public class cav extends cau {
   private final cme h;

   public cav(cme $$0) {
      super($$0, cmw.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean a() {
      if (this.h.gr()) {
         this.c = this.h.gq();
         return true;
      } else {
         return false;
      }
   }
}
