public class bne extends bnd {
   private final bxw h;

   public bne(bxw $$0) {
      super($$0, byo.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean a() {
      if (this.h.fZ()) {
         this.c = this.h.fY();
         return true;
      } else {
         return false;
      }
   }
}
