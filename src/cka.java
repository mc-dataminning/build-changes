import javax.annotation.Nullable;

public class cka extends ckj {
   public cka(civ.a $$0, csq $$1, csq $$2) {
      super($$1, $$2, $$0, hc.a);
   }

   public cka(civ.a $$0, csq $$1, csq $$2, hc $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(gw $$0, cpq $$1, @Nullable cbp $$2, cja $$3, dfe $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof ddy $$6 && $$1.a_($$0).b() instanceof czq $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
