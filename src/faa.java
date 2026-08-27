public class faa extends esi {
   private static final aep a = new aep("widget/page_forward_highlighted");
   private static final aep b = new aep("widget/page_forward");
   private static final aep c = new aep("widget/page_backward_highlighted");
   private static final aep d = new aep("widget/page_backward");
   private final boolean s;
   private final boolean t;

   public faa(int $$0, int $$1, boolean $$2, esi.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, td.a, $$3, o);
      this.s = $$2;
      this.t = $$4;
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      aep $$4;
      if (this.s) {
         $$4 = this.n() ? a : b;
      } else {
         $$4 = this.n() ? c : d;
      }

      $$0.a($$4, this.p(), this.r(), 23, 13);
   }

   @Override
   public void a(gcs $$0) {
      if (this.t) {
         $$0.a(gbj.a(aou.ce, 1.0F));
      }
   }
}
