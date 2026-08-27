public class fmm extends fmq {
   private static final wg b = wg.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final wg c = wg.c("title.32bit.deprecation.realms");
   private static final wg d = wg.c("title.32bit.deprecation.realms.check");
   private static final wg o = b.f().f("\n").b(c);
   private final fjo p;

   public fmm(fjo $$0) {
      super(b, c, d, o);
      this.p = $$0;
   }

   @Override
   protected fhd m() {
      fhg $$0 = fhg.e().a(8);
      $$0.a(fdp.a(wf.d, $$0x -> {
         if (this.a.a()) {
            this.j.m.w = true;
            this.j.m.av();
         }

         this.j.a(this.p);
      }).a());
      return $$0;
   }
}
