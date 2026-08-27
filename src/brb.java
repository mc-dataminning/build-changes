import com.google.common.collect.ImmutableMap;

public class brb extends bpw<cgu> {
   private final float c;

   public brb(float $$0) {
      super(ImmutableMap.of(bxh.m, bxi.c, bxh.n, bxi.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aov $$0, cgu $$1) {
      chh $$2 = $$1.gg();
      return $$1.bx() && $$2 != null && !$$1.aZ() && !$$1.S && $$1.f($$2) <= 16.0 && $$2.bW != null;
   }

   protected boolean a(aov $$0, cgu $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aov $$0, cgu $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aov $$0, cgu $$1, long $$2) {
      bpf<?> $$3 = $$1.dO();
      $$3.b(bxh.m);
      $$3.b(bxh.n);
   }

   protected void d(aov $$0, cgu $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cgu $$0) {
      bpf<?> $$1 = $$0.dO();
      $$1.a(bxh.m, new bxk(new bqh($$0.gg(), false), this.c, 2));
      $$1.a(bxh.n, new bqh($$0.gg(), true));
   }
}
