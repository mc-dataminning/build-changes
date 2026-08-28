import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eas(int g, int h, int i, int j) {
   public static final Codec<eas> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dyk.e, dyk.d).fieldOf("min_y").forGetter(eas::c),
                  Codec.intRange(0, dyk.c).fieldOf("height").forGetter(eas::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(eas::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(eas::f)
               )
               .apply($$0, eas::new)
      )
      .comapFlatMap(eas::a, Function.identity());
   protected static final eas b = a(-64, 384, 1, 2);
   protected static final eas c = a(0, 128, 1, 2);
   protected static final eas d = a(0, 128, 2, 1);
   protected static final eas e = a(-64, 192, 1, 2);
   protected static final eas f = a(0, 256, 2, 1);

   private static DataResult<eas> a(eas $$0) {
      if ($$0.c() + $$0.d() > dyk.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dyk.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static eas a(int $$0, int $$1, int $$2, int $$3) {
      eas $$4 = new eas($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return jy.c(this.f());
   }

   public int b() {
      return jy.c(this.e());
   }

   public eas a(dei $$0) {
      int $$1 = Math.max(this.g, $$0.G_());
      int $$2 = Math.min(this.g + this.h, $$0.an() + 1) - $$1;
      return new eas($$1, $$2, this.i, this.j);
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
