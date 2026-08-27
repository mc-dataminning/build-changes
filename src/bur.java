public class bur extends bth {
   private final bmu a;

   public bur(bmu $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aC() && !this.a.dM().b_(this.a.dm()).a(asm.a);
   }

   @Override
   public void c() {
      hx $$0 = null;

      for (hx $$2 : hx.b(
         auo.a(this.a.dr() - 2.0), auo.a(this.a.dt() - 2.0), auo.a(this.a.dx() - 2.0), auo.a(this.a.dr() + 2.0), this.a.ds(), auo.a(this.a.dx() + 2.0)
      )) {
         if (this.a.dM().b_($$2).a(asm.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.K().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
