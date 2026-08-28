import java.util.UUID;
import javax.annotation.Nullable;

public class cki extends cjk implements bxz {
   private static final akl<Boolean> bI = akp.a(cki.class, akn.k);
   private static final float bJ = 6.0F;
   private float bK;
   private float bM;
   private int bN;
   private static final buc bO = bas.a(20, 39);
   private int bP;
   @Nullable
   private UUID bQ;

   public cki(bxc<? extends cki> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bwj a(ars $$0, bwj $$1) {
      return bxc.aV.a($$0, bxb.e);
   }

   @Override
   public boolean i(czy $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cek(this));
      this.bF.a(1, new cki.c());
      this.bF.a(1, new cfj(this, 2.0, $$0 -> $$0.n_() ? axf.F : axf.G));
      this.bF.a(4, new cep(this, 1.25));
      this.bF.a(5, new cfn(this, 1.0));
      this.bF.a(6, new cey(this, crx.class, 6.0F));
      this.bF.a(7, new cfl(this));
      this.bG.a(1, new cki.b());
      this.bG.a(2, new cki.a());
      this.bG.a(3, new cgj<>(this, crx.class, 10, true, false, this::a));
      this.bG.a(4, new cgj<>(this, cjz.class, 10, true, true, null));
      this.bG.a(5, new cgp<>(this, false));
   }

   public static byz.a q() {
      return cjk.gz().a(bza.s, 30.0).a(bza.m, 20.0).a(bza.v, 0.25).a(bza.c, 6.0);
   }

   public static boolean c(bxc<cki> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      jf<dla> $$5 = $$1.u($$3);
      return !$$5.a(axd.aq) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(axe.cg);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(this.dV(), $$0);
   }

   @Override
   public void b(tz $$0) {
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
   protected awo u() {
      return this.n_() ? awp.vl : awp.vk;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.vn;
   }

   @Override
   protected awo l_() {
      return awp.vm;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.vo, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.bN <= 0) {
         this.b(awp.vp);
         this.bN = 40;
      }
   }

   @Override
   protected void a(akp.a $$0) {
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
            this.bM = azo.a(this.bM + 1.0F, 0.0F, 6.0F);
         } else {
            this.bM = azo.a(this.bM - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bN > 0) {
         this.bN--;
      }

      if (!this.dV().C) {
         this.a((ars)this.dV(), true);
      }
   }

   @Override
   public bww e(byg $$0) {
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
      return azo.h($$0, this.bK, this.bM) / 6.0F;
   }

   @Override
   protected float fk() {
      return 0.98F;
   }

   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      if ($$3 == null) {
         $$3 = new bwj.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cgj<crx> {
      public a() {
         super(cki.this, crx.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cki.this.n_()) {
            return false;
         } else {
            if (super.b()) {
               for (cki $$1 : cki.this.dV().a(cki.class, cki.this.cR().c(8.0, 4.0, 8.0))) {
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

   class b extends cgi {
      public b() {
         super(cki.this);
      }

      @Override
      public void d() {
         super.d();
         if (cki.this.n_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bxw $$0, bxu $$1) {
         if ($$0 instanceof cki && !$$0.n_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cfa {
      public c() {
         super(cki.this, 1.25, true);
      }

      @Override
      protected void a(bxu $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cki.this.w(false);
         } else if (this.a.g((bwt)$$0) < (double)(($$0.dq() + 3.0F) * ($$0.dq() + 3.0F))) {
            if (this.i()) {
               cki.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cki.this.w(true);
               cki.this.t();
            }
         } else {
            this.h();
            cki.this.w(false);
         }
      }

      @Override
      public void e() {
         cki.this.w(false);
         super.e();
      }
   }
}
