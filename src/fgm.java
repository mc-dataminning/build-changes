public class fgm extends fgp {
   private static final vg b = vg.c("multiplayerWarning.header").a(n.r);
   private static final vg c = vg.c("multiplayerWarning.message");
   private static final vg k = vg.c("multiplayerWarning.check");
   private static final vg l = b.f().f("\n").b(c);
   private final fdm m;

   public fgm(fdm $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(exr.a(vf.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.as();
         }

         this.f.a(new fgk(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(exr.a(vf.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
