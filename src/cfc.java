import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfc extends cfg {
   protected static final int c = 80;
   private static final aii<Boolean> b = ail.a(cfc.class, aik.k);
   private static final aii<Integer> e = ail.a(cfc.class, aik.b);
   private float bV;
   private float bW;
   private float bX;
   private float bY;
   private float bZ;
   @Nullable
   private box ca;
   private int cb;
   private boolean cc;
   @Nullable
   protected bwr d;

   public cfc(bol<? extends cfc> $$0, cwe $$1) {
      super($$0, $$1);
      this.bK = 10;
      this.a(eic.j, 0.0F);
      this.bM = new cfc.c(this);
      this.bV = this.af.i();
      this.bW = this.bV;
   }

   @Override
   protected void B() {
      bwi $$0 = new bwi(this, 1.0);
      this.d = new bwr(this, 1.0, 80);
      this.bP.a(4, new cfc.a(this));
      this.bP.a(5, $$0);
      this.bP.a(7, this.d);
      this.bP.a(8, new bwc(this, cia.class, 8.0F));
      this.bP.a(8, new bwc(this, cfc.class, 12.0F, 0.01F));
      this.bP.a(9, new bwp(this));
      this.d.a(EnumSet.of(bvu.a.a, bvu.a.b));
      $$0.a(EnumSet.of(bvu.a.a, bvu.a.b));
      this.bQ.a(1, new bxn<>(this, box.class, 10, true, false, new cfc.b(this)));
   }

   public static bqd.a gl() {
      return cfg.gr().a(bqe.c, 6.0).a(bqe.o, 0.5).a(bqe.i, 16.0).a(bqe.n, 30.0);
   }

   @Override
   protected byi b(cwe $$0) {
      return new byk(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, false);
      this.am.a(e, 0);
   }

   public boolean gm() {
      return this.am.b(b);
   }

   void w(boolean $$0) {
      this.am.b(b, $$0);
   }

   public int w() {
      return 80;
   }

   void b(int $$0) {
      this.am.b(e, $$0);
   }

   public boolean gn() {
      return this.am.b(e) != 0;
   }

   @Nullable
   public box go() {
      if (!this.gn()) {
         return null;
      } else if (this.dJ().B) {
         if (this.ca != null) {
            return this.ca;
         } else {
            bof $$0 = this.dJ().a(this.am.b(e));
            if ($$0 instanceof box) {
               this.ca = (box)$$0;
               return this.ca;
            } else {
               return null;
            }
         }
      } else {
         return this.q();
      }
   }

   @Override
   public void a(aii<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.cb = 0;
         this.ca = null;
      }
   }

   @Override
   public int Q() {
      return 160;
   }

   @Override
   protected ato y() {
      return this.bc() ? atp.lc : atp.ld;
   }

   @Override
   protected ato d(bne $$0) {
      return this.bc() ? atp.li : atp.lj;
   }

   @Override
   protected ato n_() {
      return this.bc() ? atp.lf : atp.lg;
   }

   @Override
   protected bof.b aW() {
      return bof.b.c;
   }

   @Override
   public float a(ib $$0, cwh $$1) {
      return $$1.b_($$0).a(auj.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void d_() {
      if (this.bx()) {
         if (this.dJ().B) {
            this.bW = this.bV;
            if (!this.aZ()) {
               this.bX = 2.0F;
               eov $$0 = this.dm();
               if ($$0.d > 0.0 && this.cc && !this.aU()) {
                  this.dJ().a(this.do(), this.dq(), this.du(), this.A(), this.cY(), 1.0F, 1.0F, false);
               }

               this.cc = $$0.d < 0.0 && this.dJ().a(this.dj().d(), this);
            } else if (this.gm()) {
               if (this.bX < 0.5F) {
                  this.bX = 4.0F;
               } else {
                  this.bX = this.bX + (0.5F - this.bX) * 0.1F;
               }
            } else {
               this.bX = this.bX + (0.125F - this.bX) * 0.2F;
            }

            this.bV = this.bV + this.bX;
            this.bZ = this.bY;
            if (!this.bc()) {
               this.bY = this.af.i();
            } else if (this.gm()) {
               this.bY = this.bY + (0.0F - this.bY) * 0.25F;
            } else {
               this.bY = this.bY + (1.0F - this.bY) * 0.06F;
            }

            if (this.gm() && this.aZ()) {
               eov $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dJ().a(kb.e, this.d(0.5) - $$1.c * 1.5, this.dr() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gn()) {
               if (this.cb < this.w()) {
                  this.cb++;
               }

               box $$3 = this.go();
               if ($$3 != null) {
                  this.I().a($$3, 90.0F, 90.0F);
                  this.I().a();
                  double $$4 = (double)this.G(0.0F);
                  double $$5 = $$3.do() - this.do();
                  double $$6 = $$3.e(0.5) - this.ds();
                  double $$7 = $$3.du() - this.du();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.af.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.af.j() * (1.7 - $$4);
                     this.dJ().a(kb.e, this.do() + $$5 * $$9, this.ds() + $$6 * $$9, this.du() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bc()) {
            this.k(300);
         } else if (this.aC()) {
            this.g(this.dm().b((double)((this.af.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.af.i() * 2.0F - 1.0F) * 0.4F)));
            this.r(this.af.i() * 360.0F);
            this.c(false);
            this.at = true;
         }

         if (this.gn()) {
            this.r(this.aX);
         }
      }

      super.d_();
   }

   protected ato A() {
      return atp.lh;
   }

   public float E(float $$0) {
      return awm.i($$0, this.bW, this.bV);
   }

   public float F(float $$0) {
      return awm.i($$0, this.bZ, this.bY);
   }

   public float G(float $$0) {
      return ((float)this.cb + $$0) / (float)this.w();
   }

   public float gp() {
      return (float)this.cb;
   }

   @Override
   public boolean a(cwh $$0) {
      return $$0.f(this);
   }

   public static boolean b(bol<? extends cfc> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.aj() != bmi.a && (bpb.a($$2) || $$1.b_($$3).a(auj.a)) && $$1.b_($$3.d()).a(auj.a);
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.dJ().B) {
         return false;
      } else {
         if (!this.gm() && !$$0.a(aug.x) && !$$0.a(bnh.N) && $$0.c() instanceof box $$2) {
            $$2.a(this.dK().d(this), 2.0F);
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
   public void a(eov $$0) {
      if (this.cU() && this.aZ()) {
         this.a(0.1F, $$0);
         this.a(bpc.a, this.dm());
         this.g(this.dm().a(0.9));
         if (!this.gm() && this.q() == null) {
            this.g(this.dm().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   static class a extends bvu {
      private final cfc a;
      private int b;
      private final boolean c;

      public a(cfc $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cev;
         this.a(EnumSet.of(bvu.a.a, bvu.a.b));
      }

      @Override
      public boolean a() {
         box $$0 = this.a.q();
         return $$0 != null && $$0.bx();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.q() != null && this.a.f((bof)this.a.q()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.N().n();
         box $$0 = this.a.q();
         if ($$0 != null) {
            this.a.I().a($$0, 90.0F, 90.0F);
         }

         this.a.at = true;
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
         box $$0 = this.a.q();
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
                     this.a.dJ().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.w()) {
                  float $$1 = 1.0F;
                  if (this.a.dJ().aj() == bmi.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dK().c(this.a, (bof)this.a), $$1);
                  $$0.a(this.a.dK().b((box)this.a), (float)this.a.g(bqe.c));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<box> {
      private final cfc a;

      public b(cfc $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable box $$0) {
         return ($$0 instanceof cia || $$0 instanceof cbl || $$0 instanceof cbw) && $$0.f(this.a) > 9.0;
      }
   }

   static class c extends bux {
      private final cfc l;

      public c(cfc $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bux.a.b && !this.l.N().l()) {
            eov $$0 = new eov(this.e - this.l.do(), this.f - this.l.dq(), this.g - this.l.du());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(awm.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dz(), $$5, 90.0F));
            this.l.aV = this.l.dz();
            float $$6 = (float)(this.h * this.l.g(bqe.o));
            float $$7 = awm.i(0.125F, this.l.fh(), $$6);
            this.l.w($$7);
            double $$8 = Math.sin((double)(this.l.ag + this.l.aj()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dz() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dz() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ag + this.l.aj()) * 0.75) * 0.05;
            this.l.g(this.l.dm().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            buw $$12 = this.l.I();
            double $$13 = this.l.do() + $$2 * 2.0;
            double $$14 = this.l.ds() + $$3 / $$1;
            double $$15 = this.l.du() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.I().a(awm.d(0.125, $$16, $$13), awm.d(0.125, $$17, $$14), awm.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.w(0.0F);
            this.l.w(false);
         }
      }
   }
}
