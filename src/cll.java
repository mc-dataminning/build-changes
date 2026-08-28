import javax.annotation.Nullable;

public class cll extends cla {
   private static final akg<Byte> b = akk.a(cll.class, aki.a);
   private static final float c = 0.1F;

   public cll(btv<? extends cll> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbb(this));
      this.bS.a(2, new cao<>(this, chj.class, 6.0F, 1.0, 1.2, $$0 -> !((chj)$$0).t()));
      this.bS.a(3, new cbn(this, 0.4F));
      this.bS.a(4, new cll.a(this));
      this.bS.a(5, new ccu(this, 0.8));
      this.bS.a(6, new cbp(this, cnu.class, 8.0F));
      this.bS.a(6, new ccc(this));
      this.bT.a(1, new ccz(this));
      this.bT.a(2, new cll.c<>(this, cnu.class));
      this.bT.a(3, new cll.c<>(this, cgm.class));
   }

   @Override
   protected cdv b(deg $$0) {
      return new cdw(this, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dS().B) {
         this.x(this.Q);
      }
   }

   public static bvq.a t() {
      return cla.gv().a(bvr.s, 16.0).a(bvr.v, 0.3F);
   }

   @Override
   protected awd w() {
      return awe.yR;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.yT;
   }

   @Override
   protected awd n_() {
      return awe.yS;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.yU, 0.15F, 1.0F);
   }

   @Override
   public boolean p_() {
      return this.y();
   }

   @Override
   public void a(duo $$0, eys $$1) {
      if (!$$0.a(dhl.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(bsv $$0) {
      return $$0.a(bsx.s) ? false : super.b($$0);
   }

   public boolean y() {
      return (this.am.a(b) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.a(b);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.am.a(b, $$1);
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azl $$4 = $$0.C_();
      if ($$4.a(100) == 0) {
         cli $$5 = btv.aN.a(this.dS(), btu.g);
         if ($$5 != null) {
            $$5.b(this.dx(), this.dz(), this.dD(), this.dI(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cll.b();
         if ($$0.am() == brm.d && $$4.i() < 0.1F * $$1.d()) {
            ((cll.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cll.b $$6) {
         jn<bst> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new bsv($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public eys l(bto $$0) {
      return $$0.dn() <= this.dn() ? new eys(0.0, 0.3125 * (double)this.ef(), 0.0) : super.l($$0);
   }

   static class a extends cbr {
      public a(cll $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.bX();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.bx();
         if ($$0 >= 0.5F && this.a.dV().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements bvc {
      @Nullable
      public jn<bst> a;

      public void a(azl $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bsx.a;
         } else if ($$1 <= 2) {
            this.a = bsx.e;
         } else if ($$1 <= 3) {
            this.a = bsx.j;
         } else if ($$1 <= 4) {
            this.a = bsx.n;
         }
      }
   }

   static class c<T extends buk> extends cda<T> {
      public c(cll $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bx();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
