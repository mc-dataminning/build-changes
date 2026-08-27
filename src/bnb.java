import com.google.common.collect.ImmutableMap;

public class bnb extends bma<bkl> {
   public static final int c = 100;
   private final bhm d;
   private final aqc e;

   public bnb(bhm $$0, aqc $$1) {
      super(ImmutableMap.of(btk.n, btl.c, btk.S, btl.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(alq $$0, bkl $$1, long $$2) {
      return !$$1.aA();
   }

   protected void b(alq $$0, bkl $$1, long $$2) {
      $$1.p(true);
      $$1.b(bkv.g);
   }

   protected void c(alq $$0, bkl $$1, long $$2) {
      if ($$1.aA()) {
         $$1.f($$1.do().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, aqe.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bkv.a);
      $$1.dN().b(btk.S);
      $$1.dN().a(btk.R, this.d.a($$0.z));
   }
}
