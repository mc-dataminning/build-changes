public class fcc extends fcf {
   private static final ui b = ui.c("multiplayerWarning.header").a(n.r);
   private static final ui c = ui.c("multiplayerWarning.message");
   private static final ui k = ui.c("multiplayerWarning.check");
   private static final ui l = b.f().f("\n").b(c);
   private final ezd m;

   public fcc(ezd $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(etj.a(uh.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.ar();
         }

         this.f.a(new fca(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(etj.a(uh.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
