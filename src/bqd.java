public class bqd extends bqc {
   private final cav h;

   public bqd(cav $$0) {
      super($$0, cbn.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean a() {
      if (this.h.ga()) {
         this.c = this.h.fZ();
         return true;
      } else {
         return false;
      }
   }
}
