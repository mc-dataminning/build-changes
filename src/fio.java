public class fio extends fak {
   private static final ajc a = new ajc("widget/page_forward_highlighted");
   private static final ajc b = new ajc("widget/page_forward");
   private static final ajc c = new ajc("widget/page_backward_highlighted");
   private static final ajc d = new ajc("widget/page_backward");
   private final boolean t;
   private final boolean u;

   public fio(int $$0, int $$1, boolean $$2, fak.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, vr.a, $$3, p);
      this.t = $$2;
      this.u = $$4;
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      ajc $$4;
      if (this.t) {
         $$4 = this.z() ? a : b;
      } else {
         $$4 = this.z() ? c : d;
      }

      $$0.a($$4, this.B(), this.C(), 23, 13);
   }

   @Override
   public void a(gmq $$0) {
      if (this.u) {
         $$0.a(glh.a(atp.cr, 1.0F));
      }
   }
}
