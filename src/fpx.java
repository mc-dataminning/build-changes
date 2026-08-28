public class fpx extends fqa {
   private static final xl b = xl.c("multiplayerWarning.header").a(n.r);
   private static final xl c = xl.c("multiplayerWarning.message");
   private static final xl d = xl.c("multiplayerWarning.check");
   private static final xl r = b.f().f("\n").b(c);
   private final fmy s;

   public fpx(fmy $$0) {
      super(b, c, d, r);
      this.s = $$0;
   }

   @Override
   protected fkn m() {
      fkq $$0 = fkq.e().a(8);
      $$0.a(fgz.a(xk.i, $$0x -> {
         if (this.a.a()) {
            this.m.m.v = true;
            this.m.m.av();
         }

         this.m.a(new fpw(this.s));
      }).a());
      $$0.a(fgz.a(xk.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.m.a(this.s);
   }
}
