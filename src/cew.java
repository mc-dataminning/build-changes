import java.util.UUID;
import javax.annotation.Nullable;

public class cew extends cee implements bsu {
   private static final ajr<Boolean> bY = ajv.a(cew.class, ajt.k);
   private static final float bZ = 6.0F;
   private float cb;
   private float cc;
   private int cd;
   private static final bpf ce = azc.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cew(bsa<? extends cew> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bro a(aqm $$0, bro $$1) {
      return bsa.aD.a((dax)$$0);
   }

   @Override
   public boolean o(cto $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bzg(this));
      this.bS.a(1, new cew.c());
      this.bS.a(1, new cew.d());
      this.bS.a(4, new bzl(this, 1.25));
      this.bS.a(5, new caj(this, 1.0));
      this.bS.a(6, new bzu(this, clw.class, 6.0F));
      this.bS.a(7, new cah(this));
      this.bT.a(1, new cew.b());
      this.bT.a(2, new cew.a());
      this.bT.a(3, new cbf<>(this, clw.class, 10, true, false, this::a_));
      this.bT.a(4, new cbf<>(this, ceo.class, 10, true, true, null));
      this.bT.a(5, new cbl<>(this, false));
   }

   public static btv.a s() {
      return bsq.A().a(btw.q, 30.0).a(btw.k, 20.0).a(btw.r, 0.25).a(btw.c, 6.0);
   }

   public static boolean c(bsa<cew> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      ix<dbw> $$5 = $$1.t($$3);
      return !$$5.a(avv.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(avw.cc);
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
   protected avg v() {
      return this.p_() ? avh.uu : avh.ut;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.uw;
   }

   @Override
   protected avg o_() {
      return avh.uv;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.ux, 0.15F, 1.0F);
   }

   protected void u() {
      if (this.cd <= 0) {
         this.b(avh.uy);
         this.cd = 40;
      }
   }

   @Override
   protected void a(ajv.a $$0) {
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
            this.cc = ayd.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = ayd.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dP().B) {
         this.a((aqm)this.dP(), true);
      }
   }

   @Override
   public brx e(bta $$0) {
      if (this.cc > 0.0F) {
         float $$1 = this.cc / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean C(bru $$0) {
      boolean $$1 = $$0.a(this.dQ().b((bso)this), (float)((int)this.g(btw.c)));
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
      return ayd.i($$0, this.cb, this.cc) / 6.0F;
   }

   @Override
   protected float fl() {
      return 0.98F;
   }

   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      if ($$3 == null) {
         $$3 = new bro.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cbf<clw> {
      public a() {
         super(cew.this, clw.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cew.this.p_()) {
            return false;
         } else {
            if (super.a()) {
               for (cew $$1 : cew.this.dP().a(cew.class, cew.this.cK().c(8.0, 4.0, 8.0))) {
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

   class b extends cbe {
      public b() {
         super(cew.this);
      }

      @Override
      public void c() {
         super.c();
         if (cew.this.p_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bsq $$0, bso $$1) {
         if ($$0 instanceof cew && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bzw {
      public c() {
         super(cew.this, 1.25, true);
      }

      @Override
      protected void a(bso $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cew.this.w(false);
         } else if (this.a.g((bru)$$0) < (double)(($$0.dj() + 3.0F) * ($$0.dj() + 3.0F))) {
            if (this.i()) {
               cew.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cew.this.w(true);
               cew.this.u();
            }
         } else {
            this.h();
            cew.this.w(false);
         }
      }

      @Override
      public void d() {
         cew.this.w(false);
         super.d();
      }
   }

   class d extends caf {
      public d() {
         super(cew.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.em() != null && this.b.p_() || this.b.bQ();
      }
   }
}
