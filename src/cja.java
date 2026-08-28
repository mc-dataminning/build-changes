import java.util.UUID;
import javax.annotation.Nullable;

public class cja extends cig implements bww {
   private static final akg<Boolean> bE = akk.a(cja.class, aki.k);
   private static final float bF = 6.0F;
   private float bG;
   private float bI;
   private int bJ;
   private static final btb bK = bam.a(20, 39);
   private int bL;
   @Nullable
   private UUID bM;

   public cja(bwb<? extends cja> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      return bwb.aU.a($$0, bwa.e);
   }

   @Override
   public boolean k(cxy $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bB.a(0, new cdh(this));
      this.bB.a(1, new cja.c());
      this.bB.a(1, new ceg(this, 2.0, $$0 -> $$0.n_() ? axb.F : axb.G));
      this.bB.a(4, new cdm(this, 1.25));
      this.bB.a(5, new cek(this, 1.0));
      this.bB.a(6, new cdv(this, cqi.class, 6.0F));
      this.bB.a(7, new cei(this));
      this.bC.a(1, new cja.b());
      this.bC.a(2, new cja.a());
      this.bC.a(3, new cfg<>(this, cqi.class, 10, true, false, this::a));
      this.bC.a(4, new cfg<>(this, ciq.class, 10, true, true, null));
      this.bC.a(5, new cfm<>(this, false));
   }

   public static bxw.a q() {
      return cig.gv().a(bxx.s, 30.0).a(bxx.m, 20.0).a(bxx.v, 0.25).a(bxx.c, 6.0);
   }

   public static boolean c(bwb<cja> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      js<dis> $$5 = $$1.t($$3);
      return !$$5.a(awy.aq) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(awz.cf);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a(this.dV(), $$0);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(bK.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.bL = $$0;
   }

   @Override
   public int a() {
      return this.bL;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bM = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bM;
   }

   @Override
   protected awj u() {
      return this.n_() ? awk.vh : awk.vg;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.vj;
   }

   @Override
   protected awj l_() {
      return awk.vi;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.vk, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.bJ <= 0) {
         this.b(awk.vl);
         this.bJ = 40;
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bE, false);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         if (this.bI != this.bG) {
            this.i_();
         }

         this.bG = this.bI;
         if (this.x()) {
            this.bI = azk.a(this.bI + 1.0F, 0.0F, 6.0F);
         } else {
            this.bI = azk.a(this.bI - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bJ > 0) {
         this.bJ--;
      }

      if (!this.dV().C) {
         this.a((arn)this.dV(), true);
      }
   }

   @Override
   public bvv e(bxd $$0) {
      if (this.bI > 0.0F) {
         float $$1 = this.bI / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean x() {
      return this.al.a(bE);
   }

   public void w(boolean $$0) {
      this.al.a(bE, $$0);
   }

   public float K(float $$0) {
      return azk.h($$0, this.bG, this.bI) / 6.0F;
   }

   @Override
   protected float fj() {
      return 0.98F;
   }

   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      if ($$3 == null) {
         $$3 = new bvi.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cfg<cqi> {
      public a() {
         super(cja.this, cqi.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cja.this.n_()) {
            return false;
         } else {
            if (super.b()) {
               for (cja $$1 : cja.this.dV().a(cja.class, cja.this.cR().c(8.0, 4.0, 8.0))) {
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

   class b extends cff {
      public b() {
         super(cja.this);
      }

      @Override
      public void d() {
         super.d();
         if (cja.this.n_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bwt $$0, bwr $$1) {
         if ($$0 instanceof cja && !$$0.n_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cdx {
      public c() {
         super(cja.this, 1.25, true);
      }

      @Override
      protected void a(bwr $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cja.this.w(false);
         } else if (this.a.g((bvs)$$0) < (double)(($$0.dq() + 3.0F) * ($$0.dq() + 3.0F))) {
            if (this.i()) {
               cja.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cja.this.w(true);
               cja.this.t();
            }
         } else {
            this.h();
            cja.this.w(false);
         }
      }

      @Override
      public void e() {
         cja.this.w(false);
         super.e();
      }
   }
}
