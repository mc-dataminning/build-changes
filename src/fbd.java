public class fbd extends fbg {
   private static final ti b = ti.c("multiplayerWarning.header").a(n.r);
   private static final ti c = ti.c("multiplayerWarning.message");
   private static final ti k = ti.c("multiplayerWarning.check");
   private static final ti l = b.e().f("\n").b(c);
   private final eyf m;

   public fbd(eyf $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(esl.a(th.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.ar();
         }

         this.f.a(new fbb(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(esl.a(th.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
