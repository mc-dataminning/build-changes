public class bsp extends bso {
   private final cdh h;

   public bsp(cdh $$0) {
      super($$0, cdz.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean a() {
      if (this.h.gg()) {
         this.c = this.h.gf();
         return true;
      } else {
         return false;
      }
   }
}
