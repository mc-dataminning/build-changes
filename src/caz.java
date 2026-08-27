import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class caz extends cal implements blg {
   public static final float b = 45.836624F;
   public static final int c = asy.f((float) (Math.PI * 5.0 / 4.0));
   protected static final afc<Byte> d = aff.a(caz.class, afe.a);
   private static final int e = 1;
   @Nullable
   bkl bT;
   @Nullable
   private ht bU;
   private boolean bV;
   private int bW;

   public caz(bjx<? extends caz> $$0, cqz $$1) {
      super($$0, $$1);
      this.bL = new caz.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aR() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bkp $$0, eif $$1) {
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
      this.bO.a(0, new bqy(this));
      this.bO.a(4, new caz.a());
      this.bO.a(8, new caz.d());
      this.bO.a(9, new brm(this, ccx.class, 3.0F, 1.0F));
      this.bO.a(10, new brm(this, bkl.class, 8.0F));
      this.bP.a(1, new bsw(this, cef.class).a());
      this.bP.a(2, new caz.b(this));
      this.bP.a(3, new bsx<>(this, ccx.class, true));
   }

   public static blo.a s() {
      return cal.gk().a(blp.l, 14.0).a(blp.c, 4.0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, (byte)0);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bU = new ht($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bjt $$0) {
      super.w($$0);
      if ($$0 instanceof caz $$1) {
         this.bT = $$1.t();
      }
   }

   @Override
   public void b(rt $$0) {
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
   public bkl t() {
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

   public void a(bkl $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected aqc w() {
      return aqd.yF;
   }

   @Override
   protected aqc m_() {
      return aqd.yH;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.yI;
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      ate $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ate $$0, bhz $$1) {
      this.a(bjy.a, new ckj(ckm.om));
      this.a(bjy.a, 0.0F);
   }

   @Override
   protected float l(bjt $$0) {
      return 0.04F;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   class a extends bre {
      public a() {
         this.a(EnumSet.of(bre.a.a));
      }

      @Override
      public boolean a() {
         bkj $$0 = caz.this.q();
         return $$0 != null && $$0.bv() && !caz.this.I().b() && caz.this.ag.a(b(7)) == 0 ? caz.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return caz.this.I().b() && caz.this.ge() && caz.this.q() != null && caz.this.q().bv();
      }

      @Override
      public void c() {
         bkj $$0 = caz.this.q();
         if ($$0 != null) {
            eif $$1 = $$0.bp();
            caz.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         caz.this.w(true);
         caz.this.a(aqd.yG, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         caz.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bkj $$0 = caz.this.q();
         if ($$0 != null) {
            if (caz.this.cG().c($$0.cG())) {
               caz.this.C($$0);
               caz.this.w(false);
            } else {
               double $$1 = caz.this.f($$0);
               if ($$1 < 9.0) {
                  eif $$2 = $$0.bp();
                  caz.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bte {
      private final buv b = buv.b().d().e();

      public b(bks $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return caz.this.bT != null && caz.this.bT.q() != null && this.a(caz.this.bT.q(), this.b);
      }

      @Override
      public void c() {
         caz.this.h(caz.this.bT.q());
         super.c();
      }
   }

   class c extends bqh {
      public c(caz $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bqh.a.b) {
            eif $$0 = new eif(this.e - caz.this.dq(), this.f - caz.this.ds(), this.g - caz.this.dw());
            double $$1 = $$0.f();
            if ($$1 < caz.this.cG().a()) {
               this.k = bqh.a.a;
               caz.this.f(caz.this.do().a(0.5));
            } else {
               caz.this.f(caz.this.do().e($$0.a(this.h * 0.05 / $$1)));
               if (caz.this.q() == null) {
                  eif $$2 = caz.this.do();
                  caz.this.r(-((float)asy.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  caz.this.aU = caz.this.dB();
               } else {
                  double $$3 = caz.this.q().dq() - caz.this.dq();
                  double $$4 = caz.this.q().dw() - caz.this.dw();
                  caz.this.r(-((float)asy.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  caz.this.aU = caz.this.dB();
               }
            }
         }
      }
   }

   class d extends bre {
      public d() {
         this.a(EnumSet.of(bre.a.a));
      }

      @Override
      public boolean a() {
         return !caz.this.I().b() && caz.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         ht $$0 = caz.this.y();
         if ($$0 == null) {
            $$0 = caz.this.dl();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ht $$2 = $$0.b(caz.this.ag.a(15) - 7, caz.this.ag.a(11) - 5, caz.this.ag.a(15) - 7);
            if (caz.this.dL().t($$2)) {
               caz.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (caz.this.q() == null) {
                  caz.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
