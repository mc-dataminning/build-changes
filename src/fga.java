public class fga extends fge {
   private static final vf b = vf.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final vf c = vf.c("title.32bit.deprecation.realms");
   private static final vf k = vf.c("title.32bit.deprecation.realms.check");
   private static final vf l = b.f().f("\n").b(c);
   private final fdb m;

   public fga(fdb $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(exg.a(ve.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.as();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
