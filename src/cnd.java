import javax.annotation.Nullable;

public class cnd extends cms {
   private static final ajx<Byte> a = akb.a(cnd.class, ajz.a);
   private static final float b = 0.1F;

   public cnd(bvi<? extends cnd> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(1, new ccq(this));
      this.bC.a(2, new ccd<>(this, cjb.class, 6.0F, 1.0, 1.2, $$0 -> !((cjb)$$0).t()));
      this.bC.a(3, new cdc(this, 0.4F));
      this.bC.a(4, new cnd.a(this));
      this.bC.a(5, new cej(this, 0.8));
      this.bC.a(6, new cde(this, cpr.class, 8.0F));
      this.bC.a(6, new cdr(this));
      this.bD.a(1, new ceo(this));
      this.bD.a(2, new cnd.c<>(this, cpr.class));
      this.bD.a(3, new cnd.c<>(this, cib.class));
   }

   @Override
   protected cfk b(dgz $$0) {
      return new cfl(this, $$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dU().C) {
         this.w(this.P);
      }
   }

   public static bxf.a m() {
      return cms.gv().a(bxg.s, 16.0).a(bxg.v, 0.3F);
   }

   @Override
   protected avz u() {
      return awa.zJ;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.zL;
   }

   @Override
   protected avz l_() {
      return awa.zK;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.zM, 0.15F, 1.0F);
   }

   @Override
   public boolean d_() {
      return this.n();
   }

   @Override
   public void a(dxq $$0, fbx $$1) {
      if (!$$0.a(dkg.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(bue $$0) {
      return $$0.a(bug.s) ? false : super.b($$0);
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
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.C_();
      if ($$4.a(100) == 0) {
         cna $$5 = bvi.be.a(this.dU(), bvh.g);
         if ($$5 != null) {
            $$5.b(this.dz(), this.dB(), this.dF(), this.dK(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cnd.b();
         if ($$0.an() == bsv.d && $$4.i() < 0.1F * $$1.d()) {
            ((cnd.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cnd.b $$6) {
         jr<buc> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new bue($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fbx l(bva $$0) {
      return $$0.dp() <= this.dp() ? new fbx(0.0, 0.3125 * (double)this.ej(), 0.0) : super.l($$0);
   }

   static class a extends cdg {
      public a(cnd $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.bZ();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.bw();
         if ($$0 >= 0.5F && this.a.dX().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements bwr {
      @Nullable
      public jr<buc> a;

      public void a(azh $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bug.a;
         } else if ($$1 <= 2) {
            this.a = bug.e;
         } else if ($$1 <= 3) {
            this.a = bug.j;
         } else if ($$1 <= 4) {
            this.a = bug.n;
         }
      }
   }

   static class c<T extends bvy> extends cep<T> {
      public c(cnd $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bw();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
