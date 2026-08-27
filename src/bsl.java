import com.google.common.collect.ImmutableMap;

public class bsl extends brg<cif> {
   private final float c;

   public bsl(float $$0) {
      super(ImmutableMap.of(byr.m, bys.c, byr.n, bys.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(apf $$0, cif $$1) {
      cis $$2 = $$1.gn();
      return $$1.bA() && $$2 != null && !$$1.bc() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.bZ != null;
   }

   protected boolean a(apf $$0, cif $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(apf $$0, cif $$1, long $$2) {
      this.a($$1);
   }

   protected void c(apf $$0, cif $$1, long $$2) {
      bqp<?> $$3 = $$1.dP();
      $$3.b(byr.m);
      $$3.b(byr.n);
   }

   protected void d(apf $$0, cif $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cif $$0) {
      bqp<?> $$1 = $$0.dP();
      $$1.a(byr.m, new byu(new brr($$0.gn(), false), this.c, 2));
      $$1.a(byr.n, new brr($$0.gn(), true));
   }
}
