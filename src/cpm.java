import javax.annotation.Nullable;

public class cpm extends cpb {
   private static final akn<Byte> a = akr.a(cpm.class, akp.a);
   private static final float b = 0.1F;

   public cpm(bxe<? extends cpm> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cem(this));
      this.bF.a(2, new cdz<>(this, cky.class, 6.0F, 1.0, 1.2, $$0 -> !((cky)$$0).t()));
      this.bF.a(3, new cey(this, 0.4F));
      this.bF.a(4, new cpm.a(this));
      this.bF.a(5, new cgf(this, 0.8));
      this.bF.a(6, new cfa(this, crz.class, 8.0F));
      this.bF.a(6, new cfn(this));
      this.bG.a(1, new cgk(this));
      this.bG.a(2, new cpm.c<>(this, crz.class));
      this.bG.a(3, new cpm.c<>(this, ckc.class));
   }

   @Override
   protected chg b(djz $$0) {
      return new chh(this, $$0);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().C) {
         this.w(this.P);
      }
   }

   public static bzb.a m() {
      return cpb.gx().a(bzc.s, 16.0).a(bzc.v, 0.3F);
   }

   @Override
   protected awq u() {
      return awr.zP;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.zR;
   }

   @Override
   protected awq l_() {
      return awr.zQ;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.zS, 0.15F, 1.0F);
   }

   @Override
   public boolean d_() {
      return this.n();
   }

   @Override
   public void a(ebg $$0, ffs $$1) {
      if (!$$0.a(dng.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(bvz $$0) {
      return $$0.a(bwb.s) ? false : super.b($$0);
   }

   public boolean n() {
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
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azz $$4 = $$0.G_();
      if ($$4.a(100) == 0) {
         cpj $$5 = bxe.bg.a(this.dV(), bxd.g);
         if ($$5 != null) {
            $$5.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cpm.b();
         if ($$0.an() == buq.d && $$4.i() < 0.1F * $$1.d()) {
            ((cpm.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cpm.b $$6) {
         jg<bvx> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new bvz($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public ffs l(bwv $$0) {
      return $$0.dq() <= this.dq() ? new ffs(0.0, 0.3125 * (double)this.el(), 0.0) : super.l($$0);
   }

   static class a extends cfc {
      public a(cpm $$0) {
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

   public static class b implements byo {
      @Nullable
      public jg<bvx> a;

      public void a(azz $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bwb.a;
         } else if ($$1 <= 2) {
            this.a = bwb.e;
         } else if ($$1 <= 3) {
            this.a = bwb.j;
         } else if ($$1 <= 4) {
            this.a = bwb.n;
         }
      }
   }

   static class c<T extends bxw> extends cgl<T> {
      public c(cpm $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bw();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
