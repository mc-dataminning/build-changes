import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfc(jv<ddr> d, int e, int f) implements dez {
   public static final int b = 10000;
   public static final MapCodec<dfc> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.a(mc.aP).fieldOf("enchantments").forGetter(dfc::b),
               ayi.a(1, 10000).fieldOf("min_cost").forGetter(dfc::c),
               ayi.a(0, 10000).fieldOf("max_cost_span").forGetter(dfc::d)
            )
            .apply($$0, dfc::new)
   );

   @Override
   public void a(cxh $$0, ddx.a $$1, azh $$2, bsw $$3) {
      float $$4 = $$3.d();
      int $$5 = ayz.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (ddu $$7 : ddt.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.b(), $$7.c());
      }
   }

   @Override
   public MapCodec<dfc> a() {
      return c;
   }

   public jv<ddr> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
