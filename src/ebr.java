import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ebr(int g, int h, int i, int j) {
   public static final Codec<ebr> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dzj.e, dzj.d).fieldOf("min_y").forGetter(ebr::c),
                  Codec.intRange(0, dzj.c).fieldOf("height").forGetter(ebr::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(ebr::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(ebr::f)
               )
               .apply($$0, ebr::new)
      )
      .comapFlatMap(ebr::a, Function.identity());
   protected static final ebr b = a(-64, 384, 1, 2);
   protected static final ebr c = a(0, 128, 1, 2);
   protected static final ebr d = a(0, 128, 2, 1);
   protected static final ebr e = a(-64, 192, 1, 2);
   protected static final ebr f = a(0, 256, 2, 1);

   private static DataResult<ebr> a(ebr $$0) {
      if ($$0.c() + $$0.d() > dzj.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dzj.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static ebr a(int $$0, int $$1, int $$2, int $$3) {
      ebr $$4 = new ebr($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return kb.c(this.f());
   }

   public int b() {
      return kb.c(this.e());
   }

   public ebr a(dfh $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.al() + 1) - $$1;
      return new ebr($$1, $$2, this.i, this.j);
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
