public class ceo extends cen {
   private final cqt h;

   public ceo(cqt $$0) {
      super($$0, crm.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean b() {
      if (this.h.gt()) {
         this.c = this.h.x();
         return true;
      } else {
         return false;
      }
   }
}
