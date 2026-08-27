import javax.annotation.Nullable;

public class cjx extends ckg {
   public cjx(cis.a $$0, csl $$1, csl $$2) {
      super($$1, $$2, $$0, ha.a);
   }

   public cjx(cis.a $$0, csl $$1, csl $$2, ha $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(gu $$0, cpl $$1, @Nullable cbm $$2, cix $$3, dez $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof ddt $$6 && $$1.a_($$0).b() instanceof czl $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
