import com.google.common.collect.ImmutableMap;

public class bze extends bxz<cpj> {
   private final float c;

   public bze(float $$0) {
      super(ImmutableMap.of(cfk.m, cfl.c, cfk.n, cfl.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(ash $$0, cpj $$1) {
      cpx $$2 = $$1.go();
      return $$1.bL() && $$2 != null && !$$1.bj() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(ash $$0, cpj $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ash $$0, cpj $$1, long $$2) {
      this.a($$1);
   }

   protected void c(ash $$0, cpj $$1, long $$2) {
      bxi<?> $$3 = $$1.ec();
      $$3.b(cfk.m);
      $$3.b(cfk.n);
   }

   protected void d(ash $$0, cpj $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cpj $$0) {
      bxi<?> $$1 = $$0.ec();
      $$1.a(cfk.m, new cfn(new byk($$0.go(), false), this.c, 2));
      $$1.a(cfk.n, new byk($$0.go(), true));
   }
}
