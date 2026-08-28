public class fpm extends fom<cqt> {
   private static final akq D = akq.b("container/horse/chest_slots");
   private static final akq E = akq.b("container/horse/saddle_slot");
   private static final akq F = akq.b("container/horse/llama_armor_slot");
   private static final akq G = akq.b("container/horse/armor_slot");
   private static final akq H = akq.b("textures/gui/container/horse.png");
   private final chg I;
   private float J;
   private float K;

   public fpm(cqt $$0, cmu $$1, chg $$2) {
      super($$0, $$1, $$2.O_());
      this.I = $$2;
   }

   @Override
   protected void a(fht $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.q) / 2;
      $$0.a(H, $$4, $$5, 0, 0, this.c, this.q);
      if (this.I instanceof chf $$6 && $$6.t()) {
         $$0.a(D, 90, 54, 0, 0, $$4 + 79, $$5 + 17, $$6.gp() * 18, 54);
      }

      if (this.I.f()) {
         $$0.a(E, $$4 + 7, $$5 + 35 - 18, 18, 18);
      }

      if (this.I.d(bsx.g)) {
         if (this.I instanceof chj) {
            $$0.a(F, $$4 + 7, $$5 + 35, 18, 18);
         } else {
            $$0.a(G, $$4 + 7, $$5 + 35, 18, 18);
         }
      }

      fpn.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.J, this.K, this.I);
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      this.J = (float)$$1;
      this.K = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}
