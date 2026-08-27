import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cac extends bzo implements bkj {
   public static final float b = 45.836624F;
   public static final int c = asb.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aef<Byte> d = aei.a(cac.class, aeh.a);
   private static final int e = 1;
   @Nullable
   bjo bT;
   @Nullable
   private gw bU;
   private boolean bV;
   private int bW;

   public cac(bja<? extends cac> $$0, cqb $$1) {
      super($$0, $$1);
      this.bL = new cac.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aR() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bjs $$0, ehh $$1) {
      super.a($$0, $$1);
      this.aO();
   }

   @Override
   public void l() {
      this.af = true;
      super.l();
      this.af = false;
      this.e(true);
      if (this.bV && --this.bW <= 0) {
         this.bW = 20;
         this.a(this.dM().i(), 1.0F);
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bqb(this));
      this.bO.a(4, new cac.a());
      this.bO.a(8, new cac.d());
      this.bO.a(9, new bqp(this, cca.class, 3.0F, 1.0F));
      this.bO.a(10, new bqp(this, bjo.class, 8.0F));
      this.bP.a(1, new brz(this, cdi.class).a());
      this.bP.a(2, new cac.b(this));
      this.bP.a(3, new bsa<>(this, cca.class, true));
   }

   public static bkr.a s() {
      return bzo.gk().a(bks.l, 14.0).a(bks.c, 4.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, (byte)0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bU = new gw($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      if (this.bU != null) {
         $$0.a("BoundX", this.bU.u());
         $$0.a("BoundY", this.bU.v());
         $$0.a("BoundZ", this.bU.w());
      }

      if (this.bV) {
         $$0.a("LifeTicks", this.bW);
      }
   }

   @Nullable
   public bjo t() {
      return this.bT;
   }

   @Nullable
   public gw y() {
      return this.bU;
   }

   public void i(@Nullable gw $$0) {
      this.bU = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.an.b(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.an.b(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.an.b(d, (byte)($$2 & 0xFF));
   }

   public boolean ge() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bjo $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected apf w() {
      return apg.yD;
   }

   @Override
   protected apf l_() {
      return apg.yF;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.yG;
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      ash $$5 = $$0.D_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ash $$0, bhc $$1) {
      this.a(bjb.a, new cjl(cjo.om));
      this.a(bjb.a, 0.0F);
   }

   @Override
   protected float l(biw $$0) {
      return 0.04F;
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   class a extends bqh {
      public a() {
         this.a(EnumSet.of(bqh.a.a));
      }

      @Override
      public boolean a() {
         bjm $$0 = cac.this.q();
         return $$0 != null && $$0.bv() && !cac.this.I().b() && cac.this.ag.a(b(7)) == 0 ? cac.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cac.this.I().b() && cac.this.ge() && cac.this.q() != null && cac.this.q().bv();
      }

      @Override
      public void c() {
         bjm $$0 = cac.this.q();
         if ($$0 != null) {
            ehh $$1 = $$0.bp();
            cac.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cac.this.w(true);
         cac.this.a(apg.yE, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cac.this.w(false);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         bjm $$0 = cac.this.q();
         if ($$0 != null) {
            if (cac.this.cG().c($$0.cG())) {
               cac.this.C($$0);
               cac.this.w(false);
            } else {
               double $$1 = cac.this.f($$0);
               if ($$1 < 9.0) {
                  ehh $$2 = $$0.bp();
                  cac.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bsh {
      private final bty b = bty.b().d().e();

      public b(bjv $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cac.this.bT != null && cac.this.bT.q() != null && this.a(cac.this.bT.q(), this.b);
      }

      @Override
      public void c() {
         cac.this.h(cac.this.bT.q());
         super.c();
      }
   }

   class c extends bpk {
      public c(cac $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bpk.a.b) {
            ehh $$0 = new ehh(this.e - cac.this.dq(), this.f - cac.this.ds(), this.g - cac.this.dw());
            double $$1 = $$0.f();
            if ($$1 < cac.this.cG().a()) {
               this.k = bpk.a.a;
               cac.this.f(cac.this.do().a(0.5));
            } else {
               cac.this.f(cac.this.do().e($$0.a(this.h * 0.05 / $$1)));
               if (cac.this.q() == null) {
                  ehh $$2 = cac.this.do();
                  cac.this.r(-((float)asb.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cac.this.aU = cac.this.dB();
               } else {
                  double $$3 = cac.this.q().dq() - cac.this.dq();
                  double $$4 = cac.this.q().dw() - cac.this.dw();
                  cac.this.r(-((float)asb.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cac.this.aU = cac.this.dB();
               }
            }
         }
      }
   }

   class d extends bqh {
      public d() {
         this.a(EnumSet.of(bqh.a.a));
      }

      @Override
      public boolean a() {
         return !cac.this.I().b() && cac.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         gw $$0 = cac.this.y();
         if ($$0 == null) {
            $$0 = cac.this.dl();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gw $$2 = $$0.b(cac.this.ag.a(15) - 7, cac.this.ag.a(11) - 5, cac.this.ag.a(15) - 7);
            if (cac.this.dL().t($$2)) {
               cac.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cac.this.q() == null) {
                  cac.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
