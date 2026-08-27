public class fbk extends fbn {
   private static final tn b = tn.c("multiplayerWarning.header").a(n.r);
   private static final tn c = tn.c("multiplayerWarning.message");
   private static final tn k = tn.c("multiplayerWarning.check");
   private static final tn l = b.e().f("\n").b(c);
   private final eym m;

   public fbk(eym $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(ess.a(tm.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.ar();
         }

         this.f.a(new fbi(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(ess.a(tm.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
