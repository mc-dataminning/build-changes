import javax.annotation.Nullable;

public class cyt extends czb {
   public cyt(dkl $$0, dkl $$1, cxk.a $$2) {
      super($$0, $$1, jm.a, $$2);
   }

   public cyt(cxk.a $$0, dkl $$1, dkl $$2, jm $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(jh $$0, dhh $$1, @Nullable cpw $$2, cxo $$3, dxu $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dwj $$6 && $$1.a_($$0).b() instanceof dro $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
