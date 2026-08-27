import java.util.UUID;
import javax.annotation.Nullable;

public class bve extends bum implements bji {
   private static final aec<Boolean> bT = aef.a(bve.class, aee.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final bge bZ = asp.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public bve(bip<? extends bve> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public big a(akn $$0, big $$1) {
      return bip.az.a((cpq)$$0);
   }

   @Override
   public boolean m(cja $$0) {
      return false;
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpq(this));
      this.bO.a(1, new bve.c());
      this.bO.a(1, new bve.d());
      this.bO.a(4, new bpv(this, 1.25));
      this.bO.a(5, new bqt(this, 1.0));
      this.bO.a(6, new bqe(this, cbp.class, 6.0F));
      this.bO.a(7, new bqr(this));
      this.bP.a(1, new bve.b());
      this.bP.a(2, new bve.a());
      this.bP.a(3, new brp<>(this, cbp.class, 10, true, false, this::a_));
      this.bP.a(4, new brp<>(this, buw.class, 10, true, true, null));
      this.bP.a(5, new brv<>(this, false));
   }

   public static bkg.a p() {
      return bjd.x().a(bkh.a, 30.0).a(bkh.b, 20.0).a(bkh.d, 0.25).a(bkh.f, 6.0);
   }

   public static boolean c(bip<bve> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      hg<cqo> $$5 = $$1.s($$3);
      return !$$5.a(apn.an) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(apo.bU);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.a(this.dK(), $$0);
   }

   @Override
   public void b(qu $$0) {
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
   protected aoy r() {
      return this.i_() ? aoz.sK : aoz.sJ;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.sM;
   }

   @Override
   protected aoy h_() {
      return aoz.sL;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.sN, 0.15F, 1.0F);
   }

   protected void q() {
      if (this.bY <= 0) {
         this.a(aoz.sO, 1.0F, this.eV());
         this.bY = 40;
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dK().B) {
         if (this.bX != this.bW) {
            this.e_();
         }

         this.bW = this.bX;
         if (this.t()) {
            this.bX = ars.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = ars.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dK().B) {
         this.a((akn)this.dK(), true);
      }
   }

   @Override
   public bim a(bjn $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
      }
   }

   @Override
   public boolean C(bil $$0) {
      boolean $$1 = $$0.a(this.dL().b((bjb)this), (float)((int)this.b(bkh.f)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   public boolean t() {
      return this.an.b(bT);
   }

   public void w(boolean $$0) {
      this.an.b(bT, $$0);
   }

   public float E(float $$0) {
      return ars.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fb() {
      return 0.98F;
   }

   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      if ($$3 == null) {
         $$3 = new big.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends brp<cbp> {
      public a() {
         super(bve.this, cbp.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (bve.this.i_()) {
            return false;
         } else {
            if (super.a()) {
               for (bve $$1 : bve.this.dK().a(bve.class, bve.this.cG().c(8.0, 4.0, 8.0))) {
                  if ($$1.i_()) {
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

   class b extends bro {
      public b() {
         super(bve.this);
      }

      @Override
      public void c() {
         super.c();
         if (bve.this.i_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bjd $$0, bjb $$1) {
         if ($$0 instanceof bve && !$$0.i_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bqg {
      public c() {
         super(bve.this, 1.25, true);
      }

      @Override
      protected void a(bjb $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bve.this.w(false);
         } else if (this.a.f((bil)$$0) < (double)(($$0.df() + 3.0F) * ($$0.df() + 3.0F))) {
            if (this.i()) {
               bve.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               bve.this.w(true);
               bve.this.q();
            }
         } else {
            this.h();
            bve.this.w(false);
         }
      }

      @Override
      public void d() {
         bve.this.w(false);
         super.d();
      }
   }

   class d extends bqp {
      public d() {
         super(bve.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ef() != null && this.b.i_() || this.b.bM();
      }
   }
}
