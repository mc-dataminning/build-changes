public class cah extends byx {
   private final bsi a;

   public cah(bsi $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aC() && !this.a.dN().b_(this.a.dn()).a(avw.a);
   }

   @Override
   public void c() {
      in $$0 = null;

      for (in $$2 : in.b(
         axz.a(this.a.ds() - 2.0), axz.a(this.a.du() - 2.0), axz.a(this.a.dy() - 2.0), axz.a(this.a.ds() + 2.0), this.a.dt(), axz.a(this.a.dy() + 2.0)
      )) {
         if (this.a.dN().b_($$2).a(avw.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.H().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
