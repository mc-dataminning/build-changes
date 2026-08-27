public class fmw extends fmz {
   private static final wi b = wi.c("multiplayerWarning.header").a(n.r);
   private static final wi c = wi.c("multiplayerWarning.message");
   private static final wi d = wi.c("multiplayerWarning.check");
   private static final wi o = b.f().f("\n").b(c);
   private final fjx p;

   public fmw(fjx $$0) {
      super(b, c, d, o);
      this.p = $$0;
   }

   @Override
   protected fhm m() {
      fhp $$0 = fhp.e().a(8);
      $$0.a(fdy.a(wh.i, $$0x -> {
         if (this.a.a()) {
            this.j.m.v = true;
            this.j.m.av();
         }

         this.j.a(new fmu(this.p));
      }).a());
      $$0.a(fdy.a(wh.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.j.a(this.p);
   }
}
