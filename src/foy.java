public class foy extends fpb {
   private static final wx b = wx.c("multiplayerWarning.header").a(n.r);
   private static final wx c = wx.c("multiplayerWarning.message");
   private static final wx d = wx.c("multiplayerWarning.check");
   private static final wx r = b.f().f("\n").b(c);
   private final fly s;

   public foy(fly $$0) {
      super(b, c, d, r);
      this.s = $$0;
   }

   @Override
   protected fjn m() {
      fjq $$0 = fjq.e().a(8);
      $$0.a(ffz.a(ww.i, $$0x -> {
         if (this.a.a()) {
            this.m.m.v = true;
            this.m.m.av();
         }

         this.m.a(new fow(this.s));
      }).a());
      $$0.a(ffz.a(ww.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.m.a(this.s);
   }
}
