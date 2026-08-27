public class fbi extends fbl {
   private static final tm b = tm.c("multiplayerWarning.header").a(n.r);
   private static final tm c = tm.c("multiplayerWarning.message");
   private static final tm k = tm.c("multiplayerWarning.check");
   private static final tm l = b.e().f("\n").b(c);
   private final eyk m;

   public fbi(eyk $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(esq.a(tl.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.ar();
         }

         this.f.a(new fbg(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(esq.a(tl.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
