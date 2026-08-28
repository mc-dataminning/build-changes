import javax.annotation.Nullable;

public class ckj extends cjy {
   private static final akg<Byte> b = akk.a(ckj.class, aki.a);
   private static final float c = 0.1F;

   public ckj(bsv<? extends ckj> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cac(this));
      this.bS.a(2, new bzp<>(this, cgj.class, 6.0F, 1.0, 1.2, $$0 -> !((cgj)$$0).u()));
      this.bS.a(3, new cao(this, 0.4F));
      this.bS.a(4, new ckj.a(this));
      this.bS.a(5, new cbv(this, 0.8));
      this.bS.a(6, new caq(this, cms.class, 8.0F));
      this.bS.a(6, new cbd(this));
      this.bT.a(1, new cca(this));
      this.bT.a(2, new ckj.c<>(this, cms.class));
      this.bT.a(3, new ckj.c<>(this, cfm.class));
   }

   @Override
   protected ccw b(dbt $$0) {
      return new ccx(this, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dP().B) {
         this.w(this.Q);
      }
   }

   public static bur.a u() {
      return cjy.gw().a(bus.q, 16.0).a(bus.r, 0.3F);
   }

   @Override
   protected avv v() {
      return avw.yI;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.yK;
   }

   @Override
   protected avv o_() {
      return avw.yJ;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.yL, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(drx $$0, evm $$1) {
      if (!$$0.a(dew.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(brx $$0) {
      return $$0.a(brz.s) ? false : super.c($$0);
   }

   public boolean y() {
      return (this.ao.a(b) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.ao.a(b);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.ao.a(b, $$1);
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azc $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         ckg $$5 = bsv.aN.a(this.dP());
         if ($$5 != null) {
            $$5.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new ckj.b();
         if ($$0.al() == bqm.d && $$4.i() < 0.1F * $$1.d()) {
            ((ckj.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof ckj.b $$6) {
         ji<brv> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new brx($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public evm l(bsp $$0) {
      return $$0.dj() <= this.dj() ? new evm(0.0, 0.3125 * (double)this.ee(), 0.0) : super.l($$0);
   }

   static class a extends cas {
      public a(ckj $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bS();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.bt();
         if ($$0 >= 0.5F && this.a.el().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements bud {
      @Nullable
      public ji<brv> a;

      public void a(azc $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = brz.a;
         } else if ($$1 <= 2) {
            this.a = brz.e;
         } else if ($$1 <= 3) {
            this.a = brz.j;
         } else if ($$1 <= 4) {
            this.a = brz.n;
         }
      }
   }

   static class c<T extends btk> extends ccb<T> {
      public c(ckj $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bt();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
