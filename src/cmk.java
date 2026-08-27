import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmk extends cmo {
   private static final Logger b = LogUtils.getLogger();
   private final ayk c = ayk.a();
   private boolean d;
   private int e;
   private static final int g = 10;
   private static final ajr<Integer> h = ajv.a(cmk.class, ajt.b);
   private static final ajr<Boolean> i = ajv.a(cmk.class, ajt.k);
   private int j;
   private int k;
   private int l;
   private int m;
   private float n;
   private boolean o = true;
   @Nullable
   private bru p;
   private cmk.a q = cmk.a.a;
   private final int r;
   private final int s;

   private cmk(bsa<? extends cmk> $$0, dax $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.au = true;
      this.r = Math.max(0, $$2);
      this.s = Math.max(0, $$3);
   }

   public cmk(bsa<? extends cmk> $$0, dax $$1) {
      this($$0, $$1, 0, 0);
   }

   public cmk(clw $$0, dax $$1, int $$2, int $$3) {
      this(bsa.bz, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dH();
      float $$5 = $$0.dF();
      float $$6 = ayd.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = ayd.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -ayd.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = ayd.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.du() - (double)$$7 * 0.3;
      double $$11 = $$0.dy();
      double $$12 = $$0.dA() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      euk $$13 = new euk((double)(-$$7), (double)ayd.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ah.a(0.5, 0.0103365), 0.6 / $$14 + this.ah.a(0.5, 0.0103365), 0.6 / $$14 + this.ah.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(ayd.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(ayd.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.O = this.dF();
      this.P = this.dH();
   }

   @Override
   protected void a(ajv.a $$0) {
      $$0.a(h, 0);
      $$0.a(i, false);
   }

   @Override
   public void a(ajr<?> $$0) {
      if (h.equals($$0)) {
         int $$1 = this.ap().a(h);
         this.p = $$1 > 0 ? this.dP().a($$1 - 1) : null;
      }

      if (i.equals($$0)) {
         this.d = this.ap().a(i);
         if (this.d) {
            this.o(this.ds().c, (double)(-0.4F * ayd.a(this.c, 0.6F, 1.0F)), this.ds().e);
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
      this.c.b(this.cz().getLeastSignificantBits() ^ this.dP().Y());
      super.l();
      clw $$0 = this.u();
      if ($$0 == null) {
         this.ao();
      } else if (this.dP().B || !this.a($$0)) {
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
         io $$2 = this.dp();
         emu $$3 = this.dP().b_($$2);
         if ($$3.a(awb.a)) {
            $$1 = $$3.a((dad)this.dP(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.q == cmk.a.a) {
            if (this.p != null) {
               this.g(euk.b);
               this.q = cmk.a.b;
               return;
            }

            if ($$4) {
               this.g(this.ds().d(0.3, 0.2, 0.3));
               this.q = cmk.a.c;
               return;
            }

            this.w();
         } else {
            if (this.q == cmk.a.b) {
               if (this.p != null) {
                  if (!this.p.dK() && this.p.dP().ae() == this.dP().ae()) {
                     this.a_(this.p.du(), this.p.e(0.8), this.p.dA());
                  } else {
                     this.A(null);
                     this.q = cmk.a.a;
                  }
               }

               return;
            }

            if (this.q == cmk.a.c) {
               euk $$5 = this.ds();
               double $$6 = this.dw() + $$5.d - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.o($$5.c * 0.9, $$5.d - $$6 * (double)this.ah.i() * 0.2, $$5.e * 0.9);
               if (this.k <= 0 && this.m <= 0) {
                  this.o = true;
               } else {
                  this.o = this.o && this.e < 10 && this.b($$2);
               }

               if ($$4) {
                  this.e = Math.max(0, this.e - 1);
                  if (this.d) {
                     this.g(this.ds().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dP().B) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(awb.a)) {
            this.g(this.ds().b(0.0, -0.03, 0.0));
         }

         this.a(bst.a, this.ds());
         this.J();
         if (this.q == cmk.a.a && (this.aE() || this.Q)) {
            this.g(euk.b);
         }

         double $$7 = 0.92;
         this.g(this.ds().a(0.92));
         this.at();
      }
   }

   private boolean a(clw $$0) {
      cto $$1 = $$0.eX();
      cto $$2 = $$0.eY();
      boolean $$3 = $$1.a(ctr.qV);
      boolean $$4 = $$2.a(ctr.qV);
      if (!$$0.dK() && $$0.bD() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.ao();
         return true;
      }
   }

   private void w() {
      eui $$0 = cmq.a(this, this::b);
      this.a($$0);
   }

   @Override
   protected boolean b(bru $$0) {
      return super.b($$0) || $$0.bD() && $$0 instanceof cig;
   }

   @Override
   protected void a(euh $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(eug $$0) {
      super.a($$0);
      this.g(this.ds().d().a($$0.a(this)));
   }

   private void A(@Nullable bru $$0) {
      this.p = $$0;
      this.ap().a(h, $$0 == null ? 0 : $$0.al() + 1);
   }

   private void a(io $$0) {
      aqm $$1 = (aqm)this.dP();
      int $$2 = 1;
      io $$3 = $$0.c();
      if (this.ah.i() < 0.25F && this.dP().r($$3)) {
         $$2++;
      }

      if (this.ah.i() < 0.5F && !this.dP().h($$3)) {
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
            this.n = this.n + (float)this.ah.a(0.0, 9.188);
            float $$4 = this.n * (float) (Math.PI / 180.0);
            float $$5 = ayd.a($$4);
            float $$6 = ayd.b($$4);
            double $$7 = this.du() + (double)($$5 * (float)this.m * 0.1F);
            double $$8 = (double)((float)ayd.a(this.dw()) + 1.0F);
            double $$9 = this.dA() + (double)($$6 * (float)this.m * 0.1F);
            drb $$10 = $$1.a_(io.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dea.G)) {
               if (this.ah.i() < 0.15F) {
                  $$1.a(ky.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(ky.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(ky.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(avh.iX, 0.25F, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
            double $$13 = this.dw() + 0.5;
            $$1.a(ky.d, this.du(), $$13, this.dA(), (int)(1.0F + this.dj() * 20.0F), (double)this.dj(), 0.0, (double)this.dj(), 0.2F);
            $$1.a(ky.E, this.du(), $$13, this.dA(), (int)(1.0F + this.dj() * 20.0F), (double)this.dj(), 0.0, (double)this.dj(), 0.2F);
            this.k = ayd.a(this.ah, 20, 40);
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

         if (this.ah.i() < $$14) {
            float $$15 = ayd.a(this.ah, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = ayd.a(this.ah, 25.0F, 60.0F);
            double $$17 = this.du() + (double)(ayd.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)ayd.a(this.dw()) + 1.0F);
            double $$19 = this.dA() + (double)(ayd.b($$15) * $$16) * 0.1;
            drb $$20 = $$1.a_(io.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dea.G)) {
               $$1.a(ky.am, $$17, $$18, $$19, 2 + this.ah.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.l <= 0) {
            this.n = ayd.a(this.ah, 0.0F, 360.0F);
            this.m = ayd.a(this.ah, 20, 80);
         }
      } else {
         this.l = ayd.a(this.ah, 100, 600);
         this.l = this.l - this.s * 20 * 5;
      }
   }

   private boolean b(io $$0) {
      cmk.b $$1 = cmk.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cmk.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cmk.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cmk.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cmk.b a(io $$0, io $$1) {
      return io.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cmk.b.c).orElse(cmk.b.c);
   }

   private cmk.b c(io $$0) {
      drb $$1 = this.dP().a_($$0);
      if (!$$1.i() && !$$1.a(dea.fm)) {
         emu $$2 = $$1.u();
         return $$2.a(awb.a) && $$2.b() && $$1.k(this.dP(), $$0).c() ? cmk.b.b : cmk.b.c;
      } else {
         return cmk.b.a;
      }
   }

   public boolean p() {
      return this.o;
   }

   @Override
   public void b(ud $$0) {
   }

   @Override
   public void a(ud $$0) {
   }

   public int a(cto $$0) {
      clw $$1 = this.u();
      if (!this.dP().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.p != null) {
            this.d(this.p);
            am.E.a((aqn)$$1, $$0, this, Collections.emptyList());
            this.dP().a(this, (byte)31);
            $$2 = this.p instanceof cig ? 3 : 5;
         } else if (this.k > 0) {
            epi $$3 = new epi.a((aqm)this.dP()).a(erx.f, this.dn()).a(erx.i, $$0).a(erx.a, this).a((float)this.r + $$1.gy()).a(erw.f);
            epk $$4 = this.dP().o().be().b(epd.aA);
            List<cto> $$5 = $$4.a($$3);
            am.E.a((aqn)$$1, $$0, this, $$5);

            for (cto $$6 : $$5) {
               cig $$7 = new cig(this.dP(), this.du(), this.dw(), this.dA(), $$6);
               double $$8 = $$1.du() - this.du();
               double $$9 = $$1.dw() - this.dw();
               double $$10 = $$1.dA() - this.dA();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dP().b($$7);
               $$1.dP().b(new bse($$1.dP(), $$1.du(), $$1.dw() + 0.5, $$1.dA() + 0.5, this.ah.a(6) + 1));
               if ($$6.a(awe.aP)) {
                  $$1.a(avr.R, 1);
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
      if ($$0 == 31 && this.dP().B && this.p instanceof clw && ((clw)this.p).g()) {
         this.d(this.p);
      }

      super.b($$0);
   }

   protected void d(bru $$0) {
      bru $$1 = this.s();
      if ($$1 != null) {
         euk $$2 = new euk($$1.du() - this.du(), $$1.dw() - this.dw(), $$1.dA() - this.dA()).a(0.1);
         $$0.g($$0.ds().e($$2));
      }
   }

   @Override
   protected bru.b bb() {
      return bru.b.a;
   }

   @Override
   public void a(bru.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void aq() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bru $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cmk $$0) {
      clw $$1 = this.u();
      if ($$1 != null) {
         $$1.cu = $$0;
      }
   }

   @Nullable
   public clw u() {
      bru $$0 = this.s();
      return $$0 instanceof clw ? (clw)$$0 : null;
   }

   @Nullable
   public bru v() {
      return this.p;
   }

   @Override
   public boolean cw() {
      return false;
   }

   @Override
   public ze<abq> dl() {
      bru $$0 = this.s();
      return new abr(this, $$0 == null ? this.al() : $$0.al());
   }

   @Override
   public void a(abr $$0) {
      super.a($$0);
      if (this.u() == null) {
         int $$1 = $$0.p();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dP().a($$1), $$1);
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
