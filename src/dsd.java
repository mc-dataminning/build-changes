import com.mojang.serialization.Codec;

public class dsd extends drw {
   public static final Codec<dsd> b = dfe.b.fieldOf("state").xmap(dfd.a::b, csq::n).xmap(dsd::new, $$0 -> $$0.c).codec();
   private final csq c;

   public dsd(csq $$0) {
      this.c = $$0;
   }

   @Override
   protected drx<?> a() {
      return drx.f;
   }

   @Override
   public dfe a(arx $$0, gw $$1) {
      hc.a $$2 = hc.a.a($$0);
      return this.c.n().a(czb.g, $$2);
   }
}
