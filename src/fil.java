public class fil extends fio {
   private static final vq b = vq.c("multiplayerWarning.header").a(n.r);
   private static final vq c = vq.c("multiplayerWarning.message");
   private static final vq k = vq.c("multiplayerWarning.check");
   private static final vq l = b.f().f("\n").b(c);
   private final ffl m;

   public fil(ffl $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.c(ezo.a(vp.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.as();
         }

         this.f.a(new fij(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(ezo.a(vp.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
