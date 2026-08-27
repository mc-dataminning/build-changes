import com.mojang.serialization.Codec;

public class dsi extends dsb {
   public static final Codec<dsi> b = dfj.b.fieldOf("state").xmap(dfi.a::b, csv::n).xmap(dsi::new, $$0 -> $$0.c).codec();
   private final csv c;

   public dsi(csv $$0) {
      this.c = $$0;
   }

   @Override
   protected dsc<?> a() {
      return dsc.f;
   }

   @Override
   public dfj a(asc $$0, gw $$1) {
      hc.a $$2 = hc.a.a($$0);
      return this.c.n().a(czg.g, $$2);
   }
}
