import com.google.common.collect.ImmutableMap;

public class bvm extends buh<clj> {
   private final float c;

   public bvm(float $$0) {
      super(ImmutableMap.of(cbs.m, cbt.c, cbs.n, cbt.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aqm $$0, clj $$1) {
      clw $$2 = $$1.gp();
      return $$1.bD() && $$2 != null && !$$1.be() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cc != null;
   }

   protected boolean a(aqm $$0, clj $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqm $$0, clj $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aqm $$0, clj $$1, long $$2) {
      btq<?> $$3 = $$1.dS();
      $$3.b(cbs.m);
      $$3.b(cbs.n);
   }

   protected void d(aqm $$0, clj $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(clj $$0) {
      btq<?> $$1 = $$0.dS();
      $$1.a(cbs.m, new cbv(new bus($$0.gp(), false), this.c, 2));
      $$1.a(cbs.n, new bus($$0.gp(), true));
   }
}
