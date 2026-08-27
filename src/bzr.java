import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzr extends bzd implements bjy {
   public static final float b = 45.836624F;
   public static final int c = ars.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aec<Byte> d = aef.a(bzr.class, aee.a);
   private static final int e = 1;
   @Nullable
   bjd bT;
   @Nullable
   private gw bU;
   private boolean bV;
   private int bW;

   public bzr(bip<? extends bzr> $$0, cpq $$1) {
      super($$0, $$1);
      this.bL = new bzr.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aR() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bjh $$0, ehi $$1) {
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
      this.bO.a(0, new bpq(this));
      this.bO.a(4, new bzr.a());
      this.bO.a(8, new bzr.d());
      this.bO.a(9, new bqe(this, cbp.class, 3.0F, 1.0F));
      this.bO.a(10, new bqe(this, bjd.class, 8.0F));
      this.bP.a(1, new bro(this, ccx.class).a());
      this.bP.a(2, new bzr.b(this));
      this.bP.a(3, new brp<>(this, cbp.class, true));
   }

   public static bkg.a p() {
      return bzd.gg().a(bkh.a, 14.0).a(bkh.f, 4.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, (byte)0);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bU = new gw($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void b(qu $$0) {
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
   public bjd q() {
      return this.bT;
   }

   @Nullable
   public gw t() {
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

   public boolean ga() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bjd $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected aoy r() {
      return aoz.yD;
   }

   @Override
   protected aoy h_() {
      return aoz.yF;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.yG;
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      arx $$5 = $$0.y_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(arx $$0, bgr $$1) {
      this.a(biq.a, new cja(cjd.om));
      this.a(biq.a, 0.0F);
   }

   @Override
   protected float l(bil $$0) {
      return 0.04F;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   class a extends bpw {
      public a() {
         this.a(EnumSet.of(bpw.a.a));
      }

      @Override
      public boolean a() {
         bjb $$0 = bzr.this.j();
         return $$0 != null && $$0.bv() && !bzr.this.E().b() && bzr.this.ag.a(b(7)) == 0 ? bzr.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return bzr.this.E().b() && bzr.this.ga() && bzr.this.j() != null && bzr.this.j().bv();
      }

      @Override
      public void c() {
         bjb $$0 = bzr.this.j();
         if ($$0 != null) {
            ehi $$1 = $$0.bp();
            bzr.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         bzr.this.w(true);
         bzr.this.a(aoz.yE, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         bzr.this.w(false);
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         bjb $$0 = bzr.this.j();
         if ($$0 != null) {
            if (bzr.this.cG().c($$0.cG())) {
               bzr.this.C($$0);
               bzr.this.w(false);
            } else {
               double $$1 = bzr.this.f($$0);
               if ($$1 < 9.0) {
                  ehi $$2 = $$0.bp();
                  bzr.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends brw {
      private final btn b = btn.b().d().e();

      public b(bjk $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return bzr.this.bT != null && bzr.this.bT.j() != null && this.a(bzr.this.bT.j(), this.b);
      }

      @Override
      public void c() {
         bzr.this.h(bzr.this.bT.j());
         super.c();
      }
   }

   class c extends boz {
      public c(bzr $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == boz.a.b) {
            ehi $$0 = new ehi(this.e - bzr.this.dp(), this.f - bzr.this.dr(), this.g - bzr.this.dv());
            double $$1 = $$0.f();
            if ($$1 < bzr.this.cG().a()) {
               this.k = boz.a.a;
               bzr.this.f(bzr.this.dn().a(0.5));
            } else {
               bzr.this.f(bzr.this.dn().e($$0.a(this.h * 0.05 / $$1)));
               if (bzr.this.j() == null) {
                  ehi $$2 = bzr.this.dn();
                  bzr.this.r(-((float)ars.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  bzr.this.aU = bzr.this.dA();
               } else {
                  double $$3 = bzr.this.j().dp() - bzr.this.dp();
                  double $$4 = bzr.this.j().dv() - bzr.this.dv();
                  bzr.this.r(-((float)ars.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  bzr.this.aU = bzr.this.dA();
               }
            }
         }
      }
   }

   class d extends bpw {
      public d() {
         this.a(EnumSet.of(bpw.a.a));
      }

      @Override
      public boolean a() {
         return !bzr.this.E().b() && bzr.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         gw $$0 = bzr.this.t();
         if ($$0 == null) {
            $$0 = bzr.this.dk();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gw $$2 = $$0.b(bzr.this.ag.a(15) - 7, bzr.this.ag.a(11) - 5, bzr.this.ag.a(15) - 7);
            if (bzr.this.dK().t($$2)) {
               bzr.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (bzr.this.j() == null) {
                  bzr.this.D().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
