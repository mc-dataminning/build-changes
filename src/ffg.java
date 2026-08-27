public class ffg extends exe {
   private static final ahg a = new ahg("widget/page_forward_highlighted");
   private static final ahg b = new ahg("widget/page_forward");
   private static final ahg c = new ahg("widget/page_backward_highlighted");
   private static final ahg d = new ahg("widget/page_backward");
   private final boolean t;
   private final boolean u;

   public ffg(int $$0, int $$1, boolean $$2, exe.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, ve.a, $$3, p);
      this.t = $$2;
      this.u = $$4;
   }

   @Override
   public void b(ews $$0, int $$1, int $$2, float $$3) {
      ahg $$4;
      if (this.t) {
         $$4 = this.z() ? a : b;
      } else {
         $$4 = this.z() ? c : d;
      }

      $$0.a($$4, this.B(), this.C(), 23, 13);
   }

   @Override
   public void a(gjc $$0) {
      if (this.u) {
         $$0.a(ght.a(arr.ce, 1.0F));
      }
   }
}
