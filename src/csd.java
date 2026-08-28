import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class csd extends csh {
   private static final Logger a = LogUtils.getLogger();
   private final azv b = azv.a();
   private boolean c;
   private int d;
   private static final int e = 10;
   private static final akj<Integer> f = akn.a(csd.class, akl.b);
   private static final akj<Boolean> g = akn.a(csd.class, akl.k);
   private int h;
   private int i;
   private int j;
   private int k;
   private float l;
   private boolean m = true;
   @Nullable
   private bwi n;
   private csd.a o = csd.a.a;
   private final int p;
   private final int q;

   private csd(bwr<? extends csd> $$0, djm $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.p = Math.max(0, $$2);
      this.q = Math.max(0, $$3);
   }

   public csd(bwr<? extends csd> $$0, djm $$1) {
      this($$0, $$1, 0, 0);
   }

   public csd(crm $$0, djm $$1, int $$2, int $$3) {
      this(bwr.bT, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dM();
      float $$5 = $$0.dK();
      float $$6 = azm.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = azm.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -azm.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = azm.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dz() - (double)$$7 * 0.3;
      double $$11 = $$0.dD();
      double $$12 = $$0.dF() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      ffc $$13 = new ffc((double)(-$$7), (double)azm.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.g();
      $$13 = $$13.d(0.6 / $$14 + this.ae.a(0.5, 0.0103365), 0.6 / $$14 + this.ae.a(0.5, 0.0103365), 0.6 / $$14 + this.ae.a(0.5, 0.0103365));
      this.i($$13);
      this.w((float)(azm.d($$13.d, $$13.f) * 180.0F / (float)Math.PI));
      this.x((float)(azm.d($$13.e, $$13.i()) * 180.0F / (float)Math.PI));
      this.N = this.dK();
      this.O = this.dM();
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(f, 0);
      $$0.a(g, false);
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   public void a(akj<?> $$0) {
      if (f.equals($$0)) {
         int $$1 = this.ar().a(f);
         this.n = $$1 > 0 ? this.dU().a($$1 - 1) : null;
      }

      if (g.equals($$0)) {
         this.c = this.ar().a(g);
         if (this.c) {
            this.n(this.dx().d, (double)(-0.4F * azm.a(this.b, 0.6F, 1.0F)), this.dx().f);
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
   public void h() {
      this.b.b(this.cF().getLeastSignificantBits() ^ this.dU().ae());
      super.h();
      crm $$0 = this.g();
      if ($$0 == null) {
         this.aq();
      } else if (this.dU().C || !this.a($$0)) {
         if (this.aH()) {
            this.h++;
            if (this.h >= 1200) {
               this.aq();
               return;
            }
         } else {
            this.h = 0;
         }

         float $$1 = 0.0F;
         iv $$2 = this.du();
         exa $$3 = this.dU().b_($$2);
         if ($$3.a(axh.a)) {
            $$1 = $$3.a(this.dU(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.o == csd.a.a) {
            if (this.n != null) {
               this.i(ffc.c);
               this.o = csd.a.b;
               return;
            }

            if ($$4) {
               this.i(this.dx().d(0.3, 0.2, 0.3));
               this.o = csd.a.c;
               return;
            }

            this.m();
         } else {
            if (this.o == csd.a.b) {
               if (this.n != null) {
                  if (!this.n.dP() && this.n.dU().aj() == this.dU().aj()) {
                     this.a_(this.n.dz(), this.n.e(0.8), this.n.dF());
                  } else {
                     this.B(null);
                     this.o = csd.a.a;
                  }
               }

               return;
            }

            if (this.o == csd.a.c) {
               ffc $$5 = this.dx();
               double $$6 = this.dB() + $$5.e - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.n($$5.d * 0.9, $$5.e - $$6 * (double)this.ae.i() * 0.2, $$5.f * 0.9);
               if (this.i <= 0 && this.k <= 0) {
                  this.m = true;
               } else {
                  this.m = this.m && this.d < 10 && this.b($$2);
               }

               if ($$4) {
                  this.d = Math.max(0, this.d - 1);
                  if (this.c) {
                     this.i(this.dx().b(0.0, -0.1 * (double)this.b.i() * (double)this.b.i(), 0.0));
                  }

                  if (!this.dU().C) {
                     this.a($$2);
                  }
               } else {
                  this.d = Math.min(10, this.d + 1);
               }
            }
         }

         if (!$$3.a(axh.a)) {
            this.i(this.dx().b(0.0, -0.03, 0.0));
         }

         this.a(bxn.a, this.dx());
         this.aI();
         this.A();
         if (this.o == csd.a.a && (this.aH() || this.P)) {
            this.i(ffc.c);
         }

         double $$7 = 0.92;
         this.i(this.dx().c(0.92));
         this.av();
      }
   }

   private boolean a(crm $$0) {
      czn $$1 = $$0.fa();
      czn $$2 = $$0.fb();
      boolean $$3 = $$1.a(czr.sd);
      boolean $$4 = $$2.a(czr.sd);
      if (!$$0.dP() && $$0.bI() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.aq();
         return true;
      }
   }

   private void m() {
      ffa $$0 = csj.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(bwi $$0) {
      return super.b($$0) || $$0.bI() && $$0 instanceof cnr;
   }

   @Override
   protected void a(fez $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.B($$0.a());
      }
   }

   @Override
   protected void a(fey $$0) {
      super.a($$0);
      this.i(this.dx().d().c($$0.a(this)));
   }

   private void B(@Nullable bwi $$0) {
      this.n = $$0;
      this.ar().a(f, $$0 == null ? 0 : $$0.ao() + 1);
   }

   private void a(iv $$0) {
      arq $$1 = (arq)this.dU();
      int $$2 = 1;
      iv $$3 = $$0.d();
      if (this.ae.i() < 0.25F && this.dU().r($$3)) {
         $$2++;
      }

      if (this.ae.i() < 0.5F && !this.dU().h($$3)) {
         $$2--;
      }

      if (this.i > 0) {
         this.i--;
         if (this.i <= 0) {
            this.j = 0;
            this.k = 0;
            this.ar().a(g, false);
         }
      } else if (this.k > 0) {
         this.k -= $$2;
         if (this.k > 0) {
            this.l = this.l + (float)this.ae.a(0.0, 9.188);
            float $$4 = this.l * (float) (Math.PI / 180.0);
            float $$5 = azm.a($$4);
            float $$6 = azm.b($$4);
            double $$7 = this.dz() + (double)($$5 * (float)this.k * 0.1F);
            double $$8 = (double)((float)azm.a(this.dB()) + 1.0F);
            double $$9 = this.dF() + (double)($$6 * (float)this.k * 0.1F);
            eat $$10 = $$1.a_(iv.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dmt.J)) {
               if (this.ae.i() < 0.15F) {
                  $$1.a(ly.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(ly.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(ly.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(awn.jB, 0.25F, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
            double $$13 = this.dB() + 0.5;
            $$1.a(ly.d, this.dz(), $$13, this.dF(), (int)(1.0F + this.dp() * 20.0F), (double)this.dp(), 0.0, (double)this.dp(), 0.2F);
            $$1.a(ly.E, this.dz(), $$13, this.dF(), (int)(1.0F + this.dp() * 20.0F), (double)this.dp(), 0.0, (double)this.dp(), 0.2F);
            this.i = azm.a(this.ae, 20, 40);
            this.ar().a(g, true);
         }
      } else if (this.j > 0) {
         this.j -= $$2;
         float $$14 = 0.15F;
         if (this.j < 20) {
            $$14 += (float)(20 - this.j) * 0.05F;
         } else if (this.j < 40) {
            $$14 += (float)(40 - this.j) * 0.02F;
         } else if (this.j < 60) {
            $$14 += (float)(60 - this.j) * 0.01F;
         }

         if (this.ae.i() < $$14) {
            float $$15 = azm.a(this.ae, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = azm.a(this.ae, 25.0F, 60.0F);
            double $$17 = this.dz() + (double)(azm.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)azm.a(this.dB()) + 1.0F);
            double $$19 = this.dF() + (double)(azm.b($$15) * $$16) * 0.1;
            eat $$20 = $$1.a_(iv.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dmt.J)) {
               $$1.a(ly.ap, $$17, $$18, $$19, 2 + this.ae.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.j <= 0) {
            this.l = azm.a(this.ae, 0.0F, 360.0F);
            this.k = azm.a(this.ae, 20, 80);
         }
      } else {
         this.j = azm.a(this.ae, 100, 600);
         this.j = this.j - this.q;
      }
   }

   private boolean b(iv $$0) {
      csd.b $$1 = csd.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         csd.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == csd.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == csd.b.a) {
                  return false;
               }
               break;
            case c:
               return false;
         }

         $$1 = $$3;
      }

      return true;
   }

   private csd.b a(iv $$0, iv $$1) {
      return iv.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : csd.b.c).orElse(csd.b.c);
   }

   private csd.b c(iv $$0) {
      eat $$1 = this.dU().a_($$0);
      if (!$$1.l() && !$$1.a(dmt.fF)) {
         exa $$2 = $$1.y();
         return $$2.a(axh.a) && $$2.b() && $$1.g(this.dU(), $$0).c() ? csd.b.b : csd.b.c;
      } else {
         return csd.b.a;
      }
   }

   public boolean f() {
      return this.m;
   }

   @Override
   public void b(tz $$0) {
   }

   @Override
   public void a(tz $$0) {
   }

   public int a(czn $$0) {
      crm $$1 = this.g();
      if (!this.dU().C && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.n != null) {
            this.d(this.n);
            aq.E.a((arr)$$1, $$0, this, Collections.emptyList());
            this.dU().a(this, (byte)31);
            $$2 = this.n instanceof cnr ? 3 : 5;
         } else if (this.i > 0) {
            ezw $$3 = new ezw.a((arq)this.dU()).a(fcn.f, this.ds()).a(fcn.i, $$0).a(fcn.a, this).a((float)this.p + $$1.eg()).a(fcm.f);
            ezy $$4 = this.dU().p().bc().b(ezp.am);
            List<czn> $$5 = $$4.a($$3);
            aq.E.a((arr)$$1, $$0, this, $$5);

            for (czn $$6 : $$5) {
               cnr $$7 = new cnr(this.dU(), this.dz(), this.dB(), this.dF(), $$6);
               double $$8 = $$1.dz() - this.dz();
               double $$9 = $$1.dB() - this.dB();
               double $$10 = $$1.dF() - this.dF();
               double $$11 = 0.1;
               $$7.n($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dU().b($$7);
               $$1.dU().b(new bww($$1.dU(), $$1.dz(), $$1.dB() + 0.5, $$1.dF() + 0.5, this.ae.a(6) + 1));
               if ($$6.a(axk.aU)) {
                  $$1.a(awx.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aH()) {
            $$2 = 2;
         }

         this.aq();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dU().C && this.n instanceof crm $$1 && $$1.gg()) {
         this.d(this.n);
      }

      super.b($$0);
   }

   protected void d(bwi $$0) {
      bwi $$1 = this.q();
      if ($$1 != null) {
         ffc $$2 = new ffc($$1.dz() - this.dz(), $$1.dB() - this.dB(), $$1.dF() - this.dF()).c(0.1);
         $$0.i($$0.dx().e($$2));
      }
   }

   @Override
   protected bwi.c be() {
      return bwi.c.a;
   }

   @Override
   public void a(bwi.d $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void as() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bwi $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable csd $$0) {
      crm $$1 = this.g();
      if ($$1 != null) {
         $$1.ck = $$0;
      }
   }

   @Nullable
   public crm g() {
      return this.q() instanceof crm $$1 ? $$1 : null;
   }

   @Nullable
   public bwi j() {
      return this.n;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public zf<abu> a(aro $$0) {
      bwi $$1 = this.q();
      return new abv(this, $$0, $$1 == null ? this.ao() : $$1.ao());
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      if (this.g() == null) {
         int $$1 = $$0.p();
         a.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dU().a($$1), $$1);
         this.aq();
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
