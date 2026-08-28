public class fpi extends fhc {
   private static final ale a = new ale("widget/page_forward_highlighted");
   private static final ale b = new ale("widget/page_forward");
   private static final ale c = new ale("widget/page_backward_highlighted");
   private static final ale d = new ale("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fpi(int $$0, int $$1, boolean $$2, fhc.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, xn.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fgp $$0, int $$1, int $$2, float $$3) {
      ale $$4;
      if (this.u) {
         $$4 = this.A() ? a : b;
      } else {
         $$4 = this.A() ? c : d;
      }

      $$0.a($$4, this.C(), this.D(), 23, 13);
   }

   @Override
   public void a(gtt $$0) {
      if (this.v) {
         $$0.a(gsg.a(avz.cy, 1.0F));
      }
   }
}
