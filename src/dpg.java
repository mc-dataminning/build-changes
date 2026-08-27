import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dpg(int g, int h, int i, int j) {
   public static final Codec<dpg> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dmy.e, dmy.d).fieldOf("min_y").forGetter(dpg::c),
                  Codec.intRange(0, dmy.c).fieldOf("height").forGetter(dpg::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dpg::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dpg::f)
               )
               .apply($$0, dpg::new)
      )
      .comapFlatMap(dpg::a, Function.identity());
   protected static final dpg b = a(-64, 384, 1, 2);
   protected static final dpg c = a(0, 128, 1, 2);
   protected static final dpg d = a(0, 128, 2, 1);
   protected static final dpg e = a(-64, 192, 1, 2);
   protected static final dpg f = a(0, 256, 2, 1);

   private static DataResult<dpg> a(dpg $$0) {
      if ($$0.c() + $$0.d() > dmy.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dmy.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dpg a(int $$0, int $$1, int $$2, int $$3) {
      dpg $$4 = new dpg($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return is.c(this.f());
   }

   public int b() {
      return is.c(this.e());
   }

   public dpg a(ctz $$0) {
      int $$1 = Math.max(this.g, $$0.J_());
      int $$2 = Math.min(this.g + this.h, $$0.al()) - $$1;
      return new dpg($$1, $$2, this.i, this.j);
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
