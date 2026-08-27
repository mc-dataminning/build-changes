import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dsu(int g, int h, int i, int j) {
   public static final Codec<dsu> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dqm.e, dqm.d).fieldOf("min_y").forGetter(dsu::c),
                  Codec.intRange(0, dqm.c).fieldOf("height").forGetter(dsu::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dsu::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dsu::f)
               )
               .apply($$0, dsu::new)
      )
      .comapFlatMap(dsu::a, Function.identity());
   protected static final dsu b = a(-64, 384, 1, 2);
   protected static final dsu c = a(0, 128, 1, 2);
   protected static final dsu d = a(0, 128, 2, 1);
   protected static final dsu e = a(-64, 192, 1, 2);
   protected static final dsu f = a(0, 256, 2, 1);

   private static DataResult<dsu> a(dsu $$0) {
      if ($$0.c() + $$0.d() > dqm.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dqm.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dsu a(int $$0, int $$1, int $$2, int $$3) {
      dsu $$4 = new dsu($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return iw.c(this.f());
   }

   public int b() {
      return iw.c(this.e());
   }

   public dsu a(cxb $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.ak()) - $$1;
      return new dsu($$1, $$2, this.i, this.j);
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
