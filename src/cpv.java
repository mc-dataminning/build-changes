import javax.annotation.Nullable;

public class cpv extends cpk {
   private static final aku<Byte> a = aky.a(cpv.class, akw.a);
   private static final float b = 0.1F;

   public cpv(bxn<? extends cpv> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void C() {
      this.bF.a(1, new cev(this));
      this.bF.a(2, new cei<>(this, clh.class, 6.0F, 1.0, 1.2, $$0 -> !((clh)$$0).p()));
      this.bF.a(3, new cfh(this, 0.4F));
      this.bF.a(4, new cpv.a(this));
      this.bF.a(5, new cgo(this, 0.8));
      this.bF.a(6, new cfj(this, csi.class, 8.0F));
      this.bF.a(6, new cfw(this));
      this.bG.a(1, new cgt(this));
      this.bG.a(2, new cpv.c<>(this, csi.class));
      this.bG.a(3, new cpv.c<>(this, ckl.class));
   }

   @Override
   protected chp b(dkj $$0) {
      return new chq(this, $$0);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void g() {
      super.g();
      if (!this.dV().C) {
         this.w(this.P);
      }
   }

   public static bzk.a p() {
      return cpk.gA().a(bzl.s, 16.0).a(bzl.v, 0.3F);
   }

   @Override
   protected awx s() {
      return awy.zP;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.zR;
   }

   @Override
   protected awx j_() {
      return awy.zQ;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.zS, 0.15F, 1.0F);
   }

   @Override
   public boolean k_() {
      return this.u();
   }

   @Override
   public void a(ebq $$0, fgc $$1) {
      if (!$$0.a(dnq.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(bwi $$0) {
      return $$0.a(bwk.s) ? false : super.b($$0);
   }

   public boolean u() {
      return (this.al.a(a) & 1) != 0;
   }

   public void w(boolean $$0) {
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
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bai $$4 = $$0.G_();
      if ($$4.a(100) == 0) {
         cps $$5 = bxn.bg.a(this.dV(), bxm.g);
         if ($$5 != null) {
            $$5.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cpv.b();
         if ($$0.an() == buz.d && $$4.i() < 0.1F * $$1.d()) {
            ((cpv.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cpv.b $$6) {
         jg<bwg> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new bwi($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fgc l(bxe $$0) {
      return $$0.dq() <= this.dq() ? new fgc(0.0, 0.3125 * (double)this.el(), 0.0) : super.l($$0);
   }

   static class a extends cfl {
      public a(cpv $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.bZ();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.bw();
         if ($$0 >= 0.5F && this.a.dY().a(100) == 0) {
            this.a.g(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements byx {
      @Nullable
      public jg<bwg> a;

      public void a(bai $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bwk.a;
         } else if ($$1 <= 2) {
            this.a = bwk.e;
         } else if ($$1 <= 3) {
            this.a = bwk.j;
         } else if ($$1 <= 4) {
            this.a = bwk.n;
         }
      }
   }

   static class c<T extends byf> extends cgu<T> {
      public c(cpv $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bw();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
