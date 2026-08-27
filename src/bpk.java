import com.google.common.collect.ImmutableMap;

public class bpk extends bof<cfd> {
   private final float c;

   public bpk(float $$0) {
      super(ImmutableMap.of(bvq.m, bvr.c, bvq.n, bvr.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(ane $$0, cfd $$1) {
      cfq $$2 = $$1.gf();
      return $$1.bx() && $$2 != null && !$$1.aZ() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bW != null;
   }

   protected boolean a(ane $$0, cfd $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ane $$0, cfd $$1, long $$2) {
      this.a($$1);
   }

   protected void c(ane $$0, cfd $$1, long $$2) {
      bno<?> $$3 = $$1.dN();
      $$3.b(bvq.m);
      $$3.b(bvq.n);
   }

   protected void d(ane $$0, cfd $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cfd $$0) {
      bno<?> $$1 = $$0.dN();
      $$1.a(bvq.m, new bvt(new boq($$0.gf(), false), this.c, 2));
      $$1.a(bvq.n, new boq($$0.gf(), true));
   }
}
