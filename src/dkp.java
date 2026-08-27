import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dkp(int g, int h, int i, int j) {
   public static final Codec<dkp> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dih.e, dih.d).fieldOf("min_y").forGetter(dkp::c),
                  Codec.intRange(0, dih.c).fieldOf("height").forGetter(dkp::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dkp::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dkp::f)
               )
               .apply($$0, dkp::new)
      )
      .comapFlatMap(dkp::a, Function.identity());
   protected static final dkp b = a(-64, 384, 1, 2);
   protected static final dkp c = a(0, 128, 1, 2);
   protected static final dkp d = a(0, 128, 2, 1);
   protected static final dkp e = a(-64, 192, 1, 2);
   protected static final dkp f = a(0, 256, 2, 1);

   private static DataResult<dkp> a(dkp $$0) {
      if ($$0.c() + $$0.d() > dih.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dih.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dkp a(int $$0, int $$1, int $$2, int $$3) {
      dkp $$4 = new dkp($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return hr.c(this.f());
   }

   public int b() {
      return hr.c(this.e());
   }

   public dkp a(cpm $$0) {
      int $$1 = Math.max(this.g, $$0.C_());
      int $$2 = Math.min(this.g + this.h, $$0.aj()) - $$1;
      return new dkp($$1, $$2, this.i, this.j);
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
