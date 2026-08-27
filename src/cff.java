public class cff extends cfp {
   public cff(bol<? extends cff> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public static bqd.a u() {
      return cfg.gr().a(bqe.o, 0.2F);
   }

   public static boolean b(bol<cff> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.aj() != bmi.a;
   }

   @Override
   public boolean a(cwh $$0) {
      return $$0.f(this) && !$$0.d(this.cE());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(bqe.a).a((double)($$0 * 3));
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   protected jz w() {
      return kb.E;
   }

   @Override
   public boolean bK() {
      return false;
   }

   @Override
   protected int A() {
      return super.A() * 4;
   }

   @Override
   protected void gh() {
      this.d *= 0.9F;
   }

   @Override
   protected void fd() {
      eov $$0 = this.dm();
      float $$1 = (float)this.gm() * 0.1F;
      this.o($$0.c, (double)(this.fb() + $$1), $$0.e);
      this.at = true;
   }

   @Override
   protected void c(aut<ehq> $$0) {
      if ($$0 == auj.b) {
         eov $$1 = this.dm();
         this.o($$1.c, (double)(0.22F + (float)this.gm() * 0.05F), $$1.e);
         this.at = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gi() {
      return this.cV();
   }

   @Override
   protected float gj() {
      return super.gj() + 2.0F;
   }

   @Override
   protected ato d(bne $$0) {
      return this.gn() ? atp.nS : atp.nR;
   }

   @Override
   protected ato n_() {
      return this.gn() ? atp.nJ : atp.nQ;
   }

   @Override
   protected ato gk() {
      return this.gn() ? atp.nV : atp.nU;
   }

   @Override
   protected ato gl() {
      return atp.nT;
   }
}
