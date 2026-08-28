import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddh(ju<dbw> d, int e, int f) implements dde {
   public static final int b = 10000;
   public static final MapCodec<ddh> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(ma.aM).fieldOf("enchantments").forGetter(ddh::b),
               ayw.a(1, 10000).fieldOf("min_cost").forGetter(ddh::c),
               ayw.a(0, 10000).fieldOf("max_cost_span").forGetter(ddh::d)
            )
            .apply($$0, ddh::new)
   );

   @Override
   public void a(cwf $$0, dcc.a $$1, azv $$2, bsf $$3) {
      float $$4 = $$3.d();
      int $$5 = azn.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dbz $$7 : dby.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<ddh> a() {
      return c;
   }

   public ju<dbw> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
