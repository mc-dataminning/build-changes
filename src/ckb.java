public class ckb extends cjz {
   private static final int g = 600;
   private static final int h = -1;
   private static final aiy<Integer> i = ajc.a(ckb.class, aja.b);
   private static final byte j = 0;

   public ckb(bqb<? extends ckb> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public ckb(cyx $$0, double $$1, double $$2, double $$3, crj $$4) {
      super(bqb.e, $$1, $$2, $$3, $$0, $$4);
      this.M();
   }

   public ckb(cyx $$0, bqo $$1, crj $$2) {
      super(bqb.e, $$1, $$0, $$2);
      this.M();
   }

   private cth K() {
      return this.y().a(jp.x, cth.a);
   }

   private void a(cth $$0) {
      this.y().b(jp.x, $$0);
      this.M();
   }

   @Override
   protected void a(crj $$0) {
      super.a($$0);
      this.M();
   }

   private void M() {
      cth $$0 = this.K();
      this.an.a(i, $$0.equals(cth.a) ? -1 : $$0.c());
   }

   public void a(bph $$0) {
      this.a(this.K().a($$0));
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(i, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.c(1);
            }
         } else {
            this.c(2);
         }
      } else if (this.b && this.c != 0 && !this.K().equals(cth.a) && this.c >= 600) {
         this.dM().a(this, (byte)0);
         this.a(new crj(crm.ou));
      }
   }

   private void c(int $$0) {
      int $$1 = this.H();
      if ($$1 != -1 && $$0 > 0) {
         double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
         double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
         double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            this.dM().a(kl.v, this.d(0.5), this.du(), this.g(0.5), $$2, $$3, $$4);
         }
      }
   }

   public int H() {
      return this.an.a(i);
   }

   @Override
   protected void a(bqo $$0) {
      super.a($$0);
      bpv $$1 = this.I();
      cth $$2 = this.K();
      if ($$2.f().isPresent()) {
         for (bph $$3 : $$2.f().get().a().a()) {
            $$0.b(new bph($$3.b(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.d(), $$3.e(), $$3.f()), $$1);
         }
      }

      for (bph $$4 : $$2.e()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected crj x() {
      return new crj(crm.ou);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.H();
         if ($$1 != -1) {
            double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
            double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
            double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dM().a(kl.v, this.d(0.5), this.du(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
