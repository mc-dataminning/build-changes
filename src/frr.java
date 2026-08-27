public class frr extends fru {
   private static final xe b = xe.c("multiplayerWarning.header").a(n.r);
   private static final xe c = xe.c("multiplayerWarning.message");
   private static final xe d = xe.c("multiplayerWarning.check");
   private static final xe r = b.f().f("\n").a(c);
   private final fon s;

   public frr(fon $$0) {
      super(b, c, d, r);
      this.s = $$0;
   }

   @Override
   protected fmb B() {
      fme $$0 = fme.e().a(8);
      $$0.a(fin.a(xd.i, $$0x -> {
         if (this.a.a()) {
            this.m.m.v = true;
            this.m.m.av();
         }

         this.m.a(new frp(this.s));
      }).a());
      $$0.a(fin.a(xd.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.m.a(this.s);
   }
}
