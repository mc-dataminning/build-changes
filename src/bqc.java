public class bqc extends bqb {
   private final cau h;

   public bqc(cau $$0) {
      super($$0, cbm.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean a() {
      if (this.h.gb()) {
         this.c = this.h.ga();
         return true;
      } else {
         return false;
      }
   }
}
