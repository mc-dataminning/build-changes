import javax.annotation.Nullable;

public class cmt extends cmr {
   private static final int f = 600;
   private static final int g = -1;
   private static final ajp<Integer> h = ajt.a(cmt.class, ajr.b);
   private static final byte i = 0;

   public cmt(bsn<? extends cmt> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cmt(dcg $$0, double $$1, double $$2, double $$3, cud $$4, @Nullable cud $$5) {
      super(bsn.e, $$1, $$2, $$3, $$0, $$4, $$5);
      this.L();
   }

   public cmt(dcg $$0, btc $$1, cud $$2, @Nullable cud $$3) {
      super(bsn.e, $$1, $$0, $$2, $$3);
      this.L();
   }

   private cwe K() {
      return this.z().a(kn.G, cwe.a);
   }

   private void a(cwe $$0) {
      this.z().b(kn.G, $$0);
      this.L();
   }

   @Override
   protected void a(cud $$0) {
      super.a($$0);
      this.L();
   }

   private void L() {
      cwe $$0 = this.K();
      this.ao.a(h, $$0.equals(cwe.a) ? -1 : $$0.b());
   }

   public void a(brp $$0) {
      this.a(this.K().a($$0));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(h, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dR().B) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.b && this.c != 0 && !this.K().equals(cwe.a) && this.c >= 600) {
         this.dR().a(this, (byte)0);
         this.a(new cud(cug.ow));
      }
   }

   private void b(int $$0) {
      int $$1 = this.H();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dR().a(lc.a(lj.u, $$1), this.d(0.5), this.dz(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int H() {
      return this.ao.a(h);
   }

   @Override
   protected void a(btc $$0) {
      super.a($$0);
      bsh $$1 = this.I();
      cwe $$2 = this.K();
      if ($$2.e().isPresent()) {
         for (brp $$3 : $$2.e().get().a().a()) {
            $$0.b(new brp($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (brp $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cud y() {
      return new cud(cug.ow);
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
               this.dR().a(lc.a(lj.u, $$2, $$3, $$4), this.d(0.5), this.dz(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
