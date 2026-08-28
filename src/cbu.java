public class cbu extends cak {
   private final btu a;

   public cbu(btu $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aF() && !this.a.dQ().b_(this.a.dq()).a(awj.a);
   }

   @Override
   public void d() {
      jd $$0 = null;

      for (jd $$2 : jd.b(
         ayn.a(this.a.dv() - 2.0), ayn.a(this.a.dx() - 2.0), ayn.a(this.a.dB() - 2.0), ayn.a(this.a.dv() + 2.0), this.a.dw(), ayn.a(this.a.dB() + 2.0)
      )) {
         if (this.a.dQ().b_($$2).a(awj.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.H().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
