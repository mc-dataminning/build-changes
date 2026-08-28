public class fpf extends fgz {
   private static final alb a = new alb("widget/page_forward_highlighted");
   private static final alb b = new alb("widget/page_forward");
   private static final alb c = new alb("widget/page_backward_highlighted");
   private static final alb d = new alb("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fpf(int $$0, int $$1, boolean $$2, fgz.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, xk.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fgm $$0, int $$1, int $$2, float $$3) {
      alb $$4;
      if (this.u) {
         $$4 = this.A() ? a : b;
      } else {
         $$4 = this.A() ? c : d;
      }

      $$0.a($$4, this.C(), this.D(), 23, 13);
   }

   @Override
   public void a(gtq $$0) {
      if (this.v) {
         $$0.a(gsd.a(avw.cy, 1.0F));
      }
   }
}
