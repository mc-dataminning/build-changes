public class brn extends brm {
   private final ccf h;

   public brn(ccf $$0) {
      super($$0, ccx.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean a() {
      if (this.h.gf()) {
         this.c = this.h.ge();
         return true;
      } else {
         return false;
      }
   }
}
