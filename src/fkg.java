public class fkg extends fkk {
   private static final vu b = vu.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final vu c = vu.c("title.32bit.deprecation.realms");
   private static final vu k = vu.c("title.32bit.deprecation.realms.check");
   private static final vu l = b.f().f("\n").b(c);
   private final fhh m;

   public fkg(fhh $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.c(fbi.a(vt.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.at();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
