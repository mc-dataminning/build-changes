import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dla(int g, int h, int i, int j) {
   public static final Codec<dla> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dis.e, dis.d).fieldOf("min_y").forGetter(dla::c),
                  Codec.intRange(0, dis.c).fieldOf("height").forGetter(dla::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dla::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dla::f)
               )
               .apply($$0, dla::new)
      )
      .comapFlatMap(dla::a, Function.identity());
   protected static final dla b = a(-64, 384, 1, 2);
   protected static final dla c = a(0, 128, 1, 2);
   protected static final dla d = a(0, 128, 2, 1);
   protected static final dla e = a(-64, 192, 1, 2);
   protected static final dla f = a(0, 256, 2, 1);

   private static DataResult<dla> a(dla $$0) {
      if ($$0.c() + $$0.d() > dis.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dis.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dla a(int $$0, int $$1, int $$2, int $$3) {
      dla $$4 = new dla($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return hp.c(this.f());
   }

   public int b() {
      return hp.c(this.e());
   }

   public dla a(cpx $$0) {
      int $$1 = Math.max(this.g, $$0.H_());
      int $$2 = Math.min(this.g + this.h, $$0.aj()) - $$1;
      return new dla($$1, $$2, this.i, this.j);
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
