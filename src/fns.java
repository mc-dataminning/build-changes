public class fns extends fnv {
   private static final ws b = ws.c("multiplayerWarning.header").a(n.r);
   private static final ws c = ws.c("multiplayerWarning.message");
   private static final ws d = ws.c("multiplayerWarning.check");
   private static final ws r = b.f().f("\n").b(c);
   private final fkt s;

   public fns(fkt $$0) {
      super(b, c, d, r);
      this.s = $$0;
   }

   @Override
   protected fii m() {
      fil $$0 = fil.e().a(8);
      $$0.a(feu.a(wr.i, $$0x -> {
         if (this.a.a()) {
            this.m.m.v = true;
            this.m.m.av();
         }

         this.m.a(new fnq(this.s));
      }).a());
      $$0.a(feu.a(wr.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.m.a(this.s);
   }
}
