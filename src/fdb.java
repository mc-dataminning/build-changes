public class fdb extends euz {
   private static final agi a = new agi("widget/page_forward_highlighted");
   private static final agi b = new agi("widget/page_forward");
   private static final agi c = new agi("widget/page_backward_highlighted");
   private static final agi d = new agi("widget/page_backward");
   private final boolean t;
   private final boolean u;

   public fdb(int $$0, int $$1, boolean $$2, euz.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, uq.a, $$3, p);
      this.t = $$2;
      this.u = $$4;
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      agi $$4;
      if (this.t) {
         $$4 = this.n() ? a : b;
      } else {
         $$4 = this.n() ? c : d;
      }

      $$0.a($$4, this.p(), this.r(), 23, 13);
   }

   @Override
   public void a(ggg $$0) {
      if (this.u) {
         $$0.a(gex.a(aqr.ce, 1.0F));
      }
   }
}
