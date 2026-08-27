public class bxz extends bxy {
   private final cji h;

   public bxz(cji $$0) {
      super($$0, cka.class, 8.0F);
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
