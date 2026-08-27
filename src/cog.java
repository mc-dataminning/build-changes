import javax.annotation.Nullable;

public class cog extends coq {
   public cog(cnb.a $$0, cwy $$1, cwy $$2) {
      super($$1, $$2, $$0, ic.a);
   }

   public cog(cnb.a $$0, cwy $$1, cwy $$2, ic $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(hx $$0, ctx $$1, @Nullable cfq $$2, cng $$3, djp $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dim $$6 && $$1.a_($$0).b() instanceof ddx $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
