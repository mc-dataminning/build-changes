import javax.annotation.Nullable;

public class cyl extends cyt {
   public cyl(dke $$0, dke $$1, cxd.a $$2) {
      super($$0, $$1, jn.a, $$2);
   }

   public cyl(cxd.a $$0, dke $$1, dke $$2, jn $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(ji $$0, dgz $$1, @Nullable cpr $$2, cxh $$3, dxq $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dwf $$6 && $$1.a_($$0).b() instanceof drk $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
