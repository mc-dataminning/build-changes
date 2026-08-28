import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record edw(int g, int h, int i, int j) {
   public static final Codec<edw> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(ebm.e, ebm.d).fieldOf("min_y").forGetter(edw::c),
                  Codec.intRange(0, ebm.c).fieldOf("height").forGetter(edw::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(edw::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(edw::f)
               )
               .apply($$0, edw::new)
      )
      .comapFlatMap(edw::a, Function.identity());
   protected static final edw b = a(-64, 384, 1, 2);
   protected static final edw c = a(0, 128, 1, 2);
   protected static final edw d = a(0, 128, 2, 1);
   protected static final edw e = a(-64, 192, 1, 2);
   protected static final edw f = a(0, 256, 2, 1);

   private static DataResult<edw> a(edw $$0) {
      if ($$0.c() + $$0.d() > ebm.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (ebm.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static edw a(int $$0, int $$1, int $$2, int $$3) {
      edw $$4 = new edw($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return kc.c(this.f());
   }

   public int b() {
      return kc.c(this.e());
   }

   public edw a(dhb $$0) {
      int $$1 = Math.max(this.g, $$0.G_());
      int $$2 = Math.min(this.g + this.h, $$0.ao() + 1) - $$1;
      return new edw($$1, $$2, this.i, this.j);
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
