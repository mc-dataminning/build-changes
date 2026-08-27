import com.google.common.collect.ImmutableMap;

public class bsm extends brh<cih> {
   private final float c;

   public bsm(float $$0) {
      super(ImmutableMap.of(bys.m, byt.c, bys.n, byt.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(apf $$0, cih $$1) {
      ciu $$2 = $$1.gn();
      return $$1.bA() && $$2 != null && !$$1.bc() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.bZ != null;
   }

   protected boolean a(apf $$0, cih $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(apf $$0, cih $$1, long $$2) {
      this.a($$1);
   }

   protected void c(apf $$0, cih $$1, long $$2) {
      bqq<?> $$3 = $$1.dP();
      $$3.b(bys.m);
      $$3.b(bys.n);
   }

   protected void d(apf $$0, cih $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cih $$0) {
      bqq<?> $$1 = $$0.dP();
      $$1.a(bys.m, new byv(new brs($$0.gn(), false), this.c, 2));
      $$1.a(bys.n, new brs($$0.gn(), true));
   }
}
