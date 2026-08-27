import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dsw(int g, int h, int i, int j) {
   public static final Codec<dsw> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dqo.e, dqo.d).fieldOf("min_y").forGetter(dsw::c),
                  Codec.intRange(0, dqo.c).fieldOf("height").forGetter(dsw::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dsw::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dsw::f)
               )
               .apply($$0, dsw::new)
      )
      .comapFlatMap(dsw::a, Function.identity());
   protected static final dsw b = a(-64, 384, 1, 2);
   protected static final dsw c = a(0, 128, 1, 2);
   protected static final dsw d = a(0, 128, 2, 1);
   protected static final dsw e = a(-64, 192, 1, 2);
   protected static final dsw f = a(0, 256, 2, 1);

   private static DataResult<dsw> a(dsw $$0) {
      if ($$0.c() + $$0.d() > dqo.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dqo.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dsw a(int $$0, int $$1, int $$2, int $$3) {
      dsw $$4 = new dsw($$0, $$1, $$2, $$3);
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

   public dsw a(cxd $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.ak()) - $$1;
      return new dsw($$1, $$2, this.i, this.j);
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
