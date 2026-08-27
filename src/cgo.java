import java.util.EnumSet;
import javax.annotation.Nullable;

public class cgo extends cga implements bqn {
   public static final float b = 45.836624F;
   public static final int c = aww.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aim<Byte> d = aiq.a(cgo.class, aio.a);
   private static final int e = 1;
   @Nullable
   bpr bX;
   @Nullable
   private ib bY;
   private boolean bZ;
   private int ca;

   public cgo(bpd<? extends cgo> $$0, cxb $$1) {
      super($$0, $$1);
      this.bO = new cgo.c(this);
      this.bM = 3;
   }

   @Override
   public boolean aT() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bpu $$0, ept $$1) {
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
      this.bR.a(0, new bwg(this));
      this.bR.a(4, new cgo.a());
      this.bR.a(8, new cgo.d());
      this.bR.a(9, new bwu(this, ciu.class, 3.0F, 1.0F));
      this.bR.a(10, new bwu(this, bpr.class, 8.0F));
      this.bS.a(1, new bye(this, ckg.class).a());
      this.bS.a(2, new cgo.b(this));
      this.bS.a(3, new byf<>(this, ciu.class, true));
   }

   public static bqv.a r() {
      return cga.gt().a(bqw.q, 14.0).a(bqw.c, 4.0);
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
   public void w(box $$0) {
      super.w($$0);
      if ($$0 instanceof cgo $$1) {
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
   public bpr s() {
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

   public void a(bpr $$0) {
      this.bX = $$0;
   }

   public void b(int $$0) {
      this.bZ = true;
      this.ca = $$0;
   }

   @Override
   protected atx v() {
      return aty.Ao;
   }

   @Override
   protected atx n_() {
      return aty.Aq;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.Ar;
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      axd $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(axd $$0, bnb $$1) {
      this.a(bpe.a, new cqm(cqp.oZ));
      this.a(bpe.a, 0.0F);
   }

   class a extends bwm {
      public a() {
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public boolean a() {
         bpp $$0 = cgo.this.p();
         return $$0 != null && $$0.bA() && !cgo.this.H().b() && cgo.this.ag.a(b(7)) == 0 ? cgo.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cgo.this.H().b() && cgo.this.gn() && cgo.this.p() != null && cgo.this.p().bA();
      }

      @Override
      public void c() {
         bpp $$0 = cgo.this.p();
         if ($$0 != null) {
            ept $$1 = $$0.bu();
            cgo.this.bO.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cgo.this.w(true);
         cgo.this.a(aty.Ap, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cgo.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bpp $$0 = cgo.this.p();
         if ($$0 != null) {
            if (cgo.this.cH().c($$0.cH())) {
               cgo.this.C($$0);
               cgo.this.w(false);
            } else {
               double $$1 = cgo.this.g($$0);
               if ($$1 < 9.0) {
                  ept $$2 = $$0.bu();
                  cgo.this.bO.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bym {
      private final caf b = caf.b().d().e();

      public b(bpx $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cgo.this.bX != null && cgo.this.bX.p() != null && this.a(cgo.this.bX.p(), this.b);
      }

      @Override
      public void c() {
         cgo.this.h(cgo.this.bX.p());
         super.c();
      }
   }

   class c extends bvp {
      public c(cgo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bvp.a.b) {
            ept $$0 = new ept(this.e - cgo.this.dr(), this.f - cgo.this.dt(), this.g - cgo.this.dx());
            double $$1 = $$0.f();
            if ($$1 < cgo.this.cH().a()) {
               this.k = bvp.a.a;
               cgo.this.g(cgo.this.dp().a(0.5));
            } else {
               cgo.this.g(cgo.this.dp().e($$0.a(this.h * 0.05 / $$1)));
               if (cgo.this.p() == null) {
                  ept $$2 = cgo.this.dp();
                  cgo.this.r(-((float)aww.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cgo.this.aX = cgo.this.dC();
               } else {
                  double $$3 = cgo.this.p().dr() - cgo.this.dr();
                  double $$4 = cgo.this.p().dx() - cgo.this.dx();
                  cgo.this.r(-((float)aww.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cgo.this.aX = cgo.this.dC();
               }
            }
         }
      }
   }

   class d extends bwm {
      public d() {
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public boolean a() {
         return !cgo.this.H().b() && cgo.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         ib $$0 = cgo.this.y();
         if ($$0 == null) {
            $$0 = cgo.this.dm();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ib $$2 = $$0.b(cgo.this.ag.a(15) - 7, cgo.this.ag.a(11) - 5, cgo.this.ag.a(15) - 7);
            if (cgo.this.dM().u($$2)) {
               cgo.this.bO.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cgo.this.p() == null) {
                  cgo.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
