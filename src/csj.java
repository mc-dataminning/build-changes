import javax.annotation.Nullable;

public class csj extends csr {
   public csj(cre.a $$0, dby $$1, dby $$2) {
      super($$1, $$2, $$0, ih.a);
   }

   public csj(cre.a $$0, dby $$1, dby $$2, ih $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(ib $$0, cyx $$1, @Nullable cjt $$2, crj $$3, doz $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dnp $$6 && $$1.a_($$0).b() instanceof dix $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
