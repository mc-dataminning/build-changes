import javax.annotation.Nullable;

public class cwx extends cxf {
   public cwx(cvn.a $$0, dhm $$1, dhm $$2) {
      super($$1, $$2, $$0, jk.a);
   }

   public cwx(cvn.a $$0, dhm $$1, dhm $$2, jk $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(jf $$0, dej $$1, @Nullable cnx $$2, cvs $$3, dus $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dth $$6 && $$1.a_($$0).b() instanceof don $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
