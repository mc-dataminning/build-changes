public class byv extends bxl {
   private final bqw a;

   public byv(bqw $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aC() && !this.a.dM().b_(this.a.dm()).a(avh.a);
   }

   @Override
   public void c() {
      ib $$0 = null;

      for (ib $$2 : ib.b(
         axk.a(this.a.dr() - 2.0), axk.a(this.a.dt() - 2.0), axk.a(this.a.dx() - 2.0), axk.a(this.a.dr() + 2.0), this.a.ds(), axk.a(this.a.dx() + 2.0)
      )) {
         if (this.a.dM().b_($$2).a(avh.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.H().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
