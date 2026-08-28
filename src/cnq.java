import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class cnq extends cmr {
   private static final ajp<Byte> g = ajt.a(cnq.class, ajr.a);
   private static final ajp<Boolean> h = ajt.a(cnq.class, ajr.k);
   private boolean i;
   public int f;

   public cnq(bsn<? extends cnq> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cnq(dcg $$0, btc $$1, cud $$2) {
      super(bsn.bf, $$1, $$0, $$2, null);
      this.ao.a(g, this.c($$2));
      this.ao.a(h, $$2.x());
   }

   public cnq(dcg $$0, double $$1, double $$2, double $$3, cud $$4) {
      super(bsn.bf, $$1, $$2, $$3, $$0, $$4, $$4);
      this.ao.a(g, this.c($$4));
      this.ao.a(h, $$4.x());
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(g, (byte)0);
      $$0.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.i = true;
      }

      bsh $$0 = this.s();
      int $$1 = this.ao.a(g);
      if ($$1 > 0 && (this.i || this.F()) && $$0 != null) {
         if (!this.K()) {
            if (!this.dR().B && this.d == cmr.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.aq();
         } else {
            this.b(true);
            ewh $$2 = $$0.bz().d(this.dp());
            this.p(this.dw(), this.dy() + $$2.d * 0.015 * (double)$$1, this.dC());
            if (this.dR().B) {
               this.ae = this.dy();
            }

            double $$3 = 0.05 * (double)$$1;
            this.j(this.du().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(avh.zC, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean K() {
      bsh $$0 = this.s();
      return $$0 == null || !$$0.bF() ? false : !($$0 instanceof aqn) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.ao.a(h);
   }

   @Nullable
   @Override
   protected ewe a(ewh $$0, ewh $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(ewe $$0) {
      bsh $$1 = $$0.a();
      float $$2 = 8.0F;
      bsh $$3 = this.s();
      bra $$4 = this.dS().a(this, (bsh)($$3 == null ? this : $$3));
      if (this.dR() instanceof aqm $$5) {
         $$2 = czo.a($$5, this.t(), $$1, $$4, $$2);
      }

      this.i = true;
      if ($$1.a($$4, $$2)) {
         if ($$1.am() == bsn.H) {
            return;
         }

         if (this.dR() instanceof aqm $$6) {
            czo.a($$6, $$1, $$4, this.t());
         }

         if ($$1 instanceof btc $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.j(this.du().d(-0.01, -0.1, -0.01));
      this.a(avh.zA, 1.0F, 1.0F);
   }

   @Override
   protected void a(aqm $$0, ewd $$1, cud $$2) {
      czo.a($$0, $$2, this.s() instanceof btc $$3 ? $$3 : null, this, null, $$1.e(), $$0x -> this.ap());
   }

   @Nonnull
   @Override
   protected cud t() {
      return this.z();
   }

   @Override
   protected boolean a(cml $$0) {
      return super.a($$0) || this.F() && this.e($$0) && $$0.ga().f(this.x());
   }

   @Override
   protected cud y() {
      return new cud(cug.vS);
   }

   @Override
   protected avg v() {
      return avh.zB;
   }

   @Override
   public void b_(cml $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.ao.a(g, this.c(this.z()));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   private byte c(cud $$0) {
      return this.dR() instanceof aqm $$1 ? (byte)ayg.a(czo.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void p() {
      int $$0 = this.ao.a(g);
      if (this.d != cmr.a.b || $$0 <= 0) {
         super.p();
      }
   }

   @Override
   protected float E() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
