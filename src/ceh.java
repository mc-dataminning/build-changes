import java.util.UUID;
import javax.annotation.Nullable;

public class ceh extends cdp implements bsg {
   private static final ajm<Boolean> bY = ajq.a(ceh.class, ajo.k);
   private static final float bZ = 6.0F;
   private float cb;
   private float cc;
   private int cd;
   private static final box ce = ayy.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public ceh(brn<? extends ceh> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public brb a(aqh $$0, brb $$1) {
      return brn.aC.a((dad)$$0);
   }

   @Override
   public boolean o(csz $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new byr(this));
      this.bS.a(1, new ceh.c());
      this.bS.a(1, new ceh.d());
      this.bS.a(4, new byw(this, 1.25));
      this.bS.a(5, new bzu(this, 1.0));
      this.bS.a(6, new bzf(this, clh.class, 6.0F));
      this.bS.a(7, new bzs(this));
      this.bT.a(1, new ceh.b());
      this.bT.a(2, new ceh.a());
      this.bT.a(3, new caq<>(this, clh.class, 10, true, false, this::a_));
      this.bT.a(4, new caq<>(this, cdz.class, 10, true, true, null));
      this.bT.a(5, new caw<>(this, false));
   }

   public static btg.a r() {
      return bsc.A().a(bth.q, 30.0).a(bth.k, 20.0).a(bth.r, 0.25).a(bth.c, 6.0);
   }

   public static boolean c(brn<ceh> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      iw<dbc> $$5 = $$1.t($$3);
      return !$$5.a(avq.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(avr.cc);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(this.dN(), $$0);
   }

   @Override
   public void b(ua $$0) {
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
   protected avb v() {
      return this.p_() ? avc.uj : avc.ui;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.ul;
   }

   @Override
   protected avb o_() {
      return avc.uk;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.um, 0.15F, 1.0F);
   }

   protected void u() {
      if (this.cd <= 0) {
         this.b(avc.un);
         this.cd = 40;
      }
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().B) {
         if (this.cc != this.cb) {
            this.j_();
         }

         this.cb = this.cc;
         if (this.y()) {
            this.cc = axz.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = axz.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dN().B) {
         this.a((aqh)this.dN(), true);
      }
   }

   @Override
   public brk e(bsl $$0) {
      if (this.cc > 0.0F) {
         float $$1 = this.cc / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean C(brh $$0) {
      boolean $$1 = $$0.a(this.dO().b((bsa)this), (float)((int)this.g(bth.c)));
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
      return axz.i($$0, this.cb, this.cc) / 6.0F;
   }

   @Override
   protected float fj() {
      return 0.98F;
   }

   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      if ($$3 == null) {
         $$3 = new brb.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends caq<clh> {
      public a() {
         super(ceh.this, clh.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (ceh.this.p_()) {
            return false;
         } else {
            if (super.a()) {
               for (ceh $$1 : ceh.this.dN().a(ceh.class, ceh.this.cI().c(8.0, 4.0, 8.0))) {
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

   class b extends cap {
      public b() {
         super(ceh.this);
      }

      @Override
      public void c() {
         super.c();
         if (ceh.this.p_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bsc $$0, bsa $$1) {
         if ($$0 instanceof ceh && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bzh {
      public c() {
         super(ceh.this, 1.25, true);
      }

      @Override
      protected void a(bsa $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            ceh.this.w(false);
         } else if (this.a.g((brh)$$0) < (double)(($$0.dh() + 3.0F) * ($$0.dh() + 3.0F))) {
            if (this.i()) {
               ceh.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               ceh.this.w(true);
               ceh.this.u();
            }
         } else {
            this.h();
            ceh.this.w(false);
         }
      }

      @Override
      public void d() {
         ceh.this.w(false);
         super.d();
      }
   }

   class d extends bzq {
      public d() {
         super(ceh.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ek() != null && this.b.p_() || this.b.bO();
      }
   }
}
