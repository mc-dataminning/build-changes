import javax.annotation.Nullable;

public class cvn extends cvv {
   public cvn(cuf.a $$0, deu $$1, deu $$2) {
      super($$1, $$2, $$0, je.a);
   }

   public cvn(cuf.a $$0, deu $$1, deu $$2, je $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(iz $$0, dbt $$1, @Nullable cms $$2, cuk $$3, drx $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dqm $$6 && $$1.a_($$0).b() instanceof dlu $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
