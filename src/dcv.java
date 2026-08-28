import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcv(jr<dbk> d, int e, int f) implements dcs {
   public static final int b = 10000;
   public static final MapCodec<dcv> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kc.a(lv.aM).fieldOf("enchantments").forGetter(dcv::b),
               aym.a(1, 10000).fieldOf("min_cost").forGetter(dcv::c),
               aym.a(0, 10000).fieldOf("max_cost_span").forGetter(dcv::d)
            )
            .apply($$0, dcv::new)
   );

   @Override
   public void a(cvp $$0, dbq.a $$1, azl $$2, brn $$3) {
      float $$4 = $$3.d();
      int $$5 = azd.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dbn $$7 : dbm.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<dcv> a() {
      return c;
   }

   public jr<dbk> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
