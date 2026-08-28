import com.google.common.collect.ImmutableMap;

public class bvs extends bur<bta> {
   public static final int c = 100;
   private final bpo d;
   private final ave e;

   public bvs(bpo $$0, ave $$1) {
      super(ImmutableMap.of(ccc.n, ccd.c, ccc.T, ccd.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aqk $$0, bta $$1, long $$2) {
      return !$$1.aE();
   }

   protected void b(aqk $$0, bta $$1, long $$2) {
      $$1.q(true);
      $$1.b(btk.g);
   }

   protected void c(aqk $$0, bta $$1, long $$2) {
      if ($$1.aE()) {
         $$1.h($$1.ds().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, avg.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(btk.a);
      $$1.dT().b(ccc.T);
      $$1.dT().a(ccc.S, this.d.a($$0.z));
   }
}
