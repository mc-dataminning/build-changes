import javax.annotation.Nullable;

public class cpk extends coz {
   private static final akl<Byte> a = akp.a(cpk.class, akn.a);
   private static final float b = 0.1F;

   public cpk(bxc<? extends cpk> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cek(this));
      this.bF.a(2, new cdx<>(this, ckw.class, 6.0F, 1.0, 1.2, $$0 -> !((ckw)$$0).t()));
      this.bF.a(3, new cew(this, 0.4F));
      this.bF.a(4, new cpk.a(this));
      this.bF.a(5, new cgd(this, 0.8));
      this.bF.a(6, new cey(this, crx.class, 8.0F));
      this.bF.a(6, new cfl(this));
      this.bG.a(1, new cgi(this));
      this.bG.a(2, new cpk.c<>(this, crx.class));
      this.bG.a(3, new cpk.c<>(this, cka.class));
   }

   @Override
   protected che b(djx $$0) {
      return new chf(this, $$0);
   }

   @Override
   protected void a(akp.a $$0) {
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

   public static byz.a m() {
      return coz.gx().a(bza.s, 16.0).a(bza.v, 0.3F);
   }

   @Override
   protected awo u() {
      return awp.zP;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.zR;
   }

   @Override
   protected awo l_() {
      return awp.zQ;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.zS, 0.15F, 1.0F);
   }

   @Override
   public boolean d_() {
      return this.n();
   }

   @Override
   public void a(ebe $$0, ffq $$1) {
      if (!$$0.a(dne.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(bvx $$0) {
      return $$0.a(bvz.s) ? false : super.b($$0);
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
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azx $$4 = $$0.G_();
      if ($$4.a(100) == 0) {
         cph $$5 = bxc.bg.a(this.dV(), bxb.g);
         if ($$5 != null) {
            $$5.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cpk.b();
         if ($$0.an() == buo.d && $$4.i() < 0.1F * $$1.d()) {
            ((cpk.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cpk.b $$6) {
         jf<bvv> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new bvx($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public ffq l(bwt $$0) {
      return $$0.dq() <= this.dq() ? new ffq(0.0, 0.3125 * (double)this.el(), 0.0) : super.l($$0);
   }

   static class a extends cfa {
      public a(cpk $$0) {
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

   public static class b implements bym {
      @Nullable
      public jf<bvv> a;

      public void a(azx $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bvz.a;
         } else if ($$1 <= 2) {
            this.a = bvz.e;
         } else if ($$1 <= 3) {
            this.a = bvz.j;
         } else if ($$1 <= 4) {
            this.a = bvz.n;
         }
      }
   }

   static class c<T extends bxu> extends cgj<T> {
      public c(cpk $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bw();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
