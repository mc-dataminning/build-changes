public class fqs extends fqw {
   private static final wz b = wz.c("multiplayerWarning.header").a(n.r);
   private static final wz c = wz.c("multiplayerWarning.message");
   private static final wz r = wz.c("multiplayerWarning.check");
   private static final wz s = b.f().f("\n").b(c);
   private final fob u;

   public fqs(fob $$0) {
      super(b, c, r, s);
      this.u = $$0;
   }

   @Override
   protected fly m() {
      fmb $$0 = fmb.e().a(8);
      $$0.a(fik.a(wy.i, $$0x -> {
         if (this.a.a()) {
            this.l.m.v = true;
            this.l.m.av();
         }

         this.l.a(new fqr(this.u));
      }).a());
      $$0.a(fik.a(wy.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.l.a(this.u);
   }
}
