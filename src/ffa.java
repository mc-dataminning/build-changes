public class ffa extends ewy {
   private static final ahd a = new ahd("widget/page_forward_highlighted");
   private static final ahd b = new ahd("widget/page_forward");
   private static final ahd c = new ahd("widget/page_backward_highlighted");
   private static final ahd d = new ahd("widget/page_backward");
   private final boolean t;
   private final boolean u;

   public ffa(int $$0, int $$1, boolean $$2, ewy.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, vc.a, $$3, p);
      this.t = $$2;
      this.u = $$4;
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      ahd $$4;
      if (this.t) {
         $$4 = this.z() ? a : b;
      } else {
         $$4 = this.z() ? c : d;
      }

      $$0.a($$4, this.B(), this.C(), 23, 13);
   }

   @Override
   public void a(gir $$0) {
      if (this.u) {
         $$0.a(ghi.a(arm.ce, 1.0F));
      }
   }
}
