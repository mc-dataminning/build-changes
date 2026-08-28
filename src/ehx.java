import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ehx(int g, int h, int i, int j) {
   public static final Codec<ehx> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(efn.e, efn.d).fieldOf("min_y").forGetter(ehx::c),
                  Codec.intRange(0, efn.c).fieldOf("height").forGetter(ehx::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(ehx::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(ehx::f)
               )
               .apply($$0, ehx::new)
      )
      .comapFlatMap(ehx::a, Function.identity());
   protected static final ehx b = a(-64, 384, 1, 2);
   protected static final ehx c = a(0, 128, 1, 2);
   protected static final ehx d = a(0, 128, 2, 1);
   protected static final ehx e = a(-64, 192, 1, 2);
   protected static final ehx f = a(0, 256, 2, 1);

   private static DataResult<ehx> a(ehx $$0) {
      if ($$0.c() + $$0.d() > efn.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (efn.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static ehx a(int $$0, int $$1, int $$2, int $$3) {
      ehx $$4 = new ehx($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return jr.c(this.f());
   }

   public int b() {
      return jr.c(this.e());
   }

   public ehx a(dkl $$0) {
      int $$1 = Math.max(this.g, $$0.K_());
      int $$2 = Math.min(this.g + this.h, $$0.ao() + 1) - $$1;
      return new ehx($$1, $$2, this.i, this.j);
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
