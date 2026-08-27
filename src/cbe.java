import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbe extends cbi {
   protected static final int c = 80;
   private static final afo<Boolean> b = afr.a(cbe.class, afq.k);
   private static final afo<Integer> e = afr.a(cbe.class, afq.b);
   private float bT;
   private float bU;
   private float bV;
   private float bW;
   private float bX;
   @Nullable
   private blg bY;
   private int bZ;
   private boolean ca;
   @Nullable
   protected bsy d;

   public cbe(bku<? extends cbe> $$0, csa $$1) {
      super($$0, $$1);
      this.bJ = 10;
      this.a(edd.j, 0.0F);
      this.bL = new cbe.c(this);
      this.bT = this.ag.i();
      this.bU = this.bT;
   }

   @Override
   protected void B() {
      bsp $$0 = new bsp(this, 1.0);
      this.d = new bsy(this, 1.0, 80);
      this.bO.a(4, new cbe.a(this));
      this.bO.a(5, $$0);
      this.bO.a(7, this.d);
      this.bO.a(8, new bsj(this, cdu.class, 8.0F));
      this.bO.a(8, new bsj(this, cbe.class, 12.0F, 0.01F));
      this.bO.a(9, new bsw(this));
      this.d.a(EnumSet.of(bsb.a.a, bsb.a.b));
      $$0.a(EnumSet.of(bsb.a.a, bsb.a.b));
      this.bP.a(1, new btu<>(this, blg.class, 10, true, false, new cbe.b(this)));
   }

   public static bml.a gf() {
      return cbi.gl().a(bmm.c, 6.0).a(bmm.m, 0.5).a(bmm.g, 16.0).a(bmm.l, 30.0);
   }

   @Override
   protected bup b(csa $$0) {
      return new bur(this, $$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, false);
      this.an.a(e, 0);
   }

   @Override
   public bll eT() {
      return bll.e;
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
   public blg gi() {
      if (!this.gh()) {
         return null;
      } else if (this.dN().B) {
         if (this.bY != null) {
            return this.bY;
         } else {
            bkq $$0 = this.dN().a(this.an.b(e));
            if ($$0 instanceof blg) {
               this.bY = (blg)$$0;
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
   public void a(afo<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.bZ = 0;
         this.bY = null;
      }
   }

   @Override
   public int Q() {
      return 160;
   }

   @Override
   protected aqq y() {
      return this.bc() ? aqr.kD : aqr.kE;
   }

   @Override
   protected aqq d(bjo $$0) {
      return this.bc() ? aqr.kJ : aqr.kK;
   }

   @Override
   protected aqq m_() {
      return this.bc() ? aqr.kG : aqr.kH;
   }

   @Override
   protected bkq.b aW() {
      return bkq.b.c;
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public float a(ht $$0, csd $$1) {
      return $$1.b_($$0).a(arl.a) ? 10.0F + $$1.v($$0) : super.a($$0, $$1);
   }

   @Override
   public void c_() {
      if (this.bx()) {
         if (this.dN().B) {
            this.bU = this.bT;
            if (!this.aZ()) {
               this.bV = 2.0F;
               eju $$0 = this.dq();
               if ($$0.d > 0.0 && this.ca && !this.aU()) {
                  this.dN().a(this.ds(), this.du(), this.dy(), this.A(), this.dc(), 1.0F, 1.0F, false);
               }

               this.ca = $$0.d < 0.0 && this.dN().a(this.dn().d(), this);
            } else if (this.gg()) {
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
            if (!this.bc()) {
               this.bW = this.ag.i();
            } else if (this.gg()) {
               this.bW = this.bW + (0.0F - this.bW) * 0.25F;
            } else {
               this.bW = this.bW + (1.0F - this.bW) * 0.06F;
            }

            if (this.gg() && this.aZ()) {
               eju $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dN().a(js.e, this.d(0.5) - $$1.c * 1.5, this.dv() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gh()) {
               if (this.bZ < this.w()) {
                  this.bZ++;
               }

               blg $$3 = this.gi();
               if ($$3 != null) {
                  this.I().a($$3, 90.0F, 90.0F);
                  this.I().a();
                  double $$4 = (double)this.G(0.0F);
                  double $$5 = $$3.ds() - this.ds();
                  double $$6 = $$3.e(0.5) - this.dw();
                  double $$7 = $$3.dy() - this.dy();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ag.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ag.j() * (1.7 - $$4);
                     this.dN().a(js.e, this.ds() + $$5 * $$9, this.dw() + $$6 * $$9, this.dy() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bc()) {
            this.j(300);
         } else if (this.aC()) {
            this.g(this.dq().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.4F)));
            this.r(this.ag.i() * 360.0F);
            this.c(false);
            this.au = true;
         }

         if (this.gh()) {
            this.r(this.aW);
         }
      }

      super.c_();
   }

   protected aqq A() {
      return aqr.kI;
   }

   public float E(float $$0) {
      return atm.i($$0, this.bU, this.bT);
   }

   public float F(float $$0) {
      return atm.i($$0, this.bX, this.bW);
   }

   public float G(float $$0) {
      return ((float)this.bZ + $$0) / (float)this.w();
   }

   public float gj() {
      return (float)this.bZ;
   }

   @Override
   public boolean a(csd $$0) {
      return $$0.f(this);
   }

   public static boolean b(bku<? extends cbe> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return ($$4.a(20) == 0 || !$$1.u($$3)) && $$1.aj() != biu.a && ($$2 == blk.c || $$1.b_($$3).a(arl.a)) && $$1.b_($$3.d()).a(arl.a);
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (this.dN().B) {
         return false;
      } else {
         if (!this.gg() && !$$0.a(ari.w) && !$$0.a(bjr.L) && $$0.c() instanceof blg $$2) {
            $$2.a(this.dO().d(this), 2.0F);
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
   public void a(eju $$0) {
      if (this.cY() && this.aZ()) {
         this.a(0.1F, $$0);
         this.a(blm.a, this.dq());
         this.g(this.dq().a(0.9));
         if (!this.gg() && this.q() == null) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }

   static class a extends bsb {
      private final cbe a;
      private int b;
      private final boolean c;

      public a(cbe $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cax;
         this.a(EnumSet.of(bsb.a.a, bsb.a.b));
      }

      @Override
      public boolean a() {
         blg $$0 = this.a.q();
         return $$0 != null && $$0.bx();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.q() != null && this.a.f((bkq)this.a.q()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.N().n();
         blg $$0 = this.a.q();
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
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         blg $$0 = this.a.q();
         if ($$0 != null) {
            this.a.N().n();
            this.a.I().a($$0, 90.0F, 90.0F);
            if (!this.a.E($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.aj());
                  if (!this.a.aU()) {
                     this.a.dN().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.w()) {
                  float $$1 = 1.0F;
                  if (this.a.dN().aj() == biu.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dO().c(this.a, this.a), $$1);
                  $$0.a(this.a.dO().b((blg)this.a), (float)this.a.b(bmm.c));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<blg> {
      private final cbe a;

      public b(cbe $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable blg $$0) {
         return ($$0 instanceof cdu || $$0 instanceof bxq || $$0 instanceof bxy) && $$0.f(this.a) > 9.0;
      }
   }

   static class c extends bre {
      private final cbe l;

      public c(cbe $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bre.a.b && !this.l.N().l()) {
            eju $$0 = new eju(this.e - this.l.ds(), this.f - this.l.du(), this.g - this.l.dy());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(atm.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dD(), $$5, 90.0F));
            this.l.aU = this.l.dD();
            float $$6 = (float)(this.h * this.l.b(bmm.m));
            float $$7 = atm.i(0.125F, this.l.fg(), $$6);
            this.l.w($$7);
            double $$8 = Math.sin((double)(this.l.ah + this.l.aj()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dD() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dD() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ah + this.l.aj()) * 0.75) * 0.05;
            this.l.g(this.l.dq().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            brd $$12 = this.l.I();
            double $$13 = this.l.ds() + $$2 * 2.0;
            double $$14 = this.l.dw() + $$3 / $$1;
            double $$15 = this.l.dy() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.I().a(atm.d(0.125, $$16, $$13), atm.d(0.125, $$17, $$14), atm.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.w(0.0F);
            this.l.w(false);
         }
      }
   }
}
