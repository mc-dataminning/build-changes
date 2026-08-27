public class fbd extends fbg {
   private static final tl b = tl.c("multiplayerWarning.header").a(n.r);
   private static final tl c = tl.c("multiplayerWarning.message");
   private static final tl k = tl.c("multiplayerWarning.check");
   private static final tl l = b.f().f("\n").b(c);
   private final eye m;

   public fbd(eye $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(esk.a(tk.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.ar();
         }

         this.f.a(new fbb(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(esk.a(tk.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
