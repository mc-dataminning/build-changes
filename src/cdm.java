public class cdm extends cdl {
   private final cpd h;

   public cdm(cpd $$0) {
      super($$0, cpw.class, 8.0F);
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
