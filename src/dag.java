import javax.annotation.Nullable;

public class dag extends dao {
   public dag(dmf $$0, dmf $$1, cyz.a $$2) {
      super($$0, $$1, ja.a, $$2);
   }

   public dag(cyz.a $$0, dmf $$1, dmf $$2, ja $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(iu $$0, dja $$1, @Nullable crc $$2, czd $$3, eah $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dyt $$6 && $$1.a_($$0).b() instanceof dtp $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
