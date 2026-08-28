import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dei(jv<dcx> d, int e, int f) implements def {
   public static final int b = 10000;
   public static final MapCodec<dei> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.a(mc.aO).fieldOf("enchantments").forGetter(dei::b),
               ayh.a(1, 10000).fieldOf("min_cost").forGetter(dei::c),
               ayh.a(0, 10000).fieldOf("max_cost_span").forGetter(dei::d)
            )
            .apply($$0, dei::new)
   );

   @Override
   public void a(cwn $$0, ddd.a $$1, azg $$2, bsg $$3) {
      float $$4 = $$3.d();
      int $$5 = ayy.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dda $$7 : dcz.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<dei> a() {
      return c;
   }

   public jv<dcx> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
