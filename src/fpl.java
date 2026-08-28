public class fpl extends fhf {
   private static final alf a = new alf("widget/page_forward_highlighted");
   private static final alf b = new alf("widget/page_forward");
   private static final alf c = new alf("widget/page_backward_highlighted");
   private static final alf d = new alf("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fpl(int $$0, int $$1, boolean $$2, fhf.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, xo.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fgs $$0, int $$1, int $$2, float $$3) {
      alf $$4;
      if (this.u) {
         $$4 = this.A() ? a : b;
      } else {
         $$4 = this.A() ? c : d;
      }

      $$0.a($$4, this.C(), this.D(), 23, 13);
   }

   @Override
   public void a(gtw $$0) {
      if (this.v) {
         $$0.a(gsj.a(awa.cy, 1.0F));
      }
   }
}
