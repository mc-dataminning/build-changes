public class bzl extends byb {
   private final brm a;

   public bzl(brm $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aC() && !this.a.dN().b_(this.a.dn()).a(avt.a);
   }

   @Override
   public void c() {
      im $$0 = null;

      for (im $$2 : im.b(
         axw.a(this.a.ds() - 2.0), axw.a(this.a.du() - 2.0), axw.a(this.a.dy() - 2.0), axw.a(this.a.ds() + 2.0), this.a.dt(), axw.a(this.a.dy() + 2.0)
      )) {
         if (this.a.dN().b_($$2).a(avt.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.H().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
