import java.util.UUID;

public class cju extends cnn implements cji {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final btt e = new btt(b, "Drinking speed penalty", -0.25, btt.a.a);
   private static final ajy<Boolean> ch = akc.a(cju.class, aka.k);
   private int ci;
   private cbg<cnn> cj;
   private cbf<cly> ck;

   public cju(bsb<? extends cju> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void y() {
      super.y();
      this.cj = new cbg<>(this, cnn.class, true, $$0 -> $$0 != null && this.gN() && $$0.ak() != bsb.bs);
      this.ck = new cbf<>(this, cly.class, 10, true, false, null);
      this.cb.a(1, new bzf(this));
      this.cb.a(2, new cak(this, 1.0, 60, 10.0F));
      this.cb.a(2, new cay(this, 1.0));
      this.cb.a(3, new bzt(this, cly.class, 8.0F));
      this.cb.a(3, new cag(this));
      this.cc.a(1, new cbd(this, cnn.class));
      this.cc.a(2, this.cj);
      this.cc.a(3, this.ck);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
   }

   @Override
   protected avn u() {
      return avo.CM;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.CQ;
   }

   @Override
   protected avn n_() {
      return avo.CO;
   }

   public void y(boolean $$0) {
      this.ap().a(ch, $$0);
   }

   public boolean r() {
      return this.ap().a(ch);
   }

   public static btu.a t() {
      return cjd.gG().a(btv.q, 26.0).a(btv.r, 0.25);
   }

   @Override
   public void m_() {
      if (!this.dU().C && this.bI()) {
         this.cj.k();
         if (this.cj.i() <= 0) {
            this.ck.a(true);
         } else {
            this.ck.a(false);
         }

         if (this.r()) {
            if (this.ci-- <= 0) {
               this.y(false);
               cuh $$0 = this.fg();
               this.a(bsc.a, cuh.i);
               cwr $$1 = $$0.a(ke.E);
               if ($$0.a(cuk.tH) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dxv.l);
               this.f(btv.r).b(e.b());
            }
         } else {
            ja<cwp> $$2 = null;
            if (this.al.i() < 0.15F && this.a(awj.a) && !this.b(brj.m)) {
               $$2 = cws.y;
            } else if (this.al.i() < 0.15F && (this.bV() || this.eK() != null && this.eK().a(awg.j)) && !this.b(brj.l)) {
               $$2 = cws.n;
            } else if (this.al.i() < 0.05F && this.eI() < this.eZ()) {
               $$2 = cws.A;
            } else if (this.al.i() < 0.5F && this.p() != null && !this.b(brj.a) && this.p().g(this) > 121.0) {
               $$2 = cws.p;
            }

            if ($$2 != null) {
               this.a(bsc.a, cwr.a(cuk.tH, $$2));
               this.ci = this.fg().t();
               this.y(true);
               if (!this.ba()) {
                  this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.CP, this.dj(), 1.0F, 0.8F + this.al.i() * 0.4F);
               }

               btr $$3 = this.f(btv.r);
               $$3.b(e.b());
               $$3.c(e);
            }
         }

         if (this.al.i() < 7.5E-4F) {
            this.dU().a(this, (byte)15);
         }
      }

      super.m_();
   }

   @Override
   public avn af_() {
      return avo.CN;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.al.a(35) + 10; $$1++) {
            this.dU().a(lb.al, this.dz() + this.al.k() * 0.13F, this.cP().e + 0.5 + this.al.k() * 0.13F, this.dF() + this.al.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bqt $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(awg.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bso $$0, float $$1) {
      if (!this.r()) {
         ewu $$2 = $$0.dx();
         double $$3 = $$0.dz() + $$2.c - this.dz();
         double $$4 = $$0.dD() - 1.1F - this.dB();
         double $$5 = $$0.dF() + $$2.e - this.dF();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         ja<cwp> $$7 = cws.C;
         if ($$0 instanceof cnn) {
            if ($$0.eI() <= 4.0F) {
               $$7 = cws.A;
            } else {
               $$7 = cws.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(brj.b)) {
            $$7 = cws.s;
         } else if ($$0.eI() >= 8.0F && !$$0.b(brj.s)) {
            $$7 = cws.E;
         } else if ($$6 <= 3.0 && !$$0.b(brj.r) && this.al.i() < 0.25F) {
            $$7 = cws.N;
         }

         cne $$8 = new cne(this.dU(), this);
         $$8.a(cwr.a(cuk.wZ, $$7));
         $$8.s($$8.dM() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.ba()) {
            this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.CR, this.dj(), 1.0F, 0.8F + this.al.i() * 0.4F);
         }

         this.dU().b($$8);
      }
   }

   public static boolean a(bsb<cju> $$0, dcp $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.al() != bpx.a && (bss.b($$2) || a($$1, $$3, $$4) || $$1.t($$3).a(ddg.h)) && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gz() {
      return false;
   }
}
