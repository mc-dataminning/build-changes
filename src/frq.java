public class frq extends fka {
   private static final alb a = alb.b("widget/page_forward_highlighted");
   private static final alb b = alb.b("widget/page_forward");
   private static final alb c = alb.b("widget/page_backward_highlighted");
   private static final alb d = alb.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public frq(int $$0, int $$1, boolean $$2, fka.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, xc.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fjn $$0, int $$1, int $$2, float $$3) {
      alb $$4;
      if (this.u) {
         $$4 = this.B() ? a : b;
      } else {
         $$4 = this.B() ? c : d;
      }

      $$0.a(ghe::C, $$4, this.D(), this.E(), 23, 13);
   }

   @Override
   public void a(hbj $$0) {
      if (this.v) {
         $$0.a(gzz.a(awd.cy, 1.0F));
      }
   }
}
