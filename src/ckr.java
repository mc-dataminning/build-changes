import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckr extends ckd implements bun {
   public static final float b = 45.836624F;
   public static final int c = ayo.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajw<Byte> d = aka.a(ckr.class, ajy.a);
   private static final int e = 1;
   @Nullable
   btp cc;
   @Nullable
   private jd cd;
   private boolean ce;
   private int cf;

   public ckr(bsx<? extends ckr> $$0, dcw $$1) {
      super($$0, $$1);
      this.bT = new ckr.c(this);
      this.bR = 3;
   }

   @Override
   public boolean aW() {
      return this.ai % c == 0;
   }

   @Override
   public void a(bts $$0, exc $$1) {
      super.a($$0, $$1);
      this.aT();
   }

   @Override
   public void l() {
      this.ag = true;
      super.l();
      this.ag = false;
      this.f(true);
      if (this.ce && --this.cf <= 0) {
         this.cf = 20;
         this.a(this.dP().j(), 1.0F);
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bW.a(0, new cag(this));
      this.bW.a(4, new ckr.a());
      this.bW.a(8, new ckr.d());
      this.bW.a(9, new cau(this, cmx.class, 3.0F, 1.0F));
      this.bW.a(10, new cau(this, btp.class, 8.0F));
      this.bX.a(1, new cce(this, coj.class).a());
      this.bX.a(2, new ckr.b(this));
      this.bX.a(3, new ccf<>(this, cmx.class, true));
   }

   public static buv.a t() {
      return ckd.gq().a(buw.s, 14.0).a(buw.c, 4.0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.cd = new jd($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bsr $$0) {
      super.w($$0);
      if ($$0 instanceof ckr $$1) {
         this.cc = $$1.x();
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      if (this.cd != null) {
         $$0.a("BoundX", this.cd.u());
         $$0.a("BoundY", this.cd.v());
         $$0.a("BoundZ", this.cd.w());
      }

      if (this.ce) {
         $$0.a("LifeTicks", this.cf);
      }
   }

   @Nullable
   public btp x() {
      return this.cc;
   }

   @Nullable
   public jd gk() {
      return this.cd;
   }

   public void h(@Nullable jd $$0) {
      this.cd = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.ao.a(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.ao.a(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.ao.a(d, (byte)($$2 & 0xFF));
   }

   public boolean gl() {
      return this.c(1);
   }

   public void x(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(btp $$0) {
      this.cc = $$0;
   }

   public void b(int $$0) {
      this.ce = true;
      this.cf = $$0;
   }

   @Override
   protected avo v() {
      return avp.AO;
   }

   @Override
   protected avo n_() {
      return avp.AQ;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.AR;
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      ayw $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayw $$0, bqp $$1) {
      this.a(bsy.a, new cuq(cut.pb));
      this.a(bsy.a, 0.0F);
   }

   class a extends cam {
      public a() {
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         btn $$0 = ckr.this.p();
         return $$0 != null && $$0.bE() && !ckr.this.J().b() && ckr.this.ah.a(b(7)) == 0 ? ckr.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return ckr.this.J().b() && ckr.this.gl() && ckr.this.p() != null && ckr.this.p().bE();
      }

      @Override
      public void d() {
         btn $$0 = ckr.this.p();
         if ($$0 != null) {
            exc $$1 = $$0.by();
            ckr.this.bT.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         ckr.this.x(true);
         ckr.this.a(avp.AP, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         ckr.this.x(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         btn $$0 = ckr.this.p();
         if ($$0 != null) {
            if (ckr.this.cK().c($$0.cK())) {
               ckr.this.D($$0);
               ckr.this.x(false);
            } else {
               double $$1 = ckr.this.g($$0);
               if ($$1 < 9.0) {
                  exc $$2 = $$0.by();
                  ckr.this.bT.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends ccm {
      private final cef b = cef.b().d().e();

      public b(final btw $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return ckr.this.cc != null && ckr.this.cc.p() != null && this.a(ckr.this.cc.p(), this.b);
      }

      @Override
      public void d() {
         ckr.this.h(ckr.this.cc.p());
         super.d();
      }
   }

   class c extends bzp {
      public c(final ckr $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bzp.a.b) {
            exc $$0 = new exc(this.e - ckr.this.dt(), this.f - ckr.this.dv(), this.g - ckr.this.dz());
            double $$1 = $$0.f();
            if ($$1 < ckr.this.cK().a()) {
               this.k = bzp.a.a;
               ckr.this.i(ckr.this.dr().a(0.5));
            } else {
               ckr.this.i(ckr.this.dr().e($$0.a(this.h * 0.05 / $$1)));
               if (ckr.this.p() == null) {
                  exc $$2 = ckr.this.dr();
                  ckr.this.t(-((float)ayo.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  ckr.this.aY = ckr.this.dE();
               } else {
                  double $$3 = ckr.this.p().dt() - ckr.this.dt();
                  double $$4 = ckr.this.p().dz() - ckr.this.dz();
                  ckr.this.t(-((float)ayo.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  ckr.this.aY = ckr.this.dE();
               }
            }
         }
      }
   }

   class d extends cam {
      public d() {
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         return !ckr.this.J().b() && ckr.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         jd $$0 = ckr.this.gk();
         if ($$0 == null) {
            $$0 = ckr.this.do();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            jd $$2 = $$0.b(ckr.this.ah.a(15) - 7, ckr.this.ah.a(11) - 5, ckr.this.ah.a(15) - 7);
            if (ckr.this.dO().u($$2)) {
               ckr.this.bT.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (ckr.this.p() == null) {
                  ckr.this.I().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
