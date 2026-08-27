import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dzc(int h, int i, int j, int k) {
   public static final Codec<dzc> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dwu.e, dwu.d).fieldOf("min_y").forGetter(dzc::c),
                  Codec.intRange(0, dwu.c).fieldOf("height").forGetter(dzc::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dzc::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dzc::f)
               )
               .apply($$0, dzc::new)
      )
      .comapFlatMap(dzc::a, Function.identity());
   protected static final dzc b = a(-64, 384, 1, 2);
   protected static final dzc c = a(0, 128, 1, 2);
   protected static final dzc d = a(0, 128, 2, 1);
   protected static final dzc e = a(-64, 192, 1, 2);
   protected static final dzc f = a(0, 256, 2, 1);
   protected static final dzc g = a(0, 256, 4, 1);

   private static DataResult<dzc> a(dzc $$0) {
      if ($$0.c() + $$0.d() > dwu.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dwu.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dzc a(int $$0, int $$1, int $$2, int $$3) {
      dzc $$4 = new dzc($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return jl.c(this.f());
   }

   public int b() {
      return jl.c(this.e());
   }

   public dzc a(dcc $$0) {
      int $$1 = Math.max(this.h, $$0.J_());
      int $$2 = Math.min(this.h + this.i, $$0.am()) - $$1;
      return new dzc($$1, $$2, this.j, this.k);
   }

   public int c() {
      return this.h;
   }

   public int d() {
      return this.i;
   }

   public int e() {
      return this.j;
   }

   public int f() {
      return this.k;
   }
}
