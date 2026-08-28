import com.google.common.collect.ImmutableMap;

public class byw extends bxr<cpd> {
   private final float c;

   public byw(float $$0) {
      super(ImmutableMap.of(cfc.m, cfd.c, cfc.n, cfd.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(ard $$0, cpd $$1) {
      cpr $$2 = $$1.x();
      return $$1.bJ() && $$2 != null && !$$1.bj() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.bQ != null;
   }

   protected boolean a(ard $$0, cpd $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ard $$0, cpd $$1, long $$2) {
      this.a($$1);
   }

   protected void c(ard $$0, cpd $$1, long $$2) {
      bxa<?> $$3 = $$1.ea();
      $$3.b(cfc.m);
      $$3.b(cfc.n);
   }

   protected void d(ard $$0, cpd $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cpd $$0) {
      bxa<?> $$1 = $$0.ea();
      $$1.a(cfc.m, new cff(new byc($$0.x(), false), this.c, 2));
      $$1.a(cfc.n, new byc($$0.x(), true));
   }
}
