public class fqb extends fqe {
   private static final xo b = xo.c("multiplayerWarning.header").a(n.r);
   private static final xo c = xo.c("multiplayerWarning.message");
   private static final xo d = xo.c("multiplayerWarning.check");
   private static final xo r = b.f().f("\n").b(c);
   private final fnc s;

   public fqb(fnc $$0) {
      super(b, c, d, r);
      this.s = $$0;
   }

   @Override
   protected fkr m() {
      fku $$0 = fku.e().a(8);
      $$0.a(fhd.a(xn.i, $$0x -> {
         if (this.a.a()) {
            this.m.m.v = true;
            this.m.m.av();
         }

         this.m.a(new fqa(this.s));
      }).a());
      $$0.a(fhd.a(xn.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.m.a(this.s);
   }
}
