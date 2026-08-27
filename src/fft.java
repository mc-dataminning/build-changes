public class fft extends ffw {
   private static final vd b = vd.c("multiplayerWarning.header").a(n.r);
   private static final vd c = vd.c("multiplayerWarning.message");
   private static final vd k = vd.c("multiplayerWarning.check");
   private static final vd l = b.f().f("\n").b(c);
   private final fct m;

   public fft(fct $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(ewy.a(vc.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.as();
         }

         this.f.a(new ffr(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(ewy.a(vc.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
