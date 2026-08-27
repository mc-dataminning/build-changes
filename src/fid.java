public class fid extends fih {
   private static final vq b = vq.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final vq c = vq.c("title.32bit.deprecation.realms");
   private static final vq k = vq.c("title.32bit.deprecation.realms.check");
   private static final vq l = b.f().f("\n").b(c);
   private final ffe m;

   public fid(ffe $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(ezh.a(vp.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.as();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
