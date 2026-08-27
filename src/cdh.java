import javax.annotation.Nullable;

public class cdh extends ccw {
   private static final agn<Byte> b = agq.a(cdh.class, agp.a);
   private static final float c = 0.1F;

   public cdh(bmc<? extends cdh> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bP.a(1, new bte(this));
      this.bP.a(3, new btq(this, 0.4F));
      this.bP.a(4, new cdh.a(this));
      this.bP.a(5, new bux(this, 0.8));
      this.bP.a(6, new bts(this, cfq.class, 8.0F));
      this.bP.a(6, new buf(this));
      this.bQ.a(1, new bvc(this));
      this.bQ.a(2, new cdh.c<>(this, cfq.class));
      this.bQ.a(3, new cdh.c<>(this, byo.class));
   }

   @Override
   protected bvy b(ctx $$0) {
      return new bvz(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B) {
         this.w(this.P);
      }
   }

   public static bnt.a w() {
      return ccw.gl().a(bnu.n, 16.0).a(bnu.o, 0.3F);
   }

   @Override
   protected ars y() {
      return art.yd;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.yf;
   }

   @Override
   protected ars n_() {
      return art.ye;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.yg, 0.15F, 1.0F);
   }

   @Override
   public boolean e_() {
      return this.A();
   }

   @Override
   public void a(djp $$0, emc $$1) {
      if (!$$0.a(cxa.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public bmt eS() {
      return bmt.c;
   }

   @Override
   public boolean c(blj $$0) {
      return $$0.a(bll.s) ? false : super.c($$0);
   }

   public boolean A() {
      return (this.an.b(b) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.b(b);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.an.b(b, $$1);
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      auw $$5 = $$0.F_();
      if ($$5.a(100) == 0) {
         cde $$6 = bmc.aL.a(this.dL());
         if ($$6 != null) {
            $$6.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.m(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cdh.b();
         if ($$0.ak() == bjz.d && $$5.i() < 0.1F * $$1.d()) {
            ((cdh.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof cdh.b $$7) {
         ih<blh> $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new blj($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   public emc k(blw $$0) {
      return $$0.dg() <= this.dg() ? new emc(0.0, 0.3125 * (double)this.dZ(), 0.0) : super.k($$0);
   }

   static class a extends btu {
      public a(cdh $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bP();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.bo();
         if ($$0 >= 0.5F && this.a.eg().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements bnh {
      @Nullable
      public ih<blh> a;

      public void a(auw $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bll.a;
         } else if ($$1 <= 2) {
            this.a = bll.e;
         } else if ($$1 <= 3) {
            this.a = bll.j;
         } else if ($$1 <= 4) {
            this.a = bll.n;
         }
      }
   }

   static class c<T extends bmo> extends bvd<T> {
      public c(cdh $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bo();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
