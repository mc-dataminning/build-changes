public class bzq extends bzl {
   private final cfb a;
   private aqu b;
   private boolean c;

   public bzq(cfb $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      aqu $$0 = (aqu)this.a.Q_();
      boolean $$1 = $$0 != null && !$$0.O_() && !$$0.gm().b && !$$0.bi() && !$$0.aF;
      return !this.a.gy() && $$1 && this.a.gH();
   }

   @Override
   public boolean R_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (aqu)this.a.Q_();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.x() && !this.a.gl()) {
         if (this.a.cP().c(this.b.cP())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
