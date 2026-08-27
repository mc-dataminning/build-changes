public class bvo extends bvn {
   private final cgt h;

   public bvo(cgt $$0) {
      super($$0, chl.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean a() {
      if (this.h.gh()) {
         this.c = this.h.gg();
         return true;
      } else {
         return false;
      }
   }
}
