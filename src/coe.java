import javax.annotation.Nullable;

public class coe extends cnt {
   private static final akh<Byte> a = akl.a(coe.class, akj.a);
   private static final float b = 0.1F;

   public coe(bwj<? extends coe> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cdp(this));
      this.bC.a(2, new cdc<>(this, cka.class, 6.0F, 1.0, 1.2, $$0 -> !((cka)$$0).t()));
      this.bC.a(3, new ceb(this, 0.4F));
      this.bC.a(4, new coe.a(this));
      this.bC.a(5, new cfi(this, 0.8));
      this.bC.a(6, new ced(this, cqs.class, 8.0F));
      this.bC.a(6, new ceq(this));
      this.bD.a(1, new cfn(this));
      this.bD.a(2, new coe.c<>(this, cqs.class));
      this.bD.a(3, new coe.c<>(this, cja.class));
   }

   @Override
   protected cgj b(dip $$0) {
      return new cgk(this, $$0);
   }

   @Override
   protected void a(akl.a $$0) {
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

   public static bye.a m() {
      return cnt.gt().a(byf.s, 16.0).a(byf.v, 0.3F);
   }

   @Override
   protected awk u() {
      return awl.zJ;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.zL;
   }

   @Override
   protected awk l_() {
      return awl.zK;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.zM, 0.15F, 1.0F);
   }

   @Override
   public boolean d_() {
      return this.n();
   }

   @Override
   public void a(dzo $$0, fdw $$1) {
      if (!$$0.a(dlw.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(bve $$0) {
      return $$0.a(bvg.s) ? false : super.b($$0);
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
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azt $$4 = $$0.C_();
      if ($$4.a(100) == 0) {
         cob $$5 = bwj.bf.a(this.dV(), bwi.g);
         if ($$5 != null) {
            $$5.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new coe.b();
         if ($$0.an() == btv.d && $$4.i() < 0.1F * $$1.d()) {
            ((coe.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof coe.b $$6) {
         je<bvc> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new bve($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fdw l(bwa $$0) {
      return $$0.dq() <= this.dq() ? new fdw(0.0, 0.3125 * (double)this.ek(), 0.0) : super.l($$0);
   }

   static class a extends cef {
      public a(coe $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.ca();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.bx();
         if ($$0 >= 0.5F && this.a.dY().a(100) == 0) {
            this.a.g(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements bxr {
      @Nullable
      public je<bvc> a;

      public void a(azt $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bvg.a;
         } else if ($$1 <= 2) {
            this.a = bvg.e;
         } else if ($$1 <= 3) {
            this.a = bvg.j;
         } else if ($$1 <= 4) {
            this.a = bvg.n;
         }
      }
   }

   static class c<T extends bwz> extends cfo<T> {
      public c(coe $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bx();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
