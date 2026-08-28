public class fsa extends fkk {
   private static final alc a = alc.b("widget/page_forward_highlighted");
   private static final alc b = alc.b("widget/page_forward");
   private static final alc c = alc.b("widget/page_backward_highlighted");
   private static final alc d = alc.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fsa(int $$0, int $$1, boolean $$2, fkk.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, xc.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fjx $$0, int $$1, int $$2, float $$3) {
      alc $$4;
      if (this.u) {
         $$4 = this.B() ? a : b;
      } else {
         $$4 = this.B() ? c : d;
      }

      $$0.a(ghq::B, $$4, this.D(), this.E(), 23, 13);
   }

   @Override
   public void a(hca $$0) {
      if (this.v) {
         $$0.a(haq.a(awe.cy, 1.0F));
      }
   }
}
