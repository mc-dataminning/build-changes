import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdk extends ccw implements bnl {
   public static final float b = 45.836624F;
   public static final int c = aup.f((float) (Math.PI * 5.0 / 4.0));
   protected static final agn<Byte> d = agq.a(cdk.class, agp.a);
   private static final int e = 1;
   @Nullable
   bmq bU;
   @Nullable
   private hx bV;
   private boolean bW;
   private int bX;

   public cdk(bmc<? extends cdk> $$0, ctx $$1) {
      super($$0, $$1);
      this.bM = new cdk.c(this);
      this.bK = 3;
   }

   @Override
   public boolean aT() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bmu $$0, emc $$1) {
      super.a($$0, $$1);
      this.aQ();
   }

   @Override
   public void l() {
      this.af = true;
      super.l();
      this.af = false;
      this.e(true);
      if (this.bW && --this.bX <= 0) {
         this.bX = 20;
         this.a(this.dM().i(), 1.0F);
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bte(this));
      this.bP.a(4, new cdk.a());
      this.bP.a(8, new cdk.d());
      this.bP.a(9, new bts(this, cfq.class, 3.0F, 1.0F));
      this.bP.a(10, new bts(this, bmq.class, 8.0F));
      this.bQ.a(1, new bvc(this, cgz.class).a());
      this.bQ.a(2, new cdk.b(this));
      this.bQ.a(3, new bvd<>(this, cfq.class, true));
   }

   public static bnt.a u() {
      return ccw.gl().a(bnu.n, 14.0).a(bnu.c, 4.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, (byte)0);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bV = new hx($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void v(blw $$0) {
      super.v($$0);
      if ($$0 instanceof cdk $$1) {
         this.bU = $$1.A();
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      if (this.bV != null) {
         $$0.a("BoundX", this.bV.u());
         $$0.a("BoundY", this.bV.v());
         $$0.a("BoundZ", this.bV.w());
      }

      if (this.bW) {
         $$0.a("LifeTicks", this.bX);
      }
   }

   @Nullable
   public bmq A() {
      return this.bU;
   }

   @Nullable
   public hx gf() {
      return this.bV;
   }

   public void i(@Nullable hx $$0) {
      this.bV = $$0;
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

   public void a(bmq $$0) {
      this.bU = $$0;
   }

   public void b(int $$0) {
      this.bW = true;
      this.bX = $$0;
   }

   @Override
   protected ars y() {
      return art.zS;
   }

   @Override
   protected ars n_() {
      return art.zU;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.zV;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      auw $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(auw $$0, bka $$1) {
      this.a(bmd.a, new cng(cnj.oZ));
      this.a(bmd.a, 0.0F);
   }

   class a extends btk {
      public a() {
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean a() {
         bmo $$0 = cdk.this.q();
         return $$0 != null && $$0.bx() && !cdk.this.K().b() && cdk.this.ag.a(b(7)) == 0 ? cdk.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cdk.this.K().b() && cdk.this.gg() && cdk.this.q() != null && cdk.this.q().bx();
      }

      @Override
      public void c() {
         bmo $$0 = cdk.this.q();
         if ($$0 != null) {
            emc $$1 = $$0.br();
            cdk.this.bM.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cdk.this.w(true);
         cdk.this.a(art.zT, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cdk.this.w(false);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         bmo $$0 = cdk.this.q();
         if ($$0 != null) {
            if (cdk.this.cH().c($$0.cH())) {
               cdk.this.B($$0);
               cdk.this.w(false);
            } else {
               double $$1 = cdk.this.f($$0);
               if ($$1 < 9.0) {
                  emc $$2 = $$0.br();
                  cdk.this.bM.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bvk {
      private final bxd b = bxd.b().d().e();

      public b(bmx $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cdk.this.bU != null && cdk.this.bU.q() != null && this.a(cdk.this.bU.q(), this.b);
      }

      @Override
      public void c() {
         cdk.this.h(cdk.this.bU.q());
         super.c();
      }
   }

   class c extends bsn {
      public c(cdk $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bsn.a.b) {
            emc $$0 = new emc(this.e - cdk.this.dq(), this.f - cdk.this.ds(), this.g - cdk.this.dw());
            double $$1 = $$0.f();
            if ($$1 < cdk.this.cH().a()) {
               this.k = bsn.a.a;
               cdk.this.g(cdk.this.do().a(0.5));
            } else {
               cdk.this.g(cdk.this.do().e($$0.a(this.h * 0.05 / $$1)));
               if (cdk.this.q() == null) {
                  emc $$2 = cdk.this.do();
                  cdk.this.r(-((float)aup.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cdk.this.aU = cdk.this.dB();
               } else {
                  double $$3 = cdk.this.q().dq() - cdk.this.dq();
                  double $$4 = cdk.this.q().dw() - cdk.this.dw();
                  cdk.this.r(-((float)aup.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cdk.this.aU = cdk.this.dB();
               }
            }
         }
      }
   }

   class d extends btk {
      public d() {
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean a() {
         return !cdk.this.K().b() && cdk.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         hx $$0 = cdk.this.gf();
         if ($$0 == null) {
            $$0 = cdk.this.dl();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            hx $$2 = $$0.b(cdk.this.ag.a(15) - 7, cdk.this.ag.a(11) - 5, cdk.this.ag.a(15) - 7);
            if (cdk.this.dL().u($$2)) {
               cdk.this.bM.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cdk.this.q() == null) {
                  cdk.this.I().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
