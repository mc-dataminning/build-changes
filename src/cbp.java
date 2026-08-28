public class cbp extends cbk {
   private final cha a;
   private ark b;
   private boolean c;

   public cbp(cha $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      ark $$0 = (ark)this.a.S_();
      boolean $$1 = $$0 != null && !$$0.Q_() && !$$0.ge().b && !$$0.bi() && !$$0.aw;
      return !this.a.go() && $$1 && this.a.gE();
   }

   @Override
   public boolean T_() {
      return !this.c;
   }

   @Override
   public void d() {
      this.b = (ark)this.a.S_();
      this.c = false;
   }

   @Override
   public void a() {
      if (!this.c && !this.a.y() && !this.a.L_()) {
         if (this.a.cO().c(this.b.cO())) {
            this.c = this.a.b(this.b);
         }
      }
   }
}
