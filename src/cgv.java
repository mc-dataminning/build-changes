import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgv extends cgz {
   protected static final int c = 80;
   private static final aiy<Boolean> b = ajc.a(cgv.class, aja.k);
   private static final aiy<Integer> e = ajc.a(cgv.class, aja.b);
   private float bX;
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   @Nullable
   private bqo cc;
   private int cd;
   private boolean ce;
   @Nullable
   protected byi d;

   public cgv(bqb<? extends cgv> $$0, cyx $$1) {
      super($$0, $$1);
      this.bM = 10;
      this.a(elj.j, 0.0F);
      this.bO = new cgv.c(this);
      this.bX = this.ag.i();
      this.bY = this.bX;
   }

   @Override
   protected void z() {
      bxz $$0 = new bxz(this, 1.0);
      this.d = new byi(this, 1.0, 80);
      this.bR.a(4, new cgv.a(this));
      this.bR.a(5, $$0);
      this.bR.a(7, this.d);
      this.bR.a(8, new bxt(this, cjt.class, 8.0F));
      this.bR.a(8, new bxt(this, cgv.class, 12.0F, 0.01F));
      this.bR.a(9, new byg(this));
      this.d.a(EnumSet.of(bxl.a.a, bxl.a.b));
      $$0.a(EnumSet.of(bxl.a.a, bxl.a.b));
      this.bS.a(1, new bze<>(this, bqo.class, 10, true, false, new cgv.b(this)));
   }

   public static bru.a gn() {
      return cgz.gt().a(brv.c, 6.0).a(brv.r, 0.5).a(brv.k, 16.0).a(brv.q, 30.0);
   }

   @Override
   protected bzz b(cyx $$0) {
      return new cab(this, $$0);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(e, 0);
   }

   public boolean go() {
      return this.an.a(b);
   }

   void w(boolean $$0) {
      this.an.a(b, $$0);
   }

   public int u() {
      return 80;
   }

   void b(int $$0) {
      this.an.a(e, $$0);
   }

   public boolean gp() {
      return this.an.a(e) != 0;
   }

   @Nullable
   public bqo gq() {
      if (!this.gp()) {
         return null;
      } else if (this.dM().B) {
         if (this.cc != null) {
            return this.cc;
         } else {
            bpv $$0 = this.dM().a(this.an.a(e));
            if ($$0 instanceof bqo) {
               this.cc = (bqo)$$0;
               return this.cc;
            } else {
               return null;
            }
         }
      } else {
         return this.p();
      }
   }

   @Override
   public void a(aiy<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.cd = 0;
         this.cc = null;
      }
   }

   @Override
   public int O() {
      return 160;
   }

   @Override
   protected aul v() {
      return this.bf() ? aum.ll : aum.lm;
   }

   @Override
   protected aul d(bot $$0) {
      return this.bf() ? aum.lr : aum.ls;
   }

   @Override
   protected aul o_() {
      return this.bf() ? aum.lo : aum.lp;
   }

   @Override
   protected bpv.b aZ() {
      return bpv.b.c;
   }

   @Override
   public float a(ib $$0, cza $$1) {
      return $$1.b_($$0).a(avh.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void n_() {
      if (this.bA()) {
         if (this.dM().B) {
            this.bY = this.bX;
            if (!this.bc()) {
               this.bZ = 2.0F;
               esa $$0 = this.dp();
               if ($$0.d > 0.0 && this.ce && !this.aU()) {
                  this.dM().a(this.dr(), this.dt(), this.dx(), this.y(), this.db(), 1.0F, 1.0F, false);
               }

               this.ce = $$0.d < 0.0 && this.dM().a(this.dm().d(), this);
            } else if (this.go()) {
               if (this.bZ < 0.5F) {
                  this.bZ = 4.0F;
               } else {
                  this.bZ = this.bZ + (0.5F - this.bZ) * 0.1F;
               }
            } else {
               this.bZ = this.bZ + (0.125F - this.bZ) * 0.2F;
            }

            this.bX = this.bX + this.bZ;
            this.cb = this.ca;
            if (!this.bf()) {
               this.ca = this.ag.i();
            } else if (this.go()) {
               this.ca = this.ca + (0.0F - this.ca) * 0.25F;
            } else {
               this.ca = this.ca + (1.0F - this.ca) * 0.06F;
            }

            if (this.go() && this.bc()) {
               esa $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dM().a(kl.e, this.d(0.5) - $$1.c * 1.5, this.du() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gp()) {
               if (this.cd < this.u()) {
                  this.cd++;
               }

               bqo $$3 = this.gq();
               if ($$3 != null) {
                  this.G().a($$3, 90.0F, 90.0F);
                  this.G().a();
                  double $$4 = (double)this.I(0.0F);
                  double $$5 = $$3.dr() - this.dr();
                  double $$6 = $$3.e(0.5) - this.dv();
                  double $$7 = $$3.dx() - this.dx();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ag.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ag.j() * (1.7 - $$4);
                     this.dM().a(kl.e, this.dr() + $$5 * $$9, this.dv() + $$6 * $$9, this.dx() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bf()) {
            this.k(300);
         } else if (this.aC()) {
            this.g(this.dp().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.4F)));
            this.r(this.ag.i() * 360.0F);
            this.c(false);
            this.au = true;
         }

         if (this.gp()) {
            this.r(this.aZ);
         }
      }

      super.n_();
   }

   protected aul y() {
      return aum.lq;
   }

   public float G(float $$0) {
      return axk.i($$0, this.bY, this.bX);
   }

   public float H(float $$0) {
      return axk.i($$0, this.cb, this.ca);
   }

   public float I(float $$0) {
      return ((float)this.cd + $$0) / (float)this.u();
   }

   public float gr() {
      return (float)this.cd;
   }

   @Override
   public boolean a(cza $$0) {
      return $$0.f(this);
   }

   public static boolean b(bqb<? extends cgv> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.ak() != bnx.a && (bqs.a($$2) || $$1.b_($$3).a(avh.a)) && $$1.b_($$3.d()).a(avh.a);
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (this.dM().B) {
         return false;
      } else {
         if (!this.go() && !$$0.a(ave.x) && !$$0.a(bow.N) && $$0.c() instanceof bqo $$2) {
            $$2.a(this.dN().d(this), 2.0F);
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
   public void a(esa $$0) {
      if (this.cX() && this.bc()) {
         this.a(0.1F, $$0);
         this.a(bqt.a, this.dp());
         this.g(this.dp().a(0.9));
         if (!this.go() && this.p() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   static class a extends bxl {
      private final cgv a;
      private int b;
      private final boolean c;

      public a(cgv $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cgo;
         this.a(EnumSet.of(bxl.a.a, bxl.a.b));
      }

      @Override
      public boolean a() {
         bqo $$0 = this.a.p();
         return $$0 != null && $$0.bA();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.p() != null && this.a.g((bpv)this.a.p()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.K().n();
         bqo $$0 = this.a.p();
         if ($$0 != null) {
            this.a.G().a($$0, 90.0F, 90.0F);
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
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bqo $$0 = this.a.p();
         if ($$0 != null) {
            this.a.K().n();
            this.a.G().a($$0, 90.0F, 90.0F);
            if (!this.a.E($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.aj());
                  if (!this.a.aU()) {
                     this.a.dM().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.u()) {
                  float $$1 = 1.0F;
                  if (this.a.dM().ak() == bnx.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dN().c(this.a, (bpv)this.a), $$1);
                  $$0.a(this.a.dN().b((bqo)this.a), (float)this.a.g(brv.c));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bqo> {
      private final cgv a;

      public b(cgv $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bqo $$0) {
         return ($$0 instanceof cjt || $$0 instanceof cdc || $$0 instanceof cdn) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends bwo {
      private final cgv l;

      public c(cgv $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bwo.a.b && !this.l.K().l()) {
            esa $$0 = new esa(this.e - this.l.dr(), this.f - this.l.dt(), this.g - this.l.dx());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(axk.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dC(), $$5, 90.0F));
            this.l.aX = this.l.dC();
            float $$6 = (float)(this.h * this.l.g(brv.r));
            float $$7 = axk.i(0.125F, this.l.fk(), $$6);
            this.l.y($$7);
            double $$8 = Math.sin((double)(this.l.ah + this.l.aj()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dC() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dC() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ah + this.l.aj()) * 0.75) * 0.05;
            this.l.g(this.l.dp().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bwn $$12 = this.l.G();
            double $$13 = this.l.dr() + $$2 * 2.0;
            double $$14 = this.l.dv() + $$3 / $$1;
            double $$15 = this.l.dx() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.G().a(axk.d(0.125, $$16, $$13), axk.d(0.125, $$17, $$14), axk.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.y(0.0F);
            this.l.w(false);
         }
      }
   }
}
