import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dog(int g, int h, int i, int j) {
   public static final Codec<dog> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dly.e, dly.d).fieldOf("min_y").forGetter(dog::c),
                  Codec.intRange(0, dly.c).fieldOf("height").forGetter(dog::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dog::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dog::f)
               )
               .apply($$0, dog::new)
      )
      .comapFlatMap(dog::a, Function.identity());
   protected static final dog b = a(-64, 384, 1, 2);
   protected static final dog c = a(0, 128, 1, 2);
   protected static final dog d = a(0, 128, 2, 1);
   protected static final dog e = a(-64, 192, 1, 2);
   protected static final dog f = a(0, 256, 2, 1);

   private static DataResult<dog> a(dog $$0) {
      if ($$0.c() + $$0.d() > dly.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dly.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dog a(int $$0, int $$1, int $$2, int $$3) {
      dog $$4 = new dog($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return iq.c(this.f());
   }

   public int b() {
      return iq.c(this.e());
   }

   public dog a(cta $$0) {
      int $$1 = Math.max(this.g, $$0.J_());
      int $$2 = Math.min(this.g + this.h, $$0.ak()) - $$1;
      return new dog($$1, $$2, this.i, this.j);
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
