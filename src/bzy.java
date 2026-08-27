import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzy extends bzk implements bkf {
   public static final float b = 45.836624F;
   public static final int c = ary.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aeg<Byte> d = aej.a(bzy.class, aei.a);
   private static final int e = 1;
   @Nullable
   bjk bT;
   @Nullable
   private gw bU;
   private boolean bV;
   private int bW;

   public bzy(biw<? extends bzy> $$0, cpx $$1) {
      super($$0, $$1);
      this.bL = new bzy.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aR() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bjo $$0, ehp $$1) {
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
      this.bO.a(0, new bpx(this));
      this.bO.a(4, new bzy.a());
      this.bO.a(8, new bzy.d());
      this.bO.a(9, new bql(this, cbw.class, 3.0F, 1.0F));
      this.bO.a(10, new bql(this, bjk.class, 8.0F));
      this.bP.a(1, new brv(this, cde.class).a());
      this.bP.a(2, new bzy.b(this));
      this.bP.a(3, new brw<>(this, cbw.class, true));
   }

   public static bkn.a s() {
      return bzk.gj().a(bko.a, 14.0).a(bko.f, 4.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, (byte)0);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bU = new gw($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void b(qy $$0) {
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
   public bjk t() {
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

   public boolean gd() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bjk $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected ape w() {
      return apf.yD;
   }

   @Override
   protected ape l_() {
      return apf.yF;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.yG;
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      ase $$5 = $$0.D_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ase $$0, bgy $$1) {
      this.a(bix.a, new cjh(cjk.om));
      this.a(bix.a, 0.0F);
   }

   @Override
   protected float l(bis $$0) {
      return 0.04F;
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   class a extends bqd {
      public a() {
         this.a(EnumSet.of(bqd.a.a));
      }

      @Override
      public boolean a() {
         bji $$0 = bzy.this.q();
         return $$0 != null && $$0.bv() && !bzy.this.I().b() && bzy.this.ag.a(b(7)) == 0 ? bzy.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return bzy.this.I().b() && bzy.this.gd() && bzy.this.q() != null && bzy.this.q().bv();
      }

      @Override
      public void c() {
         bji $$0 = bzy.this.q();
         if ($$0 != null) {
            ehp $$1 = $$0.bp();
            bzy.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         bzy.this.w(true);
         bzy.this.a(apf.yE, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         bzy.this.w(false);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         bji $$0 = bzy.this.q();
         if ($$0 != null) {
            if (bzy.this.cG().c($$0.cG())) {
               bzy.this.C($$0);
               bzy.this.w(false);
            } else {
               double $$1 = bzy.this.f($$0);
               if ($$1 < 9.0) {
                  ehp $$2 = $$0.bp();
                  bzy.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bsd {
      private final btu b = btu.b().d().e();

      public b(bjr $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return bzy.this.bT != null && bzy.this.bT.q() != null && this.a(bzy.this.bT.q(), this.b);
      }

      @Override
      public void c() {
         bzy.this.h(bzy.this.bT.q());
         super.c();
      }
   }

   class c extends bpg {
      public c(bzy $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bpg.a.b) {
            ehp $$0 = new ehp(this.e - bzy.this.dq(), this.f - bzy.this.ds(), this.g - bzy.this.dw());
            double $$1 = $$0.f();
            if ($$1 < bzy.this.cG().a()) {
               this.k = bpg.a.a;
               bzy.this.f(bzy.this.do().a(0.5));
            } else {
               bzy.this.f(bzy.this.do().e($$0.a(this.h * 0.05 / $$1)));
               if (bzy.this.q() == null) {
                  ehp $$2 = bzy.this.do();
                  bzy.this.r(-((float)ary.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  bzy.this.aU = bzy.this.dB();
               } else {
                  double $$3 = bzy.this.q().dq() - bzy.this.dq();
                  double $$4 = bzy.this.q().dw() - bzy.this.dw();
                  bzy.this.r(-((float)ary.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  bzy.this.aU = bzy.this.dB();
               }
            }
         }
      }
   }

   class d extends bqd {
      public d() {
         this.a(EnumSet.of(bqd.a.a));
      }

      @Override
      public boolean a() {
         return !bzy.this.I().b() && bzy.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         gw $$0 = bzy.this.y();
         if ($$0 == null) {
            $$0 = bzy.this.dl();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gw $$2 = $$0.b(bzy.this.ag.a(15) - 7, bzy.this.ag.a(11) - 5, bzy.this.ag.a(15) - 7);
            if (bzy.this.dL().t($$2)) {
               bzy.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (bzy.this.q() == null) {
                  bzy.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
