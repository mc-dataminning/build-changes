import com.google.common.collect.ImmutableMap;

public class bph extends boc<cev> {
   private final float c;

   public bph(float $$0) {
      super(ImmutableMap.of(bvn.m, bvo.c, bvn.n, bvo.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(and $$0, cev $$1) {
      cfi $$2 = $$1.ge();
      return $$1.bx() && $$2 != null && !$$1.aZ() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bS != null;
   }

   protected boolean a(and $$0, cev $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(and $$0, cev $$1, long $$2) {
      this.a($$1);
   }

   protected void c(and $$0, cev $$1, long $$2) {
      bnl<?> $$3 = $$1.dO();
      $$3.b(bvn.m);
      $$3.b(bvn.n);
   }

   protected void d(and $$0, cev $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cev $$0) {
      bnl<?> $$1 = $$0.dO();
      $$1.a(bvn.m, new bvq(new bon($$0.ge(), false), this.c, 2));
      $$1.a(bvn.n, new bon($$0.ge(), true));
   }
}
