import javax.annotation.Nullable;

public class cko extends ckd {
   private static final akk<Byte> b = ako.a(cko.class, akm.a);
   private static final float c = 0.1F;

   public cko(bta<? extends cko> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cah(this));
      this.bS.a(2, new bzu<>(this, cgo.class, 6.0F, 1.0, 1.2, $$0 -> !((cgo)$$0).u()));
      this.bS.a(3, new cat(this, 0.4F));
      this.bS.a(4, new cko.a(this));
      this.bS.a(5, new cca(this, 0.8));
      this.bS.a(6, new cav(this, cmx.class, 8.0F));
      this.bS.a(6, new cbi(this));
      this.bT.a(1, new ccf(this));
      this.bT.a(2, new cko.c<>(this, cmx.class));
      this.bT.a(3, new cko.c<>(this, cfr.class));
   }

   @Override
   protected cdb b(dby $$0) {
      return new cdc(this, $$0);
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

   public static buw.a u() {
      return ckd.gw().a(bux.q, 16.0).a(bux.r, 0.3F);
   }

   @Override
   protected avz v() {
      return awa.yI;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.yK;
   }

   @Override
   protected avz o_() {
      return awa.yJ;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.yL, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(dsc $$0, evr $$1) {
      if (!$$0.a(dfb.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bsc $$0) {
      return $$0.a(bse.s) ? false : super.c($$0);
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
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         ckl $$5 = bta.aN.a(this.dP());
         if ($$5 != null) {
            $$5.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cko.b();
         if ($$0.al() == bqr.d && $$4.i() < 0.1F * $$1.d()) {
            ((cko.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cko.b $$6) {
         ji<bsa> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bsc($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public evr l(bsu $$0) {
      return $$0.dj() <= this.dj() ? new evr(0.0, 0.3125 * (double)this.ee(), 0.0) : super.l($$0);
   }

   static class a extends cax {
      public a(cko $$0) {
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

   public static class b implements bui {
      @Nullable
      public ji<bsa> a;

      public void a(azh $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bse.a;
         } else if ($$1 <= 2) {
            this.a = bse.e;
         } else if ($$1 <= 3) {
            this.a = bse.j;
         } else if ($$1 <= 4) {
            this.a = bse.n;
         }
      }
   }

   static class c<T extends btp> extends ccg<T> {
      public c(cko $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bt();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
