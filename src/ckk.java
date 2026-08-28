import java.util.UUID;
import javax.annotation.Nullable;

public class ckk extends cjm implements byb {
   private static final akn<Boolean> bI = akr.a(ckk.class, akp.k);
   private static final float bJ = 6.0F;
   private float bK;
   private float bM;
   private int bN;
   private static final bue bO = bau.a(20, 39);
   private int bP;
   @Nullable
   private UUID bQ;

   public ckk(bxe<? extends ckk> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bwl a(aru $$0, bwl $$1) {
      return bxe.aV.a($$0, bxd.e);
   }

   @Override
   public boolean i(daa $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cem(this));
      this.bF.a(1, new ckk.c());
      this.bF.a(1, new cfl(this, 2.0, $$0 -> $$0.n_() ? axh.F : axh.G));
      this.bF.a(4, new cer(this, 1.25));
      this.bF.a(5, new cfp(this, 1.0));
      this.bF.a(6, new cfa(this, crz.class, 6.0F));
      this.bF.a(7, new cfn(this));
      this.bG.a(1, new ckk.b());
      this.bG.a(2, new ckk.a());
      this.bG.a(3, new cgl<>(this, crz.class, 10, true, false, this::a));
      this.bG.a(4, new cgl<>(this, ckb.class, 10, true, true, null));
      this.bG.a(5, new cgr<>(this, false));
   }

   public static bzb.a q() {
      return cjm.gz().a(bzc.s, 30.0).a(bzc.m, 20.0).a(bzc.v, 0.25).a(bzc.c, 6.0);
   }

   public static boolean c(bxe<ckk> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      jg<dlc> $$5 = $$1.u($$3);
      return !$$5.a(axf.aq) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(axg.cg);
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
   protected awq u() {
      return this.n_() ? awr.vl : awr.vk;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.vn;
   }

   @Override
   protected awq l_() {
      return awr.vm;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.vo, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.bN <= 0) {
         this.b(awr.vp);
         this.bN = 40;
      }
   }

   @Override
   protected void a(akr.a $$0) {
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
            this.bM = azq.a(this.bM + 1.0F, 0.0F, 6.0F);
         } else {
            this.bM = azq.a(this.bM - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bN > 0) {
         this.bN--;
      }

      if (!this.dV().C) {
         this.a((aru)this.dV(), true);
      }
   }

   @Override
   public bwy e(byi $$0) {
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
      return azq.h($$0, this.bK, this.bM) / 6.0F;
   }

   @Override
   protected float fk() {
      return 0.98F;
   }

   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      if ($$3 == null) {
         $$3 = new bwl.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cgl<crz> {
      public a() {
         super(ckk.this, crz.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (ckk.this.n_()) {
            return false;
         } else {
            if (super.b()) {
               for (ckk $$1 : ckk.this.dV().a(ckk.class, ckk.this.cR().c(8.0, 4.0, 8.0))) {
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

   class b extends cgk {
      public b() {
         super(ckk.this);
      }

      @Override
      public void d() {
         super.d();
         if (ckk.this.n_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bxy $$0, bxw $$1) {
         if ($$0 instanceof ckk && !$$0.n_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cfc {
      public c() {
         super(ckk.this, 1.25, true);
      }

      @Override
      protected void a(bxw $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            ckk.this.w(false);
         } else if (this.a.g((bwv)$$0) < (double)(($$0.dq() + 3.0F) * ($$0.dq() + 3.0F))) {
            if (this.i()) {
               ckk.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               ckk.this.w(true);
               ckk.this.t();
            }
         } else {
            this.h();
            ckk.this.w(false);
         }
      }

      @Override
      public void e() {
         ckk.this.w(false);
         super.e();
      }
   }
}
