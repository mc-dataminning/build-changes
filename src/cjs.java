import java.util.UUID;
import javax.annotation.Nullable;

public class cjs extends ciu implements bxj {
   private static final akj<Boolean> bG = akn.a(cjs.class, akl.k);
   private static final float bH = 6.0F;
   private float bI;
   private float bK;
   private int bL;
   private static final bto bM = baq.a(20, 39);
   private int bN;
   @Nullable
   private UUID bO;

   public cjs(bwo<? extends cjs> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bvv a(arq $$0, bvv $$1) {
      return bwo.aU.a($$0, bwn.e);
   }

   @Override
   public boolean i(czd $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdu(this));
      this.bD.a(1, new cjs.c());
      this.bD.a(1, new cet(this, 2.0, $$0 -> $$0.n_() ? axd.F : axd.G));
      this.bD.a(4, new cdz(this, 1.25));
      this.bD.a(5, new cex(this, 1.0));
      this.bD.a(6, new cei(this, crc.class, 6.0F));
      this.bD.a(7, new cev(this));
      this.bE.a(1, new cjs.b());
      this.bE.a(2, new cjs.a());
      this.bE.a(3, new cft<>(this, crc.class, 10, true, false, this::a));
      this.bE.a(4, new cft<>(this, cjj.class, 10, true, true, null));
      this.bE.a(5, new cfz<>(this, false));
   }

   public static byj.a q() {
      return ciu.gw().a(byk.s, 30.0).a(byk.m, 20.0).a(byk.v, 0.25).a(byk.c, 6.0);
   }

   public static boolean c(bwo<cjs> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      je<dkd> $$5 = $$1.u($$3);
      return !$$5.a(axb.aq) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(axc.cg);
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
      this.a(bM.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.bN = $$0;
   }

   @Override
   public int a() {
      return this.bN;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bO = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bO;
   }

   @Override
   protected awm u() {
      return this.n_() ? awn.vl : awn.vk;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.vn;
   }

   @Override
   protected awm l_() {
      return awn.vm;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.vo, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.bL <= 0) {
         this.b(awn.vp);
         this.bL = 40;
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, false);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         if (this.bK != this.bI) {
            this.i_();
         }

         this.bI = this.bK;
         if (this.x()) {
            this.bK = azm.a(this.bK + 1.0F, 0.0F, 6.0F);
         } else {
            this.bK = azm.a(this.bK - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bL > 0) {
         this.bL--;
      }

      if (!this.dV().C) {
         this.a((arq)this.dV(), true);
      }
   }

   @Override
   public bwi e(bxq $$0) {
      if (this.bK > 0.0F) {
         float $$1 = this.bK / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean x() {
      return this.al.a(bG);
   }

   public void w(boolean $$0) {
      this.al.a(bG, $$0);
   }

   public float J(float $$0) {
      return azm.h($$0, this.bI, this.bK) / 6.0F;
   }

   @Override
   protected float fk() {
      return 0.98F;
   }

   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      if ($$3 == null) {
         $$3 = new bvv.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cft<crc> {
      public a() {
         super(cjs.this, crc.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cjs.this.n_()) {
            return false;
         } else {
            if (super.b()) {
               for (cjs $$1 : cjs.this.dV().a(cjs.class, cjs.this.cR().c(8.0, 4.0, 8.0))) {
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

   class b extends cfs {
      public b() {
         super(cjs.this);
      }

      @Override
      public void d() {
         super.d();
         if (cjs.this.n_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bxg $$0, bxe $$1) {
         if ($$0 instanceof cjs && !$$0.n_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cek {
      public c() {
         super(cjs.this, 1.25, true);
      }

      @Override
      protected void a(bxe $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cjs.this.w(false);
         } else if (this.a.g((bwf)$$0) < (double)(($$0.dq() + 3.0F) * ($$0.dq() + 3.0F))) {
            if (this.i()) {
               cjs.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cjs.this.w(true);
               cjs.this.t();
            }
         } else {
            this.h();
            cjs.this.w(false);
         }
      }

      @Override
      public void e() {
         cjs.this.w(false);
         super.e();
      }
   }
}
