public class fak extends esk {
   private static final aez a = new aez("widget/page_forward_highlighted");
   private static final aez b = new aez("widget/page_forward");
   private static final aez c = new aez("widget/page_backward_highlighted");
   private static final aez d = new aez("widget/page_backward");
   private final boolean s;
   private final boolean t;

   public fak(int $$0, int $$1, boolean $$2, esk.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, tk.a, $$3, o);
      this.s = $$2;
      this.t = $$4;
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      aez $$4;
      if (this.s) {
         $$4 = this.o() ? a : b;
      } else {
         $$4 = this.o() ? c : d;
      }

      $$0.a($$4, this.r(), this.t(), 23, 13);
   }

   @Override
   public void a(gdm $$0) {
      if (this.t) {
         $$0.a(gcd.a(apg.ce, 1.0F));
      }
   }
}
