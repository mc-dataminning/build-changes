public class bqb extends bqa {
   private final cat h;

   public bqb(cat $$0) {
      super($$0, cbl.class, 8.0F);
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
