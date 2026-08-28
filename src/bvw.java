import com.google.common.collect.ImmutableMap;

public class bvw extends bur<clu> {
   private final float c;

   public bvw(float $$0) {
      super(ImmutableMap.of(ccc.m, ccd.c, ccc.n, ccd.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aqk $$0, clu $$1) {
      cmh $$2 = $$1.gn();
      return $$1.bD() && $$2 != null && !$$1.be() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(aqk $$0, clu $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqk $$0, clu $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aqk $$0, clu $$1, long $$2) {
      bua<?> $$3 = $$1.dT();
      $$3.b(ccc.m);
      $$3.b(ccc.n);
   }

   protected void d(aqk $$0, clu $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(clu $$0) {
      bua<?> $$1 = $$0.dT();
      $$1.a(ccc.m, new ccf(new bvc($$0.gn(), false), this.c, 2));
      $$1.a(ccc.n, new bvc($$0.gn(), true));
   }
}
