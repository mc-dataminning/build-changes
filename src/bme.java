import com.google.common.collect.ImmutableMap;

public class bme extends bld<bjo> {
   public static final int c = 100;
   private final bgp d;
   private final apf e;

   public bme(bgp $$0, apf $$1) {
      super(ImmutableMap.of(bsn.n, bso.c, bsn.S, bso.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(akt $$0, bjo $$1, long $$2) {
      return !$$1.aA();
   }

   protected void b(akt $$0, bjo $$1, long $$2) {
      $$1.p(true);
      $$1.b(bjy.g);
   }

   protected void c(akt $$0, bjo $$1, long $$2) {
      if ($$1.aA()) {
         $$1.f($$1.do().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, aph.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bjy.a);
      $$1.dN().b(bsn.S);
      $$1.dN().a(bsn.R, this.d.a($$0.z));
   }
}
