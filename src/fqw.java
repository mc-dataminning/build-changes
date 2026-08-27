public class fqw extends fin {
   private static final akt a = new akt("widget/page_forward_highlighted");
   private static final akt b = new akt("widget/page_forward");
   private static final akt c = new akt("widget/page_backward_highlighted");
   private static final akt d = new akt("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fqw(int $$0, int $$1, boolean $$2, fin.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, xd.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      akt $$4;
      if (this.u) {
         $$4 = this.A() ? a : b;
      } else {
         $$4 = this.A() ? c : d;
      }

      $$0.a($$4, this.C(), this.D(), 23, 13);
   }

   @Override
   public void a(gvq $$0) {
      if (this.v) {
         $$0.a(guh.a(avo.cD, 1.0F));
      }
   }
}
