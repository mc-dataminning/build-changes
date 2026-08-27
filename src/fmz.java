public class fmz extends feu {
   private static final akf a = new akf("widget/page_forward_highlighted");
   private static final akf b = new akf("widget/page_forward");
   private static final akf c = new akf("widget/page_backward_highlighted");
   private static final akf d = new akf("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fmz(int $$0, int $$1, boolean $$2, feu.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, wr.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(feh $$0, int $$1, int $$2, float $$3) {
      akf $$4;
      if (this.u) {
         $$4 = this.A() ? a : b;
      } else {
         $$4 = this.A() ? c : d;
      }

      $$0.a($$4, this.C(), this.D(), 23, 13);
   }

   @Override
   public void a(grf $$0) {
      if (this.v) {
         $$0.a(gpw.a(auz.cy, 1.0F));
      }
   }
}
