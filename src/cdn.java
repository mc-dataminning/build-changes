public class cdn extends cdm {
   private final cpe h;

   public cdn(cpe $$0) {
      super($$0, cpx.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean b() {
      if (this.h.gp()) {
         this.c = this.h.go();
         return true;
      } else {
         return false;
      }
   }
}
