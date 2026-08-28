import javax.annotation.Nullable;

public class ckp extends cke {
   private static final akk<Byte> b = ako.a(ckp.class, akm.a);
   private static final float c = 0.1F;

   public ckp(btb<? extends ckp> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cai(this));
      this.bS.a(2, new bzv<>(this, cgp.class, 6.0F, 1.0, 1.2, $$0 -> !((cgp)$$0).u()));
      this.bS.a(3, new cau(this, 0.4F));
      this.bS.a(4, new ckp.a(this));
      this.bS.a(5, new ccb(this, 0.8));
      this.bS.a(6, new caw(this, cmy.class, 8.0F));
      this.bS.a(6, new cbj(this));
      this.bT.a(1, new ccg(this));
      this.bT.a(2, new ckp.c<>(this, cmy.class));
      this.bT.a(3, new ckp.c<>(this, cfs.class));
   }

   @Override
   protected cdc b(dbz $$0) {
      return new cdd(this, $$0);
   }

   @Override
   protected void a(ako.a $$0) {
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

   public static bux.a u() {
      return cke.gw().a(buy.q, 16.0).a(buy.r, 0.3F);
   }

   @Override
   protected avz v() {
      return awa.yI;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.yK;
   }

   @Override
   protected avz o_() {
      return awa.yJ;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.yL, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(dsd $$0, evs $$1) {
      if (!$$0.a(dfc.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bsd $$0) {
      return $$0.a(bsf.s) ? false : super.c($$0);
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
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         ckm $$5 = btb.aN.a(this.dP());
         if ($$5 != null) {
            $$5.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new ckp.b();
         if ($$0.al() == bqs.d && $$4.i() < 0.1F * $$1.d()) {
            ((ckp.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof ckp.b $$6) {
         ji<bsb> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bsd($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public evs l(bsv $$0) {
      return $$0.dj() <= this.dj() ? new evs(0.0, 0.3125 * (double)this.ee(), 0.0) : super.l($$0);
   }

   static class a extends cay {
      public a(ckp $$0) {
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

   public static class b implements buj {
      @Nullable
      public ji<bsb> a;

      public void a(azh $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bsf.a;
         } else if ($$1 <= 2) {
            this.a = bsf.e;
         } else if ($$1 <= 3) {
            this.a = bsf.j;
         } else if ($$1 <= 4) {
            this.a = bsf.n;
         }
      }
   }

   static class c<T extends btq> extends cch<T> {
      public c(ckp $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bt();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
