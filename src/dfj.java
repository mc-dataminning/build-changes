import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfj(ju<ddy> d, int e, int f) implements dfg {
   public static final int b = 10000;
   public static final MapCodec<dfj> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(mb.aO).fieldOf("enchantments").forGetter(dfj::b),
               azn.a(1, 10000).fieldOf("min_cost").forGetter(dfj::c),
               azn.a(0, 10000).fieldOf("max_cost_span").forGetter(dfj::d)
            )
            .apply($$0, dfj::new)
   );

   @Override
   public void a(cxo $$0, dee.a $$1, bam $$2, btg $$3) {
      float $$4 = $$3.d();
      int $$5 = bae.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (deb $$7 : dea.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<dfj> a() {
      return c;
   }

   public ju<ddy> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
