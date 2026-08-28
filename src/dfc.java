import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfc(ju<ddr> d, int e, int f) implements dez {
   public static final int b = 10000;
   public static final MapCodec<dfc> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(mb.aN).fieldOf("enchantments").forGetter(dfc::b),
               azn.a(1, 10000).fieldOf("min_cost").forGetter(dfc::c),
               azn.a(0, 10000).fieldOf("max_cost_span").forGetter(dfc::d)
            )
            .apply($$0, dfc::new)
   );

   @Override
   public void a(cxk $$0, ddx.a $$1, bam $$2, btc $$3) {
      float $$4 = $$3.d();
      int $$5 = bae.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (ddu $$7 : ddt.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<dfc> a() {
      return c;
   }

   public ju<ddr> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
