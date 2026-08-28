public class cdh extends cce {
   private final bvo a;

   public cdh(bvo $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dW().V() && this.a.a(bus.f).f() && cgc.a(this.a);
   }

   @Override
   public void d() {
      ((cer)this.a.L()).c(true);
   }

   @Override
   public void e() {
      if (cgc.a(this.a)) {
         ((cer)this.a.L()).c(false);
      }
   }
}
