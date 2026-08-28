import javax.annotation.Nullable;

public class ckq extends ckf {
   private static final akk<Byte> b = ako.a(ckq.class, akm.a);
   private static final float c = 0.1F;

   public ckq(btc<? extends ckq> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new caj(this));
      this.bS.a(2, new bzw<>(this, cgq.class, 6.0F, 1.0, 1.2, $$0 -> !((cgq)$$0).u()));
      this.bS.a(3, new cav(this, 0.4F));
      this.bS.a(4, new ckq.a(this));
      this.bS.a(5, new ccc(this, 0.8));
      this.bS.a(6, new cax(this, cmz.class, 8.0F));
      this.bS.a(6, new cbk(this));
      this.bT.a(1, new cch(this));
      this.bT.a(2, new ckq.c<>(this, cmz.class));
      this.bT.a(3, new ckq.c<>(this, cft.class));
   }

   @Override
   protected cdd b(dca $$0) {
      return new cde(this, $$0);
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

   public static buy.a u() {
      return ckf.gw().a(buz.q, 16.0).a(buz.r, 0.3F);
   }

   @Override
   protected avz v() {
      return awa.yI;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.yK;
   }

   @Override
   protected avz o_() {
      return awa.yJ;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(awa.yL, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(dse $$0, evt $$1) {
      if (!$$0.a(dfd.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bse $$0) {
      return $$0.a(bsg.s) ? false : super.c($$0);
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
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         ckn $$5 = btc.aN.a(this.dP());
         if ($$5 != null) {
            $$5.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new ckq.b();
         if ($$0.al() == bqt.d && $$4.i() < 0.1F * $$1.d()) {
            ((ckq.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof ckq.b $$6) {
         ji<bsc> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bse($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public evt l(bsw $$0) {
      return $$0.dj() <= this.dj() ? new evt(0.0, 0.3125 * (double)this.ee(), 0.0) : super.l($$0);
   }

   static class a extends caz {
      public a(ckq $$0) {
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

   public static class b implements buk {
      @Nullable
      public ji<bsc> a;

      public void a(azh $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bsg.a;
         } else if ($$1 <= 2) {
            this.a = bsg.e;
         } else if ($$1 <= 3) {
            this.a = bsg.j;
         } else if ($$1 <= 4) {
            this.a = bsg.n;
         }
      }
   }

   static class c<T extends btr> extends cci<T> {
      public c(ckq $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bt();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
