import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dor(int g, int h, int i, int j) {
   public static final Codec<dor> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dmj.e, dmj.d).fieldOf("min_y").forGetter(dor::c),
                  Codec.intRange(0, dmj.c).fieldOf("height").forGetter(dor::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dor::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dor::f)
               )
               .apply($$0, dor::new)
      )
      .comapFlatMap(dor::a, Function.identity());
   protected static final dor b = a(-64, 384, 1, 2);
   protected static final dor c = a(0, 128, 1, 2);
   protected static final dor d = a(0, 128, 2, 1);
   protected static final dor e = a(-64, 192, 1, 2);
   protected static final dor f = a(0, 256, 2, 1);

   private static DataResult<dor> a(dor $$0) {
      if ($$0.c() + $$0.d() > dmj.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dmj.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dor a(int $$0, int $$1, int $$2, int $$3) {
      dor $$4 = new dor($$0, $$1, $$2, $$3);
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

   public dor a(ctk $$0) {
      int $$1 = Math.max(this.g, $$0.J_());
      int $$2 = Math.min(this.g + this.h, $$0.al()) - $$1;
      return new dor($$1, $$2, this.i, this.j);
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
