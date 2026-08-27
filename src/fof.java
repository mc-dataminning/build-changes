public class fof extends fga {
   private static final akn a = new akn("widget/page_forward_highlighted");
   private static final akn b = new akn("widget/page_forward");
   private static final akn c = new akn("widget/page_backward_highlighted");
   private static final akn d = new akn("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fof(int $$0, int $$1, boolean $$2, fga.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, ww.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(ffn $$0, int $$1, int $$2, float $$3) {
      akn $$4;
      if (this.u) {
         $$4 = this.A() ? a : b;
      } else {
         $$4 = this.A() ? c : d;
      }

      $$0.a($$4, this.C(), this.D(), 23, 13);
   }

   @Override
   public void a(gsn $$0) {
      if (this.v) {
         $$0.a(gre.a(avi.cy, 1.0F));
      }
   }
}
