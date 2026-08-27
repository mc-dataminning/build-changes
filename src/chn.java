import java.util.EnumSet;
import javax.annotation.Nullable;

public class chn extends cgz implements brm {
   public static final float b = 45.836624F;
   public static final int c = axk.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aiy<Byte> d = ajc.a(chn.class, aja.a);
   private static final int e = 1;
   @Nullable
   bqq bX;
   @Nullable
   private ib bY;
   private boolean bZ;
   private int ca;

   public chn(bqb<? extends chn> $$0, cyx $$1) {
      super($$0, $$1);
      this.bO = new chn.c(this);
      this.bM = 3;
   }

   @Override
   public boolean aT() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bqt $$0, esa $$1) {
      super.a($$0, $$1);
      this.aQ();
   }

   @Override
   public void l() {
      this.af = true;
      super.l();
      this.af = false;
      this.e(true);
      if (this.bZ && --this.ca <= 0) {
         this.ca = 20;
         this.a(this.dN().i(), 1.0F);
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bxf(this));
      this.bR.a(4, new chn.a());
      this.bR.a(8, new chn.d());
      this.bR.a(9, new bxt(this, cjt.class, 3.0F, 1.0F));
      this.bR.a(10, new bxt(this, bqq.class, 8.0F));
      this.bS.a(1, new bzd(this, clf.class).a());
      this.bS.a(2, new chn.b(this));
      this.bS.a(3, new bze<>(this, cjt.class, true));
   }

   public static bru.a r() {
      return cgz.gt().a(brv.q, 14.0).a(brv.c, 4.0);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bY = new ib($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bpv $$0) {
      super.w($$0);
      if ($$0 instanceof chn $$1) {
         this.bX = $$1.y();
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      if (this.bY != null) {
         $$0.a("BoundX", this.bY.u());
         $$0.a("BoundY", this.bY.v());
         $$0.a("BoundZ", this.bY.w());
      }

      if (this.bZ) {
         $$0.a("LifeTicks", this.ca);
      }
   }

   @Nullable
   public bqq y() {
      return this.bX;
   }

   @Nullable
   public ib gn() {
      return this.bY;
   }

   public void i(@Nullable ib $$0) {
      this.bY = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.an.a(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.an.a(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.an.a(d, (byte)($$2 & 0xFF));
   }

   public boolean go() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bqq $$0) {
      this.bX = $$0;
   }

   public void b(int $$0) {
      this.bZ = true;
      this.ca = $$0;
   }

   @Override
   protected aul v() {
      return aum.Ar;
   }

   @Override
   protected aul o_() {
      return aum.At;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.Au;
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      axr $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(axr $$0, bny $$1) {
      this.a(bqc.a, new crj(crm.oZ));
      this.a(bqc.a, 0.0F);
   }

   class a extends bxl {
      public a() {
         this.a(EnumSet.of(bxl.a.a));
      }

      @Override
      public boolean a() {
         bqo $$0 = chn.this.p();
         return $$0 != null && $$0.bA() && !chn.this.H().b() && chn.this.ag.a(b(7)) == 0 ? chn.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return chn.this.H().b() && chn.this.go() && chn.this.p() != null && chn.this.p().bA();
      }

      @Override
      public void c() {
         bqo $$0 = chn.this.p();
         if ($$0 != null) {
            esa $$1 = $$0.bu();
            chn.this.bO.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         chn.this.w(true);
         chn.this.a(aum.As, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         chn.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bqo $$0 = chn.this.p();
         if ($$0 != null) {
            if (chn.this.cH().c($$0.cH())) {
               chn.this.C($$0);
               chn.this.w(false);
            } else {
               double $$1 = chn.this.g($$0);
               if ($$1 < 9.0) {
                  esa $$2 = $$0.bu();
                  chn.this.bO.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bzl {
      private final cbe b = cbe.b().d().e();

      public b(bqw $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return chn.this.bX != null && chn.this.bX.p() != null && this.a(chn.this.bX.p(), this.b);
      }

      @Override
      public void c() {
         chn.this.h(chn.this.bX.p());
         super.c();
      }
   }

   class c extends bwo {
      public c(chn $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bwo.a.b) {
            esa $$0 = new esa(this.e - chn.this.dr(), this.f - chn.this.dt(), this.g - chn.this.dx());
            double $$1 = $$0.f();
            if ($$1 < chn.this.cH().a()) {
               this.k = bwo.a.a;
               chn.this.g(chn.this.dp().a(0.5));
            } else {
               chn.this.g(chn.this.dp().e($$0.a(this.h * 0.05 / $$1)));
               if (chn.this.p() == null) {
                  esa $$2 = chn.this.dp();
                  chn.this.r(-((float)axk.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  chn.this.aX = chn.this.dC();
               } else {
                  double $$3 = chn.this.p().dr() - chn.this.dr();
                  double $$4 = chn.this.p().dx() - chn.this.dx();
                  chn.this.r(-((float)axk.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  chn.this.aX = chn.this.dC();
               }
            }
         }
      }
   }

   class d extends bxl {
      public d() {
         this.a(EnumSet.of(bxl.a.a));
      }

      @Override
      public boolean a() {
         return !chn.this.H().b() && chn.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         ib $$0 = chn.this.gn();
         if ($$0 == null) {
            $$0 = chn.this.dm();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ib $$2 = $$0.b(chn.this.ag.a(15) - 7, chn.this.ag.a(11) - 5, chn.this.ag.a(15) - 7);
            if (chn.this.dM().u($$2)) {
               chn.this.bO.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (chn.this.p() == null) {
                  chn.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
