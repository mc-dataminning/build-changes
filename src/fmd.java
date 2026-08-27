public class fmd extends fdy {
   private static final ajv a = new ajv("widget/page_forward_highlighted");
   private static final ajv b = new ajv("widget/page_forward");
   private static final ajv c = new ajv("widget/page_backward_highlighted");
   private static final ajv d = new ajv("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fmd(int $$0, int $$1, boolean $$2, fdy.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, wh.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      ajv $$4;
      if (this.u) {
         $$4 = this.A() ? a : b;
      } else {
         $$4 = this.A() ? c : d;
      }

      $$0.a($$4, this.C(), this.D(), 23, 13);
   }

   @Override
   public void a(gqj $$0) {
      if (this.v) {
         $$0.a(gpa.a(auo.cy, 1.0F));
      }
   }
}
