import com.google.common.collect.ImmutableMap;

public class caf extends bza<cqy> {
   private final float c;

   public caf(float $$0) {
      super(ImmutableMap.of(cgl.n, cgm.c, cgl.o, cgm.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arq $$0, cqy $$1) {
      crm $$2 = $$1.x();
      return $$1.bI() && $$2 != null && !$$1.bh() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.bR != null;
   }

   protected boolean a(arq $$0, cqy $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arq $$0, cqy $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arq $$0, cqy $$1, long $$2) {
      byj<?> $$3 = $$1.eb();
      $$3.b(cgl.n);
      $$3.b(cgl.o);
   }

   protected void d(arq $$0, cqy $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cqy $$0) {
      byj<?> $$1 = $$0.eb();
      $$1.a(cgl.n, new cgo(new bzl($$0.x(), false), this.c, 2));
      $$1.a(cgl.o, new bzl($$0.x(), true));
   }
}
