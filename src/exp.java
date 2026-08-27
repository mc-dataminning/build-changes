public class exp extends exr {
   private static final sw b = sw.c("multiplayerWarning.header").a(n.r);
   private static final sw c = sw.c("multiplayerWarning.message");
   private static final sw k = sw.c("multiplayerWarning.check");
   private static final sw l = b.e().f("\n").b(c);
   private final euq m;

   public exp(euq $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(epi.a(sv.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.aq();
         }

         this.f.a(new exn(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(epi.a(sv.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
