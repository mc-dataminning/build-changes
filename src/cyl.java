import javax.annotation.Nullable;

public class cyl extends cyt {
   public cyl(dkd $$0, dkd $$1, cxc.a $$2) {
      super($$0, $$1, jm.a, $$2);
   }

   public cyl(cxc.a $$0, dkd $$1, dkd $$2, jm $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(jh $$0, dgz $$1, @Nullable cpo $$2, cxg $$3, dxo $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dwd $$6 && $$1.a_($$0).b() instanceof dri $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
