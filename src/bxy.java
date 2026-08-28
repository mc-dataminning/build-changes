import com.google.common.collect.ImmutableMap;

public class bxy extends bwt<cny> {
   private final float c;

   public bxy(float $$0) {
      super(ImmutableMap.of(cee.m, cef.c, cee.n, cef.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arn $$0, cny $$1) {
      com $$2 = $$1.gu();
      return $$1.bM() && $$2 != null && !$$1.bk() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(arn $$0, cny $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arn $$0, cny $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arn $$0, cny $$1, long $$2) {
      bwc<?> $$3 = $$1.ed();
      $$3.b(cee.m);
      $$3.b(cee.n);
   }

   protected void d(arn $$0, cny $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cny $$0) {
      bwc<?> $$1 = $$0.ed();
      $$1.a(cee.m, new ceh(new bxe($$0.gu(), false), this.c, 2));
      $$1.a(cee.n, new bxe($$0.gu(), true));
   }
}
