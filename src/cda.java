import java.util.UUID;
import javax.annotation.Nullable;

public class cda extends cci implements bqz {
   private static final aja<Boolean> bX = aje.a(cda.class, ajc.k);
   private static final float bY = 6.0F;
   private float ca;
   private float cb;
   private int cc;
   private static final bnq cd = ayl.a(20, 39);
   private int ce;
   @Nullable
   private UUID cf;

   public cda(bqg<? extends cda> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bpu a(apu $$0, bpu $$1) {
      return bqg.aC.a((czg)$$0);
   }

   @Override
   public boolean o(crs $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bxk(this));
      this.bR.a(1, new cda.c());
      this.bR.a(1, new cda.d());
      this.bR.a(4, new bxp(this, 1.25));
      this.bR.a(5, new byn(this, 1.0));
      this.bR.a(6, new bxy(this, cka.class, 6.0F));
      this.bR.a(7, new byl(this));
      this.bS.a(1, new cda.b());
      this.bS.a(2, new cda.a());
      this.bS.a(3, new bzj<>(this, cka.class, 10, true, false, this::a_));
      this.bS.a(4, new bzj<>(this, ccs.class, 10, true, true, null));
      this.bS.a(5, new bzp<>(this, false));
   }

   public static brz.a r() {
      return bqv.A().a(bsa.q, 30.0).a(bsa.k, 20.0).a(bsa.r, 0.25).a(bsa.c, 6.0);
   }

   public static boolean c(bqg<cda> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      in<daf> $$5 = $$1.t($$3);
      return !$$5.a(avd.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(ave.bW);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.a(this.dM(), $$0);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void c() {
      this.a(cd.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.ce = $$0;
   }

   @Override
   public int a() {
      return this.ce;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cf = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cf;
   }

   @Override
   protected aun v() {
      return this.p_() ? auo.ub : auo.ua;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.ud;
   }

   @Override
   protected aun o_() {
      return auo.uc;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.ue, 0.15F, 1.0F);
   }

   protected void u() {
      if (this.cc <= 0) {
         this.b(auo.uf);
         this.cc = 40;
      }
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(bX, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         if (this.cb != this.ca) {
            this.j_();
         }

         this.ca = this.cb;
         if (this.y()) {
            this.cb = axm.a(this.cb + 1.0F, 0.0F, 6.0F);
         } else {
            this.cb = axm.a(this.cb - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cc > 0) {
         this.cc--;
      }

      if (!this.dM().B) {
         this.a((apu)this.dM(), true);
      }
   }

   @Override
   public bqd e(bre $$0) {
      if (this.cb > 0.0F) {
         float $$1 = this.cb / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean C(bqa $$0) {
      boolean $$1 = $$0.a(this.dN().b((bqt)this), (float)((int)this.g(bsa.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   public boolean y() {
      return this.an.a(bX);
   }

   public void w(boolean $$0) {
      this.an.a(bX, $$0);
   }

   public float G(float $$0) {
      return axm.i($$0, this.ca, this.cb) / 6.0F;
   }

   @Override
   protected float fi() {
      return 0.98F;
   }

   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      if ($$3 == null) {
         $$3 = new bpu.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends bzj<cka> {
      public a() {
         super(cda.this, cka.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cda.this.p_()) {
            return false;
         } else {
            if (super.a()) {
               for (cda $$1 : cda.this.dM().a(cda.class, cda.this.cH().c(8.0, 4.0, 8.0))) {
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

   class b extends bzi {
      public b() {
         super(cda.this);
      }

      @Override
      public void c() {
         super.c();
         if (cda.this.p_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bqv $$0, bqt $$1) {
         if ($$0 instanceof cda && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bya {
      public c() {
         super(cda.this, 1.25, true);
      }

      @Override
      protected void a(bqt $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cda.this.w(false);
         } else if (this.a.g((bqa)$$0) < (double)(($$0.dg() + 3.0F) * ($$0.dg() + 3.0F))) {
            if (this.i()) {
               cda.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cda.this.w(true);
               cda.this.u();
            }
         } else {
            this.h();
            cda.this.w(false);
         }
      }

      @Override
      public void d() {
         cda.this.w(false);
         super.d();
      }
   }

   class d extends byj {
      public d() {
         super(cda.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ej() != null && this.b.p_() || this.b.bN();
      }
   }
}
