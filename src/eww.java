public class eww extends epi {
   private final boolean a;
   private final boolean b;

   public eww(int $$0, int $$1, boolean $$2, epi.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, sv.a, $$3, x);
      this.a = $$2;
      this.b = $$4;
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      int $$4 = 0;
      int $$5 = 192;
      if (this.n()) {
         $$4 += 23;
      }

      if (!this.a) {
         $$5 += 13;
      }

      $$0.a(evw.l, this.p(), this.r(), $$4, $$5, 23, 13);
   }

   @Override
   public void a(fzc $$0) {
      if (this.b) {
         $$0.a(fxt.a(amh.ce, 1.0F));
      }
   }
}
