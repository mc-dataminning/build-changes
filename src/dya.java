import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dya(int g, int h, int i, int j) {
   public static final Codec<dya> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dvs.e, dvs.d).fieldOf("min_y").forGetter(dya::c),
                  Codec.intRange(0, dvs.c).fieldOf("height").forGetter(dya::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dya::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dya::f)
               )
               .apply($$0, dya::new)
      )
      .comapFlatMap(dya::a, Function.identity());
   protected static final dya b = a(-64, 384, 1, 2);
   protected static final dya c = a(0, 128, 1, 2);
   protected static final dya d = a(0, 128, 2, 1);
   protected static final dya e = a(-64, 192, 1, 2);
   protected static final dya f = a(0, 256, 2, 1);

   private static DataResult<dya> a(dya $$0) {
      if ($$0.c() + $$0.d() > dvs.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dvs.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dya a(int $$0, int $$1, int $$2, int $$3) {
      dya $$4 = new dya($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return jt.c(this.f());
   }

   public int b() {
      return jt.c(this.e());
   }

   public dya a(dby $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.am()) - $$1;
      return new dya($$1, $$2, this.i, this.j);
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
