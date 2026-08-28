import com.google.common.collect.ImmutableMap;

public class bwk extends bvf<cmi> {
   private final float c;

   public bwk(float $$0) {
      super(ImmutableMap.of(ccq.m, ccr.c, ccq.n, ccr.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aqt $$0, cmi $$1) {
      cmv $$2 = $$1.gm();
      return $$1.bE() && $$2 != null && !$$1.bf() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(aqt $$0, cmi $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqt $$0, cmi $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aqt $$0, cmi $$1, long $$2) {
      buo<?> $$3 = $$1.dU();
      $$3.b(ccq.m);
      $$3.b(ccq.n);
   }

   protected void d(aqt $$0, cmi $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cmi $$0) {
      buo<?> $$1 = $$0.dU();
      $$1.a(ccq.m, new cct(new bvq($$0.gm(), false), this.c, 2));
      $$1.a(ccq.n, new bvq($$0.gm(), true));
   }
}
