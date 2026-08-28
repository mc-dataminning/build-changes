public class fsx extends ftb {
   private static final xe b = xe.c("multiplayerWarning.header").a(n.r);
   private static final xe c = xe.c("multiplayerWarning.message");
   private static final xe d = xe.c("multiplayerWarning.check");
   private static final xe s = b.f().f("\n").b(c);
   private final fqh u;

   public fsx(fqh $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fod m() {
      fog $$0 = fog.e().a(8);
      $$0.a(fko.a(xd.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.ay();
         }

         this.m.a(new fsw(this.u));
      }).a());
      $$0.a(fko.a(xd.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
