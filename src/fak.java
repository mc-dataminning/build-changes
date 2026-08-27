public class fak extends esl {
   private static final aeu a = new aeu("widget/page_forward_highlighted");
   private static final aeu b = new aeu("widget/page_forward");
   private static final aeu c = new aeu("widget/page_backward_highlighted");
   private static final aeu d = new aeu("widget/page_backward");
   private final boolean s;
   private final boolean t;

   public fak(int $$0, int $$1, boolean $$2, esl.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, th.a, $$3, o);
      this.s = $$2;
      this.t = $$4;
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      aeu $$4;
      if (this.s) {
         $$4 = this.o() ? a : b;
      } else {
         $$4 = this.o() ? c : d;
      }

      $$0.a($$4, this.r(), this.t(), 23, 13);
   }

   @Override
   public void a(gdl $$0) {
      if (this.t) {
         $$0.a(gcc.a(aoz.ce, 1.0F));
      }
   }
}
