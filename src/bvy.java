import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvy extends bwc {
   protected static final int c = 80;
   private static final aby<Boolean> b = acb.a(bvy.class, aca.k);
   private static final aby<Integer> e = acb.a(bvy.class, aca.b);
   private float bT;
   private float bU;
   private float bV;
   private float bW;
   private float bX;
   @Nullable
   private bfz bY;
   private int bZ;
   private boolean ca;
   @Nullable
   protected bns d;

   public bvy(bfn<? extends bvy> $$0, cmm $$1) {
      super($$0, $$1);
      this.bJ = 10;
      this.a(dxp.j, 0.0F);
      this.bL = new bvy.c(this);
      this.bT = this.af.i();
      this.bU = this.bT;
   }

   @Override
   protected void x() {
      bnj $$0 = new bnj(this, 1.0);
      this.d = new bns(this, 1.0, 80);
      this.bO.a(4, new bvy.a(this));
      this.bO.a(5, $$0);
      this.bO.a(7, this.d);
      this.bO.a(8, new bnd(this, byo.class, 8.0F));
      this.bO.a(8, new bnd(this, bvy.class, 12.0F, 0.01F));
      this.bO.a(9, new bnq(this));
      this.d.a(EnumSet.of(bmv.a.a, bmv.a.b));
      $$0.a(EnumSet.of(bmv.a.a, bmv.a.b));
      this.bP.a(1, new boo<>(this, bfz.class, 10, true, false, new bvy.b(this)));
   }

   public static bhf.a fY() {
      return bwc.ge().a(bhg.f, 6.0).a(bhg.d, 0.5).a(bhg.b, 16.0).a(bhg.a, 30.0);
   }

   @Override
   protected bpj b(cmm $$0) {
      return new bpl(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(b, false);
      this.am.a(e, 0);
   }

   @Override
   public boolean dN() {
      return true;
   }

   @Override
   public bge eN() {
      return bge.e;
   }

   public boolean fZ() {
      return this.am.b(b);
   }

   void w(boolean $$0) {
      this.am.b(b, $$0);
   }

   public int r() {
      return 80;
   }

   void b(int $$0) {
      this.am.b(e, $$0);
   }

   public boolean ga() {
      return this.am.b(e) != 0;
   }

   @Nullable
   public bfz gb() {
      if (!this.ga()) {
         return null;
      } else if (this.dI().B) {
         if (this.bY != null) {
            return this.bY;
         } else {
            bfj $$0 = this.dI().a(this.am.b(e));
            if ($$0 instanceof bfz) {
               this.bY = (bfz)$$0;
               return this.bY;
            } else {
               return null;
            }
         }
      } else {
         return this.j();
      }
   }

   @Override
   public void a(aby<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.bZ = 0;
         this.bY = null;
      }
   }

   @Override
   public int M() {
      return 160;
   }

   @Override
   protected amg s() {
      return this.aY() ? amh.kj : amh.kk;
   }

   @Override
   protected amg d(ben $$0) {
      return this.aY() ? amh.kp : amh.kq;
   }

   @Override
   protected amg g_() {
      return this.aY() ? amh.km : amh.kn;
   }

   @Override
   protected bfj.b aS() {
      return bfj.b.c;
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public float a(gu $$0, cmp $$1) {
      return $$1.b_($$0).a(anb.a) ? 10.0F + $$1.v($$0) : super.a($$0, $$1);
   }

   @Override
   public void b_() {
      if (this.bs()) {
         if (this.dI().B) {
            this.bU = this.bT;
            if (!this.aV()) {
               this.bV = 2.0F;
               eei $$0 = this.dl();
               if ($$0.d > 0.0 && this.ca && !this.aQ()) {
                  this.dI().a(this.dn(), this.dp(), this.dt(), this.w(), this.cY(), 1.0F, 1.0F, false);
               }

               this.ca = $$0.d < 0.0 && this.dI().a(this.di().d(), this);
            } else if (this.fZ()) {
               if (this.bV < 0.5F) {
                  this.bV = 4.0F;
               } else {
                  this.bV = this.bV + (0.5F - this.bV) * 0.1F;
               }
            } else {
               this.bV = this.bV + (0.125F - this.bV) * 0.2F;
            }

            this.bT = this.bT + this.bV;
            this.bX = this.bW;
            if (!this.aY()) {
               this.bW = this.af.i();
            } else if (this.fZ()) {
               this.bW = this.bW + (0.0F - this.bW) * 0.25F;
            } else {
               this.bW = this.bW + (1.0F - this.bW) * 0.06F;
            }

            if (this.fZ() && this.aV()) {
               eei $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dI().a(iv.e, this.d(0.5) - $$1.c * 1.5, this.dq() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.ga()) {
               if (this.bZ < this.r()) {
                  this.bZ++;
               }

               bfz $$3 = this.gb();
               if ($$3 != null) {
                  this.E().a($$3, 90.0F, 90.0F);
                  this.E().a();
                  double $$4 = (double)this.F(0.0F);
                  double $$5 = $$3.dn() - this.dn();
                  double $$6 = $$3.e(0.5) - this.dr();
                  double $$7 = $$3.dt() - this.dt();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.af.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.af.j() * (1.7 - $$4);
                     this.dI().a(iv.e, this.dn() + $$5 * $$9, this.dr() + $$6 * $$9, this.dt() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.aY()) {
            this.j(300);
         } else if (this.ay()) {
            this.f(this.dl().b((double)((this.af.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.af.i() * 2.0F - 1.0F) * 0.4F)));
            this.a_(this.af.i() * 360.0F);
            this.c(false);
            this.at = true;
         }

         if (this.ga()) {
            this.a_(this.aX);
         }
      }

      super.b_();
   }

   protected amg w() {
      return amh.ko;
   }

   public float D(float $$0) {
      return apa.i($$0, this.bU, this.bT);
   }

   public float E(float $$0) {
      return apa.i($$0, this.bX, this.bW);
   }

   public float F(float $$0) {
      return ((float)this.bZ + $$0) / (float)this.r();
   }

   public float gc() {
      return (float)this.bZ;
   }

   @Override
   public boolean a(cmp $$0) {
      return $$0.f(this);
   }

   public static boolean b(bfn<? extends bvy> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      return ($$4.a(20) == 0 || !$$1.u($$3)) && $$1.ai() != bdu.a && ($$2 == bgd.c || $$1.b_($$3).a(anb.a)) && $$1.b_($$3.d()).a(anb.a);
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (this.dI().B) {
         return false;
      } else {
         if (!this.fZ() && !$$0.a(amy.w) && !$$0.a(beq.L) && $$0.c() instanceof bfz $$2) {
            $$2.a(this.dJ().d(this), 2.0F);
         }

         if (this.d != null) {
            this.d.i();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public int X() {
      return 180;
   }

   @Override
   public void h(eei $$0) {
      if (this.cU() && this.aV()) {
         this.a(0.1F, $$0);
         this.a(bgf.a, this.dl());
         this.f(this.dl().a(0.9));
         if (!this.fZ() && this.j() == null) {
            this.f(this.dl().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   static class a extends bmv {
      private final bvy a;
      private int b;
      private final boolean c;

      public a(bvy $$0) {
         this.a = $$0;
         this.c = $$0 instanceof bvr;
         this.a(EnumSet.of(bmv.a.a, bmv.a.b));
      }

      @Override
      public boolean a() {
         bfz $$0 = this.a.j();
         return $$0 != null && $$0.bs();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.j() != null && this.a.f((bfj)this.a.j()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.J().n();
         bfz $$0 = this.a.j();
         if ($$0 != null) {
            this.a.E().a($$0, 90.0F, 90.0F);
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
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         bfz $$0 = this.a.j();
         if ($$0 != null) {
            this.a.J().n();
            this.a.E().a($$0, 90.0F, 90.0F);
            if (!this.a.B($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.af());
                  if (!this.a.aQ()) {
                     this.a.dI().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.r()) {
                  float $$1 = 1.0F;
                  if (this.a.dI().ai() == bdu.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dJ().c(this.a, this.a), $$1);
                  $$0.a(this.a.dJ().b((bfz)this.a), (float)this.a.b(bhg.f));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bfz> {
      private final bvy a;

      public b(bvy $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bfz $$0) {
         return ($$0 instanceof byo || $$0 instanceof bsk || $$0 instanceof bss) && $$0.f(this.a) > 9.0;
      }
   }

   static class c extends bly {
      private final bvy l;

      public c(bvy $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bly.a.b && !this.l.J().l()) {
            eei $$0 = new eei(this.e - this.l.dn(), this.f - this.l.dp(), this.g - this.l.dt());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(apa.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.a_(this.a(this.l.dy(), $$5, 90.0F));
            this.l.aV = this.l.dy();
            float $$6 = (float)(this.h * this.l.b(bhg.d));
            float $$7 = apa.i(0.125F, this.l.fa(), $$6);
            this.l.w($$7);
            double $$8 = Math.sin((double)(this.l.ag + this.l.af()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dy() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dy() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ag + this.l.af()) * 0.75) * 0.05;
            this.l.f(this.l.dl().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            blx $$12 = this.l.E();
            double $$13 = this.l.dn() + $$2 * 2.0;
            double $$14 = this.l.dr() + $$3 / $$1;
            double $$15 = this.l.dt() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.E().a(apa.d(0.125, $$16, $$13), apa.d(0.125, $$17, $$14), apa.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.w(0.0F);
            this.l.w(false);
         }
      }
   }
}
