import java.util.UUID;
import javax.annotation.Nullable;

public class ckt extends cjv implements byk {
   private static final aku<Boolean> bI = aky.a(ckt.class, akw.k);
   private static final float bJ = 6.0F;
   private float bK;
   private float bM;
   private int bN;
   private static final bun bO = bbd.a(20, 39);
   private int bP;
   @Nullable
   private UUID bQ;

   public ckt(bxn<? extends ckt> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bwu a(asb $$0, bwu $$1) {
      return bxn.aV.a($$0, bxm.e);
   }

   @Override
   public boolean i(dak $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cev(this));
      this.bF.a(1, new ckt.c());
      this.bF.a(1, new cfu(this, 2.0, $$0 -> $$0.n_() ? axo.F : axo.G));
      this.bF.a(4, new cfa(this, 1.25));
      this.bF.a(5, new cfy(this, 1.0));
      this.bF.a(6, new cfj(this, csi.class, 6.0F));
      this.bF.a(7, new cfw(this));
      this.bG.a(1, new ckt.b());
      this.bG.a(2, new ckt.a());
      this.bG.a(3, new cgu<>(this, csi.class, 10, true, false, this::a));
      this.bG.a(4, new cgu<>(this, ckk.class, 10, true, true, null));
      this.bG.a(5, new cha<>(this, false));
   }

   public static bzk.a q() {
      return cjv.gz().a(bzl.s, 30.0).a(bzl.m, 20.0).a(bzl.v, 0.25).a(bzl.c, 6.0);
   }

   public static boolean c(bxn<ckt> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      jg<dlm> $$5 = $$1.u($$3);
      return !$$5.a(axm.aq) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(axn.cg);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(this.dV(), $$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(bO.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.bP = $$0;
   }

   @Override
   public int a() {
      return this.bP;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bQ = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bQ;
   }

   @Override
   protected awx u() {
      return this.n_() ? awy.vl : awy.vk;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.vn;
   }

   @Override
   protected awx l_() {
      return awy.vm;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.vo, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.bN <= 0) {
         this.b(awy.vp);
         this.bN = 40;
      }
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bI, false);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         if (this.bM != this.bK) {
            this.i_();
         }

         this.bK = this.bM;
         if (this.x()) {
            this.bM = azz.a(this.bM + 1.0F, 0.0F, 6.0F);
         } else {
            this.bM = azz.a(this.bM - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bN > 0) {
         this.bN--;
      }

      if (!this.dV().C) {
         this.a((asb)this.dV(), true);
      }
   }

   @Override
   public bxh e(byr $$0) {
      if (this.bM > 0.0F) {
         float $$1 = this.bM / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean x() {
      return this.al.a(bI);
   }

   public void w(boolean $$0) {
      this.al.a(bI, $$0);
   }

   public float J(float $$0) {
      return azz.h($$0, this.bK, this.bM) / 6.0F;
   }

   @Override
   protected float fk() {
      return 0.98F;
   }

   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      if ($$3 == null) {
         $$3 = new bwu.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cgu<csi> {
      public a() {
         super(ckt.this, csi.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (ckt.this.n_()) {
            return false;
         } else {
            if (super.b()) {
               for (ckt $$1 : ckt.this.dV().a(ckt.class, ckt.this.cR().c(8.0, 4.0, 8.0))) {
                  if ($$1.n_()) {
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

   class b extends cgt {
      public b() {
         super(ckt.this);
      }

      @Override
      public void d() {
         super.d();
         if (ckt.this.n_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(byh $$0, byf $$1) {
         if ($$0 instanceof ckt && !$$0.n_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cfl {
      public c() {
         super(ckt.this, 1.25, true);
      }

      @Override
      protected void a(byf $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            ckt.this.w(false);
         } else if (this.a.g((bxe)$$0) < (double)(($$0.dq() + 3.0F) * ($$0.dq() + 3.0F))) {
            if (this.i()) {
               ckt.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               ckt.this.w(true);
               ckt.this.t();
            }
         } else {
            this.h();
            ckt.this.w(false);
         }
      }

      @Override
      public void e() {
         ckt.this.w(false);
         super.e();
      }
   }
}
