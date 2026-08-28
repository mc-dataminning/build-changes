import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ecy(int g, int h, int i, int j) {
   public static final Codec<ecy> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(eaq.e, eaq.d).fieldOf("min_y").forGetter(ecy::c),
                  Codec.intRange(0, eaq.c).fieldOf("height").forGetter(ecy::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(ecy::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(ecy::f)
               )
               .apply($$0, ecy::new)
      )
      .comapFlatMap(ecy::a, Function.identity());
   protected static final ecy b = a(-64, 384, 1, 2);
   protected static final ecy c = a(0, 128, 1, 2);
   protected static final ecy d = a(0, 128, 2, 1);
   protected static final ecy e = a(-64, 192, 1, 2);
   protected static final ecy f = a(0, 256, 2, 1);

   private static DataResult<ecy> a(ecy $$0) {
      if ($$0.c() + $$0.d() > eaq.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (eaq.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static ecy a(int $$0, int $$1, int $$2, int $$3) {
      ecy $$4 = new ecy($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return kc.c(this.f());
   }

   public int b() {
      return kc.c(this.e());
   }

   public ecy a(dgi $$0) {
      int $$1 = Math.max(this.g, $$0.L_());
      int $$2 = Math.min(this.g + this.h, $$0.an() + 1) - $$1;
      return new ecy($$1, $$2, this.i, this.j);
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
