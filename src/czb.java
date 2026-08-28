import javax.annotation.Nullable;

public class czb extends czj {
   public czb(dku $$0, dku $$1, cxu.a $$2) {
      super($$0, $$1, jo.a, $$2);
   }

   public czb(cxu.a $$0, dku $$1, dku $$2, jo $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(jj $$0, dhp $$1, @Nullable cqi $$2, cxy $$3, dym $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dwz $$6 && $$1.a_($$0).b() instanceof dsa $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
