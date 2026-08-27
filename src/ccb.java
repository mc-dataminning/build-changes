import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccb extends cbn implements bmi {
   public static final float b = 45.836624F;
   public static final int c = atq.f((float) (Math.PI * 5.0 / 4.0));
   protected static final afs<Byte> d = afv.a(ccb.class, afu.a);
   private static final int e = 1;
   @Nullable
   bln bT;
   @Nullable
   private hx bU;
   private boolean bV;
   private int bW;

   public ccb(bkz<? extends ccb> $$0, csf $$1) {
      super($$0, $$1);
      this.bL = new ccb.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aT() {
      return this.ah % c == 0;
   }

   @Override
   public void a(blr $$0, ejz $$1) {
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
      this.bO.a(0, new bsa(this));
      this.bO.a(4, new ccb.a());
      this.bO.a(8, new ccb.d());
      this.bO.a(9, new bso(this, cdz.class, 3.0F, 1.0F));
      this.bO.a(10, new bso(this, bln.class, 8.0F));
      this.bP.a(1, new bty(this, cfh.class).a());
      this.bP.a(2, new ccb.b(this));
      this.bP.a(3, new btz<>(this, cdz.class, true));
   }

   public static bmq.a u() {
      return cbn.gl().a(bmr.l, 14.0).a(bmr.c, 4.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, (byte)0);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bU = new hx($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bkv $$0) {
      super.w($$0);
      if ($$0 instanceof ccb $$1) {
         this.bT = $$1.A();
      }
   }

   @Override
   public void b(sd $$0) {
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
   public bln A() {
      return this.bT;
   }

   @Nullable
   public hx gf() {
      return this.bU;
   }

   public void i(@Nullable hx $$0) {
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

   public void a(bln $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected aqu y() {
      return aqv.zi;
   }

   @Override
   protected aqu n_() {
      return aqv.zk;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.zl;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      atw $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(atw $$0, biz $$1) {
      this.a(bla.a, new clo(clr.oX));
      this.a(bla.a, 0.0F);
   }

   @Override
   protected float l(bkv $$0) {
      return 0.04F;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   class a extends bsg {
      public a() {
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean a() {
         bll $$0 = ccb.this.q();
         return $$0 != null && $$0.bx() && !ccb.this.K().b() && ccb.this.ag.a(b(7)) == 0 ? ccb.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return ccb.this.K().b() && ccb.this.gg() && ccb.this.q() != null && ccb.this.q().bx();
      }

      @Override
      public void c() {
         bll $$0 = ccb.this.q();
         if ($$0 != null) {
            ejz $$1 = $$0.br();
            ccb.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         ccb.this.w(true);
         ccb.this.a(aqv.zj, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         ccb.this.w(false);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         bll $$0 = ccb.this.q();
         if ($$0 != null) {
            if (ccb.this.cH().c($$0.cH())) {
               ccb.this.C($$0);
               ccb.this.w(false);
            } else {
               double $$1 = ccb.this.f($$0);
               if ($$1 < 9.0) {
                  ejz $$2 = $$0.br();
                  ccb.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bug {
      private final bvx b = bvx.b().d().e();

      public b(blu $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return ccb.this.bT != null && ccb.this.bT.q() != null && this.a(ccb.this.bT.q(), this.b);
      }

      @Override
      public void c() {
         ccb.this.h(ccb.this.bT.q());
         super.c();
      }
   }

   class c extends brj {
      public c(ccb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == brj.a.b) {
            ejz $$0 = new ejz(this.e - ccb.this.ds(), this.f - ccb.this.du(), this.g - ccb.this.dy());
            double $$1 = $$0.f();
            if ($$1 < ccb.this.cH().a()) {
               this.k = brj.a.a;
               ccb.this.g(ccb.this.dq().a(0.5));
            } else {
               ccb.this.g(ccb.this.dq().e($$0.a(this.h * 0.05 / $$1)));
               if (ccb.this.q() == null) {
                  ejz $$2 = ccb.this.dq();
                  ccb.this.r(-((float)atq.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  ccb.this.aU = ccb.this.dD();
               } else {
                  double $$3 = ccb.this.q().ds() - ccb.this.ds();
                  double $$4 = ccb.this.q().dy() - ccb.this.dy();
                  ccb.this.r(-((float)atq.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  ccb.this.aU = ccb.this.dD();
               }
            }
         }
      }
   }

   class d extends bsg {
      public d() {
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean a() {
         return !ccb.this.K().b() && ccb.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         hx $$0 = ccb.this.gf();
         if ($$0 == null) {
            $$0 = ccb.this.dn();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            hx $$2 = $$0.b(ccb.this.ag.a(15) - 7, ccb.this.ag.a(11) - 5, ccb.this.ag.a(15) - 7);
            if (ccb.this.dN().t($$2)) {
               ccb.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (ccb.this.q() == null) {
                  ccb.this.I().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
