import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eae(int g, int h, int i, int j) {
   public static final Codec<eae> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dxw.e, dxw.d).fieldOf("min_y").forGetter(eae::c),
                  Codec.intRange(0, dxw.c).fieldOf("height").forGetter(eae::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(eae::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(eae::f)
               )
               .apply($$0, eae::new)
      )
      .comapFlatMap(eae::a, Function.identity());
   protected static final eae b = a(-64, 384, 1, 2);
   protected static final eae c = a(0, 128, 1, 2);
   protected static final eae d = a(0, 128, 2, 1);
   protected static final eae e = a(-64, 192, 1, 2);
   protected static final eae f = a(0, 256, 2, 1);

   private static DataResult<eae> a(eae $$0) {
      if ($$0.c() + $$0.d() > dxw.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dxw.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static eae a(int $$0, int $$1, int $$2, int $$3) {
      eae $$4 = new eae($$0, $$1, $$2, $$3);
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

   public eae a(ddu $$0) {
      int $$1 = Math.max(this.g, $$0.G_());
      int $$2 = Math.min(this.g + this.h, $$0.an()) - $$1;
      return new eae($$1, $$2, this.i, this.j);
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
