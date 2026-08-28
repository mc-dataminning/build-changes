public class fse extends fko {
   private static final ale a = ale.b("widget/page_forward_highlighted");
   private static final ale b = ale.b("widget/page_forward");
   private static final ale c = ale.b("widget/page_backward_highlighted");
   private static final ale d = ale.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fse(int $$0, int $$1, boolean $$2, fko.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, xd.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fkb $$0, int $$1, int $$2, float $$3) {
      ale $$4;
      if (this.u) {
         $$4 = this.B() ? a : b;
      } else {
         $$4 = this.B() ? c : d;
      }

      $$0.a(ghv::B, $$4, this.D(), this.E(), 23, 13);
   }

   @Override
   public void a(hcf $$0) {
      if (this.v) {
         $$0.a(hav.a(awg.cy, 1.0F));
      }
   }
}
