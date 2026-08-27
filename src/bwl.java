public class bwl extends bvb {
   private final boo a;

   public bwl(boo $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aC() && !this.a.dM().b_(this.a.dm()).a(aue.a);
   }

   @Override
   public void c() {
      hz $$0 = null;

      for (hz $$2 : hz.b(
         awh.a(this.a.dr() - 2.0), awh.a(this.a.dt() - 2.0), awh.a(this.a.dx() - 2.0), awh.a(this.a.dr() + 2.0), this.a.ds(), awh.a(this.a.dx() + 2.0)
      )) {
         if (this.a.dM().b_($$2).a(aue.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.K().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
