import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class csq extends csu {
   private static final Logger a = LogUtils.getLogger();
   private final azz b = azz.a();
   private boolean c;
   private int d;
   private static final int e = 10;
   private static final akn<Integer> f = akr.a(csq.class, akp.b);
   private static final akn<Boolean> g = akr.a(csq.class, akp.k);
   private int h;
   private int i;
   private int j;
   private int k;
   private float l;
   private boolean m = true;
   @Nullable
   private bwv n;
   private csq.a o = csq.a.a;
   private final int p;
   private final int q;

   private csq(bxe<? extends csq> $$0, djz $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.p = Math.max(0, $$2);
      this.q = Math.max(0, $$3);
   }

   public csq(bxe<? extends csq> $$0, djz $$1) {
      this($$0, $$1, 0, 0);
   }

   public csq(crz $$0, djz $$1, int $$2, int $$3) {
      this(bxe.bU, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dN();
      float $$5 = $$0.dL();
      float $$6 = azq.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = azq.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -azq.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = azq.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dA() - (double)$$7 * 0.3;
      double $$11 = $$0.dE();
      double $$12 = $$0.dG() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      ffs $$13 = new ffs((double)(-$$7), (double)azq.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.g();
      $$13 = $$13.d(0.6 / $$14 + this.ae.a(0.5, 0.0103365), 0.6 / $$14 + this.ae.a(0.5, 0.0103365), 0.6 / $$14 + this.ae.a(0.5, 0.0103365));
      this.i($$13);
      this.w((float)(azq.d($$13.d, $$13.f) * 180.0F / (float)Math.PI));
      this.x((float)(azq.d($$13.e, $$13.i()) * 180.0F / (float)Math.PI));
      this.N = this.dL();
      this.O = this.dN();
   }

   @Override
   protected void a(akr.a $$0) {
      $$0.a(f, 0);
      $$0.a(g, false);
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   public void a(akn<?> $$0) {
      if (f.equals($$0)) {
         int $$1 = this.ar().a(f);
         this.n = $$1 > 0 ? this.dV().a($$1 - 1) : null;
      }

      if (g.equals($$0)) {
         this.c = this.ar().a(g);
         if (this.c) {
            this.n(this.dy().d, (double)(-0.4F * azq.a(this.b, 0.6F, 1.0F)), this.dy().f);
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
      this.b.b(this.cG().getLeastSignificantBits() ^ this.dV().ae());
      super.h();
      crz $$0 = this.g();
      if ($$0 == null) {
         this.aq();
      } else if (this.dV().C || !this.a($$0)) {
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
         iw $$2 = this.dv();
         exq $$3 = this.dV().b_($$2);
         if ($$3.a(axl.a)) {
            $$1 = $$3.a(this.dV(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.o == csq.a.a) {
            if (this.n != null) {
               this.i(ffs.c);
               this.o = csq.a.b;
               return;
            }

            if ($$4) {
               this.i(this.dy().d(0.3, 0.2, 0.3));
               this.o = csq.a.c;
               return;
            }

            this.m();
         } else {
            if (this.o == csq.a.b) {
               if (this.n != null) {
                  if (!this.n.dQ() && this.n.dV().aj() == this.dV().aj()) {
                     this.a_(this.n.dA(), this.n.e(0.8), this.n.dG());
                  } else {
                     this.B(null);
                     this.o = csq.a.a;
                  }
               }

               return;
            }

            if (this.o == csq.a.c) {
               ffs $$5 = this.dy();
               double $$6 = this.dC() + $$5.e - (double)$$2.v() - (double)$$1;
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
                     this.i(this.dy().b(0.0, -0.1 * (double)this.b.i() * (double)this.b.i(), 0.0));
                  }

                  if (!this.dV().C) {
                     this.a($$2);
                  }
               } else {
                  this.d = Math.min(10, this.d + 1);
               }
            }
         }

         if (!$$3.a(axl.a)) {
            this.i(this.dy().b(0.0, -0.03, 0.0));
         }

         this.a(bya.a, this.dy());
         this.aI();
         this.A();
         if (this.o == csq.a.a && (this.aH() || this.P)) {
            this.i(ffs.c);
         }

         double $$7 = 0.92;
         this.i(this.dy().c(0.92));
         this.av();
      }
   }

   private boolean a(crz $$0) {
      daa $$1 = $$0.fb();
      daa $$2 = $$0.fc();
      boolean $$3 = $$1.a(dae.sd);
      boolean $$4 = $$2.a(dae.sd);
      if (!$$0.dQ() && $$0.bJ() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.aq();
         return true;
      }
   }

   private void m() {
      ffq $$0 = csw.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(bwv $$0) {
      return super.b($$0) || $$0.bJ() && $$0 instanceof coe;
   }

   @Override
   protected void a(ffp $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.B($$0.a());
      }
   }

   @Override
   protected void a(ffo $$0) {
      super.a($$0);
      this.i(this.dy().d().c($$0.a(this)));
   }

   private void B(@Nullable bwv $$0) {
      this.n = $$0;
      this.ar().a(f, $$0 == null ? 0 : $$0.ao() + 1);
   }

   private void a(iw $$0) {
      aru $$1 = (aru)this.dV();
      int $$2 = 1;
      iw $$3 = $$0.d();
      if (this.ae.i() < 0.25F && this.dV().r($$3)) {
         $$2++;
      }

      if (this.ae.i() < 0.5F && !this.dV().h($$3)) {
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
            float $$5 = azq.a($$4);
            float $$6 = azq.b($$4);
            double $$7 = this.dA() + (double)($$5 * (float)this.k * 0.1F);
            double $$8 = (double)((float)azq.a(this.dC()) + 1.0F);
            double $$9 = this.dG() + (double)($$6 * (float)this.k * 0.1F);
            ebg $$10 = $$1.a_(iw.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dng.J)) {
               if (this.ae.i() < 0.15F) {
                  $$1.a(lz.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(lz.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(lz.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(awr.jB, 0.25F, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
            double $$13 = this.dC() + 0.5;
            $$1.a(lz.d, this.dA(), $$13, this.dG(), (int)(1.0F + this.dq() * 20.0F), (double)this.dq(), 0.0, (double)this.dq(), 0.2F);
            $$1.a(lz.E, this.dA(), $$13, this.dG(), (int)(1.0F + this.dq() * 20.0F), (double)this.dq(), 0.0, (double)this.dq(), 0.2F);
            this.i = azq.a(this.ae, 20, 40);
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
            float $$15 = azq.a(this.ae, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = azq.a(this.ae, 25.0F, 60.0F);
            double $$17 = this.dA() + (double)(azq.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)azq.a(this.dC()) + 1.0F);
            double $$19 = this.dG() + (double)(azq.b($$15) * $$16) * 0.1;
            ebg $$20 = $$1.a_(iw.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dng.J)) {
               $$1.a(lz.ap, $$17, $$18, $$19, 2 + this.ae.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.j <= 0) {
            this.l = azq.a(this.ae, 0.0F, 360.0F);
            this.k = azq.a(this.ae, 20, 80);
         }
      } else {
         this.j = azq.a(this.ae, 100, 600);
         this.j = this.j - this.q;
      }
   }

   private boolean b(iw $$0) {
      csq.b $$1 = csq.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         csq.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == csq.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == csq.b.a) {
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

   private csq.b a(iw $$0, iw $$1) {
      return iw.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : csq.b.c).orElse(csq.b.c);
   }

   private csq.b c(iw $$0) {
      ebg $$1 = this.dV().a_($$0);
      if (!$$1.l() && !$$1.a(dng.fF)) {
         exq $$2 = $$1.y();
         return $$2.a(axl.a) && $$2.b() && $$1.g(this.dV(), $$0).c() ? csq.b.b : csq.b.c;
      } else {
         return csq.b.a;
      }
   }

   public boolean f() {
      return this.m;
   }

   @Override
   public void b(ua $$0) {
   }

   @Override
   public void a(ua $$0) {
   }

   public int a(daa $$0) {
      crz $$1 = this.g();
      if (!this.dV().C && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.n != null) {
            this.d(this.n);
            aq.E.a((arv)$$1, $$0, this, Collections.emptyList());
            this.dV().a(this, (byte)31);
            $$2 = this.n instanceof coe ? 3 : 5;
         } else if (this.i > 0) {
            fam $$3 = new fam.a((aru)this.dV()).a(fdd.f, this.dt()).a(fdd.i, $$0).a(fdd.a, this).a((float)this.p + $$1.eh()).a(fdc.f);
            fao $$4 = this.dV().p().bc().b(faf.am);
            List<daa> $$5 = $$4.a($$3);
            aq.E.a((arv)$$1, $$0, this, $$5);

            for (daa $$6 : $$5) {
               coe $$7 = new coe(this.dV(), this.dA(), this.dC(), this.dG(), $$6);
               double $$8 = $$1.dA() - this.dA();
               double $$9 = $$1.dC() - this.dC();
               double $$10 = $$1.dG() - this.dG();
               double $$11 = 0.1;
               $$7.n($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dV().b($$7);
               $$1.dV().b(new bxj($$1.dV(), $$1.dA(), $$1.dC() + 0.5, $$1.dG() + 0.5, this.ae.a(6) + 1));
               if ($$6.a(axo.aV)) {
                  $$1.a(axb.R, 1);
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
      if ($$0 == 31 && this.dV().C && this.n instanceof crz $$1 && $$1.gh()) {
         this.d(this.n);
      }

      super.b($$0);
   }

   protected void d(bwv $$0) {
      bwv $$1 = this.q();
      if ($$1 != null) {
         ffs $$2 = new ffs($$1.dA() - this.dA(), $$1.dC() - this.dC(), $$1.dG() - this.dG()).c(0.1);
         $$0.i($$0.dy().e($$2));
      }
   }

   @Override
   protected bwv.c bf() {
      return bwv.c.a;
   }

   @Override
   public void a(bwv.d $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void as() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bwv $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable csq $$0) {
      crz $$1 = this.g();
      if ($$1 != null) {
         $$1.ck = $$0;
      }
   }

   @Nullable
   public crz g() {
      return this.q() instanceof crz $$1 ? $$1 : null;
   }

   @Nullable
   public bwv j() {
      return this.n;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public zj<aby> a(ars $$0) {
      bwv $$1 = this.q();
      return new abz(this, $$0, $$1 == null ? this.ao() : $$1.ao());
   }

   @Override
   public void a(abz $$0) {
      super.a($$0);
      if (this.g() == null) {
         int $$1 = $$0.p();
         a.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dV().a($$1), $$1);
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
