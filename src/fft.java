public class fft extends exr {
   private static final ahh a = new ahh("widget/page_forward_highlighted");
   private static final ahh b = new ahh("widget/page_forward");
   private static final ahh c = new ahh("widget/page_backward_highlighted");
   private static final ahh d = new ahh("widget/page_backward");
   private final boolean t;
   private final boolean u;

   public fft(int $$0, int $$1, boolean $$2, exr.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, vf.a, $$3, p);
      this.t = $$2;
      this.u = $$4;
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      ahh $$4;
      if (this.t) {
         $$4 = this.z() ? a : b;
      } else {
         $$4 = this.z() ? c : d;
      }

      $$0.a($$4, this.B(), this.C(), 23, 13);
   }

   @Override
   public void a(gjs $$0) {
      if (this.u) {
         $$0.a(gij.a(art.cq, 1.0F));
      }
   }
}
