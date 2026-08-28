import java.util.UUID;
import javax.annotation.Nullable;

public class cfz extends cfh implements btx {
   private static final akk<Boolean> bY = ako.a(cfz.class, akm.k);
   private static final float bZ = 6.0F;
   private float cb;
   private float cc;
   private int cd;
   private static final bqh ce = azz.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cfz(btc<? extends cfz> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bsq a(arf $$0, bsq $$1) {
      return btc.aD.a((dca)$$0);
   }

   @Override
   public boolean o(cur $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new caj(this));
      this.bS.a(1, new cfz.c());
      this.bS.a(1, new cfz.d());
      this.bS.a(4, new cao(this, 1.25));
      this.bS.a(5, new cbm(this, 1.0));
      this.bS.a(6, new cax(this, cmz.class, 6.0F));
      this.bS.a(7, new cbk(this));
      this.bT.a(1, new cfz.b());
      this.bT.a(2, new cfz.a());
      this.bT.a(3, new cci<>(this, cmz.class, 10, true, false, this::a_));
      this.bT.a(4, new cci<>(this, cfr.class, 10, true, true, null));
      this.bT.a(5, new cco<>(this, false));
   }

   public static buy.a s() {
      return btt.A().a(buz.q, 30.0).a(buz.k, 20.0).a(buz.r, 0.25).a(buz.c, 6.0);
   }

   public static boolean c(btc<cfz> $$0, dcb $$1, btv $$2, iz $$3, azh $$4) {
      ji<dcz> $$5 = $$1.t($$3);
      return !$$5.a(awo.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(awp.cc);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a(this.dP(), $$0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.ah));
   }

   @Override
   public void a(int $$0) {
      this.cf = $$0;
   }

   @Override
   public int a() {
      return this.cf;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   protected avz v() {
      return this.p_() ? awa.uu : awa.ut;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.uw;
   }

   @Override
   protected avz o_() {
      return awa.uv;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(awa.ux, 0.15F, 1.0F);
   }

   protected void u() {
      if (this.cd <= 0) {
         this.b(awa.uy);
         this.cd = 40;
      }
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B) {
         if (this.cc != this.cb) {
            this.j_();
         }

         this.cb = this.cc;
         if (this.y()) {
            this.cc = ayz.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = ayz.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dP().B) {
         this.a((arf)this.dP(), true);
      }
   }

   @Override
   public bsz e(bud $$0) {
      if (this.cc > 0.0F) {
         float $$1 = this.cc / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean C(bsw $$0) {
      boolean $$1 = $$0.a(this.dQ().b((btr)this), (float)((int)this.g(buz.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   public boolean y() {
      return this.ao.a(bY);
   }

   public void w(boolean $$0) {
      this.ao.a(bY, $$0);
   }

   public float G(float $$0) {
      return ayz.i($$0, this.cb, this.cc) / 6.0F;
   }

   @Override
   protected float fl() {
      return 0.98F;
   }

   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      if ($$3 == null) {
         $$3 = new bsq.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cci<cmz> {
      public a() {
         super(cfz.this, cmz.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cfz.this.p_()) {
            return false;
         } else {
            if (super.a()) {
               for (cfz $$1 : cfz.this.dP().a(cfz.class, cfz.this.cK().c(8.0, 4.0, 8.0))) {
                  if ($$1.p_()) {
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

   class b extends cch {
      public b() {
         super(cfz.this);
      }

      @Override
      public void c() {
         super.c();
         if (cfz.this.p_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(btt $$0, btr $$1) {
         if ($$0 instanceof cfz && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends caz {
      public c() {
         super(cfz.this, 1.25, true);
      }

      @Override
      protected void a(btr $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cfz.this.w(false);
         } else if (this.a.g((bsw)$$0) < (double)(($$0.dj() + 3.0F) * ($$0.dj() + 3.0F))) {
            if (this.i()) {
               cfz.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cfz.this.w(true);
               cfz.this.u();
            }
         } else {
            this.h();
            cfz.this.w(false);
         }
      }

      @Override
      public void d() {
         cfz.this.w(false);
         super.d();
      }
   }

   class d extends cbi {
      public d() {
         super(cfz.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.em() != null && this.b.p_() || this.b.bQ();
      }
   }
}
