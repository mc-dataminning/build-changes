public class fbc extends fbg {
   private static final tl b = tl.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final tl c = tl.c("title.32bit.deprecation.realms");
   private static final tl k = tl.c("title.32bit.deprecation.realms.check");
   private static final tl l = b.f().f("\n").b(c);
   private final eye m;

   public fbc(eye $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(esk.a(tk.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.ar();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
