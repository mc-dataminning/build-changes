public class fpv extends fig {
   private static final akq a = akq.b("widget/page_forward_highlighted");
   private static final akq b = akq.b("widget/page_forward");
   private static final akq c = akq.b("widget/page_backward_highlighted");
   private static final akq d = akq.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fpv(int $$0, int $$1, boolean $$2, fig.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, wx.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      akq $$4;
      if (this.u) {
         $$4 = this.B() ? a : b;
      } else {
         $$4 = this.B() ? c : d;
      }

      $$0.a($$4, this.D(), this.E(), 23, 13);
   }

   @Override
   public void a(guy $$0) {
      if (this.v) {
         $$0.a(gto.a(avo.cy, 1.0F));
      }
   }
}
