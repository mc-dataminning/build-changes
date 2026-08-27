public class bxv extends bwl {
   private final bpw a;

   public bxv(bpw $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aC() && !this.a.dM().b_(this.a.dm()).a(aus.a);
   }

   @Override
   public void c() {
      ib $$0 = null;

      for (ib $$2 : ib.b(
         aww.a(this.a.dr() - 2.0), aww.a(this.a.dt() - 2.0), aww.a(this.a.dx() - 2.0), aww.a(this.a.dr() + 2.0), this.a.ds(), aww.a(this.a.dx() + 2.0)
      )) {
         if (this.a.dM().b_($$2).a(aus.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.H().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
