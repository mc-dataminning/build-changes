public class cfb extends cfa {
   private final crg h;

   public cfb(crg $$0) {
      super($$0, crz.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean b() {
      if (this.h.gu()) {
         this.c = this.h.x();
         return true;
      } else {
         return false;
      }
   }
}
