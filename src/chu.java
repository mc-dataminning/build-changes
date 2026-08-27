import java.util.EnumSet;
import javax.annotation.Nullable;

public class chu extends chg implements brr {
   public static final float b = 45.836624F;
   public static final int c = axm.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aja<Byte> d = aje.a(chu.class, ajc.a);
   private static final int e = 1;
   @Nullable
   bqv bX;
   @Nullable
   private id bY;
   private boolean bZ;
   private int ca;

   public chu(bqg<? extends chu> $$0, czg $$1) {
      super($$0, $$1);
      this.bO = new chu.c(this);
      this.bM = 3;
   }

   @Override
   public boolean aT() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bqy $$0, esj $$1) {
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
      this.bR.a(0, new bxk(this));
      this.bR.a(4, new chu.a());
      this.bR.a(8, new chu.d());
      this.bR.a(9, new bxy(this, cka.class, 3.0F, 1.0F));
      this.bR.a(10, new bxy(this, bqv.class, 8.0F));
      this.bS.a(1, new bzi(this, clm.class).a());
      this.bS.a(2, new chu.b(this));
      this.bS.a(3, new bzj<>(this, cka.class, true));
   }

   public static brz.a r() {
      return chg.gt().a(bsa.q, 14.0).a(bsa.c, 4.0);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bY = new id($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bqa $$0) {
      super.w($$0);
      if ($$0 instanceof chu $$1) {
         this.bX = $$1.y();
      }
   }

   @Override
   public void b(to $$0) {
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
   public bqv y() {
      return this.bX;
   }

   @Nullable
   public id gn() {
      return this.bY;
   }

   public void i(@Nullable id $$0) {
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

   public void a(bqv $$0) {
      this.bX = $$0;
   }

   public void b(int $$0) {
      this.bZ = true;
      this.ca = $$0;
   }

   @Override
   protected aun v() {
      return auo.Ar;
   }

   @Override
   protected aun o_() {
      return auo.At;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.Au;
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      axt $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(axt $$0, bod $$1) {
      this.a(bqh.a, new crs(crv.oZ));
      this.a(bqh.a, 0.0F);
   }

   class a extends bxq {
      public a() {
         this.a(EnumSet.of(bxq.a.a));
      }

      @Override
      public boolean a() {
         bqt $$0 = chu.this.p();
         return $$0 != null && $$0.bA() && !chu.this.H().b() && chu.this.ag.a(b(7)) == 0 ? chu.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return chu.this.H().b() && chu.this.go() && chu.this.p() != null && chu.this.p().bA();
      }

      @Override
      public void c() {
         bqt $$0 = chu.this.p();
         if ($$0 != null) {
            esj $$1 = $$0.bu();
            chu.this.bO.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         chu.this.w(true);
         chu.this.a(auo.As, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         chu.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bqt $$0 = chu.this.p();
         if ($$0 != null) {
            if (chu.this.cH().c($$0.cH())) {
               chu.this.C($$0);
               chu.this.w(false);
            } else {
               double $$1 = chu.this.g($$0);
               if ($$1 < 9.0) {
                  esj $$2 = $$0.bu();
                  chu.this.bO.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bzq {
      private final cbj b = cbj.b().d().e();

      public b(brb $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return chu.this.bX != null && chu.this.bX.p() != null && this.a(chu.this.bX.p(), this.b);
      }

      @Override
      public void c() {
         chu.this.h(chu.this.bX.p());
         super.c();
      }
   }

   class c extends bwt {
      public c(chu $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bwt.a.b) {
            esj $$0 = new esj(this.e - chu.this.dr(), this.f - chu.this.dt(), this.g - chu.this.dx());
            double $$1 = $$0.f();
            if ($$1 < chu.this.cH().a()) {
               this.k = bwt.a.a;
               chu.this.g(chu.this.dp().a(0.5));
            } else {
               chu.this.g(chu.this.dp().e($$0.a(this.h * 0.05 / $$1)));
               if (chu.this.p() == null) {
                  esj $$2 = chu.this.dp();
                  chu.this.r(-((float)axm.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  chu.this.aX = chu.this.dC();
               } else {
                  double $$3 = chu.this.p().dr() - chu.this.dr();
                  double $$4 = chu.this.p().dx() - chu.this.dx();
                  chu.this.r(-((float)axm.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  chu.this.aX = chu.this.dC();
               }
            }
         }
      }
   }

   class d extends bxq {
      public d() {
         this.a(EnumSet.of(bxq.a.a));
      }

      @Override
      public boolean a() {
         return !chu.this.H().b() && chu.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         id $$0 = chu.this.gn();
         if ($$0 == null) {
            $$0 = chu.this.dm();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            id $$2 = $$0.b(chu.this.ag.a(15) - 7, chu.this.ag.a(11) - 5, chu.this.ag.a(15) - 7);
            if (chu.this.dM().u($$2)) {
               chu.this.bO.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (chu.this.p() == null) {
                  chu.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
