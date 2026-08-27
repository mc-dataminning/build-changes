import java.util.UUID;
import javax.annotation.Nullable;

public class cey extends ceg implements bsw {
   private static final ajs<Boolean> bY = ajw.a(cey.class, aju.k);
   private static final float bZ = 6.0F;
   private float cb;
   private float cc;
   private int cd;
   private static final bph ce = aze.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cey(bsc<? extends cey> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public brq a(aqn $$0, brq $$1) {
      return bsc.aD.a((daz)$$0);
   }

   @Override
   public boolean o(ctq $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bzi(this));
      this.bS.a(1, new cey.c());
      this.bS.a(1, new cey.d());
      this.bS.a(4, new bzn(this, 1.25));
      this.bS.a(5, new cal(this, 1.0));
      this.bS.a(6, new bzw(this, cly.class, 6.0F));
      this.bS.a(7, new caj(this));
      this.bT.a(1, new cey.b());
      this.bT.a(2, new cey.a());
      this.bT.a(3, new cbh<>(this, cly.class, 10, true, false, this::a_));
      this.bT.a(4, new cbh<>(this, ceq.class, 10, true, true, null));
      this.bT.a(5, new cbn<>(this, false));
   }

   public static btx.a s() {
      return bss.A().a(bty.q, 30.0).a(bty.k, 20.0).a(bty.r, 0.25).a(bty.c, 6.0);
   }

   public static boolean c(bsc<cey> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      ix<dby> $$5 = $$1.t($$3);
      return !$$5.a(avw.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(avx.cc);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a(this.dP(), $$0);
   }

   @Override
   public void b(ud $$0) {
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
   protected avh v() {
      return this.p_() ? avi.uu : avi.ut;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.uw;
   }

   @Override
   protected avh o_() {
      return avi.uv;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.ux, 0.15F, 1.0F);
   }

   protected void u() {
      if (this.cd <= 0) {
         this.b(avi.uy);
         this.cd = 40;
      }
   }

   @Override
   protected void a(ajw.a $$0) {
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
            this.cc = ayf.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = ayf.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dP().B) {
         this.a((aqn)this.dP(), true);
      }
   }

   @Override
   public brz e(btc $$0) {
      if (this.cc > 0.0F) {
         float $$1 = this.cc / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean C(brw $$0) {
      boolean $$1 = $$0.a(this.dQ().b((bsq)this), (float)((int)this.g(bty.c)));
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
      return ayf.i($$0, this.cb, this.cc) / 6.0F;
   }

   @Override
   protected float fl() {
      return 0.98F;
   }

   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      if ($$3 == null) {
         $$3 = new brq.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cbh<cly> {
      public a() {
         super(cey.this, cly.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cey.this.p_()) {
            return false;
         } else {
            if (super.a()) {
               for (cey $$1 : cey.this.dP().a(cey.class, cey.this.cK().c(8.0, 4.0, 8.0))) {
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

   class b extends cbg {
      public b() {
         super(cey.this);
      }

      @Override
      public void c() {
         super.c();
         if (cey.this.p_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bss $$0, bsq $$1) {
         if ($$0 instanceof cey && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bzy {
      public c() {
         super(cey.this, 1.25, true);
      }

      @Override
      protected void a(bsq $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cey.this.w(false);
         } else if (this.a.g((brw)$$0) < (double)(($$0.dj() + 3.0F) * ($$0.dj() + 3.0F))) {
            if (this.i()) {
               cey.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cey.this.w(true);
               cey.this.u();
            }
         } else {
            this.h();
            cey.this.w(false);
         }
      }

      @Override
      public void d() {
         cey.this.w(false);
         super.d();
      }
   }

   class d extends cah {
      public d() {
         super(cey.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.em() != null && this.b.p_() || this.b.bQ();
      }
   }
}
