public class btg extends cgd {
   private static final akj<Integer> cc = akn.a(btg.class, akl.b);

   public btg(bsz<? extends btg> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected lg s() {
      return li.aP;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cc, 0);
   }

   @Override
   protected avy u() {
      return avz.kJ;
   }

   @Override
   protected avy v() {
      return avz.kG;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.kI;
   }

   @Override
   protected avy o_() {
      return avz.kH;
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void n_() {
      super.n_();
      int $$0 = this.y();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dP().a(li.aQ, this.d(0.6), this.dx(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.ao.a(cc, $$0);
   }

   public int y() {
      return this.ao.a(cc);
   }

   public static boolean a(bsz<? extends bto> $$0, dcm $$1, bts $$2, iz $$3, azg $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dfa.G);
   }
}
