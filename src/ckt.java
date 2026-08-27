public class ckt extends ckr {
   private static final int g = 600;
   private static final int h = -1;
   private static final ajk<Integer> i = ajo.a(ckt.class, ajm.b);
   private static final byte j = 0;

   public ckt(bqr<? extends ckt> $$0, czu $$1) {
      super($$0, $$1);
   }

   public ckt(czu $$0, double $$1, double $$2, double $$3, csd $$4) {
      super(bqr.e, $$1, $$2, $$3, $$0, $$4);
      this.M();
   }

   public ckt(czu $$0, bre $$1, csd $$2) {
      super(bqr.e, $$1, $$0, $$2);
      this.M();
   }

   private cuc K() {
      return this.y().a(jz.x, cuc.a);
   }

   private void a(cuc $$0) {
      this.y().b(jz.x, $$0);
      this.M();
   }

   @Override
   protected void a(csd $$0) {
      super.a($$0);
      this.M();
   }

   private void M() {
      cuc $$0 = this.K();
      this.ao.a(i, $$0.equals(cuc.a) ? -1 : $$0.c());
   }

   public void a(bpx $$0) {
      this.a(this.K().a($$0));
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(i, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().B) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.c(1);
            }
         } else {
            this.c(2);
         }
      } else if (this.b && this.c != 0 && !this.K().equals(cuc.a) && this.c >= 600) {
         this.dN().a(this, (byte)0);
         this.a(new csd(csg.ov));
      }
   }

   private void c(int $$0) {
      int $$1 = this.H();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dN().a(ko.a(kw.u, $$1), this.d(0.5), this.dv(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int H() {
      return this.ao.a(i);
   }

   @Override
   protected void a(bre $$0) {
      super.a($$0);
      bql $$1 = this.I();
      cuc $$2 = this.K();
      if ($$2.f().isPresent()) {
         for (bpx $$3 : $$2.f().get().a().a()) {
            $$0.b(new bpx($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (bpx $$4 : $$2.e()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected csd x() {
      return new csd(csg.ov);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.H();
         if ($$1 != -1) {
            float $$2 = (float)($$1 >> 16 & 0xFF) / 255.0F;
            float $$3 = (float)($$1 >> 8 & 0xFF) / 255.0F;
            float $$4 = (float)($$1 >> 0 & 0xFF) / 255.0F;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dN().a(ko.a(kw.u, $$2, $$3, $$4), this.d(0.5), this.dv(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
