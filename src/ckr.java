import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckr extends ckv {
   protected static final int c = 80;
   private static final akg<Boolean> b = akk.a(ckr.class, aki.k);
   private static final akg<Integer> e = akk.a(ckr.class, aki.b);
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   private float cd;
   @Nullable
   private buf ce;
   private int cf;
   private boolean cg;
   @Nullable
   protected cbz d;

   public ckr(btq<? extends ckr> $$0, dds $$1) {
      super($$0, $$1);
      this.bO = 10;
      this.a(eqs.j, 0.0F);
      this.bQ = new ckr.c(this);
      this.bZ = this.af.i();
      this.ca = this.bZ;
   }

   @Override
   protected void D() {
      cbq $$0 = new cbq(this, 1.0);
      this.d = new cbz(this, 1.0, 80);
      this.bT.a(4, new ckr.a(this));
      this.bT.a(5, $$0);
      this.bT.a(7, this.d);
      this.bT.a(8, new cbk(this, cnp.class, 8.0F));
      this.bT.a(8, new cbk(this, ckr.class, 12.0F, 0.01F));
      this.bT.a(9, new cbx(this));
      this.d.a(EnumSet.of(cbc.a.a, cbc.a.b));
      $$0.a(EnumSet.of(cbc.a.a, cbc.a.b));
      this.bU.a(1, new ccv<>(this, buf.class, 10, true, false, new ckr.b(this)));
   }

   public static bvl.a go() {
      return ckv.gu().a(bvm.c, 6.0).a(bvm.v, 0.5).a(bvm.s, 30.0);
   }

   @Override
   protected cdq b(dds $$0) {
      return new cds(this, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(e, 0);
   }

   public boolean gp() {
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

   public boolean gq() {
      return this.am.a(e) != 0;
   }

   @Nullable
   public buf gr() {
      if (!this.gq()) {
         return null;
      } else if (this.dS().B) {
         if (this.ce != null) {
            return this.ce;
         } else {
            btj $$0 = this.dS().a(this.am.a(e));
            if ($$0 instanceof buf) {
               this.ce = (buf)$$0;
               return this.ce;
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
         this.cf = 0;
         this.ce = null;
      }
   }

   @Override
   public int T() {
      return 160;
   }

   @Override
   protected awc w() {
      return this.bl() ? awd.lr : awd.ls;
   }

   @Override
   protected awc d(bsb $$0) {
      return this.bl() ? awd.lx : awd.ly;
   }

   @Override
   protected awc n_() {
      return this.bl() ? awd.lu : awd.lv;
   }

   @Override
   protected btj.b bf() {
      return btj.b.c;
   }

   @Override
   public float a(je $$0, ddv $$1) {
      return $$1.b_($$0).a(awy.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void m_() {
      if (this.bI()) {
         if (this.dS().B) {
            this.ca = this.bZ;
            if (!this.bi()) {
               this.cb = 2.0F;
               eye $$0 = this.dv();
               if ($$0.e > 0.0 && this.cg && !this.ba()) {
                  this.dS().a(this.dx(), this.dz(), this.dD(), this.y(), this.di(), 1.0F, 1.0F, false);
               }

               this.cg = $$0.e < 0.0 && this.dS().a(this.ds().e(), this);
            } else if (this.gp()) {
               if (this.cb < 0.5F) {
                  this.cb = 4.0F;
               } else {
                  this.cb = this.cb + (0.5F - this.cb) * 0.1F;
               }
            } else {
               this.cb = this.cb + (0.125F - this.cb) * 0.2F;
            }

            this.bZ = this.bZ + this.cb;
            this.cd = this.cc;
            if (!this.bl()) {
               this.cc = this.af.i();
            } else if (this.gp()) {
               this.cc = this.cc + (0.0F - this.cc) * 0.25F;
            } else {
               this.cc = this.cc + (1.0F - this.cc) * 0.06F;
            }

            if (this.gp() && this.bi()) {
               eye $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dS().a(ln.d, this.d(0.5) - $$1.d * 1.5, this.dA() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gq()) {
               if (this.cf < this.t()) {
                  this.cf++;
               }

               buf $$3 = this.gr();
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

         if (this.gq()) {
            this.v(this.aW);
         }
      }

      super.m_();
   }

   protected awc y() {
      return awd.lw;
   }

   public float J(float $$0) {
      return azc.h($$0, this.ca, this.bZ);
   }

   public float K(float $$0) {
      return azc.h($$0, this.cd, this.cc);
   }

   public float L(float $$0) {
      return ((float)this.cf + $$0) / (float)this.t();
   }

   public float gs() {
      return (float)this.cf;
   }

   @Override
   public boolean a(ddv $$0) {
      return $$0.f(this);
   }

   public static boolean b(btq<? extends ckr> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.am() != brh.a && (btp.a($$2) || $$1.b_($$3).a(awy.a)) && $$1.b_($$3.e()).a(awy.a);
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.dS().B) {
         return false;
      } else {
         if (!this.gp() && !$$0.a(awu.w) && !$$0.a(bse.P) && $$0.c() instanceof buf $$2) {
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
   public void a_(eye $$0) {
      if (this.de() && this.bi()) {
         this.a(0.1F, $$0);
         this.a(buj.a, this.dv());
         this.h(this.dv().c(0.9));
         if (!this.gp() && this.m() == null) {
            this.h(this.dv().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends cbc {
      private final ckr a;
      private int b;
      private final boolean c;

      public a(ckr $$0) {
         this.a = $$0;
         this.c = $$0 instanceof ckk;
         this.a(EnumSet.of(cbc.a.a, cbc.a.b));
      }

      @Override
      public boolean b() {
         buf $$0 = this.a.m();
         return $$0 != null && $$0.bI();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.m() != null && this.a.g((btj)this.a.m()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.P().o();
         buf $$0 = this.a.m();
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
         buf $$0 = this.a.m();
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
                  if (this.a.dS().am() == brh.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dT().c(this.a, (btj)this.a), $$1);
                  this.a.E($$0);
                  this.a.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements Predicate<buf> {
      private final ckr a;

      public b(ckr $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable buf $$0) {
         return ($$0 instanceof cnp || $$0 instanceof cgu || $$0 instanceof chh) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends caf {
      private final ckr l;

      public c(ckr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == caf.a.b && !this.l.P().m()) {
            eye $$0 = new eye(this.e - this.l.dx(), this.f - this.l.dz(), this.g - this.l.dD());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(azc.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.a(this.l.dI(), $$5, 90.0F));
            this.l.aU = this.l.dI();
            float $$6 = (float)(this.h * this.l.h(bvm.v));
            float $$7 = azc.h(0.125F, this.l.fm(), $$6);
            this.l.C($$7);
            double $$8 = Math.sin((double)(this.l.ag + this.l.ap()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dI() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dI() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ag + this.l.ap()) * 0.75) * 0.05;
            this.l.h(this.l.dv().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            cae $$12 = this.l.K();
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

            this.l.K().a(azc.d(0.125, $$16, $$13), azc.d(0.125, $$17, $$14), azc.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.x(true);
         } else {
            this.l.C(0.0F);
            this.l.x(false);
         }
      }
   }
}
