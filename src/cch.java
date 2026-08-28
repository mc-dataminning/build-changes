public class cch extends ccc {
   private final chs a;
   private arr b;
   private boolean c;

   public cch(chs $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      arr $$0 = (arr)this.a.T_();
      boolean $$1 = $$0 != null && !$$0.R_() && !$$0.gm().b && !$$0.bl() && !$$0.aw;
      return !this.a.gv() && $$1 && this.a.gL();
   }

   @Override
   public boolean U_() {
      return !this.c;
   }

   @Override
   public void d() {
      this.b = (arr)this.a.T_();
      this.c = false;
   }

   @Override
   public void a() {
      if (!this.c && !this.a.y() && !this.a.M_()) {
         if (this.a.cT().c(this.b.cT())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
