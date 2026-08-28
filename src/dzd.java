import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dzd(int g, int h, int i, int j) {
   public static final Codec<dzd> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dwv.e, dwv.d).fieldOf("min_y").forGetter(dzd::c),
                  Codec.intRange(0, dwv.c).fieldOf("height").forGetter(dzd::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dzd::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dzd::f)
               )
               .apply($$0, dzd::new)
      )
      .comapFlatMap(dzd::a, Function.identity());
   protected static final dzd b = a(-64, 384, 1, 2);
   protected static final dzd c = a(0, 128, 1, 2);
   protected static final dzd d = a(0, 128, 2, 1);
   protected static final dzd e = a(-64, 192, 1, 2);
   protected static final dzd f = a(0, 256, 2, 1);

   private static DataResult<dzd> a(dzd $$0) {
      if ($$0.c() + $$0.d() > dwv.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dwv.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dzd a(int $$0, int $$1, int $$2, int $$3) {
      dzd $$4 = new dzd($$0, $$1, $$2, $$3);
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

   public dzd a(dcw $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.am()) - $$1;
      return new dzd($$1, $$2, this.i, this.j);
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
