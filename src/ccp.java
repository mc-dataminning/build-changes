public class ccp extends cco {
   private final coe h;

   public ccp(coe $$0) {
      super($$0, coy.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean b() {
      if (this.h.gt()) {
         this.c = this.h.gs();
         return true;
      } else {
         return false;
      }
   }
}
