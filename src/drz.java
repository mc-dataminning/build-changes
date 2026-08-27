import com.mojang.serialization.Codec;

public class drz extends drs {
   public static final Codec<drz> b = dfa.b.fieldOf("state").xmap(dez.a::b, csm::n).xmap(drz::new, $$0 -> $$0.c).codec();
   private final csm c;

   public drz(csm $$0) {
      this.c = $$0;
   }

   @Override
   protected drt<?> a() {
      return drt.f;
   }

   @Override
   public dfa a(aru $$0, gu $$1) {
      ha.a $$2 = ha.a.a($$0);
      return this.c.n().a(cyx.g, $$2);
   }
}
