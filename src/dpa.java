import com.mojang.serialization.Codec;

public class dpa extends dot {
   public static final Codec<dpa> b = dcb.b.fieldOf("state").xmap(dca.a::b, cpn::n).xmap(dpa::new, $$0 -> $$0.c).codec();
   private final cpn c;

   public dpa(cpn $$0) {
      this.c = $$0;
   }

   @Override
   protected dou<?> a() {
      return dou.f;
   }

   @Override
   public dcb a(apf $$0, gu $$1) {
      ha.a $$2 = ha.a.a($$0);
      return this.c.n().a(cvy.g, $$2);
   }
}
