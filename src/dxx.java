import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dxx(int g, int h, int i, int j) {
   public static final Codec<dxx> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dvp.e, dvp.d).fieldOf("min_y").forGetter(dxx::c),
                  Codec.intRange(0, dvp.c).fieldOf("height").forGetter(dxx::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dxx::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dxx::f)
               )
               .apply($$0, dxx::new)
      )
      .comapFlatMap(dxx::a, Function.identity());
   protected static final dxx b = a(-64, 384, 1, 2);
   protected static final dxx c = a(0, 128, 1, 2);
   protected static final dxx d = a(0, 128, 2, 1);
   protected static final dxx e = a(-64, 192, 1, 2);
   protected static final dxx f = a(0, 256, 2, 1);

   private static DataResult<dxx> a(dxx $$0) {
      if ($$0.c() + $$0.d() > dvp.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dvp.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dxx a(int $$0, int $$1, int $$2, int $$3) {
      dxx $$4 = new dxx($$0, $$1, $$2, $$3);
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

   public dxx a(dbv $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.am()) - $$1;
      return new dxx($$1, $$2, this.i, this.j);
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
