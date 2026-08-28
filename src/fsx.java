public class fsx extends flh {
   private static final ali a = ali.b("widget/page_forward_highlighted");
   private static final ali b = ali.b("widget/page_forward");
   private static final ali c = ali.b("widget/page_backward_highlighted");
   private static final ali d = ali.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fsx(int $$0, int $$1, boolean $$2, flh.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, xh.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fku $$0, int $$1, int $$2, float $$3) {
      ali $$4;
      if (this.u) {
         $$4 = this.B() ? a : b;
      } else {
         $$4 = this.B() ? c : d;
      }

      $$0.a(gir::B, $$4, this.D(), this.E(), 23, 13);
   }

   @Override
   public void a(hdf $$0) {
      if (this.v) {
         $$0.a(hbv.a(awl.cy, 1.0F));
      }
   }
}
