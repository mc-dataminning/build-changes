import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dlc(int g, int h, int i, int j) {
   public static final Codec<dlc> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(diu.e, diu.d).fieldOf("min_y").forGetter(dlc::c),
                  Codec.intRange(0, diu.c).fieldOf("height").forGetter(dlc::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dlc::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dlc::f)
               )
               .apply($$0, dlc::new)
      )
      .comapFlatMap(dlc::a, Function.identity());
   protected static final dlc b = a(-64, 384, 1, 2);
   protected static final dlc c = a(0, 128, 1, 2);
   protected static final dlc d = a(0, 128, 2, 1);
   protected static final dlc e = a(-64, 192, 1, 2);
   protected static final dlc f = a(0, 256, 2, 1);

   private static DataResult<dlc> a(dlc $$0) {
      if ($$0.c() + $$0.d() > diu.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (diu.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dlc a(int $$0, int $$1, int $$2, int $$3) {
      dlc $$4 = new dlc($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return hs.c(this.f());
   }

   public int b() {
      return hs.c(this.e());
   }

   public dlc a(cpz $$0) {
      int $$1 = Math.max(this.g, $$0.H_());
      int $$2 = Math.min(this.g + this.h, $$0.aj()) - $$1;
      return new dlc($$1, $$2, this.i, this.j);
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
