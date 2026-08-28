import javax.annotation.Nullable;

public class cyu extends czc {
   public cyu(dkm $$0, dkm $$1, cxl.a $$2) {
      super($$0, $$1, jm.a, $$2);
   }

   public cyu(cxl.a $$0, dkm $$1, dkm $$2, jm $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(jh $$0, dhi $$1, @Nullable cpx $$2, cxp $$3, dxv $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dwk $$6 && $$1.a_($$0).b() instanceof drp $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
