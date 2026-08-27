import java.util.UUID;
import javax.annotation.Nullable;

public class cap extends bzx implements boo {
   private static final aie<Boolean> bT = aih.a(cap.class, aig.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final blh bZ = axh.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cap(bnw<? extends cap> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bnl a(aow $$0, bnl $$1) {
      return bnw.aB.a((cvr)$$0);
   }

   @Override
   public boolean m(cpd $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new buz(this));
      this.bO.a(1, new cap.c());
      this.bO.a(1, new cap.d());
      this.bO.a(4, new bve(this, 1.25));
      this.bO.a(5, new bwc(this, 1.0));
      this.bO.a(6, new bvn(this, chl.class, 6.0F));
      this.bO.a(7, new bwa(this));
      this.bP.a(1, new cap.b());
      this.bP.a(2, new cap.a());
      this.bP.a(3, new bwy<>(this, chl.class, 10, true, false, this::a_));
      this.bP.a(4, new bwy<>(this, cah.class, 10, true, true, null));
      this.bP.a(5, new bxe<>(this, false));
   }

   public static bpo.a u() {
      return bok.C().a(bpp.n, 30.0).a(bpp.i, 20.0).a(bpp.o, 0.25).a(bpp.c, 6.0);
   }

   public static boolean c(bnw<cap> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      ij<cwq> $$5 = $$1.t($$3);
      return !$$5.a(atz.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(aua.bV);
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
   protected atk y() {
      return this.o_() ? atl.tQ : atl.tP;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.tS;
   }

   @Override
   protected atk n_() {
      return atl.tR;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.tT, 0.15F, 1.0F);
   }

   protected void w() {
      if (this.bY <= 0) {
         this.b(atl.tU);
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
            this.bX = awi.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = awi.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dM().B) {
         this.a((aow)this.dM(), true);
      }
   }

   @Override
   public bnt e(bot $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean B(bnq $$0) {
      boolean $$1 = $$0.a(this.dN().b((boi)this), (float)((int)this.g(bpp.c)));
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
      return awi.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fd() {
      return 0.98F;
   }

   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      if ($$3 == null) {
         $$3 = new bnl.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends bwy<chl> {
      public a() {
         super(cap.this, chl.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cap.this.o_()) {
            return false;
         } else {
            if (super.a()) {
               for (cap $$1 : cap.this.dM().a(cap.class, cap.this.cH().c(8.0, 4.0, 8.0))) {
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

   class b extends bwx {
      public b() {
         super(cap.this);
      }

      @Override
      public void c() {
         super.c();
         if (cap.this.o_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bok $$0, boi $$1) {
         if ($$0 instanceof cap && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bvp {
      public c() {
         super(cap.this, 1.25, true);
      }

      @Override
      protected void a(boi $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.B($$0);
            cap.this.w(false);
         } else if (this.a.f((bnq)$$0) < (double)(($$0.dg() + 3.0F) * ($$0.dg() + 3.0F))) {
            if (this.i()) {
               cap.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cap.this.w(true);
               cap.this.w();
            }
         } else {
            this.h();
            cap.this.w(false);
         }
      }

      @Override
      public void d() {
         cap.this.w(false);
         super.d();
      }
   }

   class d extends bvy {
      public d() {
         super(cap.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ei() != null && this.b.o_() || this.b.bN();
      }
   }
}
