public class fjh extends fjk {
   private static final vs b = vs.c("multiplayerWarning.header").a(n.r);
   private static final vs c = vs.c("multiplayerWarning.message");
   private static final vs k = vs.c("multiplayerWarning.check");
   private static final vs l = b.f().f("\n").b(c);
   private final fgh m;

   public fjh(fgh $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.c(fak.a(vr.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.as();
         }

         this.f.a(new fjf(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fak.a(vr.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
