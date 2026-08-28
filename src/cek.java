public class cek extends cef {
   private final ckb a;
   private boolean b;

   public cek(ckb $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      if (!(this.a.e() instanceof arr $$0)) {
         return false;
      } else {
         boolean $$1 = !$$0.V_() && !$$0.gj().b && !$$0.bh() && !$$0.av;
         return !this.a.gt() && $$1 && this.a.gJ();
      }
   }

   @Override
   public boolean Q_() {
      return !this.b;
   }

   @Override
   public void d() {
      this.b = false;
   }

   @Override
   public void a() {
      if (!this.b && !this.a.x() && !this.a.O_()) {
         if (this.a.e() instanceof arr $$0 && this.a.cQ().c($$0.cQ())) {
            this.b = this.a.b($$0);
         }
      }
   }
}
