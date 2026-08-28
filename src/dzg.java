import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dzg(int g, int h, int i, int j) {
   public static final Codec<dzg> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dwy.e, dwy.d).fieldOf("min_y").forGetter(dzg::c),
                  Codec.intRange(0, dwy.c).fieldOf("height").forGetter(dzg::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dzg::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dzg::f)
               )
               .apply($$0, dzg::new)
      )
      .comapFlatMap(dzg::a, Function.identity());
   protected static final dzg b = a(-64, 384, 1, 2);
   protected static final dzg c = a(0, 128, 1, 2);
   protected static final dzg d = a(0, 128, 2, 1);
   protected static final dzg e = a(-64, 192, 1, 2);
   protected static final dzg f = a(0, 256, 2, 1);

   private static DataResult<dzg> a(dzg $$0) {
      if ($$0.c() + $$0.d() > dwy.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dwy.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dzg a(int $$0, int $$1, int $$2, int $$3) {
      dzg $$4 = new dzg($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return jx.c(this.f());
   }

   public int b() {
      return jx.c(this.e());
   }

   public dzg a(dcy $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.am()) - $$1;
      return new dzg($$1, $$2, this.i, this.j);
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
