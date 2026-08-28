public class fsp extends fkz {
   private static final alh a = alh.b("widget/page_forward_highlighted");
   private static final alh b = alh.b("widget/page_forward");
   private static final alh c = alh.b("widget/page_backward_highlighted");
   private static final alh d = alh.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fsp(int $$0, int $$1, boolean $$2, fkz.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, xg.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      alh $$4;
      if (this.u) {
         $$4 = this.B() ? a : b;
      } else {
         $$4 = this.B() ? c : d;
      }

      $$0.a(gig::B, $$4, this.D(), this.E(), 23, 13);
   }

   @Override
   public void a(hcu $$0) {
      if (this.v) {
         $$0.a(hbk.a(awk.cy, 1.0F));
      }
   }
}
