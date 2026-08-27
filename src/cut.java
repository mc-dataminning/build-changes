import javax.annotation.Nullable;

public class cut extends cvb {
   public cut(ctl.a $$0, dea $$1, dea $$2) {
      super($$1, $$2, $$0, it.a);
   }

   public cut(ctl.a $$0, dea $$1, dea $$2, it $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(io $$0, daz $$1, @Nullable cly $$2, ctq $$3, drd $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dps $$6 && $$1.a_($$0).b() instanceof dla $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
