public class cef extends cea {
   private final cjx a;
   private boolean b;

   public cef(cjx $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      if (!(this.a.e() instanceof arr $$0)) {
         return false;
      } else {
         boolean $$1 = !$$0.V_() && !$$0.gk().b && !$$0.bj() && !$$0.av;
         return !this.a.gr() && $$1 && this.a.gH();
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
         if (this.a.e() instanceof arr $$0 && this.a.cR().c($$0.cR())) {
            this.b = this.a.b($$0);
         }
      }
   }
}
