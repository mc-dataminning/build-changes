public class foe extends ffz {
   private static final akm a = new akm("widget/page_forward_highlighted");
   private static final akm b = new akm("widget/page_forward");
   private static final akm c = new akm("widget/page_backward_highlighted");
   private static final akm d = new akm("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public foe(int $$0, int $$1, boolean $$2, ffz.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, ww.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(ffm $$0, int $$1, int $$2, float $$3) {
      akm $$4;
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
         $$0.a(gre.a(avh.cy, 1.0F));
      }
   }
}
