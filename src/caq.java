import com.google.common.collect.ImmutableMap;

public class caq extends bzl<crj> {
   private final float c;

   public caq(float $$0) {
      super(ImmutableMap.of(cgw.n, cgx.c, cgw.o, cgx.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(ars $$0, crj $$1) {
      crx $$2 = $$1.x();
      return $$1.bJ() && $$2 != null && !$$1.bi() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.bR != null;
   }

   protected boolean a(ars $$0, crj $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ars $$0, crj $$1, long $$2) {
      this.a($$1);
   }

   protected void c(ars $$0, crj $$1, long $$2) {
      byu<?> $$3 = $$1.ec();
      $$3.b(cgw.n);
      $$3.b(cgw.o);
   }

   protected void d(ars $$0, crj $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(crj $$0) {
      byu<?> $$1 = $$0.ec();
      $$1.a(cgw.n, new cgz(new bzw($$0.x(), false), this.c, 2));
      $$1.a(cgw.o, new bzw($$0.x(), true));
   }
}
