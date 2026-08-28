import javax.annotation.Nullable;

public class cnd extends cms {
   private static final alc<Byte> a = alg.a(cnd.class, ale.a);
   private static final float b = 0.1F;

   public cnd(bvm<? extends cnd> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cct(this));
      this.bT.a(2, new ccg<>(this, cjb.class, 6.0F, 1.0, 1.2, $$0 -> !((cjb)$$0).t()));
      this.bT.a(3, new cdf(this, 0.4F));
      this.bT.a(4, new cnd.a(this));
      this.bT.a(5, new cem(this, 0.8));
      this.bT.a(6, new cdh(this, cps.class, 8.0F));
      this.bT.a(6, new cdu(this));
      this.bU.a(1, new cer(this));
      this.bU.a(2, new cnd.c<>(this, cps.class));
      this.bU.a(3, new cnd.c<>(this, cie.class));
   }

   @Override
   protected cfn b(dha $$0) {
      return new cfo(this, $$0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().C) {
         this.x(this.P);
      }
   }

   public static bxi.a p() {
      return cms.gr().a(bxj.s, 16.0).a(bxj.v, 0.3F);
   }

   @Override
   protected axe u() {
      return axf.zj;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.zl;
   }

   @Override
   protected axe o_() {
      return axf.zk;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.zm, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.t();
   }

   @Override
   public void a(dxn $$0, fbs $$1) {
      if (!$$0.a(dkg.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(buk $$0) {
      return $$0.a(bum.s) ? false : super.b($$0);
   }

   public boolean t() {
      return (this.al.a(a) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(a);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.al.a(a, $$1);
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bam $$4 = $$0.H_();
      if ($$4.a(100) == 0) {
         cna $$5 = bvm.bf.a(this.dV(), bvl.g);
         if ($$5 != null) {
            $$5.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cnd.b();
         if ($$0.al() == btb.d && $$4.i() < 0.1F * $$1.d()) {
            ((cnd.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cnd.b $$6) {
         jq<bui> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new buk($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fbs l(bvf $$0) {
      return $$0.dq() <= this.dq() ? new fbs(0.0, 0.3125 * (double)this.ej(), 0.0) : super.l($$0);
   }

   static class a extends cdj {
      public a(cnd $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.ca();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.by();
         if ($$0 >= 0.5F && this.a.dY().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements bwu {
      @Nullable
      public jq<bui> a;

      public void a(bam $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bum.a;
         } else if ($$1 <= 2) {
            this.a = bum.e;
         } else if ($$1 <= 3) {
            this.a = bum.j;
         } else if ($$1 <= 4) {
            this.a = bum.n;
         }
      }
   }

   static class c<T extends bwb> extends ces<T> {
      public c(cnd $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.by();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
