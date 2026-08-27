import java.util.UUID;
import javax.annotation.Nullable;

public class cdl extends cct implements brk {
   private static final ajk<Boolean> bY = ajo.a(cdl.class, ajm.k);
   private static final float bZ = 6.0F;
   private float cb;
   private float cc;
   private int cd;
   private static final bob ce = ayv.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cdl(bqr<? extends cdl> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bqf a(aqe $$0, bqf $$1) {
      return bqr.aC.a((czu)$$0);
   }

   @Override
   public boolean o(csd $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bxv(this));
      this.bS.a(1, new cdl.c());
      this.bS.a(1, new cdl.d());
      this.bS.a(4, new bya(this, 1.25));
      this.bS.a(5, new byy(this, 1.0));
      this.bS.a(6, new byj(this, ckl.class, 6.0F));
      this.bS.a(7, new byw(this));
      this.bT.a(1, new cdl.b());
      this.bT.a(2, new cdl.a());
      this.bT.a(3, new bzu<>(this, ckl.class, 10, true, false, this::a_));
      this.bT.a(4, new bzu<>(this, cdd.class, 10, true, true, null));
      this.bT.a(5, new caa<>(this, false));
   }

   public static bsk.a r() {
      return brg.A().a(bsl.q, 30.0).a(bsl.k, 20.0).a(bsl.r, 0.25).a(bsl.c, 6.0);
   }

   public static boolean c(bqr<cdl> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      iv<dat> $$5 = $$1.t($$3);
      return !$$5.a(avn.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(avo.bW);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a(this.dN(), $$0);
   }

   @Override
   public void b(ty $$0) {
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
   protected auy v() {
      return this.p_() ? auz.ui : auz.uh;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.uk;
   }

   @Override
   protected auy o_() {
      return auz.uj;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.ul, 0.15F, 1.0F);
   }

   protected void u() {
      if (this.cd <= 0) {
         this.b(auz.um);
         this.cd = 40;
      }
   }

   @Override
   protected void a(ajo.a $$0) {
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
            this.cc = axw.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = axw.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dN().B) {
         this.a((aqe)this.dN(), true);
      }
   }

   @Override
   public bqo e(brp $$0) {
      if (this.cc > 0.0F) {
         float $$1 = this.cc / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean C(bql $$0) {
      boolean $$1 = $$0.a(this.dO().b((bre)this), (float)((int)this.g(bsl.c)));
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
      return axw.i($$0, this.cb, this.cc) / 6.0F;
   }

   @Override
   protected float fj() {
      return 0.98F;
   }

   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      if ($$3 == null) {
         $$3 = new bqf.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends bzu<ckl> {
      public a() {
         super(cdl.this, ckl.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cdl.this.p_()) {
            return false;
         } else {
            if (super.a()) {
               for (cdl $$1 : cdl.this.dN().a(cdl.class, cdl.this.cI().c(8.0, 4.0, 8.0))) {
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

   class b extends bzt {
      public b() {
         super(cdl.this);
      }

      @Override
      public void c() {
         super.c();
         if (cdl.this.p_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(brg $$0, bre $$1) {
         if ($$0 instanceof cdl && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends byl {
      public c() {
         super(cdl.this, 1.25, true);
      }

      @Override
      protected void a(bre $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cdl.this.w(false);
         } else if (this.a.g((bql)$$0) < (double)(($$0.dh() + 3.0F) * ($$0.dh() + 3.0F))) {
            if (this.i()) {
               cdl.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cdl.this.w(true);
               cdl.this.u();
            }
         } else {
            this.h();
            cdl.this.w(false);
         }
      }

      @Override
      public void d() {
         cdl.this.w(false);
         super.d();
      }
   }

   class d extends byu {
      public d() {
         super(cdl.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ek() != null && this.b.p_() || this.b.bO();
      }
   }
}
