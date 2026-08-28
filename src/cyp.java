import javax.annotation.Nullable;

public class cyp extends cyx {
   public cyp(dke $$0, dke $$1, cxg.a $$2) {
      super($$0, $$1, jm.a, $$2);
   }

   public cyp(cxg.a $$0, dke $$1, dke $$2, jm $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(jh $$0, dha $$1, @Nullable cps $$2, cxk $$3, dxn $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dwc $$6 && $$1.a_($$0).b() instanceof drh $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
