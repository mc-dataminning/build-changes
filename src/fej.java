public class fej extends ewh {
   private static final agt a = new agt("widget/page_forward_highlighted");
   private static final agt b = new agt("widget/page_forward");
   private static final agt c = new agt("widget/page_backward_highlighted");
   private static final agt d = new agt("widget/page_backward");
   private final boolean t;
   private final boolean u;

   public fej(int $$0, int $$1, boolean $$2, ewh.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, va.a, $$3, p);
      this.t = $$2;
      this.u = $$4;
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      agt $$4;
      if (this.t) {
         $$4 = this.n() ? a : b;
      } else {
         $$4 = this.n() ? c : d;
      }

      $$0.a($$4, this.p(), this.r(), 23, 13);
   }

   @Override
   public void a(gia $$0) {
      if (this.u) {
         $$0.a(ggr.a(arc.ce, 1.0F));
      }
   }
}
