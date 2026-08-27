import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record duz(int g, int h, int i, int j) {
   public static final Codec<duz> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dsr.e, dsr.d).fieldOf("min_y").forGetter(duz::c),
                  Codec.intRange(0, dsr.c).fieldOf("height").forGetter(duz::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(duz::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(duz::f)
               )
               .apply($$0, duz::new)
      )
      .comapFlatMap(duz::a, Function.identity());
   protected static final duz b = a(-64, 384, 1, 2);
   protected static final duz c = a(0, 128, 1, 2);
   protected static final duz d = a(0, 128, 2, 1);
   protected static final duz e = a(-64, 192, 1, 2);
   protected static final duz f = a(0, 256, 2, 1);

   private static DataResult<duz> a(duz $$0) {
      if ($$0.c() + $$0.d() > dsr.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dsr.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static duz a(int $$0, int $$1, int $$2, int $$3) {
      duz $$4 = new duz($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return iw.c(this.f());
   }

   public int b() {
      return iw.c(this.e());
   }

   public duz a(cyz $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.al()) - $$1;
      return new duz($$1, $$2, this.i, this.j);
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
