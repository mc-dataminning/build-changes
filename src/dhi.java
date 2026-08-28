import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhi(jj<dfx> d, int e, int f) implements dhf {
   public static final int b = 10000;
   public static final MapCodec<dhi> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ju.a(mh.aR).fieldOf("enchantments").forGetter(dhi::b),
               ayu.a(1, 10000).fieldOf("min_cost").forGetter(dhi::c),
               ayu.a(0, 10000).fieldOf("max_cost_span").forGetter(dhi::d)
            )
            .apply($$0, dhi::new)
   );

   @Override
   public void a(czk $$0, dgd.a $$1, azv $$2, bue $$3) {
      float $$4 = $$3.d();
      int $$5 = azm.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dga $$7 : dfz.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.b(), $$7.c());
      }
   }

   @Override
   public MapCodec<dhi> a() {
      return c;
   }

   public jj<dfx> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
