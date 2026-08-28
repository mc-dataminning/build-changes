import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record edy(int g, int h, int i, int j) {
   public static final Codec<edy> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(ebq.e, ebq.d).fieldOf("min_y").forGetter(edy::c),
                  Codec.intRange(0, ebq.c).fieldOf("height").forGetter(edy::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(edy::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(edy::f)
               )
               .apply($$0, edy::new)
      )
      .comapFlatMap(edy::a, Function.identity());
   protected static final edy b = a(-64, 384, 1, 2);
   protected static final edy c = a(0, 128, 1, 2);
   protected static final edy d = a(0, 128, 2, 1);
   protected static final edy e = a(-64, 192, 1, 2);
   protected static final edy f = a(0, 256, 2, 1);

   private static DataResult<edy> a(edy $$0) {
      if ($$0.c() + $$0.d() > ebq.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (ebq.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static edy a(int $$0, int $$1, int $$2, int $$3) {
      edy $$4 = new edy($$0, $$1, $$2, $$3);
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

   public edy a(dhk $$0) {
      int $$1 = Math.max(this.g, $$0.L_());
      int $$2 = Math.min(this.g + this.h, $$0.am() + 1) - $$1;
      return new edy($$1, $$2, this.i, this.j);
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
