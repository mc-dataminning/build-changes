public class cdb extends ccw {
   private final cio a;
   private are b;
   private boolean c;

   public cdb(cio $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      are $$0 = (are)this.a.ae_();
      boolean $$1 = $$0 != null && !$$0.U_() && !$$0.gm().b && !$$0.bj() && !$$0.av;
      return !this.a.gs() && $$1 && this.a.gI();
   }

   @Override
   public boolean P_() {
      return !this.c;
   }

   @Override
   public void d() {
      this.b = (are)this.a.ae_();
      this.c = false;
   }

   @Override
   public void a() {
      if (!this.c && !this.a.x() && !this.a.O_()) {
         if (this.a.cQ().c(this.b.cQ())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
