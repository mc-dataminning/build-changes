import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dyh(int g, int h, int i, int j) {
   public static final Codec<dyh> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dvz.e, dvz.d).fieldOf("min_y").forGetter(dyh::c),
                  Codec.intRange(0, dvz.c).fieldOf("height").forGetter(dyh::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dyh::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dyh::f)
               )
               .apply($$0, dyh::new)
      )
      .comapFlatMap(dyh::a, Function.identity());
   protected static final dyh b = a(-64, 384, 1, 2);
   protected static final dyh c = a(0, 128, 1, 2);
   protected static final dyh d = a(0, 128, 2, 1);
   protected static final dyh e = a(-64, 192, 1, 2);
   protected static final dyh f = a(0, 256, 2, 1);

   private static DataResult<dyh> a(dyh $$0) {
      if ($$0.c() + $$0.d() > dvz.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dvz.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dyh a(int $$0, int $$1, int $$2, int $$3) {
      dyh $$4 = new dyh($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return ju.c(this.f());
   }

   public int b() {
      return ju.c(this.e());
   }

   public dyh a(dcf $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.am()) - $$1;
      return new dyh($$1, $$2, this.i, this.j);
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
