public class ftq extends ftu {
   private static final xi b = xi.c("multiplayerWarning.header").a(n.r);
   private static final xi c = xi.c("multiplayerWarning.message");
   private static final xi d = xi.c("multiplayerWarning.check");
   private static final xi s = b.f().f("\n").b(c);
   private final fra u;

   public ftq(fra $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fox m() {
      fpa $$0 = fpa.e().a(8);
      $$0.a(flh.a(xh.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.ay();
         }

         this.m.a(new ftp(this.u));
      }).a());
      $$0.a(flh.a(xh.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
