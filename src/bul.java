public class bul extends btb {
   private final bmo a;

   public bul(bmo $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aC() && !this.a.dM().b_(this.a.dm()).a(asg.a);
   }

   @Override
   public void c() {
      hx $$0 = null;

      for (hx $$2 : hx.b(
         aui.a(this.a.dr() - 2.0), aui.a(this.a.dt() - 2.0), aui.a(this.a.dx() - 2.0), aui.a(this.a.dr() + 2.0), this.a.ds(), aui.a(this.a.dx() + 2.0)
      )) {
         if (this.a.dM().b_($$2).a(asg.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.K().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
