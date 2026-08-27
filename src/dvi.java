import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dvi(int g, int h, int i, int j) {
   public static final Codec<dvi> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dta.e, dta.d).fieldOf("min_y").forGetter(dvi::c),
                  Codec.intRange(0, dta.c).fieldOf("height").forGetter(dvi::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dvi::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dvi::f)
               )
               .apply($$0, dvi::new)
      )
      .comapFlatMap(dvi::a, Function.identity());
   protected static final dvi b = a(-64, 384, 1, 2);
   protected static final dvi c = a(0, 128, 1, 2);
   protected static final dvi d = a(0, 128, 2, 1);
   protected static final dvi e = a(-64, 192, 1, 2);
   protected static final dvi f = a(0, 256, 2, 1);

   private static DataResult<dvi> a(dvi $$0) {
      if ($$0.c() + $$0.d() > dta.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dta.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dvi a(int $$0, int $$1, int $$2, int $$3) {
      dvi $$4 = new dvi($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return iy.c(this.f());
   }

   public int b() {
      return iy.c(this.e());
   }

   public dvi a(czi $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.al()) - $$1;
      return new dvi($$1, $$2, this.i, this.j);
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
