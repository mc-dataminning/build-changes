import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cio extends cis {
   private static final Logger b = LogUtils.getLogger();
   private final awt c = awt.a();
   private boolean d;
   private int e;
   private static final int g = 10;
   private static final aii<Integer> h = ail.a(cio.class, aik.b);
   private static final aii<Boolean> i = ail.a(cio.class, aik.k);
   private int j;
   private int k;
   private int l;
   private int m;
   private float n;
   private boolean o = true;
   @Nullable
   private bof p;
   private cio.a q = cio.a.a;
   private final int r;
   private final int s;

   private cio(bol<? extends cio> $$0, cwe $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.as = true;
      this.r = Math.max(0, $$2);
      this.s = Math.max(0, $$3);
   }

   public cio(bol<? extends cio> $$0, cwe $$1) {
      this($$0, $$1, 0, 0);
   }

   public cio(cia $$0, cwe $$1, int $$2, int $$3) {
      this(bol.bx, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.dB();
      float $$5 = $$0.dz();
      float $$6 = awm.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = awm.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -awm.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = awm.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.do() - (double)$$7 * 0.3;
      double $$11 = $$0.ds();
      double $$12 = $$0.du() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      eov $$13 = new eov((double)(-$$7), (double)awm.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.af.a(0.5, 0.0103365), 0.6 / $$14 + this.af.a(0.5, 0.0103365), 0.6 / $$14 + this.af.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(awm.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(awm.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.M = this.dz();
      this.N = this.dB();
   }

   @Override
   protected void c_() {
      this.an().a(h, 0);
      this.an().a(i, false);
   }

   @Override
   public void a(aii<?> $$0) {
      if (h.equals($$0)) {
         int $$1 = this.an().b(h);
         this.p = $$1 > 0 ? this.dJ().a($$1 - 1) : null;
      }

      if (i.equals($$0)) {
         this.d = this.an().b(i);
         if (this.d) {
            this.o(this.dm().c, (double)(-0.4F * awm.a(this.c, 0.6F, 1.0F)), this.dm().e);
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
      this.c.b(this.ct().getLeastSignificantBits() ^ this.dJ().X());
      super.l();
      cia $$0 = this.s();
      if ($$0 == null) {
         this.am();
      } else if (this.dJ().B || !this.a($$0)) {
         if (this.aC()) {
            this.j++;
            if (this.j >= 1200) {
               this.am();
               return;
            }
         } else {
            this.j = 0;
         }

         float $$1 = 0.0F;
         ib $$2 = this.dj();
         ehr $$3 = this.dJ().b_($$2);
         if ($$3.a(auj.a)) {
            $$1 = $$3.a((cvk)this.dJ(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.q == cio.a.a) {
            if (this.p != null) {
               this.g(eov.b);
               this.q = cio.a.b;
               return;
            }

            if ($$4) {
               this.g(this.dm().d(0.3, 0.2, 0.3));
               this.q = cio.a.c;
               return;
            }

            this.x();
         } else {
            if (this.q == cio.a.b) {
               if (this.p != null) {
                  if (!this.p.dE() && this.p.dJ().ad() == this.dJ().ad()) {
                     this.a_(this.p.do(), this.p.e(0.8), this.p.du());
                  } else {
                     this.z(null);
                     this.q = cio.a.a;
                  }
               }

               return;
            }

            if (this.q == cio.a.c) {
               eov $$5 = this.dm();
               double $$6 = this.dq() + $$5.d - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.o($$5.c * 0.9, $$5.d - $$6 * (double)this.af.i() * 0.2, $$5.e * 0.9);
               if (this.k <= 0 && this.m <= 0) {
                  this.o = true;
               } else {
                  this.o = this.o && this.e < 10 && this.b($$2);
               }

               if ($$4) {
                  this.e = Math.max(0, this.e - 1);
                  if (this.d) {
                     this.g(this.dm().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dJ().B) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(auj.a)) {
            this.g(this.dm().b(0.0, -0.03, 0.0));
         }

         this.a(bpc.a, this.dm());
         this.J();
         if (this.q == cio.a.a && (this.aC() || this.O)) {
            this.g(eov.b);
         }

         double $$7 = 0.92;
         this.g(this.dm().a(0.92));
         this.ar();
      }
   }

   private boolean a(cia $$0) {
      cpq $$1 = $$0.eR();
      cpq $$2 = $$0.eS();
      boolean $$3 = $$1.a(cpt.qU);
      boolean $$4 = $$2.a(cpt.qU);
      if (!$$0.dE() && $$0.bx() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.am();
         return true;
      }
   }

   private void x() {
      eot $$0 = ciu.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(bof $$0) {
      return super.a($$0) || $$0.bx() && $$0 instanceof cel;
   }

   @Override
   protected void a(eos $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         this.z($$0.a());
      }
   }

   @Override
   protected void a(eor $$0) {
      super.a($$0);
      this.g(this.dm().d().a($$0.a(this)));
   }

   private void z(@Nullable bof $$0) {
      this.p = $$0;
      this.an().b(h, $$0 == null ? 0 : $$0.aj() + 1);
   }

   private void a(ib $$0) {
      apa $$1 = (apa)this.dJ();
      int $$2 = 1;
      ib $$3 = $$0.c();
      if (this.af.i() < 0.25F && this.dJ().r($$3)) {
         $$2++;
      }

      if (this.af.i() < 0.5F && !this.dJ().h($$3)) {
         $$2--;
      }

      if (this.k > 0) {
         this.k--;
         if (this.k <= 0) {
            this.l = 0;
            this.m = 0;
            this.an().b(i, false);
         }
      } else if (this.m > 0) {
         this.m -= $$2;
         if (this.m > 0) {
            this.n = this.n + (float)this.af.a(0.0, 9.188);
            float $$4 = this.n * (float) (Math.PI / 180.0);
            float $$5 = awm.a($$4);
            float $$6 = awm.b($$4);
            double $$7 = this.do() + (double)($$5 * (float)this.m * 0.1F);
            double $$8 = (double)((float)awm.a(this.dq()) + 1.0F);
            double $$9 = this.du() + (double)($$6 * (float)this.m * 0.1F);
            dme $$10 = $$1.a_(ib.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(czh.G)) {
               if (this.af.i() < 0.15F) {
                  $$1.a(kb.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(kb.D, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(kb.D, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(atp.iJ, 0.25F, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
            double $$13 = this.dq() + 0.5;
            $$1.a(kb.e, this.do(), $$13, this.du(), (int)(1.0F + this.dd() * 20.0F), (double)this.dd(), 0.0, (double)this.dd(), 0.2F);
            $$1.a(kb.D, this.do(), $$13, this.du(), (int)(1.0F + this.dd() * 20.0F), (double)this.dd(), 0.0, (double)this.dd(), 0.2F);
            this.k = awm.a(this.af, 20, 40);
            this.an().b(i, true);
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

         if (this.af.i() < $$14) {
            float $$15 = awm.a(this.af, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = awm.a(this.af, 25.0F, 60.0F);
            double $$17 = this.do() + (double)(awm.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)awm.a(this.dq()) + 1.0F);
            double $$19 = this.du() + (double)(awm.b($$15) * $$16) * 0.1;
            dme $$20 = $$1.a_(ib.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(czh.G)) {
               $$1.a(kb.aj, $$17, $$18, $$19, 2 + this.af.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.l <= 0) {
            this.n = awm.a(this.af, 0.0F, 360.0F);
            this.m = awm.a(this.af, 20, 80);
         }
      } else {
         this.l = awm.a(this.af, 100, 600);
         this.l = this.l - this.s * 20 * 5;
      }
   }

   private boolean b(ib $$0) {
      cio.b $$1 = cio.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cio.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cio.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cio.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cio.b a(ib $$0, ib $$1) {
      return ib.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cio.b.c).orElse(cio.b.c);
   }

   private cio.b c(ib $$0) {
      dme $$1 = this.dJ().a_($$0);
      if (!$$1.i() && !$$1.a(czh.fm)) {
         ehr $$2 = $$1.u();
         return $$2.a(auj.a) && $$2.b() && $$1.k(this.dJ(), $$0).c() ? cio.b.b : cio.b.c;
      } else {
         return cio.b.a;
      }
   }

   public boolean q() {
      return this.o;
   }

   @Override
   public void b(sy $$0) {
   }

   @Override
   public void a(sy $$0) {
   }

   public int a(cpq $$0) {
      cia $$1 = this.s();
      if (!this.dJ().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.p != null) {
            this.c(this.p);
            am.E.a((apb)$$1, $$0, this, Collections.emptyList());
            this.dJ().a(this, (byte)31);
            $$2 = this.p instanceof cel ? 3 : 5;
         } else if (this.k > 0) {
            eke $$3 = new eke.a((apa)this.dJ()).a(emj.f, this.dh()).a(emj.i, $$0).a(emj.a, this).a((float)this.r + $$1.gr()).a(emi.f);
            ekg $$4 = this.dJ().o().aM().getLootTable(ejw.as);
            List<cpq> $$5 = $$4.a($$3);
            am.E.a((apb)$$1, $$0, this, $$5);

            for (cpq $$6 : $$5) {
               cel $$7 = new cel(this.dJ(), this.do(), this.dq(), this.du(), $$6);
               double $$8 = $$1.do() - this.do();
               double $$9 = $$1.dq() - this.dq();
               double $$10 = $$1.du() - this.du();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dJ().b($$7);
               $$1.dJ().b(new bon($$1.dJ(), $$1.do(), $$1.dq() + 0.5, $$1.du() + 0.5, this.af.a(6) + 1));
               if ($$6.a(aum.ao)) {
                  $$1.a(atz.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aC()) {
            $$2 = 2;
         }

         this.am();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dJ().B && this.p instanceof cia && ((cia)this.p).g()) {
         this.c(this.p);
      }

      super.b($$0);
   }

   protected void c(bof $$0) {
      bof $$1 = this.w();
      if ($$1 != null) {
         eov $$2 = new eov($$1.do() - this.do(), $$1.dq() - this.dq(), $$1.du() - this.du()).a(0.1);
         $$0.g($$0.dm().e($$2));
      }
   }

   @Override
   protected bof.b aW() {
      return bof.b.a;
   }

   @Override
   public void a(bof.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ao() {
      this.a(null);
   }

   @Override
   public void b(@Nullable bof $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable cio $$0) {
      cia $$1 = this.s();
      if ($$1 != null) {
         $$1.cp = $$0;
      }
   }

   @Nullable
   public cia s() {
      bof $$0 = this.w();
      return $$0 instanceof cia ? (cia)$$0 : null;
   }

   @Nullable
   public bof u() {
      return this.p;
   }

   @Override
   public boolean cq() {
      return false;
   }

   @Override
   public xz<aai> df() {
      bof $$0 = this.w();
      return new aaj(this, $$0 == null ? this.aj() : $$0.aj());
   }

   @Override
   public void a(aaj $$0) {
      super.a($$0);
      if (this.s() == null) {
         int $$1 = $$0.p();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dJ().a($$1), $$1);
         this.al();
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
