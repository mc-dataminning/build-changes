import javax.annotation.Nullable;

public class cvs extends cwa {
   public cvs(cuk.a $$0, dez $$1, dez $$2) {
      super($$1, $$2, $$0, je.a);
   }

   public cvs(cuk.a $$0, dez $$1, dez $$2, je $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(iz $$0, dby $$1, @Nullable cmx $$2, cup $$3, dsc $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dqr $$6 && $$1.a_($$0).b() instanceof dlz $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
