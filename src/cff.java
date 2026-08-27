import java.util.EnumSet;
import javax.annotation.Nullable;

public class cff extends cer implements bpg {
   public static final float b = 45.836624F;
   public static final int c = awi.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aie<Byte> d = aih.a(cff.class, aig.a);
   private static final int e = 1;
   @Nullable
   bok bT;
   @Nullable
   private hz bU;
   private boolean bV;
   private int bW;

   public cff(bnw<? extends cff> $$0, cvr $$1) {
      super($$0, $$1);
      this.bL = new cff.c(this);
      this.bJ = 3;
   }

   @Override
   public boolean aT() {
      return this.ag % c == 0;
   }

   @Override
   public void a(bon $$0, enz $$1) {
      super.a($$0, $$1);
      this.aQ();
   }

   @Override
   public void l() {
      this.ae = true;
      super.l();
      this.ae = false;
      this.e(true);
      if (this.bV && --this.bW <= 0) {
         this.bW = 20;
         this.a(this.dN().i(), 1.0F);
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new buz(this));
      this.bO.a(4, new cff.a());
      this.bO.a(8, new cff.d());
      this.bO.a(9, new bvn(this, chl.class, 3.0F, 1.0F));
      this.bO.a(10, new bvn(this, bok.class, 8.0F));
      this.bP.a(1, new bwx(this, civ.class).a());
      this.bP.a(2, new cff.b(this));
      this.bP.a(3, new bwy<>(this, chl.class, true));
   }

   public static bpo.a u() {
      return cer.gm().a(bpp.n, 14.0).a(bpp.c, 4.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, (byte)0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bU = new hz($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void v(bnq $$0) {
      super.v($$0);
      if ($$0 instanceof cff $$1) {
         this.bT = $$1.A();
      }
   }

   @Override
   public void b(sw $$0) {
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
   public bok A() {
      return this.bT;
   }

   @Nullable
   public hz gg() {
      return this.bU;
   }

   public void i(@Nullable hz $$0) {
      this.bU = $$0;
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

   public boolean gh() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bok $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected atk y() {
      return atl.zT;
   }

   @Override
   protected atk n_() {
      return atl.zV;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.zW;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      awp $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(awp $$0, blu $$1) {
      this.a(bnx.a, new cpd(cpg.oZ));
      this.a(bnx.a, 0.0F);
   }

   class a extends bvf {
      public a() {
         this.a(EnumSet.of(bvf.a.a));
      }

      @Override
      public boolean a() {
         boi $$0 = cff.this.q();
         return $$0 != null && $$0.bx() && !cff.this.K().b() && cff.this.af.a(b(7)) == 0 ? cff.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cff.this.K().b() && cff.this.gh() && cff.this.q() != null && cff.this.q().bx();
      }

      @Override
      public void c() {
         boi $$0 = cff.this.q();
         if ($$0 != null) {
            enz $$1 = $$0.br();
            cff.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cff.this.w(true);
         cff.this.a(atl.zU, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cff.this.w(false);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         boi $$0 = cff.this.q();
         if ($$0 != null) {
            if (cff.this.cH().c($$0.cH())) {
               cff.this.B($$0);
               cff.this.w(false);
            } else {
               double $$1 = cff.this.f($$0);
               if ($$1 < 9.0) {
                  enz $$2 = $$0.br();
                  cff.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bxf {
      private final byy b = byy.b().d().e();

      public b(boq $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cff.this.bT != null && cff.this.bT.q() != null && this.a(cff.this.bT.q(), this.b);
      }

      @Override
      public void c() {
         cff.this.h(cff.this.bT.q());
         super.c();
      }
   }

   class c extends bui {
      public c(cff $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bui.a.b) {
            enz $$0 = new enz(this.e - cff.this.dr(), this.f - cff.this.dt(), this.g - cff.this.dx());
            double $$1 = $$0.f();
            if ($$1 < cff.this.cH().a()) {
               this.k = bui.a.a;
               cff.this.g(cff.this.dp().a(0.5));
            } else {
               cff.this.g(cff.this.dp().e($$0.a(this.h * 0.05 / $$1)));
               if (cff.this.q() == null) {
                  enz $$2 = cff.this.dp();
                  cff.this.r(-((float)awi.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cff.this.aU = cff.this.dC();
               } else {
                  double $$3 = cff.this.q().dr() - cff.this.dr();
                  double $$4 = cff.this.q().dx() - cff.this.dx();
                  cff.this.r(-((float)awi.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cff.this.aU = cff.this.dC();
               }
            }
         }
      }
   }

   class d extends bvf {
      public d() {
         this.a(EnumSet.of(bvf.a.a));
      }

      @Override
      public boolean a() {
         return !cff.this.K().b() && cff.this.af.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         hz $$0 = cff.this.gg();
         if ($$0 == null) {
            $$0 = cff.this.dm();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            hz $$2 = $$0.b(cff.this.af.a(15) - 7, cff.this.af.a(11) - 5, cff.this.af.a(15) - 7);
            if (cff.this.dM().u($$2)) {
               cff.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cff.this.q() == null) {
                  cff.this.I().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
