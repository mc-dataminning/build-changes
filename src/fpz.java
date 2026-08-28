public class fpz extends fik {
   private static final akr a = akr.b("widget/page_forward_highlighted");
   private static final akr b = akr.b("widget/page_forward");
   private static final akr c = akr.b("widget/page_backward_highlighted");
   private static final akr d = akr.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fpz(int $$0, int $$1, boolean $$2, fik.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, wy.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fhx $$0, int $$1, int $$2, float $$3) {
      akr $$4;
      if (this.u) {
         $$4 = this.B() ? a : b;
      } else {
         $$4 = this.B() ? c : d;
      }

      $$0.a($$4, this.D(), this.E(), 23, 13);
   }

   @Override
   public void a(gvd $$0) {
      if (this.v) {
         $$0.a(gtt.a(avp.cy, 1.0F));
      }
   }
}
