import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eda(int g, int h, int i, int j) {
   public static final Codec<eda> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(eas.e, eas.d).fieldOf("min_y").forGetter(eda::c),
                  Codec.intRange(0, eas.c).fieldOf("height").forGetter(eda::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(eda::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(eda::f)
               )
               .apply($$0, eda::new)
      )
      .comapFlatMap(eda::a, Function.identity());
   protected static final eda b = a(-64, 384, 1, 2);
   protected static final eda c = a(0, 128, 1, 2);
   protected static final eda d = a(0, 128, 2, 1);
   protected static final eda e = a(-64, 192, 1, 2);
   protected static final eda f = a(0, 256, 2, 1);

   private static DataResult<eda> a(eda $$0) {
      if ($$0.c() + $$0.d() > eas.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (eas.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static eda a(int $$0, int $$1, int $$2, int $$3) {
      eda $$4 = new eda($$0, $$1, $$2, $$3);
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

   public eda a(dgk $$0) {
      int $$1 = Math.max(this.g, $$0.L_());
      int $$2 = Math.min(this.g + this.h, $$0.an() + 1) - $$1;
      return new eda($$1, $$2, this.i, this.j);
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
