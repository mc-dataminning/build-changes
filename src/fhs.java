public class fhs extends ezo {
   private static final aiy a = new aiy("widget/page_forward_highlighted");
   private static final aiy b = new aiy("widget/page_forward");
   private static final aiy c = new aiy("widget/page_backward_highlighted");
   private static final aiy d = new aiy("widget/page_backward");
   private final boolean t;
   private final boolean u;

   public fhs(int $$0, int $$1, boolean $$2, ezo.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, vp.a, $$3, p);
      this.t = $$2;
      this.u = $$4;
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      aiy $$4;
      if (this.t) {
         $$4 = this.z() ? a : b;
      } else {
         $$4 = this.z() ? c : d;
      }

      $$0.a($$4, this.B(), this.C(), 23, 13);
   }

   @Override
   public void a(gls $$0) {
      if (this.u) {
         $$0.a(gkj.a(atl.cr, 1.0F));
      }
   }
}
