import java.util.EnumSet;
import javax.annotation.Nullable;

public class cfu extends cfg implements bpv {
   public static final float b = 45.836624F;
   public static final int c = awm.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aii<Byte> d = ail.a(cfu.class, aik.a);
   private static final int e = 1;
   @Nullable
   boz bV;
   @Nullable
   private ib bW;
   private boolean bX;
   private int bY;

   public cfu(bol<? extends cfu> $$0, cwe $$1) {
      super($$0, $$1);
      this.bM = new cfu.c(this);
      this.bK = 3;
   }

   @Override
   public boolean aT() {
      return this.ag % c == 0;
   }

   @Override
   public void a(bpc $$0, eov $$1) {
      super.a($$0, $$1);
      this.aQ();
   }

   @Override
   public void l() {
      this.ae = true;
      super.l();
      this.ae = false;
      this.e(true);
      if (this.bX && --this.bY <= 0) {
         this.bY = 20;
         this.a(this.dK().i(), 1.0F);
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bvo(this));
      this.bP.a(4, new cfu.a());
      this.bP.a(8, new cfu.d());
      this.bP.a(9, new bwc(this, cia.class, 3.0F, 1.0F));
      this.bP.a(10, new bwc(this, boz.class, 8.0F));
      this.bQ.a(1, new bxm(this, cjk.class).a());
      this.bQ.a(2, new cfu.b(this));
      this.bQ.a(3, new bxn<>(this, cia.class, true));
   }

   public static bqd.a u() {
      return cfg.gr().a(bqe.n, 14.0).a(bqe.c, 4.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, (byte)0);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bW = new ib($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void v(bof $$0) {
      super.v($$0);
      if ($$0 instanceof cfu $$1) {
         this.bV = $$1.A();
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      if (this.bW != null) {
         $$0.a("BoundX", this.bW.u());
         $$0.a("BoundY", this.bW.v());
         $$0.a("BoundZ", this.bW.w());
      }

      if (this.bX) {
         $$0.a("LifeTicks", this.bY);
      }
   }

   @Nullable
   public boz A() {
      return this.bV;
   }

   @Nullable
   public ib gl() {
      return this.bW;
   }

   public void i(@Nullable ib $$0) {
      this.bW = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.am.b(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.am.b(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.am.b(d, (byte)($$2 & 0xFF));
   }

   public boolean gm() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(boz $$0) {
      this.bV = $$0;
   }

   public void b(int $$0) {
      this.bX = true;
      this.bY = $$0;
   }

   @Override
   protected ato y() {
      return atp.Ag;
   }

   @Override
   protected ato n_() {
      return atp.Ai;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.Aj;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      awt $$4 = $$0.F_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(awt $$0, bmj $$1) {
      this.a(bom.a, new cpq(cpt.oZ));
      this.a(bom.a, 0.0F);
   }

   class a extends bvu {
      public a() {
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean a() {
         box $$0 = cfu.this.q();
         return $$0 != null && $$0.bx() && !cfu.this.K().b() && cfu.this.af.a(b(7)) == 0 ? cfu.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cfu.this.K().b() && cfu.this.gm() && cfu.this.q() != null && cfu.this.q().bx();
      }

      @Override
      public void c() {
         box $$0 = cfu.this.q();
         if ($$0 != null) {
            eov $$1 = $$0.br();
            cfu.this.bM.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cfu.this.w(true);
         cfu.this.a(atp.Ah, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cfu.this.w(false);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         box $$0 = cfu.this.q();
         if ($$0 != null) {
            if (cfu.this.cE().c($$0.cE())) {
               cfu.this.B($$0);
               cfu.this.w(false);
            } else {
               double $$1 = cfu.this.f($$0);
               if ($$1 < 9.0) {
                  eov $$2 = $$0.br();
                  cfu.this.bM.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bxu {
      private final bzn b = bzn.b().d().e();

      public b(bpf $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cfu.this.bV != null && cfu.this.bV.q() != null && this.a(cfu.this.bV.q(), this.b);
      }

      @Override
      public void c() {
         cfu.this.h(cfu.this.bV.q());
         super.c();
      }
   }

   class c extends bux {
      public c(cfu $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bux.a.b) {
            eov $$0 = new eov(this.e - cfu.this.do(), this.f - cfu.this.dq(), this.g - cfu.this.du());
            double $$1 = $$0.f();
            if ($$1 < cfu.this.cE().a()) {
               this.k = bux.a.a;
               cfu.this.g(cfu.this.dm().a(0.5));
            } else {
               cfu.this.g(cfu.this.dm().e($$0.a(this.h * 0.05 / $$1)));
               if (cfu.this.q() == null) {
                  eov $$2 = cfu.this.dm();
                  cfu.this.r(-((float)awm.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cfu.this.aV = cfu.this.dz();
               } else {
                  double $$3 = cfu.this.q().do() - cfu.this.do();
                  double $$4 = cfu.this.q().du() - cfu.this.du();
                  cfu.this.r(-((float)awm.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cfu.this.aV = cfu.this.dz();
               }
            }
         }
      }
   }

   class d extends bvu {
      public d() {
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean a() {
         return !cfu.this.K().b() && cfu.this.af.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         ib $$0 = cfu.this.gl();
         if ($$0 == null) {
            $$0 = cfu.this.dj();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ib $$2 = $$0.b(cfu.this.af.a(15) - 7, cfu.this.af.a(11) - 5, cfu.this.af.a(15) - 7);
            if (cfu.this.dJ().u($$2)) {
               cfu.this.bM.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cfu.this.q() == null) {
                  cfu.this.I().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
