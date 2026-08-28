import javax.annotation.Nullable;

public class cja extends ciy {
   public cja(bup<? extends cja> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected awn w() {
      return awo.hg;
   }

   @Override
   protected awn gW() {
      return awo.hh;
   }

   @Override
   protected awn o_() {
      return awo.hj;
   }

   @Nullable
   @Override
   protected awn gx() {
      return awo.hk;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.hl;
   }

   @Override
   public boolean a(cgv $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cja) && !($$0 instanceof cjb) ? false : this.hf() && ((ciz)$$0).hf();
      }
   }

   @Override
   protected void he() {
      this.a(awo.hm, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public btz a(arq $$0, btz $$1) {
      bup<? extends ciz> $$2 = $$1 instanceof cjb ? bup.at : bup.z;
      ciz $$3 = $$2.a($$0, buo.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
