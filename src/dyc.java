import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dyc(int g, int h, int i, int j) {
   public static final Codec<dyc> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dvu.e, dvu.d).fieldOf("min_y").forGetter(dyc::c),
                  Codec.intRange(0, dvu.c).fieldOf("height").forGetter(dyc::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dyc::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dyc::f)
               )
               .apply($$0, dyc::new)
      )
      .comapFlatMap(dyc::a, Function.identity());
   protected static final dyc b = a(-64, 384, 1, 2);
   protected static final dyc c = a(0, 128, 1, 2);
   protected static final dyc d = a(0, 128, 2, 1);
   protected static final dyc e = a(-64, 192, 1, 2);
   protected static final dyc f = a(0, 256, 2, 1);

   private static DataResult<dyc> a(dyc $$0) {
      if ($$0.c() + $$0.d() > dvu.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dvu.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dyc a(int $$0, int $$1, int $$2, int $$3) {
      dyc $$4 = new dyc($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return jt.c(this.f());
   }

   public int b() {
      return jt.c(this.e());
   }

   public dyc a(dca $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.am()) - $$1;
      return new dyc($$1, $$2, this.i, this.j);
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
