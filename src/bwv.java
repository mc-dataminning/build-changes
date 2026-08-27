public class bwv extends bwu {
   private final cic h;

   public bwv(cic $$0) {
      super($$0, ciu.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean a() {
      if (this.h.go()) {
         this.c = this.h.gn();
         return true;
      } else {
         return false;
      }
   }
}
