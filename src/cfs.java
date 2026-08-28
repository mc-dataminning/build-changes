import java.util.UUID;
import javax.annotation.Nullable;

public class cfs extends cfa implements btq {
   private static final akg<Boolean> bY = akk.a(cfs.class, aki.k);
   private static final float bZ = 6.0F;
   private float cb;
   private float cc;
   private int cd;
   private static final bqa ce = azu.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cfs(bsv<? extends cfs> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bsj a(arb $$0, bsj $$1) {
      return bsv.aD.a((dbt)$$0);
   }

   @Override
   public boolean o(cuk $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cac(this));
      this.bS.a(1, new cfs.c());
      this.bS.a(1, new cfs.d());
      this.bS.a(4, new cah(this, 1.25));
      this.bS.a(5, new cbf(this, 1.0));
      this.bS.a(6, new caq(this, cms.class, 6.0F));
      this.bS.a(7, new cbd(this));
      this.bT.a(1, new cfs.b());
      this.bT.a(2, new cfs.a());
      this.bT.a(3, new ccb<>(this, cms.class, 10, true, false, this::a_));
      this.bT.a(4, new ccb<>(this, cfk.class, 10, true, true, null));
      this.bT.a(5, new cch<>(this, false));
   }

   public static bur.a s() {
      return btm.A().a(bus.q, 30.0).a(bus.k, 20.0).a(bus.r, 0.25).a(bus.c, 6.0);
   }

   public static boolean c(bsv<cfs> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      ji<dcs> $$5 = $$1.t($$3);
      return !$$5.a(awk.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(awl.cc);
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
   protected avv v() {
      return this.p_() ? avw.uu : avw.ut;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.uw;
   }

   @Override
   protected avv o_() {
      return avw.uv;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.ux, 0.15F, 1.0F);
   }

   protected void u() {
      if (this.cd <= 0) {
         this.b(avw.uy);
         this.cd = 40;
      }
   }

   @Override
   protected void a(akk.a $$0) {
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
            this.cc = ayu.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = ayu.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dP().B) {
         this.a((arb)this.dP(), true);
      }
   }

   @Override
   public bss e(btw $$0) {
      if (this.cc > 0.0F) {
         float $$1 = this.cc / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean C(bsp $$0) {
      boolean $$1 = $$0.a(this.dQ().b((btk)this), (float)((int)this.g(bus.c)));
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
      return ayu.i($$0, this.cb, this.cc) / 6.0F;
   }

   @Override
   protected float fl() {
      return 0.98F;
   }

   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      if ($$3 == null) {
         $$3 = new bsj.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends ccb<cms> {
      public a() {
         super(cfs.this, cms.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cfs.this.p_()) {
            return false;
         } else {
            if (super.a()) {
               for (cfs $$1 : cfs.this.dP().a(cfs.class, cfs.this.cK().c(8.0, 4.0, 8.0))) {
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

   class b extends cca {
      public b() {
         super(cfs.this);
      }

      @Override
      public void c() {
         super.c();
         if (cfs.this.p_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(btm $$0, btk $$1) {
         if ($$0 instanceof cfs && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cas {
      public c() {
         super(cfs.this, 1.25, true);
      }

      @Override
      protected void a(btk $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cfs.this.w(false);
         } else if (this.a.g((bsp)$$0) < (double)(($$0.dj() + 3.0F) * ($$0.dj() + 3.0F))) {
            if (this.i()) {
               cfs.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cfs.this.w(true);
               cfs.this.u();
            }
         } else {
            this.h();
            cfs.this.w(false);
         }
      }

      @Override
      public void d() {
         cfs.this.w(false);
         super.d();
      }
   }

   class d extends cbb {
      public d() {
         super(cfs.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.em() != null && this.b.p_() || this.b.bQ();
      }
   }
}
