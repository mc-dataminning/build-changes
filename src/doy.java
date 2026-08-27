import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record doy(int g, int h, int i, int j) {
   public static final Codec<doy> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dmq.e, dmq.d).fieldOf("min_y").forGetter(doy::c),
                  Codec.intRange(0, dmq.c).fieldOf("height").forGetter(doy::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(doy::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(doy::f)
               )
               .apply($$0, doy::new)
      )
      .comapFlatMap(doy::a, Function.identity());
   protected static final doy b = a(-64, 384, 1, 2);
   protected static final doy c = a(0, 128, 1, 2);
   protected static final doy d = a(0, 128, 2, 1);
   protected static final doy e = a(-64, 192, 1, 2);
   protected static final doy f = a(0, 256, 2, 1);

   private static DataResult<doy> a(doy $$0) {
      if ($$0.c() + $$0.d() > dmq.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dmq.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static doy a(int $$0, int $$1, int $$2, int $$3) {
      doy $$4 = new doy($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return is.c(this.f());
   }

   public int b() {
      return is.c(this.e());
   }

   public doy a(ctr $$0) {
      int $$1 = Math.max(this.g, $$0.J_());
      int $$2 = Math.min(this.g + this.h, $$0.al()) - $$1;
      return new doy($$1, $$2, this.i, this.j);
   }

   public int c() {
      return this.g;
   }

   public int d() {
      return this.h;
   }

   public int e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }
}
