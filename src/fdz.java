public class fdz extends fec {
   private static final uv b = uv.c("multiplayerWarning.header").a(n.r);
   private static final uv c = uv.c("multiplayerWarning.message");
   private static final uv k = uv.c("multiplayerWarning.check");
   private static final uv l = b.f().f("\n").b(c);
   private final faz m;

   public fdz(faz $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(eve.a(uu.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.as();
         }

         this.f.a(new fdx(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(eve.a(uu.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
