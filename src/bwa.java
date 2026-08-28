import com.google.common.collect.ImmutableMap;

public class bwa extends buv<cly> {
   private final float c;

   public bwa(float $$0) {
      super(ImmutableMap.of(ccg.m, cch.c, ccg.n, cch.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aqm $$0, cly $$1) {
      cml $$2 = $$1.gn();
      return $$1.bF() && $$2 != null && !$$1.bg() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.ce != null;
   }

   protected boolean a(aqm $$0, cly $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqm $$0, cly $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aqm $$0, cly $$1, long $$2) {
      bue<?> $$3 = $$1.dV();
      $$3.b(ccg.m);
      $$3.b(ccg.n);
   }

   protected void d(aqm $$0, cly $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cly $$0) {
      bue<?> $$1 = $$0.dV();
      $$1.a(ccg.m, new ccj(new bvg($$0.gn(), false), this.c, 2));
      $$1.a(ccg.n, new bvg($$0.gn(), true));
   }
}
