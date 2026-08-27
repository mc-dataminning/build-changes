public class fkh extends fkk {
   private static final vu b = vu.c("multiplayerWarning.header").a(n.r);
   private static final vu c = vu.c("multiplayerWarning.message");
   private static final vu k = vu.c("multiplayerWarning.check");
   private static final vu l = b.f().f("\n").b(c);
   private final fhh m;

   public fkh(fhh $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.c(fbi.a(vt.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.at();
         }

         this.f.a(new fkf(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fbi.a(vt.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
