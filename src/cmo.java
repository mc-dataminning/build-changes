import javax.annotation.Nullable;

public class cmo extends cmx {
   public cmo(clj.a $$0, cvf $$1, cvf $$2) {
      super($$1, $$2, $$0, ib.a);
   }

   public cmo(clj.a $$0, cvf $$1, cvf $$2, ib $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(hx $$0, csf $$1, @Nullable cdz $$2, clo $$3, dhn $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dgr $$6 && $$1.a_($$0).b() instanceof dce $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
