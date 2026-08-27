public class fap extends esq {
   private static final aew a = new aew("widget/page_forward_highlighted");
   private static final aew b = new aew("widget/page_forward");
   private static final aew c = new aew("widget/page_backward_highlighted");
   private static final aew d = new aew("widget/page_backward");
   private final boolean s;
   private final boolean t;

   public fap(int $$0, int $$1, boolean $$2, esq.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, tk.a, $$3, o);
      this.s = $$2;
      this.t = $$4;
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      aew $$4;
      if (this.s) {
         $$4 = this.o() ? a : b;
      } else {
         $$4 = this.o() ? c : d;
      }

      $$0.a($$4, this.r(), this.t(), 23, 13);
   }

   @Override
   public void a(gdq $$0) {
      if (this.t) {
         $$0.a(gch.a(apd.ce, 1.0F));
      }
   }
}
