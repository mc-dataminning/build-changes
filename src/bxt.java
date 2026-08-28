import com.google.common.collect.ImmutableMap;

public class bxt extends bwo<cnt> {
   private final float c;

   public bxt(float $$0) {
      super(ImmutableMap.of(cdz.m, cea.c, cdz.n, cea.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arm $$0, cnt $$1) {
      coh $$2 = $$1.gv();
      return $$1.bM() && $$2 != null && !$$1.bk() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.ca != null;
   }

   protected boolean a(arm $$0, cnt $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arm $$0, cnt $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arm $$0, cnt $$1, long $$2) {
      bvx<?> $$3 = $$1.ed();
      $$3.b(cdz.m);
      $$3.b(cdz.n);
   }

   protected void d(arm $$0, cnt $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cnt $$0) {
      bvx<?> $$1 = $$0.ed();
      $$1.a(cdz.m, new cec(new bwz($$0.gv(), false), this.c, 2));
      $$1.a(cdz.n, new bwz($$0.gv(), true));
   }
}
