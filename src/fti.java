public class fti extends ftm {
   private static final xh b = xh.c("multiplayerWarning.header").a(n.r);
   private static final xh c = xh.c("multiplayerWarning.message");
   private static final xh d = xh.c("multiplayerWarning.check");
   private static final xh s = b.f().f("\n").b(c);
   private final fqs u;

   public fti(fqs $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected foo m() {
      fos $$0 = fos.e().a(8);
      $$0.a(fkz.a(xg.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.ay();
         }

         this.m.a(new fth(this.u));
      }).a());
      $$0.a(fkz.a(xg.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
