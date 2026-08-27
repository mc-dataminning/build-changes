public class fat extends faw {
   private static final te b = te.c("multiplayerWarning.header").a(n.r);
   private static final te c = te.c("multiplayerWarning.message");
   private static final te k = te.c("multiplayerWarning.check");
   private static final te l = b.e().f("\n").b(c);
   private final exv m;

   public fat(exv $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(esi.a(td.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.aq();
         }

         this.f.a(new far(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(esi.a(td.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
