import javax.annotation.Nullable;

public class cni extends cmx {
   private static final alc<Byte> a = alg.a(cni.class, ale.a);
   private static final float b = 0.1F;

   public cni(bvr<? extends cni> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(1, new ccy(this));
      this.bT.a(2, new ccl<>(this, cjg.class, 6.0F, 1.0, 1.2, $$0 -> !((cjg)$$0).t()));
      this.bT.a(3, new cdk(this, 0.4F));
      this.bT.a(4, new cni.a(this));
      this.bT.a(5, new cer(this, 0.8));
      this.bT.a(6, new cdm(this, cpx.class, 8.0F));
      this.bT.a(6, new cdz(this));
      this.bU.a(1, new cew(this));
      this.bU.a(2, new cni.c<>(this, cpx.class));
      this.bU.a(3, new cni.c<>(this, cij.class));
   }

   @Override
   protected cfs b(dhi $$0) {
      return new cft(this, $$0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dW().C) {
         this.x(this.P);
      }
   }

   public static bxn.a p() {
      return cmx.gt().a(bxo.s, 16.0).a(bxo.v, 0.3F);
   }

   @Override
   protected axe u() {
      return axf.zk;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.zm;
   }

   @Override
   protected axe o_() {
      return axf.zl;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.zn, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.t();
   }

   @Override
   public void a(dxv $$0, fby $$1) {
      if (!$$0.a(dko.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(bup $$0) {
      return $$0.a(bur.s) ? false : super.b($$0);
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
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bam $$4 = $$0.H_();
      if ($$4.a(100) == 0) {
         cnf $$5 = bvr.bf.a(this.dW(), bvq.g);
         if ($$5 != null) {
            $$5.b(this.dB(), this.dD(), this.dH(), this.dM(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cni.b();
         if ($$0.al() == btg.d && $$4.i() < 0.1F * $$1.d()) {
            ((cni.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cni.b $$6) {
         jq<bun> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new bup($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fby l(bvk $$0) {
      return $$0.dr() <= this.dr() ? new fby(0.0, 0.3125 * (double)this.ek(), 0.0) : super.l($$0);
   }

   static class a extends cdo {
      public a(cni $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.ca();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.by();
         if ($$0 >= 0.5F && this.a.dZ().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements bwz {
      @Nullable
      public jq<bun> a;

      public void a(bam $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bur.a;
         } else if ($$1 <= 2) {
            this.a = bur.e;
         } else if ($$1 <= 3) {
            this.a = bur.j;
         } else if ($$1 <= 4) {
            this.a = bur.n;
         }
      }
   }

   static class c<T extends bwg> extends cex<T> {
      public c(cni $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.by();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
