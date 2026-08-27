import java.util.EnumSet;
import javax.annotation.Nullable;

public class cfb extends cen implements bpc {
   public static final float b = 45.836624F;
   public static final int c = awh.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aie<Byte> d = aih.a(cfb.class, aig.a);
   private static final int e = 1;
   @Nullable
   boi bT;
   @Nullable
   private hz bU;
   private boolean bV;
   private int bW;

   public cfb(bnu<? extends cfb> $$0, cvn $$1) {
      super($$0, $$1);
      this.bL = new cfb.c(this);
      this.bJ = 3;
   }

   @Override
   public boolean aT() {
      return this.ag % c == 0;
   }

   @Override
   public void a(bol $$0, ens $$1) {
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
      this.bO.a(0, new buv(this));
      this.bO.a(4, new cfb.a());
      this.bO.a(8, new cfb.d());
      this.bO.a(9, new bvj(this, chh.class, 3.0F, 1.0F));
      this.bO.a(10, new bvj(this, boi.class, 8.0F));
      this.bP.a(1, new bwt(this, cir.class).a());
      this.bP.a(2, new cfb.b(this));
      this.bP.a(3, new bwu<>(this, chh.class, true));
   }

   public static bpk.a u() {
      return cen.gm().a(bpl.n, 14.0).a(bpl.c, 4.0);
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
   public void v(bno $$0) {
      super.v($$0);
      if ($$0 instanceof cfb $$1) {
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
   public boi A() {
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

   public void a(boi $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected atj y() {
      return atk.zS;
   }

   @Override
   protected atj n_() {
      return atk.zU;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.zV;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      awo $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(awo $$0, bls $$1) {
      this.a(bnv.a, new coz(cpc.oZ));
      this.a(bnv.a, 0.0F);
   }

   class a extends bvb {
      public a() {
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public boolean a() {
         bog $$0 = cfb.this.q();
         return $$0 != null && $$0.bx() && !cfb.this.K().b() && cfb.this.af.a(b(7)) == 0 ? cfb.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cfb.this.K().b() && cfb.this.gh() && cfb.this.q() != null && cfb.this.q().bx();
      }

      @Override
      public void c() {
         bog $$0 = cfb.this.q();
         if ($$0 != null) {
            ens $$1 = $$0.br();
            cfb.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cfb.this.w(true);
         cfb.this.a(atk.zT, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cfb.this.w(false);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         bog $$0 = cfb.this.q();
         if ($$0 != null) {
            if (cfb.this.cH().c($$0.cH())) {
               cfb.this.B($$0);
               cfb.this.w(false);
            } else {
               double $$1 = cfb.this.f($$0);
               if ($$1 < 9.0) {
                  ens $$2 = $$0.br();
                  cfb.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bxb {
      private final byu b = byu.b().d().e();

      public b(boo $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cfb.this.bT != null && cfb.this.bT.q() != null && this.a(cfb.this.bT.q(), this.b);
      }

      @Override
      public void c() {
         cfb.this.h(cfb.this.bT.q());
         super.c();
      }
   }

   class c extends bue {
      public c(cfb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bue.a.b) {
            ens $$0 = new ens(this.e - cfb.this.dr(), this.f - cfb.this.dt(), this.g - cfb.this.dx());
            double $$1 = $$0.f();
            if ($$1 < cfb.this.cH().a()) {
               this.k = bue.a.a;
               cfb.this.g(cfb.this.dp().a(0.5));
            } else {
               cfb.this.g(cfb.this.dp().e($$0.a(this.h * 0.05 / $$1)));
               if (cfb.this.q() == null) {
                  ens $$2 = cfb.this.dp();
                  cfb.this.r(-((float)awh.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cfb.this.aU = cfb.this.dC();
               } else {
                  double $$3 = cfb.this.q().dr() - cfb.this.dr();
                  double $$4 = cfb.this.q().dx() - cfb.this.dx();
                  cfb.this.r(-((float)awh.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cfb.this.aU = cfb.this.dC();
               }
            }
         }
      }
   }

   class d extends bvb {
      public d() {
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public boolean a() {
         return !cfb.this.K().b() && cfb.this.af.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         hz $$0 = cfb.this.gg();
         if ($$0 == null) {
            $$0 = cfb.this.dm();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            hz $$2 = $$0.b(cfb.this.af.a(15) - 7, cfb.this.af.a(11) - 5, cfb.this.af.a(15) - 7);
            if (cfb.this.dM().u($$2)) {
               cfb.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cfb.this.q() == null) {
                  cfb.this.I().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
