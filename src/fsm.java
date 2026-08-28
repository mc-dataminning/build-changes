public abstract class fsm<T extends csb> extends fsn<T> {
   private final alj G;
   private final alj H;
   private final alj I;

   public fsm(T $$0, cot $$1, xj $$2, xj $$3, alj $$4, alj $$5, alj $$6) {
      super($$0, new fvq($$0, $$3), $$1, $$2);
      this.G = $$4;
      this.H = $$5;
      this.I = $$6;
   }

   @Override
   public void aR_() {
      super.aR_();
      this.v = (this.s - this.p.a(this.l)) / 2;
   }

   @Override
   protected fqk J() {
      return new fqk(this.C + 20, this.o / 2 - 49);
   }

   @Override
   protected void a(flq $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(gjq::B, this.G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.z.o()) {
         int $$6 = 14;
         int $$7 = azm.f(this.z.n() * 13.0F) + 1;
         $$0.a(gjq::B, this.H, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = azm.f(this.z.m() * 24.0F);
      $$0.a(gjq::B, this.I, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
   }
}
