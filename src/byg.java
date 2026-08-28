import com.google.common.collect.ImmutableMap;

public class byg extends bxb<coj> {
   private final float c;

   public byg(float $$0) {
      super(ImmutableMap.of(cem.m, cen.c, cem.n, cen.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(ard $$0, coj $$1) {
      coy $$2 = $$1.gs();
      return $$1.bL() && $$2 != null && !$$1.bj() && !$$1.T && $$1.g((bum)$$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(ard $$0, coj $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ard $$0, coj $$1, long $$2) {
      this.a($$1);
   }

   protected void c(ard $$0, coj $$1, long $$2) {
      bwk<?> $$3 = $$1.eb();
      $$3.b(cem.m);
      $$3.b(cem.n);
   }

   protected void d(ard $$0, coj $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(coj $$0) {
      bwk<?> $$1 = $$0.eb();
      $$1.a(cem.m, new cep(new bxm($$0.gs(), false), this.c, 2));
      $$1.a(cem.n, new bxm($$0.gs(), true));
   }
}
