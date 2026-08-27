public class btp extends bto {
   private final cep h;

   public btp(cep $$0) {
      super($$0, cfh.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean a() {
      if (this.h.gf()) {
         this.c = this.h.ge();
         return true;
      } else {
         return false;
      }
   }
}
