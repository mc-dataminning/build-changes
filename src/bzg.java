import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzg extends bzk {
   protected static final int c = 80;
   private static final aeg<Boolean> b = aej.a(bzg.class, aei.k);
   private static final aeg<Integer> e = aej.a(bzg.class, aei.b);
   private float bT;
   private float bU;
   private float bV;
   private float bW;
   private float bX;
   @Nullable
   private bji bY;
   private int bZ;
   private boolean ca;
   @Nullable
   protected bra d;

   public bzg(biw<? extends bzg> $$0, cpx $$1) {
      super($$0, $$1);
      this.bJ = 10;
      this.a(eaz.j, 0.0F);
      this.bL = new bzg.c(this);
      this.bT = this.ag.i();
      this.bU = this.bT;
   }

   @Override
   protected void z() {
      bqr $$0 = new bqr(this, 1.0);
      this.d = new bra(this, 1.0, 80);
      this.bO.a(4, new bzg.a(this));
      this.bO.a(5, $$0);
      this.bO.a(7, this.d);
      this.bO.a(8, new bql(this, cbw.class, 8.0F));
      this.bO.a(8, new bql(this, bzg.class, 12.0F, 0.01F));
      this.bO.a(9, new bqy(this));
      this.d.a(EnumSet.of(bqd.a.a, bqd.a.b));
      $$0.a(EnumSet.of(bqd.a.a, bqd.a.b));
      this.bP.a(1, new brw<>(this, bji.class, 10, true, false, new bzg.b(this)));
   }

   public static bkn.a gd() {
      return bzk.gj().a(bko.f, 6.0).a(bko.d, 0.5).a(bko.b, 16.0).a(bko.a, 30.0);
   }

   @Override
   protected bsr b(cpx $$0) {
      return new bst(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, false);
      this.an.a(e, 0);
   }

   @Override
   public boolean dQ() {
      return true;
   }

   @Override
   public bjn eR() {
      return bjn.e;
   }

   public boolean ge() {
      return this.an.b(b);
   }

   void w(boolean $$0) {
      this.an.b(b, $$0);
   }

   public int t() {
      return 80;
   }

   void b(int $$0) {
      this.an.b(e, $$0);
   }

   public boolean gf() {
      return this.an.b(e) != 0;
   }

   @Nullable
   public bji gg() {
      if (!this.gf()) {
         return null;
      } else if (this.dL().B) {
         if (this.bY != null) {
            return this.bY;
         } else {
            bis $$0 = this.dL().a(this.an.b(e));
            if ($$0 instanceof bji) {
               this.bY = (bji)$$0;
               return this.bY;
            } else {
               return null;
            }
         }
      } else {
         return this.q();
      }
   }

   @Override
   public void a(aeg<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.bZ = 0;
         this.bY = null;
      }
   }

   @Override
   public int O() {
      return 160;
   }

   @Override
   protected ape w() {
      return this.ba() ? apf.kj : apf.kk;
   }

   @Override
   protected ape d(bhq $$0) {
      return this.ba() ? apf.kp : apf.kq;
   }

   @Override
   protected ape l_() {
      return this.ba() ? apf.km : apf.kn;
   }

   @Override
   protected bis.b aU() {
      return bis.b.c;
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public float a(gw $$0, cqa $$1) {
      return $$1.b_($$0).a(apz.a) ? 10.0F + $$1.v($$0) : super.a($$0, $$1);
   }

   @Override
   public void b_() {
      if (this.bv()) {
         if (this.dL().B) {
            this.bU = this.bT;
            if (!this.aX()) {
               this.bV = 2.0F;
               ehp $$0 = this.do();
               if ($$0.d > 0.0 && this.ca && !this.aS()) {
                  this.dL().a(this.dq(), this.ds(), this.dw(), this.y(), this.da(), 1.0F, 1.0F, false);
               }

               this.ca = $$0.d < 0.0 && this.dL().a(this.dl().d(), this);
            } else if (this.ge()) {
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
            if (!this.ba()) {
               this.bW = this.ag.i();
            } else if (this.ge()) {
               this.bW = this.bW + (0.0F - this.bW) * 0.25F;
            } else {
               this.bW = this.bW + (1.0F - this.bW) * 0.06F;
            }

            if (this.ge() && this.aX()) {
               ehp $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dL().a(ix.e, this.d(0.5) - $$1.c * 1.5, this.dt() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gf()) {
               if (this.bZ < this.t()) {
                  this.bZ++;
               }

               bji $$3 = this.gg();
               if ($$3 != null) {
                  this.G().a($$3, 90.0F, 90.0F);
                  this.G().a();
                  double $$4 = (double)this.G(0.0F);
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
                     this.dL().a(ix.e, this.dq() + $$5 * $$9, this.du() + $$6 * $$9, this.dw() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.ba()) {
            this.j(300);
         } else if (this.aA()) {
            this.f(this.do().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.4F)));
            this.r(this.ag.i() * 360.0F);
            this.c(false);
            this.au = true;
         }

         if (this.gf()) {
            this.r(this.aW);
         }
      }

      super.b_();
   }

   protected ape y() {
      return apf.ko;
   }

   public float E(float $$0) {
      return ary.i($$0, this.bU, this.bT);
   }

   public float F(float $$0) {
      return ary.i($$0, this.bX, this.bW);
   }

   public float G(float $$0) {
      return ((float)this.bZ + $$0) / (float)this.t();
   }

   public float gh() {
      return (float)this.bZ;
   }

   @Override
   public boolean a(cqa $$0) {
      return $$0.f(this);
   }

   public static boolean b(biw<? extends bzg> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return ($$4.a(20) == 0 || !$$1.u($$3)) && $$1.ai() != bgx.a && ($$2 == bjm.c || $$1.b_($$3).a(apz.a)) && $$1.b_($$3.d()).a(apz.a);
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      if (this.dL().B) {
         return false;
      } else {
         if (!this.ge() && !$$0.a(apw.w) && !$$0.a(bht.L) && $$0.c() instanceof bji $$2) {
            $$2.a(this.dM().d(this), 2.0F);
         }

         if (this.d != null) {
            this.d.i();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public int Y() {
      return 180;
   }

   @Override
   public void h(ehp $$0) {
      if (this.cW() && this.aX()) {
         this.a(0.1F, $$0);
         this.a(bjo.a, this.do());
         this.f(this.do().a(0.9));
         if (!this.ge() && this.q() == null) {
            this.f(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }

   static class a extends bqd {
      private final bzg a;
      private int b;
      private final boolean c;

      public a(bzg $$0) {
         this.a = $$0;
         this.c = $$0 instanceof byz;
         this.a(EnumSet.of(bqd.a.a, bqd.a.b));
      }

      @Override
      public boolean a() {
         bji $$0 = this.a.q();
         return $$0 != null && $$0.bv();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.q() != null && this.a.f((bis)this.a.q()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.L().n();
         bji $$0 = this.a.q();
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
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         bji $$0 = this.a.q();
         if ($$0 != null) {
            this.a.L().n();
            this.a.G().a($$0, 90.0F, 90.0F);
            if (!this.a.E($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.ah());
                  if (!this.a.aS()) {
                     this.a.dL().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.t()) {
                  float $$1 = 1.0F;
                  if (this.a.dL().ai() == bgx.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dM().c(this.a, this.a), $$1);
                  $$0.a(this.a.dM().b((bji)this.a), (float)this.a.b(bko.f));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bji> {
      private final bzg a;

      public b(bzg $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bji $$0) {
         return ($$0 instanceof cbw || $$0 instanceof bvs || $$0 instanceof bwa) && $$0.f(this.a) > 9.0;
      }
   }

   static class c extends bpg {
      private final bzg l;

      public c(bzg $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bpg.a.b && !this.l.L().l()) {
            ehp $$0 = new ehp(this.e - this.l.dq(), this.f - this.l.ds(), this.g - this.l.dw());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(ary.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dB(), $$5, 90.0F));
            this.l.aU = this.l.dB();
            float $$6 = (float)(this.h * this.l.b(bko.d));
            float $$7 = ary.i(0.125F, this.l.fe(), $$6);
            this.l.w($$7);
            double $$8 = Math.sin((double)(this.l.ah + this.l.ah()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dB() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dB() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ah + this.l.ah()) * 0.75) * 0.05;
            this.l.f(this.l.do().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bpf $$12 = this.l.G();
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

            this.l.G().a(ary.d(0.125, $$16, $$13), ary.d(0.125, $$17, $$14), ary.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.w(0.0F);
            this.l.w(false);
         }
      }
   }
}
