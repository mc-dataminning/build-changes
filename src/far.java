public class far extends ess {
   private static final aey a = new aey("widget/page_forward_highlighted");
   private static final aey b = new aey("widget/page_forward");
   private static final aey c = new aey("widget/page_backward_highlighted");
   private static final aey d = new aey("widget/page_backward");
   private final boolean s;
   private final boolean t;

   public far(int $$0, int $$1, boolean $$2, ess.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, tm.a, $$3, o);
      this.s = $$2;
      this.t = $$4;
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      aey $$4;
      if (this.s) {
         $$4 = this.o() ? a : b;
      } else {
         $$4 = this.o() ? c : d;
      }

      $$0.a($$4, this.r(), this.t(), 23, 13);
   }

   @Override
   public void a(gds $$0) {
      if (this.t) {
         $$0.a(gcj.a(apf.ce, 1.0F));
      }
   }
}
