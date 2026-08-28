import javax.annotation.Nullable;

public class ckm extends ckb {
   private static final akj<Byte> b = akn.a(ckm.class, akl.a);
   private static final float c = 0.1F;

   public ckm(bsy<? extends ckm> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new caf(this));
      this.bS.a(2, new bzs<>(this, cgm.class, 6.0F, 1.0, 1.2, $$0 -> !((cgm)$$0).u()));
      this.bS.a(3, new car(this, 0.4F));
      this.bS.a(4, new ckm.a(this));
      this.bS.a(5, new cby(this, 0.8));
      this.bS.a(6, new cat(this, cmv.class, 8.0F));
      this.bS.a(6, new cbg(this));
      this.bT.a(1, new ccd(this));
      this.bT.a(2, new ckm.c<>(this, cmv.class));
      this.bT.a(3, new ckm.c<>(this, cfp.class));
   }

   @Override
   protected ccz b(dbw $$0) {
      return new cda(this, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
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

   public static buu.a u() {
      return ckb.gw().a(buv.q, 16.0).a(buv.r, 0.3F);
   }

   @Override
   protected avy v() {
      return avz.yI;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.yK;
   }

   @Override
   protected avy o_() {
      return avz.yJ;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.yL, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(dsa $$0, evp $$1) {
      if (!$$0.a(dez.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bsa $$0) {
      return $$0.a(bsc.s) ? false : super.c($$0);
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
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azf $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         ckj $$5 = bsy.aN.a(this.dP());
         if ($$5 != null) {
            $$5.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new ckm.b();
         if ($$0.al() == bqp.d && $$4.i() < 0.1F * $$1.d()) {
            ((ckm.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof ckm.b $$6) {
         ji<bry> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bsa($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public evp l(bss $$0) {
      return $$0.dj() <= this.dj() ? new evp(0.0, 0.3125 * (double)this.ee(), 0.0) : super.l($$0);
   }

   static class a extends cav {
      public a(ckm $$0) {
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

   public static class b implements bug {
      @Nullable
      public ji<bry> a;

      public void a(azf $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bsc.a;
         } else if ($$1 <= 2) {
            this.a = bsc.e;
         } else if ($$1 <= 3) {
            this.a = bsc.j;
         } else if ($$1 <= 4) {
            this.a = bsc.n;
         }
      }
   }

   static class c<T extends btn> extends cce<T> {
      public c(ckm $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bt();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
