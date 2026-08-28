public class cda extends ccv {
   private final cil a;
   private ary b;
   private boolean c;

   public cda(cil $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      ary $$0 = (ary)this.a.ah_();
      boolean $$1 = $$0 != null && !$$0.aa_() && !$$0.gj().b && !$$0.bj() && !$$0.av;
      return !this.a.go() && $$1 && this.a.gE();
   }

   @Override
   public boolean U_() {
      return !this.c;
   }

   @Override
   public void d() {
      this.b = (ary)this.a.ah_();
      this.c = false;
   }

   @Override
   public void a() {
      if (!this.c && !this.a.x() && !this.a.P_()) {
         if (this.a.cR().c(this.b.cR())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
