import javax.annotation.Nullable;

public class caf extends cad {
   public caf(bmc<? extends caf> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected ars y() {
      return art.gR;
   }

   @Override
   protected ars gE() {
      return art.gS;
   }

   @Override
   protected ars n_() {
      return art.gU;
   }

   @Nullable
   @Override
   protected ars gm() {
      return art.gV;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.gW;
   }

   @Override
   public boolean a(byc $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof caf) && !($$0 instanceof cag) ? false : this.gN() && ((cae)$$0).gN();
      }
   }

   @Nullable
   @Override
   public blr a(ane $$0, blr $$1) {
      bmc<? extends cae> $$2 = $$1 instanceof cag ? bmc.ar : bmc.y;
      cae $$3 = $$2.a((ctx)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
