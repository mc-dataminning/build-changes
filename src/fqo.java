public class fqo extends fqs {
   private static final wy b = wy.c("multiplayerWarning.header").a(n.r);
   private static final wy c = wy.c("multiplayerWarning.message");
   private static final wy q = wy.c("multiplayerWarning.check");
   private static final wy r = b.f().f("\n").b(c);
   private final fnx s;

   public fqo(fnx $$0) {
      super(b, c, q, r);
      this.s = $$0;
   }

   @Override
   protected flu m() {
      flx $$0 = flx.e().a(8);
      $$0.a(fig.a(wx.i, $$0x -> {
         if (this.a.a()) {
            this.l.m.v = true;
            this.l.m.av();
         }

         this.l.a(new fqn(this.s));
      }).a());
      $$0.a(fig.a(wx.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.l.a(this.s);
   }
}
