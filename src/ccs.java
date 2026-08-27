import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccs extends ccw {
   protected static final int c = 80;
   private static final agn<Boolean> b = agq.a(ccs.class, agp.k);
   private static final agn<Integer> e = agq.a(ccs.class, agp.b);
   private float bU;
   private float bV;
   private float bW;
   private float bX;
   private float bY;
   @Nullable
   private bmo bZ;
   private int ca;
   private boolean cb;
   @Nullable
   protected buh d;

   public ccs(bmc<? extends ccs> $$0, ctx $$1) {
      super($$0, $$1);
      this.bK = 10;
      this.a(efk.j, 0.0F);
      this.bM = new ccs.c(this);
      this.bU = this.ag.i();
      this.bV = this.bU;
   }

   @Override
   protected void B() {
      bty $$0 = new bty(this, 1.0);
      this.d = new buh(this, 1.0, 80);
      this.bP.a(4, new ccs.a(this));
      this.bP.a(5, $$0);
      this.bP.a(7, this.d);
      this.bP.a(8, new bts(this, cfq.class, 8.0F));
      this.bP.a(8, new bts(this, ccs.class, 12.0F, 0.01F));
      this.bP.a(9, new buf(this));
      this.d.a(EnumSet.of(btk.a.a, btk.a.b));
      $$0.a(EnumSet.of(btk.a.a, btk.a.b));
      this.bQ.a(1, new bvd<>(this, bmo.class, 10, true, false, new ccs.b(this)));
   }

   public static bnt.a gf() {
      return ccw.gl().a(bnu.c, 6.0).a(bnu.o, 0.5).a(bnu.i, 16.0).a(bnu.n, 30.0);
   }

   @Override
   protected bvy b(ctx $$0) {
      return new bwa(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
      this.an.a(e, 0);
   }

   @Override
   public bmt eS() {
      return bmt.e;
   }

   public boolean gg() {
      return this.an.b(b);
   }

   void w(boolean $$0) {
      this.an.b(b, $$0);
   }

   public int w() {
      return 80;
   }

   void b(int $$0) {
      this.an.b(e, $$0);
   }

   public boolean gh() {
      return this.an.b(e) != 0;
   }

   @Nullable
   public bmo gi() {
      if (!this.gh()) {
         return null;
      } else if (this.dL().B) {
         if (this.bZ != null) {
            return this.bZ;
         } else {
            blw $$0 = this.dL().a(this.an.b(e));
            if ($$0 instanceof bmo) {
               this.bZ = (bmo)$$0;
               return this.bZ;
            } else {
               return null;
            }
         }
      } else {
         return this.q();
      }
   }

   @Override
   public void a(agn<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.ca = 0;
         this.bZ = null;
      }
   }

   @Override
   public int Q() {
      return 160;
   }

   @Override
   protected ars y() {
      return this.bc() ? art.lb : art.lc;
   }

   @Override
   protected ars d(bkv $$0) {
      return this.bc() ? art.lh : art.li;
   }

   @Override
   protected ars n_() {
      return this.bc() ? art.le : art.lf;
   }

   @Override
   protected blw.b aW() {
      return blw.b.c;
   }

   @Override
   public float a(hx $$0, cua $$1) {
      return $$1.b_($$0).a(asn.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void d_() {
      if (this.bx()) {
         if (this.dL().B) {
            this.bV = this.bU;
            if (!this.aZ()) {
               this.bW = 2.0F;
               emc $$0 = this.do();
               if ($$0.d > 0.0 && this.cb && !this.aU()) {
                  this.dL().a(this.dq(), this.ds(), this.dw(), this.A(), this.db(), 1.0F, 1.0F, false);
               }

               this.cb = $$0.d < 0.0 && this.dL().a(this.dl().d(), this);
            } else if (this.gg()) {
               if (this.bW < 0.5F) {
                  this.bW = 4.0F;
               } else {
                  this.bW = this.bW + (0.5F - this.bW) * 0.1F;
               }
            } else {
               this.bW = this.bW + (0.125F - this.bW) * 0.2F;
            }

            this.bU = this.bU + this.bW;
            this.bY = this.bX;
            if (!this.bc()) {
               this.bX = this.ag.i();
            } else if (this.gg()) {
               this.bX = this.bX + (0.0F - this.bX) * 0.25F;
            } else {
               this.bX = this.bX + (1.0F - this.bX) * 0.06F;
            }

            if (this.gg() && this.aZ()) {
               emc $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dL().a(jx.e, this.d(0.5) - $$1.c * 1.5, this.dt() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gh()) {
               if (this.ca < this.w()) {
                  this.ca++;
               }

               bmo $$3 = this.gi();
               if ($$3 != null) {
                  this.I().a($$3, 90.0F, 90.0F);
                  this.I().a();
                  double $$4 = (double)this.F(0.0F);
                  double $$5 = $$3.dq() - this.dq();
                  double $$6 = $$3.e(0.5) - this.du();
                  double $$7 = $$3.dw() - this.dw();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ag.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ag.j() * (1.7 - $$4);
                     this.dL().a(jx.e, this.dq() + $$5 * $$9, this.du() + $$6 * $$9, this.dw() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bc()) {
            this.j(300);
         } else if (this.aC()) {
            this.g(this.do().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.4F)));
            this.r(this.ag.i() * 360.0F);
            this.c(false);
            this.au = true;
         }

         if (this.gh()) {
            this.r(this.aW);
         }
      }

      super.d_();
   }

   protected ars A() {
      return art.lg;
   }

   public float D(float $$0) {
      return aup.i($$0, this.bV, this.bU);
   }

   public float E(float $$0) {
      return aup.i($$0, this.bY, this.bX);
   }

   public float F(float $$0) {
      return ((float)this.ca + $$0) / (float)this.w();
   }

   public float gj() {
      return (float)this.ca;
   }

   @Override
   public boolean a(cua $$0) {
      return $$0.f(this);
   }

   public static boolean b(bmc<? extends ccs> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.ak() != bjz.a && (bms.a($$2) || $$1.b_($$3).a(asn.a)) && $$1.b_($$3.d()).a(asn.a);
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.dL().B) {
         return false;
      } else {
         if (!this.gg() && !$$0.a(ask.x) && !$$0.a(bky.N) && $$0.c() instanceof bmo $$2) {
            $$2.a(this.dM().d(this), 2.0F);
         }

         if (this.d != null) {
            this.d.i();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public int ab() {
      return 180;
   }

   @Override
   public void a(emc $$0) {
      if (this.cX() && this.aZ()) {
         this.a(0.1F, $$0);
         this.a(bmu.a, this.do());
         this.g(this.do().a(0.9));
         if (!this.gg() && this.q() == null) {
            this.g(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   static class a extends btk {
      private final ccs a;
      private int b;
      private final boolean c;

      public a(ccs $$0) {
         this.a = $$0;
         this.c = $$0 instanceof ccl;
         this.a(EnumSet.of(btk.a.a, btk.a.b));
      }

      @Override
      public boolean a() {
         bmo $$0 = this.a.q();
         return $$0 != null && $$0.bx();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.q() != null && this.a.f((blw)this.a.q()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.N().n();
         bmo $$0 = this.a.q();
         if ($$0 != null) {
            this.a.I().a($$0, 90.0F, 90.0F);
         }

         this.a.au = true;
      }

      @Override
      public void d() {
         this.a.b(0);
         this.a.h(null);
         this.a.d.i();
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         bmo $$0 = this.a.q();
         if ($$0 != null) {
            this.a.N().n();
            this.a.I().a($$0, 90.0F, 90.0F);
            if (!this.a.D($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.aj());
                  if (!this.a.aU()) {
                     this.a.dL().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.w()) {
                  float $$1 = 1.0F;
                  if (this.a.dL().ak() == bjz.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dM().c(this.a, (blw)this.a), $$1);
                  $$0.a(this.a.dM().b((bmo)this.a), (float)this.a.g(bnu.c));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bmo> {
      private final ccs a;

      public b(ccs $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bmo $$0) {
         return ($$0 instanceof cfq || $$0 instanceof bzb || $$0 instanceof bzm) && $$0.f(this.a) > 9.0;
      }
   }

   static class c extends bsn {
      private final ccs l;

      public c(ccs $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bsn.a.b && !this.l.N().l()) {
            emc $$0 = new emc(this.e - this.l.dq(), this.f - this.l.ds(), this.g - this.l.dw());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(aup.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dB(), $$5, 90.0F));
            this.l.aU = this.l.dB();
            float $$6 = (float)(this.h * this.l.g(bnu.o));
            float $$7 = aup.i(0.125F, this.l.ff(), $$6);
            this.l.v($$7);
            double $$8 = Math.sin((double)(this.l.ah + this.l.aj()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dB() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dB() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ah + this.l.aj()) * 0.75) * 0.05;
            this.l.g(this.l.do().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bsm $$12 = this.l.I();
            double $$13 = this.l.dq() + $$2 * 2.0;
            double $$14 = this.l.du() + $$3 / $$1;
            double $$15 = this.l.dw() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.I().a(aup.d(0.125, $$16, $$13), aup.d(0.125, $$17, $$14), aup.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.v(0.0F);
            this.l.w(false);
         }
      }
   }
}
