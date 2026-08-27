import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record drd(int g, int h, int i, int j) {
   public static final Codec<drd> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dov.e, dov.d).fieldOf("min_y").forGetter(drd::c),
                  Codec.intRange(0, dov.c).fieldOf("height").forGetter(drd::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(drd::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(drd::f)
               )
               .apply($$0, drd::new)
      )
      .comapFlatMap(drd::a, Function.identity());
   protected static final drd b = a(-64, 384, 1, 2);
   protected static final drd c = a(0, 128, 1, 2);
   protected static final drd d = a(0, 128, 2, 1);
   protected static final drd e = a(-64, 192, 1, 2);
   protected static final drd f = a(0, 256, 2, 1);

   private static DataResult<drd> a(drd $$0) {
      if ($$0.c() + $$0.d() > dov.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dov.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static drd a(int $$0, int $$1, int $$2, int $$3) {
      drd $$4 = new drd($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return iu.c(this.f());
   }

   public int b() {
      return iu.c(this.e());
   }

   public drd a(cvt $$0) {
      int $$1 = Math.max(this.g, $$0.J_());
      int $$2 = Math.min(this.g + this.h, $$0.ak()) - $$1;
      return new drd($$1, $$2, this.i, this.j);
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
