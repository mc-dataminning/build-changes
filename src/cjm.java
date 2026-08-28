import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjm extends cjq {
   protected static final int c = 80;
   private static final ajp<Boolean> b = ajt.a(cjm.class, ajr.k);
   private static final ajp<Integer> e = ajt.a(cjm.class, ajr.b);
   private float ca;
   private float cb;
   private float cc;
   private float cd;
   private float ce;
   @Nullable
   private btb cf;
   private int cg;
   private boolean ch;
   @Nullable
   protected caw d;

   public cjm(bsm<? extends cjm> $$0, dcf $$1) {
      super($$0, $$1);
      this.bP = 10;
      this.a(eoy.j, 0.0F);
      this.bR = new cjm.c(this);
      this.ca = this.ah.i();
      this.cb = this.ca;
   }

   @Override
   protected void z() {
      can $$0 = new can(this, 1.0);
      this.d = new caw(this, 1.0, 80);
      this.bU.a(4, new cjm.a(this));
      this.bU.a(5, $$0);
      this.bU.a(7, this.d);
      this.bU.a(8, new cah(this, cmk.class, 8.0F));
      this.bU.a(8, new cah(this, cjm.class, 12.0F, 0.01F));
      this.bU.a(9, new cau(this));
      this.d.a(EnumSet.of(bzz.a.a, bzz.a.b));
      $$0.a(EnumSet.of(bzz.a.a, bzz.a.b));
      this.bV.a(1, new cbs<>(this, btb.class, 10, true, false, new cjm.b(this)));
   }

   public static bui.a go() {
      return cjq.gu().a(buj.c, 6.0).a(buj.v, 0.5).a(buj.m, 16.0).a(buj.s, 30.0);
   }

   @Override
   protected ccn b(dcf $$0) {
      return new ccp(this, $$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(e, 0);
   }

   public boolean gp() {
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

   public boolean gq() {
      return this.ao.a(e) != 0;
   }

   @Nullable
   public btb gr() {
      if (!this.gq()) {
         return null;
      } else if (this.dQ().B) {
         if (this.cf != null) {
            return this.cf;
         } else {
            bsg $$0 = this.dQ().a(this.ao.a(e));
            if ($$0 instanceof btb) {
               this.cf = (btb)$$0;
               return this.cf;
            } else {
               return null;
            }
         }
      } else {
         return this.p();
      }
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.cg = 0;
         this.cf = null;
      }
   }

   @Override
   public int P() {
      return 160;
   }

   @Override
   protected avg v() {
      return this.bi() ? avh.lq : avh.lr;
   }

   @Override
   protected avg d(bqz $$0) {
      return this.bi() ? avh.lw : avh.lx;
   }

   @Override
   protected avg o_() {
      return this.bi() ? avh.lt : avh.lu;
   }

   @Override
   protected bsg.b bc() {
      return bsg.b.c;
   }

   @Override
   public float a(ja $$0, dci $$1) {
      return $$1.b_($$0).a(awc.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void n_() {
      if (this.bE()) {
         if (this.dQ().B) {
            this.cb = this.ca;
            if (!this.bf()) {
               this.cc = 2.0F;
               ewf $$0 = this.dt();
               if ($$0.d > 0.0 && this.ch && !this.aX()) {
                  this.dQ().a(this.dv(), this.dx(), this.dB(), this.y(), this.df(), 1.0F, 1.0F, false);
               }

               this.ch = $$0.d < 0.0 && this.dQ().a(this.dq().d(), this);
            } else if (this.gp()) {
               if (this.cc < 0.5F) {
                  this.cc = 4.0F;
               } else {
                  this.cc = this.cc + (0.5F - this.cc) * 0.1F;
               }
            } else {
               this.cc = this.cc + (0.125F - this.cc) * 0.2F;
            }

            this.ca = this.ca + this.cc;
            this.ce = this.cd;
            if (!this.bi()) {
               this.cd = this.ah.i();
            } else if (this.gp()) {
               this.cd = this.cd + (0.0F - this.cd) * 0.25F;
            } else {
               this.cd = this.cd + (1.0F - this.cd) * 0.06F;
            }

            if (this.gp() && this.bf()) {
               ewf $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dQ().a(lj.d, this.d(0.5) - $$1.c * 1.5, this.dy() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gq()) {
               if (this.cg < this.u()) {
                  this.cg++;
               }

               btb $$3 = this.gr();
               if ($$3 != null) {
                  this.G().a($$3, 90.0F, 90.0F);
                  this.G().a();
                  double $$4 = (double)this.J(0.0F);
                  double $$5 = $$3.dv() - this.dv();
                  double $$6 = $$3.e(0.5) - this.dz();
                  double $$7 = $$3.dB() - this.dB();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ah.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ah.j() * (1.7 - $$4);
                     this.dQ().a(lj.d, this.dv() + $$5 * $$9, this.dz() + $$6 * $$9, this.dB() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bi()) {
            this.j(300);
         } else if (this.aF()) {
            this.i(this.dt().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.4F)));
            this.s(this.ah.i() * 360.0F);
            this.d(false);
            this.av = true;
         }

         if (this.gq()) {
            this.s(this.ba);
         }
      }

      super.n_();
   }

   protected avg y() {
      return avh.lv;
   }

   public float H(float $$0) {
      return ayg.i($$0, this.cb, this.ca);
   }

   public float I(float $$0) {
      return ayg.i($$0, this.ce, this.cd);
   }

   public float J(float $$0) {
      return ((float)this.cg + $$0) / (float)this.u();
   }

   public float gs() {
      return (float)this.cg;
   }

   @Override
   public boolean a(dci $$0) {
      return $$0.f(this);
   }

   public static boolean b(bsm<? extends cjm> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.al() != bqd.a && (btf.a($$2) || $$1.b_($$3).a(awc.a)) && $$1.b_($$3.d()).a(awc.a);
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.dQ().B) {
         return false;
      } else {
         if (!this.gp() && !$$0.a(avy.x) && !$$0.a(brc.O) && $$0.c() instanceof btb $$2) {
            $$2.a(this.dR().d(this), 2.0F);
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
   public void a(ewf $$0) {
      if (this.db() && this.bf()) {
         this.a(0.1F, $$0);
         this.a(btg.a, this.dt());
         this.i(this.dt().a(0.9));
         if (!this.gp() && this.p() == null) {
            this.i(this.dt().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   static class a extends bzz {
      private final cjm a;
      private int b;
      private final boolean c;

      public a(cjm $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cjf;
         this.a(EnumSet.of(bzz.a.a, bzz.a.b));
      }

      @Override
      public boolean a() {
         btb $$0 = this.a.p();
         return $$0 != null && $$0.bE();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.p() != null && this.a.g((bsg)this.a.p()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.K().n();
         btb $$0 = this.a.p();
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
         btb $$0 = this.a.p();
         if ($$0 != null) {
            this.a.K().n();
            this.a.G().a($$0, 90.0F, 90.0F);
            if (!this.a.F($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.am());
                  if (!this.a.aX()) {
                     this.a.dQ().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.u()) {
                  float $$1 = 1.0F;
                  if (this.a.dQ().al() == bqd.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dR().c(this.a, (bsg)this.a), $$1);
                  this.a.D($$0);
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<btb> {
      private final cjm a;

      public b(cjm $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable btb $$0) {
         return ($$0 instanceof cmk || $$0 instanceof cfq || $$0 instanceof cgd) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends bzc {
      private final cjm l;

      public c(cjm $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bzc.a.b && !this.l.K().l()) {
            ewf $$0 = new ewf(this.e - this.l.dv(), this.f - this.l.dx(), this.g - this.l.dB());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(ayg.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.s(this.a(this.l.dG(), $$5, 90.0F));
            this.l.aY = this.l.dG();
            float $$6 = (float)(this.h * this.l.g(buj.v));
            float $$7 = ayg.i(0.125F, this.l.fk(), $$6);
            this.l.z($$7);
            double $$8 = Math.sin((double)(this.l.ai + this.l.am()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dG() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dG() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ai + this.l.am()) * 0.75) * 0.05;
            this.l.i(this.l.dt().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bzb $$12 = this.l.G();
            double $$13 = this.l.dv() + $$2 * 2.0;
            double $$14 = this.l.dz() + $$3 / $$1;
            double $$15 = this.l.dB() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.G().a(ayg.d(0.125, $$16, $$13), ayg.d(0.125, $$17, $$14), ayg.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.z(0.0F);
            this.l.w(false);
         }
      }
   }
}
