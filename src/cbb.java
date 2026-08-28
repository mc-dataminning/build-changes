import com.google.common.collect.ImmutableMap;

public class cbb extends bzw<cru> {
   private final float c;

   public cbb(float $$0) {
      super(ImmutableMap.of(chh.n, chi.c, chh.o, chi.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(asb $$0, cru $$1) {
      csi $$2 = $$1.gu();
      return $$1.bJ() && $$2 != null && !$$1.bi() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.bR != null;
   }

   protected boolean a(asb $$0, cru $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(asb $$0, cru $$1, long $$2) {
      this.a($$1);
   }

   protected void c(asb $$0, cru $$1, long $$2) {
      bzf<?> $$3 = $$1.ec();
      $$3.b(chh.n);
      $$3.b(chh.o);
   }

   protected void d(asb $$0, cru $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cru $$0) {
      bzf<?> $$1 = $$0.ec();
      $$1.a(chh.n, new chk(new cah($$0.gu(), false), this.c, 2));
      $$1.a(chh.o, new cah($$0.gu(), true));
   }
}
