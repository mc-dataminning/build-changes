public class ftm extends flw {
   private static final all a = all.b("widget/page_forward_highlighted");
   private static final all b = all.b("widget/page_forward");
   private static final all c = all.b("widget/page_backward_highlighted");
   private static final all d = all.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public ftm(int $$0, int $$1, boolean $$2, flw.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, xk.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      all $$4;
      if (this.u) {
         $$4 = this.B() ? a : b;
      } else {
         $$4 = this.B() ? c : d;
      }

      $$0.a(gjh::B, $$4, this.D(), this.E(), 23, 13);
   }

   @Override
   public void a(hdv $$0) {
      if (this.v) {
         $$0.a(hcl.a(awo.cy, 1.0F));
      }
   }
}
