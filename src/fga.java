public class fga extends fgd {
   private static final vf b = vf.c("multiplayerWarning.header").a(n.r);
   private static final vf c = vf.c("multiplayerWarning.message");
   private static final vf k = vf.c("multiplayerWarning.check");
   private static final vf l = b.f().f("\n").b(c);
   private final fda m;

   public fga(fda $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(exf.a(ve.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.as();
         }

         this.f.a(new ffy(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(exf.a(ve.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
