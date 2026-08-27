import java.util.UUID;
import javax.annotation.Nullable;

public class bvb extends buj implements bjf {
   private static final adz<Boolean> bT = aec.a(bvb.class, aeb.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final bgb bZ = asm.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public bvb(bim<? extends bvb> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      return bim.az.a((cpl)$$0);
   }

   @Override
   public boolean m(cix $$0) {
      return false;
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpn(this));
      this.bO.a(1, new bvb.c());
      this.bO.a(1, new bvb.d());
      this.bO.a(4, new bps(this, 1.25));
      this.bO.a(5, new bqq(this, 1.0));
      this.bO.a(6, new bqb(this, cbm.class, 6.0F));
      this.bO.a(7, new bqo(this));
      this.bP.a(1, new bvb.b());
      this.bP.a(2, new bvb.a());
      this.bP.a(3, new brm<>(this, cbm.class, 10, true, false, this::a_));
      this.bP.a(4, new brm<>(this, but.class, 10, true, true, null));
      this.bP.a(5, new brs<>(this, false));
   }

   public static bkd.a p() {
      return bja.x().a(bke.a, 30.0).a(bke.b, 20.0).a(bke.d, 0.25).a(bke.f, 6.0);
   }

   public static boolean c(bim<bvb> $$0, cpm $$1, bjc $$2, gu $$3, aru $$4) {
      he<cqj> $$5 = $$1.s($$3);
      return !$$5.a(apk.an) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(apl.bU);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(this.dK(), $$0);
   }

   @Override
   public void b(qr $$0) {
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
   protected aov r() {
      return this.i_() ? aow.sK : aow.sJ;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.sM;
   }

   @Override
   protected aov h_() {
      return aow.sL;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(aow.sN, 0.15F, 1.0F);
   }

   protected void q() {
      if (this.bY <= 0) {
         this.a(aow.sO, 1.0F, this.eV());
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
            this.bX = arp.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = arp.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dK().B) {
         this.a((akk)this.dK(), true);
      }
   }

   @Override
   public bij a(bjk $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
      }
   }

   @Override
   public boolean C(bii $$0) {
      boolean $$1 = $$0.a(this.dL().b((biy)this), (float)((int)this.b(bke.f)));
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
      return arp.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fb() {
      return 0.98F;
   }

   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      if ($$3 == null) {
         $$3 = new bid.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends brm<cbm> {
      public a() {
         super(bvb.this, cbm.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (bvb.this.i_()) {
            return false;
         } else {
            if (super.a()) {
               for (bvb $$1 : bvb.this.dK().a(bvb.class, bvb.this.cG().c(8.0, 4.0, 8.0))) {
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

   class b extends brl {
      public b() {
         super(bvb.this);
      }

      @Override
      public void c() {
         super.c();
         if (bvb.this.i_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bja $$0, biy $$1) {
         if ($$0 instanceof bvb && !$$0.i_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bqd {
      public c() {
         super(bvb.this, 1.25, true);
      }

      @Override
      protected void a(biy $$0) {
         if (this.i() && this.a.i($$0)) {
            this.h();
            this.a.C($$0);
            bvb.this.w(false);
         } else if (this.a.f((bii)$$0) < (double)(($$0.df() + 3.0F) * ($$0.df() + 3.0F))) {
            if (this.i()) {
               bvb.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               bvb.this.w(true);
               bvb.this.q();
            }
         } else {
            this.h();
            bvb.this.w(false);
         }
      }

      @Override
      public void d() {
         bvb.this.w(false);
         super.d();
      }
   }

   class d extends bqm {
      public d() {
         super(bvb.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ef() != null && this.b.i_() || this.b.bM();
      }
   }
}
