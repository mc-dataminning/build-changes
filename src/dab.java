import javax.annotation.Nullable;

public class dab extends daj {
   public dab(dma $$0, dma $$1, cyu.a $$2) {
      super($$0, $$1, ja.a, $$2);
   }

   public dab(cyu.a $$0, dma $$1, dma $$2, ja $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(iu $$0, div $$1, @Nullable cqy $$2, cyy $$3, dzz $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dyl $$6 && $$1.a_($$0).b() instanceof dti $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
