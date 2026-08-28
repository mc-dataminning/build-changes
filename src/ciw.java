import javax.annotation.Nullable;

public class ciw extends ciu {
   public ciw(bul<? extends ciw> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected awk w() {
      return awl.hg;
   }

   @Override
   protected awk gV() {
      return awl.hh;
   }

   @Override
   protected awk o_() {
      return awl.hj;
   }

   @Nullable
   @Override
   protected awk gw() {
      return awl.hk;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.hl;
   }

   @Override
   public boolean a(cgr $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof ciw) && !($$0 instanceof cix) ? false : this.he() && ((civ)$$0).he();
      }
   }

   @Override
   protected void hd() {
      this.a(awl.hm, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public btv a(arn $$0, btv $$1) {
      bul<? extends civ> $$2 = $$1 instanceof cix ? bul.at : bul.z;
      civ $$3 = $$2.a($$0, buk.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
