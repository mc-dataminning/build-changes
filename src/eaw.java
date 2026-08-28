import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eaw(int g, int h, int i, int j) {
   public static final Codec<eaw> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dyo.e, dyo.d).fieldOf("min_y").forGetter(eaw::c),
                  Codec.intRange(0, dyo.c).fieldOf("height").forGetter(eaw::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(eaw::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(eaw::f)
               )
               .apply($$0, eaw::new)
      )
      .comapFlatMap(eaw::a, Function.identity());
   protected static final eaw b = a(-64, 384, 1, 2);
   protected static final eaw c = a(0, 128, 1, 2);
   protected static final eaw d = a(0, 128, 2, 1);
   protected static final eaw e = a(-64, 192, 1, 2);
   protected static final eaw f = a(0, 256, 2, 1);

   private static DataResult<eaw> a(eaw $$0) {
      if ($$0.c() + $$0.d() > dyo.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dyo.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static eaw a(int $$0, int $$1, int $$2, int $$3) {
      eaw $$4 = new eaw($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return jz.c(this.f());
   }

   public int b() {
      return jz.c(this.e());
   }

   public eaw a(del $$0) {
      int $$1 = Math.max(this.g, $$0.H_());
      int $$2 = Math.min(this.g + this.h, $$0.an() + 1) - $$1;
      return new eaw($$1, $$2, this.i, this.j);
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
