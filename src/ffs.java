public class ffs extends ffw {
   private static final vd b = vd.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final vd c = vd.c("title.32bit.deprecation.realms");
   private static final vd k = vd.c("title.32bit.deprecation.realms.check");
   private static final vd l = b.f().f("\n").b(c);
   private final fct m;

   public ffs(fct $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(ewy.a(vc.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.as();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
