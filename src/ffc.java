public class ffc extends fff {
   private static final vb b = vb.c("multiplayerWarning.header").a(n.r);
   private static final vb c = vb.c("multiplayerWarning.message");
   private static final vb k = vb.c("multiplayerWarning.check");
   private static final vb l = b.f().f("\n").b(c);
   private final fcc m;

   public ffc(fcc $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(ewh.a(va.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.as();
         }

         this.f.a(new ffa(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(ewh.a(va.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
