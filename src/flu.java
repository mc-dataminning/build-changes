public class flu extends fdp {
   private static final ajt a = new ajt("widget/page_forward_highlighted");
   private static final ajt b = new ajt("widget/page_forward");
   private static final ajt c = new ajt("widget/page_backward_highlighted");
   private static final ajt d = new ajt("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public flu(int $$0, int $$1, boolean $$2, fdp.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, wf.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      ajt $$4;
      if (this.u) {
         $$4 = this.A() ? a : b;
      } else {
         $$4 = this.A() ? c : d;
      }

      $$0.a($$4, this.C(), this.D(), 23, 13);
   }

   @Override
   public void a(gqa $$0) {
      if (this.v) {
         $$0.a(gor.a(aum.cy, 1.0F));
      }
   }
}
