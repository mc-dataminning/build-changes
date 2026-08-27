import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbo extends cba implements blv {
   public static final float b = 45.836624F;
   public static final int c = ati.f((float) (Math.PI * 5.0 / 4.0));
   protected static final afm<Byte> d = afp.a(cbo.class, afo.a);
   private static final int e = 1;
   @Nullable
   bla bT;
   @Nullable
   private ht bU;
   private boolean bV;
   private int bW;

   public cbo(bkm<? extends cbo> $$0, crs $$1) {
      super($$0, $$1);
      this.bL = new cbo.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aR() {
      return this.ah % c == 0;
   }

   @Override
   public void a(ble $$0, eji $$1) {
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
      this.bO.a(0, new brn(this));
      this.bO.a(4, new cbo.a());
      this.bO.a(8, new cbo.d());
      this.bO.a(9, new bsb(this, cdm.class, 3.0F, 1.0F));
      this.bO.a(10, new bsb(this, bla.class, 8.0F));
      this.bP.a(1, new btl(this, ceu.class).a());
      this.bP.a(2, new cbo.b(this));
      this.bP.a(3, new btm<>(this, cdm.class, true));
   }

   public static bmd.a s() {
      return cba.gk().a(bme.l, 14.0).a(bme.c, 4.0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, (byte)0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bU = new ht($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bki $$0) {
      super.w($$0);
      if ($$0 instanceof cbo $$1) {
         this.bT = $$1.t();
      }
   }

   @Override
   public void b(rz $$0) {
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
   public bla t() {
      return this.bT;
   }

   @Nullable
   public ht y() {
      return this.bU;
   }

   public void i(@Nullable ht $$0) {
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

   public void a(bla $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected aqm w() {
      return aqn.yH;
   }

   @Override
   protected aqm m_() {
      return aqn.yJ;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.yK;
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      ato $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ato $$0, bio $$1) {
      this.a(bkn.a, new clb(cle.om));
      this.a(bkn.a, 0.0F);
   }

   @Override
   protected float l(bki $$0) {
      return 0.04F;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   class a extends brt {
      public a() {
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean a() {
         bky $$0 = cbo.this.q();
         return $$0 != null && $$0.bv() && !cbo.this.I().b() && cbo.this.ag.a(b(7)) == 0 ? cbo.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cbo.this.I().b() && cbo.this.ge() && cbo.this.q() != null && cbo.this.q().bv();
      }

      @Override
      public void c() {
         bky $$0 = cbo.this.q();
         if ($$0 != null) {
            eji $$1 = $$0.bp();
            cbo.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cbo.this.w(true);
         cbo.this.a(aqn.yI, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cbo.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bky $$0 = cbo.this.q();
         if ($$0 != null) {
            if (cbo.this.cG().c($$0.cG())) {
               cbo.this.C($$0);
               cbo.this.w(false);
            } else {
               double $$1 = cbo.this.f($$0);
               if ($$1 < 9.0) {
                  eji $$2 = $$0.bp();
                  cbo.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends btt {
      private final bvk b = bvk.b().d().e();

      public b(blh $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cbo.this.bT != null && cbo.this.bT.q() != null && this.a(cbo.this.bT.q(), this.b);
      }

      @Override
      public void c() {
         cbo.this.h(cbo.this.bT.q());
         super.c();
      }
   }

   class c extends bqw {
      public c(cbo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bqw.a.b) {
            eji $$0 = new eji(this.e - cbo.this.dq(), this.f - cbo.this.ds(), this.g - cbo.this.dw());
            double $$1 = $$0.f();
            if ($$1 < cbo.this.cG().a()) {
               this.k = bqw.a.a;
               cbo.this.f(cbo.this.do().a(0.5));
            } else {
               cbo.this.f(cbo.this.do().e($$0.a(this.h * 0.05 / $$1)));
               if (cbo.this.q() == null) {
                  eji $$2 = cbo.this.do();
                  cbo.this.r(-((float)ati.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cbo.this.aU = cbo.this.dB();
               } else {
                  double $$3 = cbo.this.q().dq() - cbo.this.dq();
                  double $$4 = cbo.this.q().dw() - cbo.this.dw();
                  cbo.this.r(-((float)ati.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cbo.this.aU = cbo.this.dB();
               }
            }
         }
      }
   }

   class d extends brt {
      public d() {
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean a() {
         return !cbo.this.I().b() && cbo.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         ht $$0 = cbo.this.y();
         if ($$0 == null) {
            $$0 = cbo.this.dl();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ht $$2 = $$0.b(cbo.this.ag.a(15) - 7, cbo.this.ag.a(11) - 5, cbo.this.ag.a(15) - 7);
            if (cbo.this.dL().t($$2)) {
               cbo.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cbo.this.q() == null) {
                  cbo.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
