public class fuf extends fuj {
   private static final xl b = xl.c("multiplayerWarning.header").a(n.r);
   private static final xl c = xl.c("multiplayerWarning.message");
   private static final xl d = xl.c("multiplayerWarning.check");
   private static final xl s = b.f().f("\n").b(c);
   private final frp u;

   public fuf(frp $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fpm m() {
      fpp $$0 = fpp.e().a(8);
      $$0.a(flw.a(xk.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.ay();
         }

         this.m.a(new fue(this.u));
      }).a());
      $$0.a(flw.a(xk.k, $$0x -> this.aP_()).a());
      return $$0;
   }

   @Override
   public void aP_() {
      this.m.a(this.u);
   }
}
