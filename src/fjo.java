public class fjo extends fbi {
   private static final ajh a = new ajh("widget/page_forward_highlighted");
   private static final ajh b = new ajh("widget/page_forward");
   private static final ajh c = new ajh("widget/page_backward_highlighted");
   private static final ajh d = new ajh("widget/page_backward");
   private final boolean t;
   private final boolean u;

   public fjo(int $$0, int $$1, boolean $$2, fbi.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, vt.a, $$3, p);
      this.t = $$2;
      this.u = $$4;
   }

   @Override
   public void b(fav $$0, int $$1, int $$2, float $$3) {
      ajh $$4;
      if (this.t) {
         $$4 = this.z() ? a : b;
      } else {
         $$4 = this.z() ? c : d;
      }

      $$0.a($$4, this.B(), this.C(), 23, 13);
   }

   @Override
   public void a(gnt $$0) {
      if (this.u) {
         $$0.a(gmk.a(aty.cx, 1.0F));
      }
   }
}
