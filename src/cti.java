import javax.annotation.Nullable;

public class cti extends csq {
   private static final ti a = ti.c("container.cartography_table");

   protected cti(dfd.d $$0) {
      super($$0);
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         return bgt.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apj.aw);
         return bgt.b;
      }
   }

   @Nullable
   @Override
   public bgw b(dfe $$0, cpq $$1, gw $$2) {
      return new bhb(($$2x, $$3, $$4) -> new cem($$2x, $$3, cer.a($$1, $$2)), a);
   }
}
