import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhw(jj<dgl> d, int e, int f) implements dht {
   public static final int b = 10000;
   public static final MapCodec<dhw> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ju.a(mh.aR).fieldOf("enchantments").forGetter(dhw::b),
               ayw.a(1, 10000).fieldOf("min_cost").forGetter(dhw::c),
               ayw.a(0, 10000).fieldOf("max_cost_span").forGetter(dhw::d)
            )
            .apply($$0, dhw::new)
   );

   @Override
   public void a(czy $$0, dgr.a $$1, azx $$2, bup $$3) {
      float $$4 = $$3.d();
      int $$5 = azo.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dgo $$7 : dgn.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.b(), $$7.c());
      }
   }

   @Override
   public MapCodec<dhw> a() {
      return c;
   }

   public jj<dgl> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
