public class fbc extends fbg {
   private static final ti b = ti.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final ti c = ti.c("title.32bit.deprecation.realms");
   private static final ti k = ti.c("title.32bit.deprecation.realms.check");
   private static final ti l = b.e().f("\n").b(c);
   private final eyf m;

   public fbc(eyf $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(esl.a(th.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.ar();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
