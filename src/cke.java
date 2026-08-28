import java.util.EnumSet;
import javax.annotation.Nullable;

public class cke extends cjq implements bua {
   public static final float b = 45.836624F;
   public static final int c = ayg.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajp<Byte> d = ajt.a(cke.class, ajr.a);
   private static final int e = 1;
   @Nullable
   btd ca;
   @Nullable
   private ja cb;
   private boolean cc;
   private int cd;

   public cke(bsm<? extends cke> $$0, dcf $$1) {
      super($$0, $$1);
      this.bR = new cke.c(this);
      this.bP = 3;
   }

   @Override
   public boolean aW() {
      return this.ai % c == 0;
   }

   @Override
   public void a(btg $$0, ewf $$1) {
      super.a($$0, $$1);
      this.aT();
   }

   @Override
   public void l() {
      this.ag = true;
      super.l();
      this.ag = false;
      this.f(true);
      if (this.cc && --this.cd <= 0) {
         this.cd = 20;
         this.a(this.dR().j(), 1.0F);
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzt(this));
      this.bU.a(4, new cke.a());
      this.bU.a(8, new cke.d());
      this.bU.a(9, new cah(this, cmk.class, 3.0F, 1.0F));
      this.bU.a(10, new cah(this, btd.class, 8.0F));
      this.bV.a(1, new cbr(this, cnw.class).a());
      this.bV.a(2, new cke.b(this));
      this.bV.a(3, new cbs<>(this, cmk.class, true));
   }

   public static bui.a u() {
      return cjq.gu().a(buj.s, 14.0).a(buj.c, 4.0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.cb = new ja($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bsg $$0) {
      super.w($$0);
      if ($$0 instanceof cke $$1) {
         this.ca = $$1.y();
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.cb != null) {
         $$0.a("BoundX", this.cb.u());
         $$0.a("BoundY", this.cb.v());
         $$0.a("BoundZ", this.cb.w());
      }

      if (this.cc) {
         $$0.a("LifeTicks", this.cd);
      }
   }

   @Nullable
   public btd y() {
      return this.ca;
   }

   @Nullable
   public ja go() {
      return this.cb;
   }

   public void h(@Nullable ja $$0) {
      this.cb = $$0;
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

   public boolean gp() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(btd $$0) {
      this.ca = $$0;
   }

   public void b(int $$0) {
      this.cc = true;
      this.cd = $$0;
   }

   @Override
   protected avg v() {
      return avh.AN;
   }

   @Override
   protected avg o_() {
      return avh.AP;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.AQ;
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      ayo $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayo $$0, bqe $$1) {
      this.a(bsn.a, new cuc(cuf.pb));
      this.a(bsn.a, 0.0F);
   }

   class a extends bzz {
      public a() {
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean a() {
         btb $$0 = cke.this.p();
         return $$0 != null && $$0.bE() && !cke.this.H().b() && cke.this.ah.a(b(7)) == 0 ? cke.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cke.this.H().b() && cke.this.gp() && cke.this.p() != null && cke.this.p().bE();
      }

      @Override
      public void c() {
         btb $$0 = cke.this.p();
         if ($$0 != null) {
            ewf $$1 = $$0.by();
            cke.this.bR.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cke.this.w(true);
         cke.this.a(avh.AO, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cke.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         btb $$0 = cke.this.p();
         if ($$0 != null) {
            if (cke.this.cL().c($$0.cL())) {
               cke.this.D($$0);
               cke.this.w(false);
            } else {
               double $$1 = cke.this.g($$0);
               if ($$1 < 9.0) {
                  ewf $$2 = $$0.by();
                  cke.this.bR.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends cbz {
      private final cds b = cds.b().d().e();

      public b(final btk $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cke.this.ca != null && cke.this.ca.p() != null && this.a(cke.this.ca.p(), this.b);
      }

      @Override
      public void c() {
         cke.this.h(cke.this.ca.p());
         super.c();
      }
   }

   class c extends bzc {
      public c(final cke $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bzc.a.b) {
            ewf $$0 = new ewf(this.e - cke.this.dv(), this.f - cke.this.dx(), this.g - cke.this.dB());
            double $$1 = $$0.f();
            if ($$1 < cke.this.cL().a()) {
               this.k = bzc.a.a;
               cke.this.i(cke.this.dt().a(0.5));
            } else {
               cke.this.i(cke.this.dt().e($$0.a(this.h * 0.05 / $$1)));
               if (cke.this.p() == null) {
                  ewf $$2 = cke.this.dt();
                  cke.this.s(-((float)ayg.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cke.this.aY = cke.this.dG();
               } else {
                  double $$3 = cke.this.p().dv() - cke.this.dv();
                  double $$4 = cke.this.p().dB() - cke.this.dB();
                  cke.this.s(-((float)ayg.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cke.this.aY = cke.this.dG();
               }
            }
         }
      }
   }

   class d extends bzz {
      public d() {
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean a() {
         return !cke.this.H().b() && cke.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         ja $$0 = cke.this.go();
         if ($$0 == null) {
            $$0 = cke.this.dq();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ja $$2 = $$0.b(cke.this.ah.a(15) - 7, cke.this.ah.a(11) - 5, cke.this.ah.a(15) - 7);
            if (cke.this.dQ().u($$2)) {
               cke.this.bR.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cke.this.p() == null) {
                  cke.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
