public class fmn extends fmq {
   private static final wg b = wg.c("multiplayerWarning.header").a(n.r);
   private static final wg c = wg.c("multiplayerWarning.message");
   private static final wg d = wg.c("multiplayerWarning.check");
   private static final wg o = b.f().f("\n").b(c);
   private final fjo p;

   public fmn(fjo $$0) {
      super(b, c, d, o);
      this.p = $$0;
   }

   @Override
   protected fhd m() {
      fhg $$0 = fhg.e().a(8);
      $$0.a(fdp.a(wf.i, $$0x -> {
         if (this.a.a()) {
            this.j.m.v = true;
            this.j.m.av();
         }

         this.j.a(new fml(this.p));
      }).a());
      $$0.a(fdp.a(wf.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.j.a(this.p);
   }
}
