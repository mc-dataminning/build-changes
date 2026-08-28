import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record edr(int g, int h, int i, int j) {
   public static final Codec<edr> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(ebj.e, ebj.d).fieldOf("min_y").forGetter(edr::c),
                  Codec.intRange(0, ebj.c).fieldOf("height").forGetter(edr::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(edr::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(edr::f)
               )
               .apply($$0, edr::new)
      )
      .comapFlatMap(edr::a, Function.identity());
   protected static final edr b = a(-64, 384, 1, 2);
   protected static final edr c = a(0, 128, 1, 2);
   protected static final edr d = a(0, 128, 2, 1);
   protected static final edr e = a(-64, 192, 1, 2);
   protected static final edr f = a(0, 256, 2, 1);

   private static DataResult<edr> a(edr $$0) {
      if ($$0.c() + $$0.d() > ebj.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (ebj.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static edr a(int $$0, int $$1, int $$2, int $$3) {
      edr $$4 = new edr($$0, $$1, $$2, $$3);
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

   public edr a(dhb $$0) {
      int $$1 = Math.max(this.g, $$0.L_());
      int $$2 = Math.min(this.g + this.h, $$0.an() + 1) - $$1;
      return new edr($$1, $$2, this.i, this.j);
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
