import javax.annotation.Nullable;

public class cey extends cew {
   public cey(bqr<? extends cey> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected auy v() {
      return auz.ha;
   }

   @Override
   protected auy gN() {
      return auz.hb;
   }

   @Override
   protected auy o_() {
      return auz.hd;
   }

   @Nullable
   @Override
   protected auy gw() {
      return auz.he;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.hf;
   }

   @Override
   public boolean a(cct $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cey) && !($$0 instanceof cez) ? false : this.gW() && ((cex)$$0).gW();
      }
   }

   @Override
   protected void gV() {
      this.a(auz.hg, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bqf a(aqe $$0, bqf $$1) {
      bqr<? extends cex> $$2 = $$1 instanceof cez ? bqr.as : bqr.z;
      cex $$3 = $$2.a((czu)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
