public class ftu extends fmd {
   private static final alj a = alj.b("widget/page_forward_highlighted");
   private static final alj b = alj.b("widget/page_forward");
   private static final alj c = alj.b("widget/page_backward_highlighted");
   private static final alj d = alj.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public ftu(int $$0, int $$1, boolean $$2, fmd.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, xi.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      alj $$4;
      if (this.u) {
         $$4 = this.B() ? a : b;
      } else {
         $$4 = this.B() ? c : d;
      }

      $$0.a(gjq::B, $$4, this.D(), this.E(), 23, 13);
   }

   @Override
   public void a(heg $$0) {
      if (this.v) {
         $$0.a(hcw.a(awn.cy, 1.0F));
      }
   }
}
