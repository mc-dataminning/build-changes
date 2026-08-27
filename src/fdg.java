public class fdg extends eve {
   private static final agm a = new agm("widget/page_forward_highlighted");
   private static final agm b = new agm("widget/page_forward");
   private static final agm c = new agm("widget/page_backward_highlighted");
   private static final agm d = new agm("widget/page_backward");
   private final boolean t;
   private final boolean u;

   public fdg(int $$0, int $$1, boolean $$2, eve.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, uu.a, $$3, p);
      this.t = $$2;
      this.u = $$4;
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      agm $$4;
      if (this.t) {
         $$4 = this.n() ? a : b;
      } else {
         $$4 = this.n() ? c : d;
      }

      $$0.a($$4, this.p(), this.r(), 23, 13);
   }

   @Override
   public void a(ggl $$0) {
      if (this.u) {
         $$0.a(gfc.a(aqv.ce, 1.0F));
      }
   }
}
