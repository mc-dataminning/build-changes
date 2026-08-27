public class fnj extends ffe {
   private static final akh a = new akh("widget/page_forward_highlighted");
   private static final akh b = new akh("widget/page_forward");
   private static final akh c = new akh("widget/page_backward_highlighted");
   private static final akh d = new akh("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fnj(int $$0, int $$1, boolean $$2, ffe.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, wt.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fer $$0, int $$1, int $$2, float $$3) {
      akh $$4;
      if (this.u) {
         $$4 = this.A() ? a : b;
      } else {
         $$4 = this.A() ? c : d;
      }

      $$0.a($$4, this.C(), this.D(), 23, 13);
   }

   @Override
   public void a(grq $$0) {
      if (this.v) {
         $$0.a(gqh.a(avc.cy, 1.0F));
      }
   }
}
