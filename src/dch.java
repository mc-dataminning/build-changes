import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dch(jr<daw> d, int e, int f) implements dce {
   public static final int b = 10000;
   public static final MapCodec<dch> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kc.a(lv.aL).fieldOf("enchantments").forGetter(dch::b),
               ayl.a(1, 10000).fieldOf("min_cost").forGetter(dch::c),
               ayl.a(0, 10000).fieldOf("max_cost_span").forGetter(dch::d)
            )
            .apply($$0, dch::new)
   );

   @Override
   public void a(cvl $$0, dbc.a $$1, azk $$2, bri $$3) {
      float $$4 = $$3.d();
      int $$5 = azc.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (daz $$7 : day.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<dch> a() {
      return c;
   }

   public jr<daw> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
