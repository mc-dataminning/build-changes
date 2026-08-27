import java.util.UUID;
import javax.annotation.Nullable;

public class cal extends bzt implements bom {
   private static final aie<Boolean> bT = aih.a(cal.class, aig.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final blf bZ = axh.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cal(bnu<? extends cal> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bnj a(aov $$0, bnj $$1) {
      return bnu.aB.a((cvn)$$0);
   }

   @Override
   public boolean m(coz $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new buv(this));
      this.bO.a(1, new cal.c());
      this.bO.a(1, new cal.d());
      this.bO.a(4, new bva(this, 1.25));
      this.bO.a(5, new bvy(this, 1.0));
      this.bO.a(6, new bvj(this, chh.class, 6.0F));
      this.bO.a(7, new bvw(this));
      this.bP.a(1, new cal.b());
      this.bP.a(2, new cal.a());
      this.bP.a(3, new bwu<>(this, chh.class, 10, true, false, this::a_));
      this.bP.a(4, new bwu<>(this, cad.class, 10, true, true, null));
      this.bP.a(5, new bxa<>(this, false));
   }

   public static bpk.a u() {
      return boi.C().a(bpl.n, 30.0).a(bpl.i, 20.0).a(bpl.o, 0.25).a(bpl.c, 6.0);
   }

   public static boolean c(bnu<cal> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      ij<cwm> $$5 = $$1.t($$3);
      return !$$5.a(aty.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(atz.bV);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a(this.dM(), $$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.af));
   }

   @Override
   public void a(int $$0) {
      this.ca = $$0;
   }

   @Override
   public int a() {
      return this.ca;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   protected atj y() {
      return this.o_() ? atk.tP : atk.tO;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.tR;
   }

   @Override
   protected atj n_() {
      return atk.tQ;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.tS, 0.15F, 1.0F);
   }

   protected void w() {
      if (this.bY <= 0) {
         this.b(atk.tT);
         this.bY = 40;
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bT, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         if (this.bX != this.bW) {
            this.k_();
         }

         this.bW = this.bX;
         if (this.A()) {
            this.bX = awh.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = awh.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dM().B) {
         this.a((aov)this.dM(), true);
      }
   }

   @Override
   public bnr e(bor $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean B(bno $$0) {
      boolean $$1 = $$0.a(this.dN().b((bog)this), (float)((int)this.g(bpl.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   public boolean A() {
      return this.am.b(bT);
   }

   public void w(boolean $$0) {
      this.am.b(bT, $$0);
   }

   public float E(float $$0) {
      return awh.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fd() {
      return 0.98F;
   }

   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      if ($$3 == null) {
         $$3 = new bnj.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends bwu<chh> {
      public a() {
         super(cal.this, chh.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cal.this.o_()) {
            return false;
         } else {
            if (super.a()) {
               for (cal $$1 : cal.this.dM().a(cal.class, cal.this.cH().c(8.0, 4.0, 8.0))) {
                  if ($$1.o_()) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      protected double l() {
         return super.l() * 0.5;
      }
   }

   class b extends bwt {
      public b() {
         super(cal.this);
      }

      @Override
      public void c() {
         super.c();
         if (cal.this.o_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(boi $$0, bog $$1) {
         if ($$0 instanceof cal && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bvl {
      public c() {
         super(cal.this, 1.25, true);
      }

      @Override
      protected void a(bog $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.B($$0);
            cal.this.w(false);
         } else if (this.a.f((bno)$$0) < (double)(($$0.dg() + 3.0F) * ($$0.dg() + 3.0F))) {
            if (this.i()) {
               cal.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cal.this.w(true);
               cal.this.w();
            }
         } else {
            this.h();
            cal.this.w(false);
         }
      }

      @Override
      public void d() {
         cal.this.w(false);
         super.d();
      }
   }

   class d extends bvu {
      public d() {
         super(cal.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ei() != null && this.b.o_() || this.b.bN();
      }
   }
}
