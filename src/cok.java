import javax.annotation.Nullable;

public class cok extends cnz {
   private static final akj<Byte> a = akn.a(cok.class, akl.a);
   private static final float b = 0.1F;

   public cok(bwm<? extends cok> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cds(this));
      this.bC.a(2, new cdf<>(this, ckg.class, 6.0F, 1.0, 1.2, $$0 -> !((ckg)$$0).t()));
      this.bC.a(3, new cee(this, 0.4F));
      this.bC.a(4, new cok.a(this));
      this.bC.a(5, new cfl(this, 0.8));
      this.bC.a(6, new ceg(this, cqy.class, 8.0F));
      this.bC.a(6, new cet(this));
      this.bD.a(1, new cfq(this));
      this.bD.a(2, new cok.c<>(this, cqy.class));
      this.bD.a(3, new cok.c<>(this, cjg.class));
   }

   @Override
   protected cgm b(div $$0) {
      return new cgn(this, $$0);
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

   public static byh.a m() {
      return cnz.gt().a(byi.s, 16.0).a(byi.v, 0.3F);
   }

   @Override
   protected awm u() {
      return awn.zM;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.zO;
   }

   @Override
   protected awm l_() {
      return awn.zN;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.zP, 0.15F, 1.0F);
   }

   @Override
   public boolean d_() {
      return this.n();
   }

   @Override
   public void a(dzz $$0, fei $$1) {
      if (!$$0.a(dmc.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(bvh $$0) {
      return $$0.a(bvj.s) ? false : super.b($$0);
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
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azv $$4 = $$0.C_();
      if ($$4.a(100) == 0) {
         coh $$5 = bwm.bf.a(this.dV(), bwl.g);
         if ($$5 != null) {
            $$5.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cok.b();
         if ($$0.an() == bty.d && $$4.i() < 0.1F * $$1.d()) {
            ((cok.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cok.b $$6) {
         je<bvf> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new bvh($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fei l(bwd $$0) {
      return $$0.dq() <= this.dq() ? new fei(0.0, 0.3125 * (double)this.ek(), 0.0) : super.l($$0);
   }

   static class a extends cei {
      public a(cok $$0) {
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

   public static class b implements bxu {
      @Nullable
      public je<bvf> a;

      public void a(azv $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bvj.a;
         } else if ($$1 <= 2) {
            this.a = bvj.e;
         } else if ($$1 <= 3) {
            this.a = bvj.j;
         } else if ($$1 <= 4) {
            this.a = bvj.n;
         }
      }
   }

   static class c<T extends bxc> extends cfr<T> {
      public c(cok $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bx();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
