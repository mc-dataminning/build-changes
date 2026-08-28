import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dyb(int g, int h, int i, int j) {
   public static final Codec<dyb> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dvt.e, dvt.d).fieldOf("min_y").forGetter(dyb::c),
                  Codec.intRange(0, dvt.c).fieldOf("height").forGetter(dyb::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dyb::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dyb::f)
               )
               .apply($$0, dyb::new)
      )
      .comapFlatMap(dyb::a, Function.identity());
   protected static final dyb b = a(-64, 384, 1, 2);
   protected static final dyb c = a(0, 128, 1, 2);
   protected static final dyb d = a(0, 128, 2, 1);
   protected static final dyb e = a(-64, 192, 1, 2);
   protected static final dyb f = a(0, 256, 2, 1);

   private static DataResult<dyb> a(dyb $$0) {
      if ($$0.c() + $$0.d() > dvt.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dvt.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dyb a(int $$0, int $$1, int $$2, int $$3) {
      dyb $$4 = new dyb($$0, $$1, $$2, $$3);
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

   public dyb a(dbz $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.am()) - $$1;
      return new dyb($$1, $$2, this.i, this.j);
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
