import javax.annotation.Nullable;

public class ctn extends csv {
   private static final tm a = tm.c("container.cartography_table");

   protected ctn(dfi.d $$0) {
      super($$0);
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apo.aw);
         return bgy.b;
      }
   }

   @Nullable
   @Override
   public bhb b(dfj $$0, cpv $$1, gw $$2) {
      return new bhg(($$2x, $$3, $$4) -> new cer($$2x, $$3, cew.a($$1, $$2)), a);
   }
}
