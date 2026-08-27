public class bza extends bxq {
   private final brb a;

   public bza(brb $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aC() && !this.a.dM().b_(this.a.dm()).a(avj.a);
   }

   @Override
   public void c() {
      id $$0 = null;

      for (id $$2 : id.b(
         axm.a(this.a.dr() - 2.0), axm.a(this.a.dt() - 2.0), axm.a(this.a.dx() - 2.0), axm.a(this.a.dr() + 2.0), this.a.ds(), axm.a(this.a.dx() + 2.0)
      )) {
         if (this.a.dM().b_($$2).a(avj.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.H().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
