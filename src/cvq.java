import javax.annotation.Nullable;

public class cvq extends cvy {
   public cvq(cui.a $$0, dex $$1, dex $$2) {
      super($$1, $$2, $$0, je.a);
   }

   public cvq(cui.a $$0, dex $$1, dex $$2, je $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(iz $$0, dbw $$1, @Nullable cmv $$2, cun $$3, dsa $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dqp $$6 && $$1.a_($$0).b() instanceof dlx $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
