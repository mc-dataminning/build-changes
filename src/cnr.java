import javax.annotation.Nullable;

public class cnr extends coa {
   public cnr(cmm.a $$0, cwj $$1, cwj $$2) {
      super($$1, $$2, $$0, ic.a);
   }

   public cnr(cmm.a $$0, cwj $$1, cwj $$2, ic $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(hx $$0, cti $$1, @Nullable cfb $$2, cmr $$3, dja $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dhx $$6 && $$1.a_($$0).b() instanceof ddi $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
