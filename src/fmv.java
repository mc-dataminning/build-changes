public class fmv extends fmz {
   private static final wi b = wi.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final wi c = wi.c("title.32bit.deprecation.realms");
   private static final wi d = wi.c("title.32bit.deprecation.realms.check");
   private static final wi o = b.f().f("\n").b(c);
   private final fjx p;

   public fmv(fjx $$0) {
      super(b, c, d, o);
      this.p = $$0;
   }

   @Override
   protected fhm m() {
      fhp $$0 = fhp.e().a(8);
      $$0.a(fdy.a(wh.d, $$0x -> {
         if (this.a.a()) {
            this.j.m.w = true;
            this.j.m.av();
         }

         this.j.a(this.p);
      }).a());
      return $$0;
   }
}
