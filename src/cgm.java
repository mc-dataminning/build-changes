import java.util.EnumSet;
import javax.annotation.Nullable;

public class cgm extends cfy implements bqm {
   public static final float b = 45.836624F;
   public static final int c = aww.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aim<Byte> d = aiq.a(cgm.class, aio.a);
   private static final int e = 1;
   @Nullable
   bpq bX;
   @Nullable
   private ib bY;
   private boolean bZ;
   private int ca;

   public cgm(bpc<? extends cgm> $$0, cwz $$1) {
      super($$0, $$1);
      this.bO = new cgm.c(this);
      this.bM = 3;
   }

   @Override
   public boolean aT() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bpt $$0, epr $$1) {
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
      this.bR.a(0, new bwf(this));
      this.bR.a(4, new cgm.a());
      this.bR.a(8, new cgm.d());
      this.bR.a(9, new bwt(this, cis.class, 3.0F, 1.0F));
      this.bR.a(10, new bwt(this, bpq.class, 8.0F));
      this.bS.a(1, new byd(this, cke.class).a());
      this.bS.a(2, new cgm.b(this));
      this.bS.a(3, new bye<>(this, cis.class, true));
   }

   public static bqu.a r() {
      return cfy.gt().a(bqv.q, 14.0).a(bqv.c, 4.0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bY = new ib($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bow $$0) {
      super.w($$0);
      if ($$0 instanceof cgm $$1) {
         this.bX = $$1.s();
      }
   }

   @Override
   public void b(ta $$0) {
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
   public bpq s() {
      return this.bX;
   }

   @Nullable
   public ib y() {
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

   public boolean gn() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bpq $$0) {
      this.bX = $$0;
   }

   public void b(int $$0) {
      this.bZ = true;
      this.ca = $$0;
   }

   @Override
   protected atx v() {
      return aty.Aj;
   }

   @Override
   protected atx n_() {
      return aty.Al;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.Am;
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      axd $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(axd $$0, bna $$1) {
      this.a(bpd.a, new cqk(cqn.oZ));
      this.a(bpd.a, 0.0F);
   }

   class a extends bwl {
      public a() {
         this.a(EnumSet.of(bwl.a.a));
      }

      @Override
      public boolean a() {
         bpo $$0 = cgm.this.p();
         return $$0 != null && $$0.bA() && !cgm.this.H().b() && cgm.this.ag.a(b(7)) == 0 ? cgm.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cgm.this.H().b() && cgm.this.gn() && cgm.this.p() != null && cgm.this.p().bA();
      }

      @Override
      public void c() {
         bpo $$0 = cgm.this.p();
         if ($$0 != null) {
            epr $$1 = $$0.bu();
            cgm.this.bO.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cgm.this.w(true);
         cgm.this.a(aty.Ak, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cgm.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bpo $$0 = cgm.this.p();
         if ($$0 != null) {
            if (cgm.this.cH().c($$0.cH())) {
               cgm.this.C($$0);
               cgm.this.w(false);
            } else {
               double $$1 = cgm.this.g($$0);
               if ($$1 < 9.0) {
                  epr $$2 = $$0.bu();
                  cgm.this.bO.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends byl {
      private final cae b = cae.b().d().e();

      public b(bpw $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cgm.this.bX != null && cgm.this.bX.p() != null && this.a(cgm.this.bX.p(), this.b);
      }

      @Override
      public void c() {
         cgm.this.h(cgm.this.bX.p());
         super.c();
      }
   }

   class c extends bvo {
      public c(cgm $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bvo.a.b) {
            epr $$0 = new epr(this.e - cgm.this.dr(), this.f - cgm.this.dt(), this.g - cgm.this.dx());
            double $$1 = $$0.f();
            if ($$1 < cgm.this.cH().a()) {
               this.k = bvo.a.a;
               cgm.this.g(cgm.this.dp().a(0.5));
            } else {
               cgm.this.g(cgm.this.dp().e($$0.a(this.h * 0.05 / $$1)));
               if (cgm.this.p() == null) {
                  epr $$2 = cgm.this.dp();
                  cgm.this.r(-((float)aww.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cgm.this.aX = cgm.this.dC();
               } else {
                  double $$3 = cgm.this.p().dr() - cgm.this.dr();
                  double $$4 = cgm.this.p().dx() - cgm.this.dx();
                  cgm.this.r(-((float)aww.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cgm.this.aX = cgm.this.dC();
               }
            }
         }
      }
   }

   class d extends bwl {
      public d() {
         this.a(EnumSet.of(bwl.a.a));
      }

      @Override
      public boolean a() {
         return !cgm.this.H().b() && cgm.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         ib $$0 = cgm.this.y();
         if ($$0 == null) {
            $$0 = cgm.this.dm();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ib $$2 = $$0.b(cgm.this.ag.a(15) - 7, cgm.this.ag.a(11) - 5, cgm.this.ag.a(15) - 7);
            if (cgm.this.dM().u($$2)) {
               cgm.this.bO.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cgm.this.p() == null) {
                  cgm.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
