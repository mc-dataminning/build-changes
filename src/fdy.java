public class fdy extends fec {
   private static final uv b = uv.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final uv c = uv.c("title.32bit.deprecation.realms");
   private static final uv k = uv.c("title.32bit.deprecation.realms.check");
   private static final uv l = b.f().f("\n").b(c);
   private final faz m;

   public fdy(faz $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(eve.a(uu.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.as();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
