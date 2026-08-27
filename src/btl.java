import com.google.common.collect.ImmutableMap;

public class btl extends bsg<cjg> {
   private final float c;

   public btl(float $$0) {
      super(ImmutableMap.of(bzr.m, bzs.c, bzr.n, bzs.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aps $$0, cjg $$1) {
      cjt $$2 = $$1.gn();
      return $$1.bA() && $$2 != null && !$$1.bc() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.bY != null;
   }

   protected boolean a(aps $$0, cjg $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aps $$0, cjg $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aps $$0, cjg $$1, long $$2) {
      brp<?> $$3 = $$1.dP();
      $$3.b(bzr.m);
      $$3.b(bzr.n);
   }

   protected void d(aps $$0, cjg $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cjg $$0) {
      brp<?> $$1 = $$0.dP();
      $$1.a(bzr.m, new bzu(new bsr($$0.gn(), false), this.c, 2));
      $$1.a(bzr.n, new bsr($$0.gn(), true));
   }
}
