import javax.annotation.Nullable;

public class cmb extends cmk {
   public cmb(ckw.a $$0, cut $$1, cut $$2) {
      super($$1, $$2, $$0, hx.a);
   }

   public cmb(ckw.a $$0, cut $$1, cut $$2, hx $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(ht $$0, crs $$1, @Nullable cdm $$2, clb $$3, dgw $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dga $$6 && $$1.a_($$0).b() instanceof dbs $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
