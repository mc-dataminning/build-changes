public class cbw extends cam {
   private final btw a;

   public cbw(btw $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aF() && !this.a.dO().b_(this.a.do()).a(awk.a);
   }

   @Override
   public void d() {
      jd $$0 = null;

      for (jd $$2 : jd.b(
         ayo.a(this.a.dt() - 2.0), ayo.a(this.a.dv() - 2.0), ayo.a(this.a.dz() - 2.0), ayo.a(this.a.dt() + 2.0), this.a.du(), ayo.a(this.a.dz() + 2.0)
      )) {
         if (this.a.dO().b_($$2).a(awk.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.J().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
