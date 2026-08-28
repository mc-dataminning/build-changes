public class fra extends frh {
   public static final wz a = wz.c("options.accessibility.title");

   private static fgr<?>[] a(fgs $$0) {
      return new fgr[]{
         $$0.as(),
         $$0.W(),
         $$0.t(),
         $$0.H(),
         $$0.p(),
         $$0.r(),
         $$0.Y(),
         $$0.n(),
         $$0.o(),
         $$0.A(),
         $$0.B(),
         $$0.ab(),
         $$0.ac(),
         $$0.ad(),
         $$0.aj(),
         $$0.ak(),
         $$0.al(),
         $$0.ao(),
         $$0.am(),
         $$0.an(),
         $$0.b(),
         $$0.a(),
         $$0.s(),
         $$0.c(),
         $$0.u()
      };
   }

   public fra(fod $$0, fgs $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aT_() {
      super.aT_();
      fik $$0 = this.r.b(this.c.t());
      if ($$0 != null && !this.l.ac().b().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(fjx.a(wz.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void m() {
      this.r.a(a(this.c));
   }

   @Override
   protected void C() {
      fmd $$0 = this.s.b(fmd.e().a(8));
      $$0.a(fim.a(wz.c("options.accessibility.link"), fna.b(this, axj.l)).a());
      $$0.a(fim.a(wy.d, $$0x -> this.l.a(this.b)).a());
   }
}
