import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dhs(int g, int h, int i, int j) {
   public static final Codec<dhs> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dfk.e, dfk.d).fieldOf("min_y").forGetter(dhs::c),
                  Codec.intRange(0, dfk.c).fieldOf("height").forGetter(dhs::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dhs::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dhs::f)
               )
               .apply($$0, dhs::new)
      )
      .comapFlatMap(dhs::a, Function.identity());
   protected static final dhs b = a(-64, 384, 1, 2);
   protected static final dhs c = a(0, 128, 1, 2);
   protected static final dhs d = a(0, 128, 2, 1);
   protected static final dhs e = a(-64, 192, 1, 2);
   protected static final dhs f = a(0, 256, 2, 1);

   private static DataResult<dhs> a(dhs $$0) {
      if ($$0.c() + $$0.d() > dfk.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dfk.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dhs a(int $$0, int $$1, int $$2, int $$3) {
      dhs $$4 = new dhs($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return hq.c(this.f());
   }

   public int b() {
      return hq.c(this.e());
   }

   public dhs a(cmo $$0) {
      int $$1 = Math.max(this.g, $$0.C_());
      int $$2 = Math.min(this.g + this.h, $$0.aj()) - $$1;
      return new dhs($$1, $$2, this.i, this.j);
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
