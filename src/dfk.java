import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfk(ju<ddz> d, int e, int f) implements dfh {
   public static final int b = 10000;
   public static final MapCodec<dfk> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(mb.aO).fieldOf("enchantments").forGetter(dfk::b),
               azn.a(1, 10000).fieldOf("min_cost").forGetter(dfk::c),
               azn.a(0, 10000).fieldOf("max_cost_span").forGetter(dfk::d)
            )
            .apply($$0, dfk::new)
   );

   @Override
   public void a(cxp $$0, def.a $$1, bam $$2, bth $$3) {
      float $$4 = $$3.d();
      int $$5 = bae.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dec $$7 : deb.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<dfk> a() {
      return c;
   }

   public ju<ddz> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
