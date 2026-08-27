import javax.annotation.Nullable;

public class ccp extends ccn {
   public ccp(bol<? extends ccp> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected ato y() {
      return atp.gS;
   }

   @Override
   protected ato gK() {
      return atp.gT;
   }

   @Override
   protected ato n_() {
      return atp.gV;
   }

   @Nullable
   @Override
   protected ato gs() {
      return atp.gW;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.gX;
   }

   @Override
   public boolean a(cam $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof ccp) && !($$0 instanceof ccq) ? false : this.gT() && ((cco)$$0).gT();
      }
   }

   @Nullable
   @Override
   public boa a(apa $$0, boa $$1) {
      bol<? extends cco> $$2 = $$1 instanceof ccq ? bol.ar : bol.y;
      cco $$3 = $$2.a((cwe)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
