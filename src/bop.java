public class bop extends cbl {
   private static final aii<Integer> bZ = ail.a(bop.class, aik.b);

   public bop(bol<? extends bop> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected jz u() {
      return kb.aM;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bZ, 0);
   }

   @Override
   protected ato w() {
      return atp.kv;
   }

   @Override
   protected ato y() {
      return atp.ks;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.ku;
   }

   @Override
   protected ato n_() {
      return atp.kt;
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.A());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void d_() {
      super.d_();
      int $$0 = this.A();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dJ().a(kb.aN, this.d(0.6), this.dr(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.am.b(bZ, $$0);
   }

   public int A() {
      return this.am.b(bZ);
   }

   public static boolean a(bol<? extends box> $$0, cwt $$1, bpb $$2, ib $$3, awt $$4) {
      return $$3.v() <= $$1.A_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(czh.G);
   }
}
