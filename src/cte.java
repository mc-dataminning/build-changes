import javax.annotation.Nullable;

public class cte extends ctm {
   public cte(cry.a $$0, dcv $$1, dcv $$2) {
      super($$1, $$2, $$0, ir.a);
   }

   public cte(cry.a $$0, dcv $$1, dcv $$2, ir $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(im $$0, czu $$1, @Nullable ckl $$2, csd $$3, dpy $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof don $$6 && $$1.a_($$0).b() instanceof djv $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
