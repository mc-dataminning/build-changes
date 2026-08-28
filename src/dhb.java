import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhb(ji<dfq> d, int e, int f) implements dgy {
   public static final int b = 10000;
   public static final MapCodec<dhb> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jt.a(mg.aR).fieldOf("enchantments").forGetter(dhb::b),
               ayu.a(1, 10000).fieldOf("min_cost").forGetter(dhb::c),
               ayu.a(0, 10000).fieldOf("max_cost_span").forGetter(dhb::d)
            )
            .apply($$0, dhb::new)
   );

   @Override
   public void a(czd $$0, dfw.a $$1, azv $$2, bub $$3) {
      float $$4 = $$3.d();
      int $$5 = azm.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dft $$7 : dfs.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.b(), $$7.c());
      }
   }

   @Override
   public MapCodec<dhb> a() {
      return c;
   }

   public ji<dfq> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
