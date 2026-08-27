import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbw extends cbi implements bmd {
   public static final float b = 45.836624F;
   public static final int c = atm.f((float) (Math.PI * 5.0 / 4.0));
   protected static final afo<Byte> d = afr.a(cbw.class, afq.a);
   private static final int e = 1;
   @Nullable
   bli bT;
   @Nullable
   private ht bU;
   private boolean bV;
   private int bW;

   public cbw(bku<? extends cbw> $$0, csa $$1) {
      super($$0, $$1);
      this.bL = new cbw.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aT() {
      return this.ah % c == 0;
   }

   @Override
   public void a(blm $$0, eju $$1) {
      super.a($$0, $$1);
      this.aQ();
   }

   @Override
   public void l() {
      this.af = true;
      super.l();
      this.af = false;
      this.e(true);
      if (this.bV && --this.bW <= 0) {
         this.bW = 20;
         this.a(this.dO().i(), 1.0F);
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new brv(this));
      this.bO.a(4, new cbw.a());
      this.bO.a(8, new cbw.d());
      this.bO.a(9, new bsj(this, cdu.class, 3.0F, 1.0F));
      this.bO.a(10, new bsj(this, bli.class, 8.0F));
      this.bP.a(1, new btt(this, cfc.class).a());
      this.bP.a(2, new cbw.b(this));
      this.bP.a(3, new btu<>(this, cdu.class, true));
   }

   public static bml.a u() {
      return cbi.gl().a(bmm.l, 14.0).a(bmm.c, 4.0);
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
   public void w(bkq $$0) {
      super.w($$0);
      if ($$0 instanceof cbw $$1) {
         this.bT = $$1.A();
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
   public bli A() {
      return this.bT;
   }

   @Nullable
   public ht gf() {
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

   public boolean gg() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bli $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected aqq y() {
      return aqr.zi;
   }

   @Override
   protected aqq m_() {
      return aqr.zk;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.zl;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      ats $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ats $$0, biv $$1) {
      this.a(bkv.a, new clj(clm.oX));
      this.a(bkv.a, 0.0F);
   }

   @Override
   protected float l(bkq $$0) {
      return 0.04F;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   class a extends bsb {
      public a() {
         this.a(EnumSet.of(bsb.a.a));
      }

      @Override
      public boolean a() {
         blg $$0 = cbw.this.q();
         return $$0 != null && $$0.bx() && !cbw.this.K().b() && cbw.this.ag.a(b(7)) == 0 ? cbw.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cbw.this.K().b() && cbw.this.gg() && cbw.this.q() != null && cbw.this.q().bx();
      }

      @Override
      public void c() {
         blg $$0 = cbw.this.q();
         if ($$0 != null) {
            eju $$1 = $$0.br();
            cbw.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cbw.this.w(true);
         cbw.this.a(aqr.zj, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cbw.this.w(false);
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         blg $$0 = cbw.this.q();
         if ($$0 != null) {
            if (cbw.this.cH().c($$0.cH())) {
               cbw.this.C($$0);
               cbw.this.w(false);
            } else {
               double $$1 = cbw.this.f($$0);
               if ($$1 < 9.0) {
                  eju $$2 = $$0.br();
                  cbw.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bub {
      private final bvs b = bvs.b().d().e();

      public b(blp $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cbw.this.bT != null && cbw.this.bT.q() != null && this.a(cbw.this.bT.q(), this.b);
      }

      @Override
      public void c() {
         cbw.this.h(cbw.this.bT.q());
         super.c();
      }
   }

   class c extends bre {
      public c(cbw $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bre.a.b) {
            eju $$0 = new eju(this.e - cbw.this.ds(), this.f - cbw.this.du(), this.g - cbw.this.dy());
            double $$1 = $$0.f();
            if ($$1 < cbw.this.cH().a()) {
               this.k = bre.a.a;
               cbw.this.g(cbw.this.dq().a(0.5));
            } else {
               cbw.this.g(cbw.this.dq().e($$0.a(this.h * 0.05 / $$1)));
               if (cbw.this.q() == null) {
                  eju $$2 = cbw.this.dq();
                  cbw.this.r(-((float)atm.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cbw.this.aU = cbw.this.dD();
               } else {
                  double $$3 = cbw.this.q().ds() - cbw.this.ds();
                  double $$4 = cbw.this.q().dy() - cbw.this.dy();
                  cbw.this.r(-((float)atm.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cbw.this.aU = cbw.this.dD();
               }
            }
         }
      }
   }

   class d extends bsb {
      public d() {
         this.a(EnumSet.of(bsb.a.a));
      }

      @Override
      public boolean a() {
         return !cbw.this.K().b() && cbw.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         ht $$0 = cbw.this.gf();
         if ($$0 == null) {
            $$0 = cbw.this.dn();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ht $$2 = $$0.b(cbw.this.ag.a(15) - 7, cbw.this.ag.a(11) - 5, cbw.this.ag.a(15) - 7);
            if (cbw.this.dN().t($$2)) {
               cbw.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cbw.this.q() == null) {
                  cbw.this.I().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
