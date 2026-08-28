import java.util.UUID;
import javax.annotation.Nullable;

public class chn extends cgv implements bvj {
   private static final ako<Boolean> bY = aks.a(chn.class, akq.k);
   private static final float bZ = 6.0F;
   private float ca;
   private float cc;
   private int cd;
   private static final brs ce = bap.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public chn(bup<? extends chn> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public btz a(arq $$0, btz $$1) {
      return bup.aD.a($$0, buo.e);
   }

   @Override
   public boolean l(cwf $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbw(this));
      this.bS.a(1, new chn.c());
      this.bS.a(1, new ccv(this, 2.0, $$0 -> $$0.p_() ? axf.F : axf.G));
      this.bS.a(4, new ccb(this, 1.25));
      this.bS.a(5, new ccz(this, 1.0));
      this.bS.a(6, new cck(this, cor.class, 6.0F));
      this.bS.a(7, new ccx(this));
      this.bT.a(1, new chn.b());
      this.bT.a(2, new chn.a());
      this.bT.a(3, new cdv<>(this, cor.class, 10, true, false, this::a_));
      this.bT.a(4, new cdv<>(this, chf.class, 10, true, true, null));
      this.bT.a(5, new ceb<>(this, false));
   }

   public static bwl.a q() {
      return cgv.gA().a(bwm.s, 30.0).a(bwm.m, 20.0).a(bwm.v, 0.25).a(bwm.c, 6.0);
   }

   public static boolean c(bup<chn> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      jq<dgh> $$5 = $$1.t($$3);
      return !$$5.a(axc.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(axd.cd);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a(this.dY(), $$0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.af));
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
   protected awn w() {
      return this.p_() ? awo.uw : awo.uv;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.uy;
   }

   @Override
   protected awn o_() {
      return awo.ux;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.uz, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.cd <= 0) {
         this.b(awo.uA);
         this.cd = 40;
      }
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dY().C) {
         if (this.cc != this.ca) {
            this.j_();
         }

         this.ca = this.cc;
         if (this.y()) {
            this.cc = azn.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = azn.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dY().C) {
         this.a((arq)this.dY(), true);
      }
   }

   @Override
   public bul e(bvq $$0) {
      if (this.cc > 0.0F) {
         float $$1 = this.cc / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean y() {
      return this.am.a(bY);
   }

   public void x(boolean $$0) {
      this.am.a(bY, $$0);
   }

   public float J(float $$0) {
      return azn.h($$0, this.ca, this.cc) / 6.0F;
   }

   @Override
   protected float fp() {
      return 0.98F;
   }

   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      if ($$3 == null) {
         $$3 = new btz.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cdv<cor> {
      public a() {
         super(chn.this, cor.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (chn.this.p_()) {
            return false;
         } else {
            if (super.b()) {
               for (chn $$1 : chn.this.dY().a(chn.class, chn.this.cT().c(8.0, 4.0, 8.0))) {
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

   class b extends cdu {
      public b() {
         super(chn.this);
      }

      @Override
      public void d() {
         super.d();
         if (chn.this.p_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bvg $$0, bve $$1) {
         if ($$0 instanceof chn && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends ccm {
      public c() {
         super(chn.this, 1.25, true);
      }

      @Override
      protected void a(bve $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.E($$0);
            chn.this.x(false);
         } else if (this.a.g((bui)$$0) < (double)(($$0.dt() + 3.0F) * ($$0.dt() + 3.0F))) {
            if (this.i()) {
               chn.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               chn.this.x(true);
               chn.this.t();
            }
         } else {
            this.h();
            chn.this.x(false);
         }
      }

      @Override
      public void e() {
         chn.this.x(false);
         super.e();
      }
   }
}
