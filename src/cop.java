import javax.annotation.Nullable;

public class cop extends cod {
   private static final akj<Byte> a = akn.a(cop.class, akl.a);
   private static final float b = 0.1F;

   public cop(bwo<? extends cop> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cdu(this));
      this.bD.a(2, new cdh<>(this, ckk.class, 6.0F, 1.0, 1.2, $$0 -> !((ckk)$$0).t()));
      this.bD.a(3, new ceg(this, 0.4F));
      this.bD.a(4, new cop.a(this));
      this.bD.a(5, new cfn(this, 0.8));
      this.bD.a(6, new cei(this, crc.class, 8.0F));
      this.bD.a(6, new cev(this));
      this.bE.a(1, new cfs(this));
      this.bE.a(2, new cop.c<>(this, crc.class));
      this.bE.a(3, new cop.c<>(this, cjk.class));
   }

   @Override
   protected cgo b(dja $$0) {
      return new cgp(this, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
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

   public static byj.a m() {
      return cod.gu().a(byk.s, 16.0).a(byk.v, 0.3F);
   }

   @Override
   protected awm u() {
      return awn.zP;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.zR;
   }

   @Override
   protected awm l_() {
      return awn.zQ;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.zS, 0.15F, 1.0F);
   }

   @Override
   public boolean d_() {
      return this.n();
   }

   @Override
   public void a(eah $$0, feq $$1) {
      if (!$$0.a(dmh.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(bvj $$0) {
      return $$0.a(bvl.s) ? false : super.b($$0);
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
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azv $$4 = $$0.C_();
      if ($$4.a(100) == 0) {
         col $$5 = bwo.bf.a(this.dV(), bwn.g);
         if ($$5 != null) {
            $$5.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cop.b();
         if ($$0.an() == bua.d && $$4.i() < 0.1F * $$1.d()) {
            ((cop.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cop.b $$6) {
         je<bvh> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new bvj($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public feq l(bwf $$0) {
      return $$0.dq() <= this.dq() ? new feq(0.0, 0.3125 * (double)this.el(), 0.0) : super.l($$0);
   }

   static class a extends cek {
      public a(cop $$0) {
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

   public static class b implements bxw {
      @Nullable
      public je<bvh> a;

      public void a(azv $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bvl.a;
         } else if ($$1 <= 2) {
            this.a = bvl.e;
         } else if ($$1 <= 3) {
            this.a = bvl.j;
         } else if ($$1 <= 4) {
            this.a = bvl.n;
         }
      }
   }

   static class c<T extends bxe> extends cft<T> {
      public c(cop $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bx();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
