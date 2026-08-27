import javax.annotation.Nullable;

public class cjp extends cje {
   private static final ajs<Byte> b = ajw.a(cjp.class, aju.a);
   private static final float c = 0.1F;

   public cjp(bsc<? extends cjp> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzi(this));
      this.bS.a(2, new byv<>(this, cfp.class, 6.0F, 1.0, 1.2, $$0 -> !((cfp)$$0).u()));
      this.bS.a(3, new bzu(this, 0.4F));
      this.bS.a(4, new cjp.a(this));
      this.bS.a(5, new cbb(this, 0.8));
      this.bS.a(6, new bzw(this, cly.class, 8.0F));
      this.bS.a(6, new caj(this));
      this.bT.a(1, new cbg(this));
      this.bT.a(2, new cjp.c<>(this, cly.class));
      this.bT.a(3, new cjp.c<>(this, ces.class));
   }

   @Override
   protected ccc b(daz $$0) {
      return new ccd(this, $$0);
   }

   @Override
   protected void a(ajw.a $$0) {
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

   public static btx.a u() {
      return cje.gv().a(bty.q, 16.0).a(bty.r, 0.3F);
   }

   @Override
   protected avh v() {
      return avi.yI;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.yK;
   }

   @Override
   protected avh o_() {
      return avi.yJ;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.yL, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(drd $$0, eum $$1) {
      if (!$$0.a(dec.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bre $$0) {
      return $$0.a(brg.s) ? false : super.c($$0);
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
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      aym $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         cjm $$5 = bsc.aN.a(this.dP());
         if ($$5 != null) {
            $$5.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cjp.b();
         if ($$0.ak() == bpt.d && $$4.i() < 0.1F * $$1.d()) {
            ((cjp.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cjp.b $$6) {
         ix<brc> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bre($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public eum l(brw $$0) {
      return $$0.dj() <= this.dj() ? new eum(0.0, 0.3125 * (double)this.ee(), 0.0) : super.l($$0);
   }

   static class a extends bzy {
      public a(cjp $$0) {
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

   public static class b implements btj {
      @Nullable
      public ix<brc> a;

      public void a(aym $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = brg.a;
         } else if ($$1 <= 2) {
            this.a = brg.e;
         } else if ($$1 <= 3) {
            this.a = brg.j;
         } else if ($$1 <= 4) {
            this.a = brg.n;
         }
      }
   }

   static class c<T extends bsq> extends cbh<T> {
      public c(cjp $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bt();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
