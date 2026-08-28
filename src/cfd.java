public class cfd extends cea {
   private final bxm a;

   public cfd(bxm $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dV().V() && this.a.a(bwp.f).f() && chy.a(this.a);
   }

   @Override
   public void d() {
      ((cgn)this.a.O()).c(true);
   }

   @Override
   public void e() {
      if (chy.a(this.a)) {
         ((cgn)this.a.O()).c(false);
      }
   }
}
