import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cka extends cke {
   protected static final int c = 80;
   private static final akk<Boolean> b = ako.a(cka.class, akm.k);
   private static final akk<Integer> e = ako.a(cka.class, akm.b);
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   @Nullable
   private btq cd;
   private int ce;
   private boolean cf;
   @Nullable
   protected cbl d;

   public cka(btb<? extends cka> $$0, dbz $$1) {
      super($$0, $$1);
      this.bN = 10;
      this.a(eon.j, 0.0F);
      this.bP = new cka.c(this);
      this.bY = this.ah.i();
      this.bZ = this.bY;
   }

   @Override
   protected void z() {
      cbc $$0 = new cbc(this, 1.0);
      this.d = new cbl(this, 1.0, 80);
      this.bS.a(4, new cka.a(this));
      this.bS.a(5, $$0);
      this.bS.a(7, this.d);
      this.bS.a(8, new caw(this, cmy.class, 8.0F));
      this.bS.a(8, new caw(this, cka.class, 12.0F, 0.01F));
      this.bS.a(9, new cbj(this));
      this.d.a(EnumSet.of(cao.a.a, cao.a.b));
      $$0.a(EnumSet.of(cao.a.a, cao.a.b));
      this.bT.a(1, new cch<>(this, btq.class, 10, true, false, new cka.b(this)));
   }

   public static bux.a gq() {
      return cke.gw().a(buy.c, 6.0).a(buy.r, 0.5).a(buy.k, 16.0).a(buy.q, 30.0);
   }

   @Override
   protected cdc b(dbz $$0) {
      return new cde(this, $$0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(e, 0);
   }

   public boolean gr() {
      return this.ao.a(b);
   }

   void w(boolean $$0) {
      this.ao.a(b, $$0);
   }

   public int u() {
      return 80;
   }

   void b(int $$0) {
      this.ao.a(e, $$0);
   }

   public boolean gs() {
      return this.ao.a(e) != 0;
   }

   @Nullable
   public btq gt() {
      if (!this.gs()) {
         return null;
      } else if (this.dP().B) {
         if (this.cd != null) {
            return this.cd;
         } else {
            bsv $$0 = this.dP().a(this.ao.a(e));
            if ($$0 instanceof btq) {
               this.cd = (btq)$$0;
               return this.cd;
            } else {
               return null;
            }
         }
      } else {
         return this.p();
      }
   }

   @Override
   public void a(akk<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.ce = 0;
         this.cd = null;
      }
   }

   @Override
   public int P() {
      return 160;
   }

   @Override
   protected avz v() {
      return this.bh() ? awa.lq : awa.lr;
   }

   @Override
   protected avz d(bro $$0) {
      return this.bh() ? awa.lw : awa.lx;
   }

   @Override
   protected avz o_() {
      return this.bh() ? awa.lt : awa.lu;
   }

   @Override
   protected bsv.b bb() {
      return bsv.b.c;
   }

   @Override
   public float a(iz $$0, dcc $$1) {
      return $$1.b_($$0).a(awv.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void n_() {
      if (this.bD()) {
         if (this.dP().B) {
            this.bZ = this.bY;
            if (!this.be()) {
               this.ca = 2.0F;
               evs $$0 = this.ds();
               if ($$0.d > 0.0 && this.cf && !this.aW()) {
                  this.dP().a(this.du(), this.dw(), this.dA(), this.y(), this.de(), 1.0F, 1.0F, false);
               }

               this.cf = $$0.d < 0.0 && this.dP().a(this.dp().d(), this);
            } else if (this.gr()) {
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
            if (!this.bh()) {
               this.cb = this.ah.i();
            } else if (this.gr()) {
               this.cb = this.cb + (0.0F - this.cb) * 0.25F;
            } else {
               this.cb = this.cb + (1.0F - this.cb) * 0.06F;
            }

            if (this.gr() && this.be()) {
               evs $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dP().a(li.d, this.d(0.5) - $$1.c * 1.5, this.dx() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gs()) {
               if (this.ce < this.u()) {
                  this.ce++;
               }

               btq $$3 = this.gt();
               if ($$3 != null) {
                  this.G().a($$3, 90.0F, 90.0F);
                  this.G().a();
                  double $$4 = (double)this.I(0.0F);
                  double $$5 = $$3.du() - this.du();
                  double $$6 = $$3.e(0.5) - this.dy();
                  double $$7 = $$3.dA() - this.dA();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ah.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ah.j() * (1.7 - $$4);
                     this.dP().a(li.d, this.du() + $$5 * $$9, this.dy() + $$6 * $$9, this.dA() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bh()) {
            this.k(300);
         } else if (this.aE()) {
            this.h(this.ds().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.4F)));
            this.r(this.ah.i() * 360.0F);
            this.d(false);
            this.av = true;
         }

         if (this.gs()) {
            this.r(this.ba);
         }
      }

      super.n_();
   }

   protected avz y() {
      return awa.lv;
   }

   public float G(float $$0) {
      return ayz.i($$0, this.bZ, this.bY);
   }

   public float H(float $$0) {
      return ayz.i($$0, this.cc, this.cb);
   }

   public float I(float $$0) {
      return ((float)this.ce + $$0) / (float)this.u();
   }

   public float gu() {
      return (float)this.ce;
   }

   @Override
   public boolean a(dcc $$0) {
      return $$0.f(this);
   }

   public static boolean b(btb<? extends cka> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.al() != bqs.a && (btu.a($$2) || $$1.b_($$3).a(awv.a)) && $$1.b_($$3.d()).a(awv.a);
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      if (this.dP().B) {
         return false;
      } else {
         if (!this.gr() && !$$0.a(awr.x) && !$$0.a(brr.N) && $$0.c() instanceof btq $$2) {
            $$2.a(this.dQ().d(this), 2.0F);
         }

         if (this.d != null) {
            this.d.i();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public int aa() {
      return 180;
   }

   @Override
   public void a(evs $$0) {
      if (this.da() && this.be()) {
         this.a(0.1F, $$0);
         this.a(btv.a, this.ds());
         this.h(this.ds().a(0.9));
         if (!this.gr() && this.p() == null) {
            this.h(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   static class a extends cao {
      private final cka a;
      private int b;
      private final boolean c;

      public a(cka $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cjt;
         this.a(EnumSet.of(cao.a.a, cao.a.b));
      }

      @Override
      public boolean a() {
         btq $$0 = this.a.p();
         return $$0 != null && $$0.bD();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.p() != null && this.a.g((bsv)this.a.p()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.K().n();
         btq $$0 = this.a.p();
         if ($$0 != null) {
            this.a.G().a($$0, 90.0F, 90.0F);
         }

         this.a.av = true;
      }

      @Override
      public void d() {
         this.a.b(0);
         this.a.h(null);
         this.a.d.i();
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         btq $$0 = this.a.p();
         if ($$0 != null) {
            this.a.K().n();
            this.a.G().a($$0, 90.0F, 90.0F);
            if (!this.a.E($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.al());
                  if (!this.a.aW()) {
                     this.a.dP().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.u()) {
                  float $$1 = 1.0F;
                  if (this.a.dP().al() == bqs.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dQ().c(this.a, (bsv)this.a), $$1);
                  $$0.a(this.a.dQ().b((btq)this.a), (float)this.a.g(buy.c));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<btq> {
      private final cka a;

      public b(cka $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable btq $$0) {
         return ($$0 instanceof cmy || $$0 instanceof cgf || $$0 instanceof cgs) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends bzr {
      private final cka l;

      public c(cka $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bzr.a.b && !this.l.K().l()) {
            evs $$0 = new evs(this.e - this.l.du(), this.f - this.l.dw(), this.g - this.l.dA());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(ayz.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dF(), $$5, 90.0F));
            this.l.aY = this.l.dF();
            float $$6 = (float)(this.h * this.l.g(buy.r));
            float $$7 = ayz.i(0.125F, this.l.fn(), $$6);
            this.l.y($$7);
            double $$8 = Math.sin((double)(this.l.ai + this.l.al()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dF() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dF() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ai + this.l.al()) * 0.75) * 0.05;
            this.l.h(this.l.ds().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bzq $$12 = this.l.G();
            double $$13 = this.l.du() + $$2 * 2.0;
            double $$14 = this.l.dy() + $$3 / $$1;
            double $$15 = this.l.dA() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.G().a(ayz.d(0.125, $$16, $$13), ayz.d(0.125, $$17, $$14), ayz.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.y(0.0F);
            this.l.w(false);
         }
      }
   }
}
