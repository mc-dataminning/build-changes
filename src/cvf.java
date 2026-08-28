import javax.annotation.Nullable;

public class cvf extends cvn {
   public cvf(ctx.a $$0, dfh $$1, dfh $$2) {
      super($$1, $$2, $$0, jf.a);
   }

   public cvf(ctx.a $$0, dfh $$1, dfh $$2, jf $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(ja $$0, dcf $$1, @Nullable cmk $$2, cuc $$3, dsk $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dra $$6 && $$1.a_($$0).b() instanceof dmh $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
