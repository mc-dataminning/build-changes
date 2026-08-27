import javax.annotation.Nullable;

public class bwr extends bwp {
   public bwr(biu<? extends bwr> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected apd w() {
      return ape.fZ;
   }

   @Override
   protected apd gC() {
      return ape.ga;
   }

   @Override
   protected apd l_() {
      return ape.gc;
   }

   @Nullable
   @Override
   protected apd gk() {
      return ape.gd;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.ge;
   }

   @Override
   public boolean a(bur $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bwr) && !($$0 instanceof bws) ? false : this.gL() && ((bwq)$$0).gL();
      }
   }

   @Nullable
   @Override
   public bil a(akr $$0, bil $$1) {
      biu<? extends bwq> $$2 = $$1 instanceof bws ? biu.ap : biu.w;
      bwq $$3 = $$2.a((cpv)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
