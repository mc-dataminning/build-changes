public class fqd extends fqg {
   private static final xp b = xp.c("multiplayerWarning.header").a(n.r);
   private static final xp c = xp.c("multiplayerWarning.message");
   private static final xp d = xp.c("multiplayerWarning.check");
   private static final xp r = b.f().f("\n").b(c);
   private final fne s;

   public fqd(fne $$0) {
      super(b, c, d, r);
      this.s = $$0;
   }

   @Override
   protected fkt m() {
      fkw $$0 = fkw.e().a(8);
      $$0.a(fhf.a(xo.i, $$0x -> {
         if (this.a.a()) {
            this.m.m.v = true;
            this.m.m.av();
         }

         this.m.a(new fqc(this.s));
      }).a());
      $$0.a(fhf.a(xo.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.m.a(this.s);
   }
}
