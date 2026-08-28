public class caj extends cai {
   private final clt h;

   public caj(clt $$0) {
      super($$0, cml.class, 8.0F);
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
