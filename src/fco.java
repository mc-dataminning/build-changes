public class fco extends eum {
   private static final agg a = new agg("widget/page_forward_highlighted");
   private static final agg b = new agg("widget/page_forward");
   private static final agg c = new agg("widget/page_backward_highlighted");
   private static final agg d = new agg("widget/page_backward");
   private final boolean t;
   private final boolean u;

   public fco(int $$0, int $$1, boolean $$2, eum.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, uq.a, $$3, p);
      this.t = $$2;
      this.u = $$4;
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      agg $$4;
      if (this.t) {
         $$4 = this.n() ? a : b;
      } else {
         $$4 = this.n() ? c : d;
      }

      $$0.a($$4, this.p(), this.r(), 23, 13);
   }

   @Override
   public void a(gft $$0) {
      if (this.u) {
         $$0.a(gek.a(aqn.ce, 1.0F));
      }
   }
}
