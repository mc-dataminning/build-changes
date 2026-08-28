import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjj extends cjn {
   protected static final int c = 80;
   private static final ajp<Boolean> b = ajt.a(cjj.class, ajr.k);
   private static final ajp<Integer> e = ajt.a(cjj.class, ajr.b);
   private float ca;
   private float cb;
   private float cc;
   private float cd;
   private float ce;
   @Nullable
   private bsy cf;
   private int cg;
   private boolean ch;
   @Nullable
   protected cat d;

   public cjj(bsj<? extends cjj> $$0, dcd $$1) {
      super($$0, $$1);
      this.bP = 10;
      this.a(eos.j, 0.0F);
      this.bR = new cjj.c(this);
      this.ca = this.ah.i();
      this.cb = this.ca;
   }

   @Override
   protected void z() {
      cak $$0 = new cak(this, 1.0);
      this.d = new cat(this, 1.0, 80);
      this.bU.a(4, new cjj.a(this));
      this.bU.a(5, $$0);
      this.bU.a(7, this.d);
      this.bU.a(8, new cae(this, cmh.class, 8.0F));
      this.bU.a(8, new cae(this, cjj.class, 12.0F, 0.01F));
      this.bU.a(9, new car(this));
      this.d.a(EnumSet.of(bzw.a.a, bzw.a.b));
      $$0.a(EnumSet.of(bzw.a.a, bzw.a.b));
      this.bV.a(1, new cbp<>(this, bsy.class, 10, true, false, new cjj.b(this)));
   }

   public static buf.a gn() {
      return cjn.gt().a(bug.c, 6.0).a(bug.v, 0.5).a(bug.m, 16.0).a(bug.s, 30.0);
   }

   @Override
   protected cck b(dcd $$0) {
      return new ccm(this, $$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(e, 0);
   }

   public boolean go() {
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

   public boolean gp() {
      return this.ao.a(e) != 0;
   }

   @Nullable
   public bsy gq() {
      if (!this.gp()) {
         return null;
      } else if (this.dP().B) {
         if (this.cf != null) {
            return this.cf;
         } else {
            bsd $$0 = this.dP().a(this.ao.a(e));
            if ($$0 instanceof bsy) {
               this.cf = (bsy)$$0;
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
   protected ave v() {
      return this.bh() ? avf.lq : avf.lr;
   }

   @Override
   protected ave d(bqw $$0) {
      return this.bh() ? avf.lw : avf.lx;
   }

   @Override
   protected ave o_() {
      return this.bh() ? avf.lt : avf.lu;
   }

   @Override
   protected bsd.b bb() {
      return bsd.b.c;
   }

   @Override
   public float a(ja $$0, dcg $$1) {
      return $$1.b_($$0).a(awa.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void n_() {
      if (this.bD()) {
         if (this.dP().B) {
            this.cb = this.ca;
            if (!this.be()) {
               this.cc = 2.0F;
               evz $$0 = this.ds();
               if ($$0.d > 0.0 && this.ch && !this.aW()) {
                  this.dP().a(this.du(), this.dw(), this.dA(), this.y(), this.de(), 1.0F, 1.0F, false);
               }

               this.ch = $$0.d < 0.0 && this.dP().a(this.dp().d(), this);
            } else if (this.go()) {
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
            if (!this.bh()) {
               this.cd = this.ah.i();
            } else if (this.go()) {
               this.cd = this.cd + (0.0F - this.cd) * 0.25F;
            } else {
               this.cd = this.cd + (1.0F - this.cd) * 0.06F;
            }

            if (this.go() && this.be()) {
               evz $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dP().a(lj.d, this.d(0.5) - $$1.c * 1.5, this.dx() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gp()) {
               if (this.cg < this.u()) {
                  this.cg++;
               }

               bsy $$3 = this.gq();
               if ($$3 != null) {
                  this.G().a($$3, 90.0F, 90.0F);
                  this.G().a();
                  double $$4 = (double)this.J(0.0F);
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
                     this.dP().a(lj.d, this.du() + $$5 * $$9, this.dy() + $$6 * $$9, this.dA() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bh()) {
            this.j(300);
         } else if (this.aE()) {
            this.h(this.ds().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.4F)));
            this.s(this.ah.i() * 360.0F);
            this.d(false);
            this.av = true;
         }

         if (this.gp()) {
            this.s(this.ba);
         }
      }

      super.n_();
   }

   protected ave y() {
      return avf.lv;
   }

   public float H(float $$0) {
      return aye.i($$0, this.cb, this.ca);
   }

   public float I(float $$0) {
      return aye.i($$0, this.ce, this.cd);
   }

   public float J(float $$0) {
      return ((float)this.cg + $$0) / (float)this.u();
   }

   public float gr() {
      return (float)this.cg;
   }

   @Override
   public boolean a(dcg $$0) {
      return $$0.f(this);
   }

   public static boolean b(bsj<? extends cjj> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.al() != bqa.a && (btc.a($$2) || $$1.b_($$3).a(awa.a)) && $$1.b_($$3.d()).a(awa.a);
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.dP().B) {
         return false;
      } else {
         if (!this.go() && !$$0.a(avw.x) && !$$0.a(bqz.O) && $$0.c() instanceof bsy $$2) {
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
   public void a(evz $$0) {
      if (this.da() && this.be()) {
         this.a(0.1F, $$0);
         this.a(btd.a, this.ds());
         this.h(this.ds().a(0.9));
         if (!this.go() && this.p() == null) {
            this.h(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   static class a extends bzw {
      private final cjj a;
      private int b;
      private final boolean c;

      public a(cjj $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cjc;
         this.a(EnumSet.of(bzw.a.a, bzw.a.b));
      }

      @Override
      public boolean a() {
         bsy $$0 = this.a.p();
         return $$0 != null && $$0.bD();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.p() != null && this.a.g((bsd)this.a.p()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.K().n();
         bsy $$0 = this.a.p();
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
         bsy $$0 = this.a.p();
         if ($$0 != null) {
            this.a.K().n();
            this.a.G().a($$0, 90.0F, 90.0F);
            if (!this.a.F($$0)) {
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
                  if (this.a.dP().al() == bqa.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dQ().c(this.a, (bsd)this.a), $$1);
                  this.a.D($$0);
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bsy> {
      private final cjj a;

      public b(cjj $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bsy $$0) {
         return ($$0 instanceof cmh || $$0 instanceof cfn || $$0 instanceof cga) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends byz {
      private final cjj l;

      public c(cjj $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == byz.a.b && !this.l.K().l()) {
            evz $$0 = new evz(this.e - this.l.du(), this.f - this.l.dw(), this.g - this.l.dA());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(aye.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.s(this.a(this.l.dF(), $$5, 90.0F));
            this.l.aY = this.l.dF();
            float $$6 = (float)(this.h * this.l.g(bug.v));
            float $$7 = aye.i(0.125F, this.l.fj(), $$6);
            this.l.z($$7);
            double $$8 = Math.sin((double)(this.l.ai + this.l.al()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dF() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dF() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ai + this.l.al()) * 0.75) * 0.05;
            this.l.h(this.l.ds().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            byy $$12 = this.l.G();
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

            this.l.G().a(aye.d(0.125, $$16, $$13), aye.d(0.125, $$17, $$14), aye.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.z(0.0F);
            this.l.w(false);
         }
      }
   }
}
