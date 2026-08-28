import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ebh(int g, int h, int i, int j) {
   public static final Codec<ebh> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dyz.e, dyz.d).fieldOf("min_y").forGetter(ebh::c),
                  Codec.intRange(0, dyz.c).fieldOf("height").forGetter(ebh::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(ebh::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(ebh::f)
               )
               .apply($$0, ebh::new)
      )
      .comapFlatMap(ebh::a, Function.identity());
   protected static final ebh b = a(-64, 384, 1, 2);
   protected static final ebh c = a(0, 128, 1, 2);
   protected static final ebh d = a(0, 128, 2, 1);
   protected static final ebh e = a(-64, 192, 1, 2);
   protected static final ebh f = a(0, 256, 2, 1);

   private static DataResult<ebh> a(ebh $$0) {
      if ($$0.c() + $$0.d() > dyz.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dyz.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static ebh a(int $$0, int $$1, int $$2, int $$3) {
      ebh $$4 = new ebh($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return ka.c(this.f());
   }

   public int b() {
      return ka.c(this.e());
   }

   public ebh a(dex $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.an() + 1) - $$1;
      return new ebh($$1, $$2, this.i, this.j);
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
