import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckw extends cla {
   protected static final int c = 80;
   private static final akg<Boolean> b = akk.a(ckw.class, aki.k);
   private static final akg<Integer> e = akk.a(ckw.class, aki.b);
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   @Nullable
   private buk cd;
   private int ce;
   private boolean cf;
   @Nullable
   protected cce d;

   public ckw(btv<? extends ckw> $$0, deg $$1) {
      super($$0, $$1);
      this.bN = 10;
      this.a(erg.j, 0.0F);
      this.bP = new ckw.c(this);
      this.bY = this.af.i();
      this.bZ = this.bY;
   }

   @Override
   protected void D() {
      cbv $$0 = new cbv(this, 1.0);
      this.d = new cce(this, 1.0, 80);
      this.bS.a(4, new ckw.a(this));
      this.bS.a(5, $$0);
      this.bS.a(7, this.d);
      this.bS.a(8, new cbp(this, cnu.class, 8.0F));
      this.bS.a(8, new cbp(this, ckw.class, 12.0F, 0.01F));
      this.bS.a(9, new ccc(this));
      this.d.a(EnumSet.of(cbh.a.a, cbh.a.b));
      $$0.a(EnumSet.of(cbh.a.a, cbh.a.b));
      this.bT.a(1, new cda<>(this, buk.class, 10, true, false, new ckw.b(this)));
   }

   public static bvq.a gp() {
      return cla.gv().a(bvr.c, 6.0).a(bvr.v, 0.5).a(bvr.s, 30.0);
   }

   @Override
   protected cdv b(deg $$0) {
      return new cdx(this, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(e, 0);
   }

   public boolean gq() {
      return this.am.a(b);
   }

   void x(boolean $$0) {
      this.am.a(b, $$0);
   }

   public int t() {
      return 80;
   }

   void b(int $$0) {
      this.am.a(e, $$0);
   }

   public boolean gr() {
      return this.am.a(e) != 0;
   }

   @Nullable
   public buk gs() {
      if (!this.gr()) {
         return null;
      } else if (this.dS().B) {
         if (this.cd != null) {
            return this.cd;
         } else {
            bto $$0 = this.dS().a(this.am.a(e));
            if ($$0 instanceof buk) {
               this.cd = (buk)$$0;
               return this.cd;
            } else {
               return null;
            }
         }
      } else {
         return this.m();
      }
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.ce = 0;
         this.cd = null;
      }
   }

   @Override
   public int T() {
      return 160;
   }

   @Override
   protected awd w() {
      return this.bl() ? awe.lr : awe.ls;
   }

   @Override
   protected awd d(bsg $$0) {
      return this.bl() ? awe.lx : awe.ly;
   }

   @Override
   protected awd n_() {
      return this.bl() ? awe.lu : awe.lv;
   }

   @Override
   protected bto.b bf() {
      return bto.b.c;
   }

   @Override
   public float a(je $$0, dej $$1) {
      return $$1.b_($$0).a(awz.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void m_() {
      if (this.bI()) {
         if (this.dS().B) {
            this.bZ = this.bY;
            if (!this.bi()) {
               this.ca = 2.0F;
               eys $$0 = this.dv();
               if ($$0.e > 0.0 && this.cf && !this.ba()) {
                  this.dS().a(this.dx(), this.dz(), this.dD(), this.y(), this.di(), 1.0F, 1.0F, false);
               }

               this.cf = $$0.e < 0.0 && this.dS().a(this.ds().e(), this);
            } else if (this.gq()) {
               if (this.ca < 0.5F) {
                  this.ca = 4.0F;
               } else {
                  this.ca = this.ca + (0.5F - this.ca) * 0.1F;
               }
            } else {
               this.ca = this.ca + (0.125F - this.ca) * 0.2F;
            }

            this.bY = this.bY + this.ca;
            this.cc = this.cb;
            if (!this.bl()) {
               this.cb = this.af.i();
            } else if (this.gq()) {
               this.cb = this.cb + (0.0F - this.cb) * 0.25F;
            } else {
               this.cb = this.cb + (1.0F - this.cb) * 0.06F;
            }

            if (this.gq() && this.bi()) {
               eys $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dS().a(ln.d, this.d(0.5) - $$1.d * 1.5, this.dA() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gr()) {
               if (this.ce < this.t()) {
                  this.ce++;
               }

               buk $$3 = this.gs();
               if ($$3 != null) {
                  this.K().a($$3, 90.0F, 90.0F);
                  this.K().a();
                  double $$4 = (double)this.L(0.0F);
                  double $$5 = $$3.dx() - this.dx();
                  double $$6 = $$3.e(0.5) - this.dB();
                  double $$7 = $$3.dD() - this.dD();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.af.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.af.j() * (1.7 - $$4);
                     this.dS().a(ln.d, this.dx() + $$5 * $$9, this.dB() + $$6 * $$9, this.dD() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bl()) {
            this.j(300);
         } else if (this.aH()) {
            this.h(this.dv().b((double)((this.af.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.af.i() * 2.0F - 1.0F) * 0.4F)));
            this.v(this.af.i() * 360.0F);
            this.d(false);
            this.as = true;
         }

         if (this.gr()) {
            this.v(this.aV);
         }
      }

      super.m_();
   }

   protected awd y() {
      return awe.lw;
   }

   public float J(float $$0) {
      return azd.h($$0, this.bZ, this.bY);
   }

   public float K(float $$0) {
      return azd.h($$0, this.cc, this.cb);
   }

   public float L(float $$0) {
      return ((float)this.ce + $$0) / (float)this.t();
   }

   public float gt() {
      return (float)this.ce;
   }

   @Override
   public boolean a(dej $$0) {
      return $$0.f(this);
   }

   public static boolean b(btv<? extends ckw> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.am() != brm.a && (btu.a($$2) || $$1.b_($$3).a(awz.a)) && $$1.b_($$3.e()).a(awz.a);
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.dS().B) {
         return false;
      } else {
         if (!this.gq() && !$$0.a(awv.w) && !$$0.a(bsj.P) && $$0.c() instanceof buk $$2) {
            $$2.a(this.dT().d(this), 2.0F);
         }

         if (this.d != null) {
            this.d.i();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public int ae() {
      return 180;
   }

   @Override
   public void a_(eys $$0) {
      if (this.de() && this.bi()) {
         this.a(0.1F, $$0);
         this.a(buo.a, this.dv());
         this.h(this.dv().c(0.9));
         if (!this.gq() && this.m() == null) {
            this.h(this.dv().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends cbh {
      private final ckw a;
      private int b;
      private final boolean c;

      public a(ckw $$0) {
         this.a = $$0;
         this.c = $$0 instanceof ckp;
         this.a(EnumSet.of(cbh.a.a, cbh.a.b));
      }

      @Override
      public boolean b() {
         buk $$0 = this.a.m();
         return $$0 != null && $$0.bI();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.m() != null && this.a.g((bto)this.a.m()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.P().o();
         buk $$0 = this.a.m();
         if ($$0 != null) {
            this.a.K().a($$0, 90.0F, 90.0F);
         }

         this.a.as = true;
      }

      @Override
      public void e() {
         this.a.b(0);
         this.a.h(null);
         this.a.d.i();
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         buk $$0 = this.a.m();
         if ($$0 != null) {
            this.a.P().o();
            this.a.K().a($$0, 90.0F, 90.0F);
            if (!this.a.G($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.ap());
                  if (!this.a.ba()) {
                     this.a.dS().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.t()) {
                  float $$1 = 1.0F;
                  if (this.a.dS().am() == brm.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dT().c(this.a, (bto)this.a), $$1);
                  this.a.E($$0);
                  this.a.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements Predicate<buk> {
      private final ckw a;

      public b(ckw $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable buk $$0) {
         return ($$0 instanceof cnu || $$0 instanceof cgz || $$0 instanceof chm) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends cak {
      private final ckw l;

      public c(ckw $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cak.a.b && !this.l.P().m()) {
            eys $$0 = new eys(this.e - this.l.dx(), this.f - this.l.dz(), this.g - this.l.dD());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(azd.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.a(this.l.dI(), $$5, 90.0F));
            this.l.aT = this.l.dI();
            float $$6 = (float)(this.h * this.l.h(bvr.v));
            float $$7 = azd.h(0.125F, this.l.fm(), $$6);
            this.l.C($$7);
            double $$8 = Math.sin((double)(this.l.ag + this.l.ap()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dI() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dI() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ag + this.l.ap()) * 0.75) * 0.05;
            this.l.h(this.l.dv().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            caj $$12 = this.l.K();
            double $$13 = this.l.dx() + $$2 * 2.0;
            double $$14 = this.l.dB() + $$3 / $$1;
            double $$15 = this.l.dD() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.K().a(azd.d(0.125, $$16, $$13), azd.d(0.125, $$17, $$14), azd.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.x(true);
         } else {
            this.l.C(0.0F);
            this.l.x(false);
         }
      }
   }
}
