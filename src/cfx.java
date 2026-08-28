import java.util.UUID;
import javax.annotation.Nullable;

public class cfx extends cff implements btv {
   private static final akk<Boolean> bY = ako.a(cfx.class, akm.k);
   private static final float bZ = 6.0F;
   private float cb;
   private float cc;
   private int cd;
   private static final bqf ce = azz.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cfx(bta<? extends cfx> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bso a(arf $$0, bso $$1) {
      return bta.aD.a((dby)$$0);
   }

   @Override
   public boolean o(cup $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cah(this));
      this.bS.a(1, new cfx.c());
      this.bS.a(1, new cfx.d());
      this.bS.a(4, new cam(this, 1.25));
      this.bS.a(5, new cbk(this, 1.0));
      this.bS.a(6, new cav(this, cmx.class, 6.0F));
      this.bS.a(7, new cbi(this));
      this.bT.a(1, new cfx.b());
      this.bT.a(2, new cfx.a());
      this.bT.a(3, new ccg<>(this, cmx.class, 10, true, false, this::a_));
      this.bT.a(4, new ccg<>(this, cfp.class, 10, true, true, null));
      this.bT.a(5, new ccm<>(this, false));
   }

   public static buw.a s() {
      return btr.A().a(bux.q, 30.0).a(bux.k, 20.0).a(bux.r, 0.25).a(bux.c, 6.0);
   }

   public static boolean c(bta<cfx> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      ji<dcx> $$5 = $$1.t($$3);
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
   protected avz d(brn $$0) {
      return awa.uw;
   }

   @Override
   protected avz o_() {
      return awa.uv;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
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
   public bsx e(bub $$0) {
      if (this.cc > 0.0F) {
         float $$1 = this.cc / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean C(bsu $$0) {
      boolean $$1 = $$0.a(this.dQ().b((btp)this), (float)((int)this.g(bux.c)));
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
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      if ($$3 == null) {
         $$3 = new bso.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends ccg<cmx> {
      public a() {
         super(cfx.this, cmx.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cfx.this.p_()) {
            return false;
         } else {
            if (super.a()) {
               for (cfx $$1 : cfx.this.dP().a(cfx.class, cfx.this.cK().c(8.0, 4.0, 8.0))) {
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

   class b extends ccf {
      public b() {
         super(cfx.this);
      }

      @Override
      public void c() {
         super.c();
         if (cfx.this.p_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(btr $$0, btp $$1) {
         if ($$0 instanceof cfx && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cax {
      public c() {
         super(cfx.this, 1.25, true);
      }

      @Override
      protected void a(btp $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cfx.this.w(false);
         } else if (this.a.g((bsu)$$0) < (double)(($$0.dj() + 3.0F) * ($$0.dj() + 3.0F))) {
            if (this.i()) {
               cfx.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cfx.this.w(true);
               cfx.this.u();
            }
         } else {
            this.h();
            cfx.this.w(false);
         }
      }

      @Override
      public void d() {
         cfx.this.w(false);
         super.d();
      }
   }

   class d extends cbg {
      public d() {
         super(cfx.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.em() != null && this.b.p_() || this.b.bQ();
      }
   }
}
