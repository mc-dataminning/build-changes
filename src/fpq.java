public class fpq extends foq<cqv> {
   private static final akr E = akr.b("container/horse/chest_slots");
   private static final akr F = akr.b("container/horse/saddle_slot");
   private static final akr G = akr.b("container/horse/llama_armor_slot");
   private static final akr H = akr.b("container/horse/armor_slot");
   private static final akr I = akr.b("textures/gui/container/horse.png");
   private final chi J;
   private final int K;
   private float L;
   private float M;

   public fpq(cqv $$0, cmw $$1, chi $$2, int $$3) {
      super($$0, $$1, $$2.S_());
      this.J = $$2;
      this.K = $$3;
   }

   @Override
   protected void a(fhx $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.r) / 2;
      $$0.a(I, $$4, $$5, 0, 0, this.c, this.r);
      if (this.K > 0) {
         $$0.a(E, 90, 54, 0, 0, $$4 + 79, $$5 + 17, this.K * 18, 54);
      }

      if (this.J.f()) {
         $$0.a(F, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.J.d(bsy.g)) {
         if (this.J instanceof chl) {
            $$0.a(G, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(H, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      fpr.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.L, this.M, this.J);
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      this.L = (float)$$1;
      this.M = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}
