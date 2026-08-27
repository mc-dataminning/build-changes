import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dvy(int g, int h, int i, int j) {
   public static final Codec<dvy> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dtq.e, dtq.d).fieldOf("min_y").forGetter(dvy::c),
                  Codec.intRange(0, dtq.c).fieldOf("height").forGetter(dvy::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dvy::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dvy::f)
               )
               .apply($$0, dvy::new)
      )
      .comapFlatMap(dvy::a, Function.identity());
   protected static final dvy b = a(-64, 384, 1, 2);
   protected static final dvy c = a(0, 128, 1, 2);
   protected static final dvy d = a(0, 128, 2, 1);
   protected static final dvy e = a(-64, 192, 1, 2);
   protected static final dvy f = a(0, 256, 2, 1);

   private static DataResult<dvy> a(dvy $$0) {
      if ($$0.c() + $$0.d() > dtq.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dtq.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dvy a(int $$0, int $$1, int $$2, int $$3) {
      dvy $$4 = new dvy($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return jg.c(this.f());
   }

   public int b() {
      return jg.c(this.e());
   }

   public dvy a(czw $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.al()) - $$1;
      return new dvy($$1, $$2, this.i, this.j);
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
