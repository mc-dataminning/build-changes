public class cck extends ccf {
   private final chv a;
   private arq b;
   private boolean c;

   public cck(chv $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      arq $$0 = (arq)this.a.ag_();
      boolean $$1 = $$0 != null && !$$0.Y_() && !$$0.gh().b && !$$0.bj() && !$$0.av;
      return !this.a.gm() && $$1 && this.a.gC();
   }

   @Override
   public boolean S_() {
      return !this.c;
   }

   @Override
   public void d() {
      this.b = (arq)this.a.ag_();
      this.c = false;
   }

   @Override
   public void a() {
      if (!this.c && !this.a.v() && !this.a.N_()) {
         if (this.a.cR().c(this.b.cR())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
