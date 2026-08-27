public class fcb extends fcf {
   private static final ui b = ui.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final ui c = ui.c("title.32bit.deprecation.realms");
   private static final ui k = ui.c("title.32bit.deprecation.realms.check");
   private static final ui l = b.f().f("\n").b(c);
   private final ezd m;

   public fcb(ezd $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(etj.a(uh.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.ar();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
