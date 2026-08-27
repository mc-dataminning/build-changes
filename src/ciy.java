import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ciy extends cjc {
   protected static final int c = 80;
   private static final ajr<Boolean> b = ajv.a(ciy.class, ajt.k);
   private static final ajr<Integer> e = ajv.a(ciy.class, ajt.b);
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   @Nullable
   private bso cd;
   private int ce;
   private boolean cf;
   @Nullable
   protected caj d;

   public ciy(bsa<? extends ciy> $$0, dax $$1) {
      super($$0, $$1);
      this.bN = 10;
      this.a(enl.j, 0.0F);
      this.bP = new ciy.c(this);
      this.bY = this.ah.i();
      this.bZ = this.bY;
   }

   @Override
   protected void z() {
      caa $$0 = new caa(this, 1.0);
      this.d = new caj(this, 1.0, 80);
      this.bS.a(4, new ciy.a(this));
      this.bS.a(5, $$0);
      this.bS.a(7, this.d);
      this.bS.a(8, new bzu(this, clw.class, 8.0F));
      this.bS.a(8, new bzu(this, ciy.class, 12.0F, 0.01F));
      this.bS.a(9, new cah(this));
      this.d.a(EnumSet.of(bzm.a.a, bzm.a.b));
      $$0.a(EnumSet.of(bzm.a.a, bzm.a.b));
      this.bT.a(1, new cbf<>(this, bso.class, 10, true, false, new ciy.b(this)));
   }

   public static btv.a gp() {
      return cjc.gv().a(btw.c, 6.0).a(btw.r, 0.5).a(btw.k, 16.0).a(btw.q, 30.0);
   }

   @Override
   protected cca b(dax $$0) {
      return new ccc(this, $$0);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(e, 0);
   }

   public boolean gq() {
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

   public boolean gr() {
      return this.ao.a(e) != 0;
   }

   @Nullable
   public bso gs() {
      if (!this.gr()) {
         return null;
      } else if (this.dP().B) {
         if (this.cd != null) {
            return this.cd;
         } else {
            bru $$0 = this.dP().a(this.ao.a(e));
            if ($$0 instanceof bso) {
               this.cd = (bso)$$0;
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
   public void a(ajr<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.ce = 0;
         this.cd = null;
      }
   }

   @Override
   public int O() {
      return 160;
   }

   @Override
   protected avg v() {
      return this.bh() ? avh.lq : avh.lr;
   }

   @Override
   protected avg d(bqn $$0) {
      return this.bh() ? avh.lw : avh.lx;
   }

   @Override
   protected avg o_() {
      return this.bh() ? avh.lt : avh.lu;
   }

   @Override
   protected bru.b bb() {
      return bru.b.c;
   }

   @Override
   public float a(io $$0, dba $$1) {
      return $$1.b_($$0).a(awb.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void n_() {
      if (this.bD()) {
         if (this.dP().B) {
            this.bZ = this.bY;
            if (!this.be()) {
               this.ca = 2.0F;
               euk $$0 = this.ds();
               if ($$0.d > 0.0 && this.cf && !this.aW()) {
                  this.dP().a(this.du(), this.dw(), this.dA(), this.y(), this.de(), 1.0F, 1.0F, false);
               }

               this.cf = $$0.d < 0.0 && this.dP().a(this.dp().d(), this);
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
            if (!this.bh()) {
               this.cb = this.ah.i();
            } else if (this.gq()) {
               this.cb = this.cb + (0.0F - this.cb) * 0.25F;
            } else {
               this.cb = this.cb + (1.0F - this.cb) * 0.06F;
            }

            if (this.gq() && this.be()) {
               euk $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dP().a(ky.d, this.d(0.5) - $$1.c * 1.5, this.dx() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gr()) {
               if (this.ce < this.u()) {
                  this.ce++;
               }

               bso $$3 = this.gs();
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
                     this.dP().a(ky.d, this.du() + $$5 * $$9, this.dy() + $$6 * $$9, this.dA() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bh()) {
            this.k(300);
         } else if (this.aE()) {
            this.g(this.ds().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.4F)));
            this.r(this.ah.i() * 360.0F);
            this.d(false);
            this.av = true;
         }

         if (this.gr()) {
            this.r(this.bb);
         }
      }

      super.n_();
   }

   protected avg y() {
      return avh.lv;
   }

   public float G(float $$0) {
      return ayd.i($$0, this.bZ, this.bY);
   }

   public float H(float $$0) {
      return ayd.i($$0, this.cc, this.cb);
   }

   public float I(float $$0) {
      return ((float)this.ce + $$0) / (float)this.u();
   }

   public float gt() {
      return (float)this.ce;
   }

   @Override
   public boolean a(dba $$0) {
      return $$0.f(this);
   }

   public static boolean b(bsa<? extends ciy> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.ak() != bpr.a && (bss.a($$2) || $$1.b_($$3).a(awb.a)) && $$1.b_($$3.d()).a(awb.a);
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (this.dP().B) {
         return false;
      } else {
         if (!this.gq() && !$$0.a(avy.x) && !$$0.a(bqq.N) && $$0.c() instanceof bso $$2) {
            $$2.a(this.dQ().d(this), 2.0F);
         }

         if (this.d != null) {
            this.d.i();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public int Z() {
      return 180;
   }

   @Override
   public void a(euk $$0) {
      if (this.da() && this.be()) {
         this.a(0.1F, $$0);
         this.a(bst.a, this.ds());
         this.g(this.ds().a(0.9));
         if (!this.gq() && this.p() == null) {
            this.g(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   static class a extends bzm {
      private final ciy a;
      private int b;
      private final boolean c;

      public a(ciy $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cir;
         this.a(EnumSet.of(bzm.a.a, bzm.a.b));
      }

      @Override
      public boolean a() {
         bso $$0 = this.a.p();
         return $$0 != null && $$0.bD();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.p() != null && this.a.g((bru)this.a.p()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.K().n();
         bso $$0 = this.a.p();
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
         bso $$0 = this.a.p();
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
                  if (this.a.dP().ak() == bpr.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dQ().c(this.a, (bru)this.a), $$1);
                  $$0.a(this.a.dQ().b((bso)this.a), (float)this.a.g(btw.c));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bso> {
      private final ciy a;

      public b(ciy $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bso $$0) {
         return ($$0 instanceof clw || $$0 instanceof cfd || $$0 instanceof cfq) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends byp {
      private final ciy l;

      public c(ciy $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == byp.a.b && !this.l.K().l()) {
            euk $$0 = new euk(this.e - this.l.du(), this.f - this.l.dw(), this.g - this.l.dA());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(ayd.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dF(), $$5, 90.0F));
            this.l.aZ = this.l.dF();
            float $$6 = (float)(this.h * this.l.g(btw.r));
            float $$7 = ayd.i(0.125F, this.l.fn(), $$6);
            this.l.y($$7);
            double $$8 = Math.sin((double)(this.l.ai + this.l.al()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dF() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dF() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ai + this.l.al()) * 0.75) * 0.05;
            this.l.g(this.l.ds().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            byo $$12 = this.l.G();
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

            this.l.G().a(ayd.d(0.125, $$16, $$13), ayd.d(0.125, $$17, $$14), ayd.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.y(0.0F);
            this.l.w(false);
         }
      }
   }
}
