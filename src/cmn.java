import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmn extends cms {
   private static final Logger b = LogUtils.getLogger();
   private final ayt c = ayt.a();
   private boolean d;
   private int e;
   private static final int g = 10;
   private static final ajy<Integer> h = akc.a(cmn.class, aka.b);
   private static final ajy<Boolean> i = akc.a(cmn.class, aka.k);
   private int j;
   private int k;
   private int l;
   private int m;
   private float n;
   private boolean o = true;
   @Nullable
   private brv p;
   private cmn.a q = cmn.a.a;
   private final int r;
   private final int s;

   private cmn(bsb<? extends cmn> $$0, dca $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.ay = true;
      this.r = Math.max(0, $$2);
      this.s = Math.max(0, $$3);
   }

   public cmn(bsb<? extends cmn> $$0, dca $$1) {
      this($$0, $$1, 0, 0);
   }

   public cmn(cly $$0, dca $$1, int $$2, int $$3) {
      this(bsb.bF, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dM();
      float $$5 = $$0.dK();
      float $$6 = aym.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = aym.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -aym.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = aym.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dz() - (double)$$7 * 0.3;
      double $$11 = $$0.dD();
      double $$12 = $$0.dF() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      ewu $$13 = new ewu((double)(-$$7), (double)aym.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.al.a(0.5, 0.0103365), 0.6 / $$14 + this.al.a(0.5, 0.0103365), 0.6 / $$14 + this.al.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(aym.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(aym.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.P = this.dK();
      this.Q = this.dM();
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(h, 0);
      $$0.a(i, false);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (h.equals($$0)) {
         int $$1 = this.ap().a(h);
         this.p = $$1 > 0 ? this.dU().a($$1 - 1) : null;
      }

      if (i.equals($$0)) {
         this.d = this.ap().a(i);
         if (this.d) {
            this.o(this.dx().c, (double)(-0.4F * aym.a(this.c, 0.6F, 1.0F)), this.dx().e);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0;
      return $$0 < 4096.0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
   }

   @Override
   public void l() {
      this.c.b(this.cE().getLeastSignificantBits() ^ this.dU().Z());
      super.l();
      cly $$0 = this.r();
      if ($$0 == null) {
         this.ao();
      } else if (this.dU().C || !this.a($$0)) {
         if (this.aE()) {
            this.j++;
            if (this.j >= 1200) {
               this.ao();
               return;
            }
         } else {
            this.j = 0;
         }

         float $$1 = 0.0F;
         ir $$2 = this.du();
         epe $$3 = this.dU().b_($$2);
         if ($$3.a(awj.a)) {
            $$1 = $$3.a((dbg)this.dU(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.q == cmn.a.a) {
            if (this.p != null) {
               this.g(ewu.b);
               this.q = cmn.a.b;
               return;
            }

            if ($$4) {
               this.g(this.dx().d(0.3, 0.2, 0.3));
               this.q = cmn.a.c;
               return;
            }

            this.w();
         } else {
            if (this.q == cmn.a.b) {
               if (this.p != null) {
                  if (!this.p.dP() && this.p.dU().af() == this.dU().af()) {
                     this.a_(this.p.dz(), this.p.e(0.8), this.p.dF());
                  } else {
                     this.A(null);
                     this.q = cmn.a.a;
                  }
               }

               return;
            }

            if (this.q == cmn.a.c) {
               ewu $$5 = this.dx();
               double $$6 = this.dB() + $$5.d - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.o($$5.c * 0.9, $$5.d - $$6 * (double)this.al.i() * 0.2, $$5.e * 0.9);
               if (this.k <= 0 && this.m <= 0) {
                  this.o = true;
               } else {
                  this.o = this.o && this.e < 10 && this.b($$2);
               }

               if ($$4) {
                  this.e = Math.max(0, this.e - 1);
                  if (this.d) {
                     this.g(this.dx().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dU().C) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(awj.a)) {
            this.g(this.dx().b(0.0, -0.03, 0.0));
         }

         this.a(bst.a, this.dx());
         this.J();
         if (this.q == cmn.a.a && (this.aE() || this.R)) {
            this.g(ewu.b);
         }

         double $$7 = 0.92;
         this.g(this.dx().a(0.92));
         this.at();
      }
   }

   private boolean a(cly $$0) {
      cuh $$1 = $$0.fg();
      cuh $$2 = $$0.fh();
      boolean $$3 = $$1.a(cuk.ss);
      boolean $$4 = $$2.a(cuk.ss);
      if (!$$0.dP() && $$0.bI() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.ao();
         return true;
      }
   }

   private void w() {
      ews $$0 = cmu.a(this, this::b);
      this.a($$0);
   }

   @Override
   protected boolean b(brv $$0) {
      return super.b($$0) || $$0.bI() && $$0 instanceof cig;
   }

   @Override
   protected void a(ewr $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(ewq $$0) {
      super.a($$0);
      this.g(this.dx().d().a($$0.a(this)));
   }

   private void A(@Nullable brv $$0) {
      this.p = $$0;
      this.ap().a(h, $$0 == null ? 0 : $$0.al() + 1);
   }

   private void a(ir $$0) {
      aqt $$1 = (aqt)this.dU();
      int $$2 = 1;
      ir $$3 = $$0.c();
      if (this.al.i() < 0.25F && this.dU().r($$3)) {
         $$2++;
      }

      if (this.al.i() < 0.5F && !this.dU().h($$3)) {
         $$2--;
      }

      if (this.k > 0) {
         this.k--;
         if (this.k <= 0) {
            this.l = 0;
            this.m = 0;
            this.ap().a(i, false);
         }
      } else if (this.m > 0) {
         this.m -= $$2;
         if (this.m > 0) {
            this.n = this.n + (float)this.al.a(0.0, 9.188);
            float $$4 = this.n * (float) (Math.PI / 180.0);
            float $$5 = aym.a($$4);
            float $$6 = aym.b($$4);
            double $$7 = this.dz() + (double)($$5 * (float)this.m * 0.1F);
            double $$8 = (double)((float)aym.a(this.dB()) + 1.0F);
            double $$9 = this.dF() + (double)($$6 * (float)this.m * 0.1F);
            dtc $$10 = $$1.a_(ir.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dfe.al)) {
               if (this.al.i() < 0.15F) {
                  $$1.a(lb.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(lb.D, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(lb.D, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(avo.jk, 0.25F, 1.0F + (this.al.i() - this.al.i()) * 0.4F);
            double $$13 = this.dB() + 0.5;
            $$1.a(lb.d, this.dz(), $$13, this.dF(), (int)(1.0F + this.do() * 20.0F), (double)this.do(), 0.0, (double)this.do(), 0.2F);
            $$1.a(lb.D, this.dz(), $$13, this.dF(), (int)(1.0F + this.do() * 20.0F), (double)this.do(), 0.0, (double)this.do(), 0.2F);
            this.k = aym.a(this.al, 20, 40);
            this.ap().a(i, true);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         float $$14 = 0.15F;
         if (this.l < 20) {
            $$14 += (float)(20 - this.l) * 0.05F;
         } else if (this.l < 40) {
            $$14 += (float)(40 - this.l) * 0.02F;
         } else if (this.l < 60) {
            $$14 += (float)(60 - this.l) * 0.01F;
         }

         if (this.al.i() < $$14) {
            float $$15 = aym.a(this.al, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = aym.a(this.al, 25.0F, 60.0F);
            double $$17 = this.dz() + (double)(aym.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)aym.a(this.dB()) + 1.0F);
            double $$19 = this.dF() + (double)(aym.b($$15) * $$16) * 0.1;
            dtc $$20 = $$1.a_(ir.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dfe.al)) {
               $$1.a(lb.ak, $$17, $$18, $$19, 2 + this.al.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.l <= 0) {
            this.n = aym.a(this.al, 0.0F, 360.0F);
            this.m = aym.a(this.al, 20, 80);
         }
      } else {
         this.l = aym.a(this.al, 100, 600);
         this.l = this.l - this.s * 20 * 5;
      }
   }

   private boolean b(ir $$0) {
      cmn.b $$1 = cmn.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cmn.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cmn.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cmn.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cmn.b a(ir $$0, ir $$1) {
      return ir.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cmn.b.c).orElse(cmn.b.c);
   }

   private cmn.b c(ir $$0) {
      dtc $$1 = this.dU().a_($$0);
      if (!$$1.i() && !$$1.a(dfe.ge)) {
         epe $$2 = $$1.u();
         return $$2.a(awj.a) && $$2.b() && $$1.k(this.dU(), $$0).c() ? cmn.b.b : cmn.b.c;
      } else {
         return cmn.b.a;
      }
   }

   public boolean p() {
      return this.o;
   }

   @Override
   public void b(uk $$0) {
   }

   @Override
   public void a(uk $$0) {
   }

   public int a(cuh $$0) {
      cly $$1 = this.r();
      if (!this.dU().C && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.p != null) {
            this.d(this.p);
            an.E.a((aqu)$$1, $$0, this, Collections.emptyList());
            this.dU().a(this, (byte)31);
            $$2 = this.p instanceof cig ? 3 : 5;
         } else if (this.k > 0) {
            ers $$3 = new ers.a((aqt)this.dU()).a(eug.f, this.ds()).a(eug.i, $$0).a(eug.a, this).a((float)this.r + $$1.gJ()).a(euf.f);
            eru $$4 = this.dU().o().be().b(ern.aO);
            List<cuh> $$5 = $$4.a($$3);
            an.E.a((aqu)$$1, $$0, this, $$5);

            for (cuh $$6 : $$5) {
               cig $$7 = new cig(this.dU(), this.dz(), this.dB(), this.dF(), $$6);
               double $$8 = $$1.dz() - this.dz();
               double $$9 = $$1.dB() - this.dB();
               double $$10 = $$1.dF() - this.dF();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dU().b($$7);
               $$1.dU().b(new bse($$1.dU(), $$1.dz(), $$1.dB() + 0.5, $$1.dF() + 0.5, this.al.a(6) + 1));
               if ($$6.a(awm.aQ)) {
                  $$1.a(avz.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aE()) {
            $$2 = 2;
         }

         this.ao();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dU().C && this.p instanceof cly && ((cly)this.p).g()) {
         this.d(this.p);
      }

      super.b($$0);
   }

   protected void d(brv $$0) {
      brv $$1 = this.t();
      if ($$1 != null) {
         ewu $$2 = new ewu($$1.dz() - this.dz(), $$1.dB() - this.dB(), $$1.dF() - this.dF()).a(0.1);
         $$0.g($$0.dx().e($$2));
      }
   }

   @Override
   protected brv.c bf() {
      return brv.c.a;
   }

   @Override
   public void a(brv.d $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void aq() {
      this.a(null);
   }

   @Override
   public void c(@Nullable brv $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cmn $$0) {
      cly $$1 = this.r();
      if ($$1 != null) {
         $$1.cJ = $$0;
      }
   }

   @Nullable
   public cly r() {
      brv $$0 = this.t();
      return $$0 instanceof cly ? (cly)$$0 : null;
   }

   @Nullable
   public brv u() {
      return this.p;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public zl<abw> dq() {
      brv $$0 = this.t();
      return new abx(this, $$0 == null ? this.al() : $$0.al());
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      if (this.r() == null) {
         int $$1 = $$0.p();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dU().a($$1), $$1);
         this.an();
      }
   }

   static enum a {
      a,
      b,
      c;
   }

   static enum b {
      a,
      b,
      c;
   }
}
