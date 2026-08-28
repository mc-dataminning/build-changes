import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckf extends cjr implements bub {
   public static final float b = 45.836624F;
   public static final int c = ayg.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajp<Byte> d = ajt.a(ckf.class, ajr.a);
   private static final int e = 1;
   @Nullable
   bte ca;
   @Nullable
   private ja cb;
   private boolean cc;
   private int cd;

   public ckf(bsn<? extends ckf> $$0, dcg $$1) {
      super($$0, $$1);
      this.bR = new ckf.c(this);
      this.bP = 3;
   }

   @Override
   public boolean aX() {
      return this.ai % c == 0;
   }

   @Override
   public void a(bth $$0, ewh $$1) {
      super.a($$0, $$1);
      this.aU();
   }

   @Override
   public void l() {
      this.ag = true;
      super.l();
      this.ag = false;
      this.g(true);
      if (this.cc && --this.cd <= 0) {
         this.cd = 20;
         this.a(this.dS().j(), 1.0F);
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzu(this));
      this.bU.a(4, new ckf.a());
      this.bU.a(8, new ckf.d());
      this.bU.a(9, new cai(this, cml.class, 3.0F, 1.0F));
      this.bU.a(10, new cai(this, bte.class, 8.0F));
      this.bV.a(1, new cbs(this, cnx.class).a());
      this.bV.a(2, new ckf.b(this));
      this.bV.a(3, new cbt<>(this, cml.class, true));
   }

   public static buj.a t() {
      return cjr.gt().a(buk.s, 14.0).a(buk.c, 4.0);
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
   public void w(bsh $$0) {
      super.w($$0);
      if ($$0 instanceof ckf $$1) {
         this.ca = $$1.x();
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
   public bte x() {
      return this.ca;
   }

   @Nullable
   public ja gn() {
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

   public boolean go() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bte $$0) {
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
   protected avg n_() {
      return avh.AP;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.AQ;
   }

   @Override
   public float bv() {
      return 1.0F;
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      ayo $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayo $$0, bqf $$1) {
      this.a(bso.a, new cud(cug.pb));
      this.a(bso.a, 0.0F);
   }

   class a extends caa {
      public a() {
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean a() {
         btc $$0 = ckf.this.p();
         return $$0 != null && $$0.bF() && !ckf.this.H().b() && ckf.this.ah.a(b(7)) == 0 ? ckf.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return ckf.this.H().b() && ckf.this.go() && ckf.this.p() != null && ckf.this.p().bF();
      }

      @Override
      public void c() {
         btc $$0 = ckf.this.p();
         if ($$0 != null) {
            ewh $$1 = $$0.bz();
            ckf.this.bR.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         ckf.this.w(true);
         ckf.this.a(avh.AO, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         ckf.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         btc $$0 = ckf.this.p();
         if ($$0 != null) {
            if (ckf.this.cM().c($$0.cM())) {
               ckf.this.D($$0);
               ckf.this.w(false);
            } else {
               double $$1 = ckf.this.g($$0);
               if ($$1 < 9.0) {
                  ewh $$2 = $$0.bz();
                  ckf.this.bR.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends cca {
      private final cdt b = cdt.b().d().e();

      public b(final btl $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return ckf.this.ca != null && ckf.this.ca.p() != null && this.a(ckf.this.ca.p(), this.b);
      }

      @Override
      public void c() {
         ckf.this.h(ckf.this.ca.p());
         super.c();
      }
   }

   class c extends bzd {
      public c(final ckf $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bzd.a.b) {
            ewh $$0 = new ewh(this.e - ckf.this.dw(), this.f - ckf.this.dy(), this.g - ckf.this.dC());
            double $$1 = $$0.f();
            if ($$1 < ckf.this.cM().a()) {
               this.k = bzd.a.a;
               ckf.this.j(ckf.this.du().a(0.5));
            } else {
               ckf.this.j(ckf.this.du().e($$0.a(this.h * 0.05 / $$1)));
               if (ckf.this.p() == null) {
                  ewh $$2 = ckf.this.du();
                  ckf.this.s(-((float)ayg.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  ckf.this.aZ = ckf.this.dH();
               } else {
                  double $$3 = ckf.this.p().dw() - ckf.this.dw();
                  double $$4 = ckf.this.p().dC() - ckf.this.dC();
                  ckf.this.s(-((float)ayg.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  ckf.this.aZ = ckf.this.dH();
               }
            }
         }
      }
   }

   class d extends caa {
      public d() {
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean a() {
         return !ckf.this.H().b() && ckf.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         ja $$0 = ckf.this.gn();
         if ($$0 == null) {
            $$0 = ckf.this.dr();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ja $$2 = $$0.b(ckf.this.ah.a(15) - 7, ckf.this.ah.a(11) - 5, ckf.this.ah.a(15) - 7);
            if (ckf.this.dR().u($$2)) {
               ckf.this.bR.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (ckf.this.p() == null) {
                  ckf.this.F().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
