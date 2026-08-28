import java.util.UUID;
import javax.annotation.Nullable;

public class cfw extends cfe implements btu {
   private static final akj<Boolean> bY = akn.a(cfw.class, akl.k);
   private static final float bZ = 6.0F;
   private float cb;
   private float cc;
   private int cd;
   private static final bqe ce = azy.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cfw(bsz<? extends cfw> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bsn a(are $$0, bsn $$1) {
      return bsz.aD.a((dbx)$$0);
   }

   @Override
   public boolean o(cuo $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cag(this));
      this.bS.a(1, new cfw.c());
      this.bS.a(1, new cfw.d());
      this.bS.a(4, new cal(this, 1.25));
      this.bS.a(5, new cbj(this, 1.0));
      this.bS.a(6, new cau(this, cmw.class, 6.0F));
      this.bS.a(7, new cbh(this));
      this.bT.a(1, new cfw.b());
      this.bT.a(2, new cfw.a());
      this.bT.a(3, new ccf<>(this, cmw.class, 10, true, false, this::a_));
      this.bT.a(4, new ccf<>(this, cfo.class, 10, true, true, null));
      this.bT.a(5, new ccl<>(this, false));
   }

   public static buv.a s() {
      return btq.A().a(buw.q, 30.0).a(buw.k, 20.0).a(buw.r, 0.25).a(buw.c, 6.0);
   }

   public static boolean c(bsz<cfw> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      ji<dcw> $$5 = $$1.t($$3);
      return !$$5.a(awn.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(awo.cc);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a(this.dP(), $$0);
   }

   @Override
   public void b(ur $$0) {
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
   protected avy v() {
      return this.p_() ? avz.uu : avz.ut;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.uw;
   }

   @Override
   protected avy o_() {
      return avz.uv;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.ux, 0.15F, 1.0F);
   }

   protected void u() {
      if (this.cd <= 0) {
         this.b(avz.uy);
         this.cd = 40;
      }
   }

   @Override
   protected void a(akn.a $$0) {
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
            this.cc = ayy.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = ayy.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dP().B) {
         this.a((are)this.dP(), true);
      }
   }

   @Override
   public bsw e(bua $$0) {
      if (this.cc > 0.0F) {
         float $$1 = this.cc / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean C(bst $$0) {
      boolean $$1 = $$0.a(this.dQ().b((bto)this), (float)((int)this.g(buw.c)));
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
      return ayy.i($$0, this.cb, this.cc) / 6.0F;
   }

   @Override
   protected float fl() {
      return 0.98F;
   }

   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      if ($$3 == null) {
         $$3 = new bsn.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends ccf<cmw> {
      public a() {
         super(cfw.this, cmw.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cfw.this.p_()) {
            return false;
         } else {
            if (super.a()) {
               for (cfw $$1 : cfw.this.dP().a(cfw.class, cfw.this.cK().c(8.0, 4.0, 8.0))) {
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

   class b extends cce {
      public b() {
         super(cfw.this);
      }

      @Override
      public void c() {
         super.c();
         if (cfw.this.p_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(btq $$0, bto $$1) {
         if ($$0 instanceof cfw && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends caw {
      public c() {
         super(cfw.this, 1.25, true);
      }

      @Override
      protected void a(bto $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cfw.this.w(false);
         } else if (this.a.g((bst)$$0) < (double)(($$0.dj() + 3.0F) * ($$0.dj() + 3.0F))) {
            if (this.i()) {
               cfw.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cfw.this.w(true);
               cfw.this.u();
            }
         } else {
            this.h();
            cfw.this.w(false);
         }
      }

      @Override
      public void d() {
         cfw.this.w(false);
         super.d();
      }
   }

   class d extends cbf {
      public d() {
         super(cfw.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.em() != null && this.b.p_() || this.b.bQ();
      }
   }
}
