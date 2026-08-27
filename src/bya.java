import java.util.UUID;
import javax.annotation.Nullable;

public class bya extends bxi implements bmc {
   private static final afz<Boolean> bT = agc.a(bya.class, agb.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final biw bZ = auz.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public bya(blj<? extends bya> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bla a(amp $$0, bla $$1) {
      return blj.aA.a((csy)$$0);
   }

   @Override
   public boolean m(cmh $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsl(this));
      this.bO.a(1, new bya.c());
      this.bO.a(1, new bya.d());
      this.bO.a(4, new bsq(this, 1.25));
      this.bO.a(5, new bto(this, 1.0));
      this.bO.a(6, new bsz(this, cer.class, 6.0F));
      this.bO.a(7, new btm(this));
      this.bP.a(1, new bya.b());
      this.bP.a(2, new bya.a());
      this.bP.a(3, new buk<>(this, cer.class, 10, true, false, this::a_));
      this.bP.a(4, new buk<>(this, bxs.class, 10, true, true, null));
      this.bP.a(5, new buq<>(this, false));
   }

   public static bna.a u() {
      return blx.C().a(bnb.l, 30.0).a(bnb.g, 20.0).a(bnb.m, 0.25).a(bnb.c, 6.0);
   }

   public static boolean c(blj<bya> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      ie<ctx> $$5 = $$1.s($$3);
      return !$$5.a(arq.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(arr.bU);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.a(this.dM(), $$0);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
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
   protected arb y() {
      return this.o_() ? arc.tA : arc.tz;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.tC;
   }

   @Override
   protected arb n_() {
      return arc.tB;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.tD, 0.15F, 1.0F);
   }

   protected void w() {
      if (this.bY <= 0) {
         this.a(arc.tE, 1.0F, this.eX());
         this.bY = 40;
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bT, false);
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
            this.bX = aty.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = aty.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dM().B) {
         this.a((amp)this.dM(), true);
      }
   }

   @Override
   public blg a(bmh $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
      }
   }

   @Override
   public boolean C(blf $$0) {
      boolean $$1 = $$0.a(this.dN().b((blv)this), (float)((int)this.b(bnb.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   public boolean A() {
      return this.an.b(bT);
   }

   public void w(boolean $$0) {
      this.an.b(bT, $$0);
   }

   public float E(float $$0) {
      return aty.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fd() {
      return 0.98F;
   }

   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      if ($$3 == null) {
         $$3 = new bla.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends buk<cer> {
      public a() {
         super(bya.this, cer.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (bya.this.o_()) {
            return false;
         } else {
            if (super.a()) {
               for (bya $$1 : bya.this.dM().a(bya.class, bya.this.cH().c(8.0, 4.0, 8.0))) {
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

   class b extends buj {
      public b() {
         super(bya.this);
      }

      @Override
      public void c() {
         super.c();
         if (bya.this.o_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(blx $$0, blv $$1) {
         if ($$0 instanceof bya && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends btb {
      public c() {
         super(bya.this, 1.25, true);
      }

      @Override
      protected void a(blv $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bya.this.w(false);
         } else if (this.a.f((blf)$$0) < (double)(($$0.dg() + 3.0F) * ($$0.dg() + 3.0F))) {
            if (this.i()) {
               bya.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               bya.this.w(true);
               bya.this.w();
            }
         } else {
            this.h();
            bya.this.w(false);
         }
      }

      @Override
      public void d() {
         bya.this.w(false);
         super.d();
      }
   }

   class d extends btk {
      public d() {
         super(bya.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.eh() != null && this.b.o_() || this.b.bN();
      }
   }
}
