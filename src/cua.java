import javax.annotation.Nullable;

public class cua extends cui {
   public cua(csu.a $$0, dde $$1, dde $$2) {
      super($$1, $$2, $$0, is.a);
   }

   public cua(csu.a $$0, dde $$1, dde $$2, is $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(in $$0, dad $$1, @Nullable clh $$2, csz $$3, dqh $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dow $$6 && $$1.a_($$0).b() instanceof dke $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
