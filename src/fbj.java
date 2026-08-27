public class fbj extends etj {
   private static final afw a = new afw("widget/page_forward_highlighted");
   private static final afw b = new afw("widget/page_forward");
   private static final afw c = new afw("widget/page_backward_highlighted");
   private static final afw d = new afw("widget/page_backward");
   private final boolean s;
   private final boolean t;

   public fbj(int $$0, int $$1, boolean $$2, etj.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, uh.a, $$3, o);
      this.s = $$2;
      this.t = $$4;
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      afw $$4;
      if (this.s) {
         $$4 = this.n() ? a : b;
      } else {
         $$4 = this.n() ? c : d;
      }

      $$0.a($$4, this.p(), this.r(), 23, 13);
   }

   @Override
   public void a(gem $$0) {
      if (this.t) {
         $$0.a(gdd.a(aqd.ce, 1.0F));
      }
   }
}
