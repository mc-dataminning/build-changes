import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzn extends byz implements bju {
   public static final float b = 45.836624F;
   public static final int c = aro.f((float) (Math.PI * 5.0 / 4.0));
   protected static final adx<Byte> d = aea.a(bzn.class, adz.a);
   private static final int e = 1;
   @Nullable
   biy bT;
   @Nullable
   private gv bU;
   private boolean bV;
   private int bW;

   public bzn(bik<? extends bzn> $$0, cpk $$1) {
      super($$0, $$1);
      this.bL = new bzn.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aR() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bjc $$0, ehf $$1) {
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
         this.a(this.dL().i(), 1.0F);
      }
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpm(this));
      this.bO.a(4, new bzn.a());
      this.bO.a(8, new bzn.d());
      this.bO.a(9, new bqa(this, cbl.class, 3.0F, 1.0F));
      this.bO.a(10, new bqa(this, biy.class, 8.0F));
      this.bP.a(1, new brk(this, cct.class).a());
      this.bP.a(2, new bzn.b(this));
      this.bP.a(3, new brl<>(this, cbl.class, true));
   }

   public static bkc.a p() {
      return byz.gf().a(bkd.a, 14.0).a(bkd.f, 4.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, (byte)0);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bU = new gv($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void b(qs $$0) {
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
   public biy q() {
      return this.bT;
   }

   @Nullable
   public gv t() {
      return this.bU;
   }

   public void i(@Nullable gv $$0) {
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

   public boolean fZ() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(biy $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected aot r() {
      return aou.yy;
   }

   @Override
   protected aot h_() {
      return aou.yA;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.yB;
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      art $$5 = $$0.y_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(art $$0, bgm $$1) {
      this.a(bil.a, new ciw(ciz.om));
      this.a(bil.a, 0.0F);
   }

   @Override
   protected float l(big $$0) {
      return 0.04F;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   class a extends bps {
      public a() {
         this.a(EnumSet.of(bps.a.a));
      }

      @Override
      public boolean a() {
         biw $$0 = bzn.this.j();
         return $$0 != null && $$0.bv() && !bzn.this.E().b() && bzn.this.ag.a(b(7)) == 0 ? bzn.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return bzn.this.E().b() && bzn.this.fZ() && bzn.this.j() != null && bzn.this.j().bv();
      }

      @Override
      public void c() {
         biw $$0 = bzn.this.j();
         if ($$0 != null) {
            ehf $$1 = $$0.bp();
            bzn.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         bzn.this.w(true);
         bzn.this.a(aou.yz, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         bzn.this.w(false);
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         biw $$0 = bzn.this.j();
         if ($$0 != null) {
            if (bzn.this.cG().c($$0.cG())) {
               bzn.this.C($$0);
               bzn.this.w(false);
            } else {
               double $$1 = bzn.this.f($$0);
               if ($$1 < 9.0) {
                  ehf $$2 = $$0.bp();
                  bzn.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends brs {
      private final btj b = btj.b().d().e();

      public b(bjf $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return bzn.this.bT != null && bzn.this.bT.j() != null && this.a(bzn.this.bT.j(), this.b);
      }

      @Override
      public void c() {
         bzn.this.h(bzn.this.bT.j());
         super.c();
      }
   }

   class c extends bov {
      public c(bzn $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bov.a.b) {
            ehf $$0 = new ehf(this.e - bzn.this.dp(), this.f - bzn.this.dr(), this.g - bzn.this.dv());
            double $$1 = $$0.f();
            if ($$1 < bzn.this.cG().a()) {
               this.k = bov.a.a;
               bzn.this.f(bzn.this.dn().a(0.5));
            } else {
               bzn.this.f(bzn.this.dn().e($$0.a(this.h * 0.05 / $$1)));
               if (bzn.this.j() == null) {
                  ehf $$2 = bzn.this.dn();
                  bzn.this.r(-((float)aro.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  bzn.this.aU = bzn.this.dA();
               } else {
                  double $$3 = bzn.this.j().dp() - bzn.this.dp();
                  double $$4 = bzn.this.j().dv() - bzn.this.dv();
                  bzn.this.r(-((float)aro.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  bzn.this.aU = bzn.this.dA();
               }
            }
         }
      }
   }

   class d extends bps {
      public d() {
         this.a(EnumSet.of(bps.a.a));
      }

      @Override
      public boolean a() {
         return !bzn.this.E().b() && bzn.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         gv $$0 = bzn.this.t();
         if ($$0 == null) {
            $$0 = bzn.this.dk();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gv $$2 = $$0.b(bzn.this.ag.a(15) - 7, bzn.this.ag.a(11) - 5, bzn.this.ag.a(15) - 7);
            if (bzn.this.dK().t($$2)) {
               bzn.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (bzn.this.j() == null) {
                  bzn.this.D().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
