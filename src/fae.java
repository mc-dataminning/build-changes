public class fae extends esh {
   private static final aer a = new aer("widget/page_forward_highlighted");
   private static final aer b = new aer("widget/page_forward");
   private static final aer c = new aer("widget/page_backward_highlighted");
   private static final aer d = new aer("widget/page_backward");
   private final boolean s;
   private final boolean t;

   public fae(int $$0, int $$1, boolean $$2, esh.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, te.a, $$3, o);
      this.s = $$2;
      this.t = $$4;
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      aer $$4;
      if (this.s) {
         $$4 = this.n() ? a : b;
      } else {
         $$4 = this.n() ? c : d;
      }

      $$0.a($$4, this.p(), this.r(), 23, 13);
   }

   @Override
   public void a(gcx $$0) {
      if (this.t) {
         $$0.a(gbo.a(aow.ce, 1.0F));
      }
   }
}
