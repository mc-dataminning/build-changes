import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dye(int g, int h, int i, int j) {
   public static final Codec<dye> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dvw.e, dvw.d).fieldOf("min_y").forGetter(dye::c),
                  Codec.intRange(0, dvw.c).fieldOf("height").forGetter(dye::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dye::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dye::f)
               )
               .apply($$0, dye::new)
      )
      .comapFlatMap(dye::a, Function.identity());
   protected static final dye b = a(-64, 384, 1, 2);
   protected static final dye c = a(0, 128, 1, 2);
   protected static final dye d = a(0, 128, 2, 1);
   protected static final dye e = a(-64, 192, 1, 2);
   protected static final dye f = a(0, 256, 2, 1);

   private static DataResult<dye> a(dye $$0) {
      if ($$0.c() + $$0.d() > dvw.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dvw.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dye a(int $$0, int $$1, int $$2, int $$3) {
      dye $$4 = new dye($$0, $$1, $$2, $$3);
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

   public dye a(dcc $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.am()) - $$1;
      return new dye($$1, $$2, this.i, this.j);
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
