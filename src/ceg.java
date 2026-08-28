public class ceg extends cdd {
   private final bwn a;

   public ceg(bwn $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dW().U() && this.a.a(bvr.f).f() && chb.a(this.a);
   }

   @Override
   public void d() {
      ((cfq)this.a.L()).d(true);
   }

   @Override
   public void e() {
      if (chb.a(this.a)) {
         ((cfq)this.a.L()).d(false);
      }
   }
}
