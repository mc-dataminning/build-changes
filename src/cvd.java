import javax.annotation.Nullable;

public class cvd extends cvl {
   public cvd(ctv.a $$0, dff $$1, dff $$2) {
      super($$1, $$2, $$0, jf.a);
   }

   public cvd(ctv.a $$0, dff $$1, dff $$2, jf $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(ja $$0, dcd $$1, @Nullable cmh $$2, cua $$3, dsh $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dqx $$6 && $$1.a_($$0).b() instanceof dmf $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
