import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record efv(int g, int h, int i, int j) {
   public static final Codec<efv> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(edl.e, edl.d).fieldOf("min_y").forGetter(efv::c),
                  Codec.intRange(0, edl.c).fieldOf("height").forGetter(efv::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(efv::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(efv::f)
               )
               .apply($$0, efv::new)
      )
      .comapFlatMap(efv::a, Function.identity());
   protected static final efv b = a(-64, 384, 1, 2);
   protected static final efv c = a(0, 128, 1, 2);
   protected static final efv d = a(0, 128, 2, 1);
   protected static final efv e = a(-64, 192, 1, 2);
   protected static final efv f = a(0, 256, 2, 1);

   private static DataResult<efv> a(efv $$0) {
      if ($$0.c() + $$0.d() > edl.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (edl.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static efv a(int $$0, int $$1, int $$2, int $$3) {
      efv $$4 = new efv($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return jp.c(this.f());
   }

   public int b() {
      return jp.c(this.e());
   }

   public efv a(dir $$0) {
      int $$1 = Math.max(this.g, $$0.G_());
      int $$2 = Math.min(this.g + this.h, $$0.ao() + 1) - $$1;
      return new efv($$1, $$2, this.i, this.j);
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
