import com.google.common.collect.ImmutableMap;

public class bye extends bwz<coh> {
   private final float c;

   public bye(float $$0) {
      super(ImmutableMap.of(cek.m, cel.c, cek.n, cel.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(ard $$0, coh $$1) {
      cow $$2 = $$1.gs();
      return $$1.bL() && $$2 != null && !$$1.bj() && !$$1.T && $$1.g((buk)$$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(ard $$0, coh $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ard $$0, coh $$1, long $$2) {
      this.a($$1);
   }

   protected void c(ard $$0, coh $$1, long $$2) {
      bwi<?> $$3 = $$1.eb();
      $$3.b(cek.m);
      $$3.b(cek.n);
   }

   protected void d(ard $$0, coh $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(coh $$0) {
      bwi<?> $$1 = $$0.eb();
      $$1.a(cek.m, new cen(new bxk($$0.gs(), false), this.c, 2));
      $$1.a(cek.n, new bxk($$0.gs(), true));
   }
}
