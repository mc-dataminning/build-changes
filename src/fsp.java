public class fsp extends fsw {
   public static final xd a = xd.c("options.accessibility.title");

   private static fie<?>[] a(fif $$0) {
      return new fie[]{
         $$0.au(),
         $$0.Y(),
         $$0.u(),
         $$0.I(),
         $$0.q(),
         $$0.s(),
         $$0.aa(),
         $$0.o(),
         $$0.p(),
         $$0.B(),
         $$0.C(),
         $$0.ad(),
         $$0.ae(),
         $$0.af(),
         $$0.al(),
         $$0.am(),
         $$0.an(),
         $$0.aq(),
         $$0.ao(),
         $$0.ap(),
         $$0.b(),
         $$0.a(),
         $$0.t(),
         $$0.c(),
         $$0.v(),
         $$0.J()
      };
   }

   public fsp(fpt $$0, fif $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aT_() {
      super.aT_();
      fjy $$0 = this.d.b(this.c.u());
      if ($$0 != null && !this.m.ac().b().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(fll.a(xd.c("options.accessibility.high_contrast.error.tooltip")));
      }

      fjy $$1 = this.d.b(this.c.J());
      if ($$1 != null) {
         $$1.j = this.G();
      }
   }

   @Override
   protected void m() {
      this.d.a(a(this.c));
   }

   @Override
   protected void D() {
      fns $$0 = this.s.b(fns.e().a(8));
      $$0.a(fka.a(xd.c("options.accessibility.link"), fop.b(this, axy.l)).a());
      $$0.a(fka.a(xc.d, $$0x -> this.m.a(this.b)).a());
   }

   private boolean G() {
      return this.m.s != null && this.m.s.J().b(cqj.e);
   }
}
