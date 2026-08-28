public class caf extends cae {
   private final clp h;

   public caf(clp $$0) {
      super($$0, cmh.class, 8.0F);
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
