public class fsj extends fsn {
   private static final xd b = xd.c("multiplayerWarning.header").a(n.r);
   private static final xd c = xd.c("multiplayerWarning.message");
   private static final xd d = xd.c("multiplayerWarning.check");
   private static final xd s = b.f().f("\n").b(c);
   private final fpt u;

   public fsj(fpt $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fnp m() {
      fns $$0 = fns.e().a(8);
      $$0.a(fka.a(xc.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.ay();
         }

         this.m.a(new fsi(this.u));
      }).a());
      $$0.a(fka.a(xc.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
