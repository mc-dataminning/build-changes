public class fgl extends fgp {
   private static final vg b = vg.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final vg c = vg.c("title.32bit.deprecation.realms");
   private static final vg k = vg.c("title.32bit.deprecation.realms.check");
   private static final vg l = b.f().f("\n").b(c);
   private final fdm m;

   public fgl(fdm $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(exr.a(vf.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.as();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
