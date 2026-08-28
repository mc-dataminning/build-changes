import com.google.common.collect.ImmutableMap;

public class bzd extends bxy<cpi> {
   private final float c;

   public bzd(float $$0) {
      super(ImmutableMap.of(cfj.m, cfk.c, cfj.n, cfk.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(ash $$0, cpi $$1) {
      cpw $$2 = $$1.gm();
      return $$1.bL() && $$2 != null && !$$1.bj() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(ash $$0, cpi $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ash $$0, cpi $$1, long $$2) {
      this.a($$1);
   }

   protected void c(ash $$0, cpi $$1, long $$2) {
      bxh<?> $$3 = $$1.eb();
      $$3.b(cfj.m);
      $$3.b(cfj.n);
   }

   protected void d(ash $$0, cpi $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cpi $$0) {
      bxh<?> $$1 = $$0.eb();
      $$1.a(cfj.m, new cfm(new byj($$0.gm(), false), this.c, 2));
      $$1.a(cfj.n, new byj($$0.gm(), true));
   }
}
