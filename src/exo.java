public class exo extends exr {
   private static final sw b = sw.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final sw c = sw.c("title.32bit.deprecation.realms");
   private static final sw k = sw.c("title.32bit.deprecation.realms.check");
   private static final sw l = b.e().f("\n").b(c);
   private final euq m;

   public exo(euq $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(epi.a(sv.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.aq();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
