public class bqm extends bql {
   private final cbe h;

   public bqm(cbe $$0) {
      super($$0, cbw.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean a() {
      if (this.h.ge()) {
         this.c = this.h.gd();
         return true;
      } else {
         return false;
      }
   }
}
