import javax.annotation.Nullable;

public class cjc extends cja {
   public cjc(bur<? extends cjc> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected avz u() {
      return awa.hA;
   }

   @Override
   protected avz gQ() {
      return awa.hB;
   }

   @Override
   protected avz o_() {
      return awa.hD;
   }

   @Nullable
   @Override
   protected avz gr() {
      return awa.hE;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.hF;
   }

   @Override
   public boolean a(cgx $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cjc) && !($$0 instanceof cjd) ? false : this.gY() && ((cjb)$$0).gY();
      }
   }

   @Override
   protected void gX() {
      this.a(awa.hG, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bub a(arc $$0, bub $$1) {
      bur<? extends cjb> $$2 = $$1 instanceof cjd ? bur.aG : bur.J;
      cjb $$3 = $$2.a($$0, buq.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
