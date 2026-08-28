public class fpy extends fqf {
   public static final wu a = wu.c("options.accessibility.title");

   private static ffq<?>[] a(ffr $$0) {
      return new ffq[]{
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

   public fpy(fnd $$0, ffr $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aO_() {
      super.aO_();
      fhk $$0 = this.q.b(this.c.t());
      if ($$0 != null && !this.l.ac().b().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(fix.a(wu.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void m() {
      this.q.a(a(this.c));
   }

   @Override
   protected void E() {
      fld $$0 = this.r.b(fld.e().a(8));
      $$0.a(fhm.a(wu.c("options.accessibility.link"), fma.b(this, "https://aka.ms/MinecraftJavaAccessibility")).a());
      $$0.a(fhm.a(wt.d, $$0x -> this.l.a(this.b)).a());
   }
}
