import javax.annotation.Nullable;

public class cjn extends cjc {
   private static final ajr<Byte> b = ajv.a(cjn.class, ajt.a);
   private static final float c = 0.1F;

   public cjn(bsa<? extends cjn> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzg(this));
      this.bS.a(2, new byt<>(this, cfn.class, 6.0F, 1.0, 1.2, $$0 -> !((cfn)$$0).u()));
      this.bS.a(3, new bzs(this, 0.4F));
      this.bS.a(4, new cjn.a(this));
      this.bS.a(5, new caz(this, 0.8));
      this.bS.a(6, new bzu(this, clw.class, 8.0F));
      this.bS.a(6, new cah(this));
      this.bT.a(1, new cbe(this));
      this.bT.a(2, new cjn.c<>(this, clw.class));
      this.bT.a(3, new cjn.c<>(this, ceq.class));
   }

   @Override
   protected cca b(dax $$0) {
      return new ccb(this, $$0);
   }

   @Override
   protected void a(ajv.a $$0) {
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

   public static btv.a u() {
      return cjc.gv().a(btw.q, 16.0).a(btw.r, 0.3F);
   }

   @Override
   protected avg v() {
      return avh.yI;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.yK;
   }

   @Override
   protected avg o_() {
      return avh.yJ;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.yL, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(drb $$0, euk $$1) {
      if (!$$0.a(dea.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(brc $$0) {
      return $$0.a(bre.s) ? false : super.c($$0);
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
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayk $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         cjk $$5 = bsa.aN.a(this.dP());
         if ($$5 != null) {
            $$5.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cjn.b();
         if ($$0.ak() == bpr.d && $$4.i() < 0.1F * $$1.d()) {
            ((cjn.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cjn.b $$6) {
         ix<bra> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new brc($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public euk l(bru $$0) {
      return $$0.dj() <= this.dj() ? new euk(0.0, 0.3125 * (double)this.ee(), 0.0) : super.l($$0);
   }

   static class a extends bzw {
      public a(cjn $$0) {
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

   public static class b implements bth {
      @Nullable
      public ix<bra> a;

      public void a(ayk $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bre.a;
         } else if ($$1 <= 2) {
            this.a = bre.e;
         } else if ($$1 <= 3) {
            this.a = bre.j;
         } else if ($$1 <= 4) {
            this.a = bre.n;
         }
      }
   }

   static class c<T extends bso> extends cbf<T> {
      public c(cjn $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bt();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
