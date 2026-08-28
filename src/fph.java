public class fph extends fhs {
   private static final akk a = new akk("widget/page_forward_highlighted");
   private static final akk b = new akk("widget/page_forward");
   private static final akk c = new akk("widget/page_backward_highlighted");
   private static final akk d = new akk("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fph(int $$0, int $$1, boolean $$2, fhs.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, wt.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
      akk $$4;
      if (this.u) {
         $$4 = this.B() ? a : b;
      } else {
         $$4 = this.B() ? c : d;
      }

      $$0.a($$4, this.D(), this.E(), 23, 13);
   }

   @Override
   public void a(guh $$0) {
      if (this.v) {
         $$0.a(gsx.a(avh.cy, 1.0F));
      }
   }
}
