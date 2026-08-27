import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dqw(int g, int h, int i, int j) {
   public static final Codec<dqw> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(doo.e, doo.d).fieldOf("min_y").forGetter(dqw::c),
                  Codec.intRange(0, doo.c).fieldOf("height").forGetter(dqw::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dqw::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dqw::f)
               )
               .apply($$0, dqw::new)
      )
      .comapFlatMap(dqw::a, Function.identity());
   protected static final dqw b = a(-64, 384, 1, 2);
   protected static final dqw c = a(0, 128, 1, 2);
   protected static final dqw d = a(0, 128, 2, 1);
   protected static final dqw e = a(-64, 192, 1, 2);
   protected static final dqw f = a(0, 256, 2, 1);

   private static DataResult<dqw> a(dqw $$0) {
      if ($$0.c() + $$0.d() > doo.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (doo.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dqw a(int $$0, int $$1, int $$2, int $$3) {
      dqw $$4 = new dqw($$0, $$1, $$2, $$3);
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

   public dqw a(cvp $$0) {
      int $$1 = Math.max(this.g, $$0.J_());
      int $$2 = Math.min(this.g + this.h, $$0.al()) - $$1;
      return new dqw($$1, $$2, this.i, this.j);
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
