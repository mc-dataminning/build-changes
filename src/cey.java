import javax.annotation.Nullable;

public class cey extends cen {
   private static final aie<Byte> b = aih.a(cey.class, aig.a);
   private static final float c = 0.1F;

   public cey(bnu<? extends cey> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new buv(this));
      this.bO.a(2, new bui<>(this, cba.class, 6.0F, 1.0, 1.2, $$0 -> !((cba)$$0).w()));
      this.bO.a(3, new bvh(this, 0.4F));
      this.bO.a(4, new cey.a(this));
      this.bO.a(5, new bwo(this, 0.8));
      this.bO.a(6, new bvj(this, chh.class, 8.0F));
      this.bO.a(6, new bvw(this));
      this.bP.a(1, new bwt(this));
      this.bP.a(2, new cey.c<>(this, chh.class));
      this.bP.a(3, new cey.c<>(this, caf.class));
   }

   @Override
   protected bxp b(cvn $$0) {
      return new bxq(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B) {
         this.w(this.O);
      }
   }

   public static bpk.a w() {
      return cen.gm().a(bpl.n, 16.0).a(bpl.o, 0.3F);
   }

   @Override
   protected atj y() {
      return atk.yd;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.yf;
   }

   @Override
   protected atj n_() {
      return atk.ye;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.yg, 0.15F, 1.0F);
   }

   @Override
   public boolean e_() {
      return this.A();
   }

   @Override
   public void a(dlf $$0, ens $$1) {
      if (!$$0.a(cyq.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bnb $$0) {
      return $$0.a(bnd.s) ? false : super.c($$0);
   }

   public boolean A() {
      return (this.am.b(b) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.am.b(b);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.am.b(b, $$1);
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      awo $$5 = $$0.F_();
      if ($$5.a(100) == 0) {
         cev $$6 = bnu.aL.a(this.dM());
         if ($$6 != null) {
            $$6.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.m(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cey.b();
         if ($$0.ak() == blr.d && $$5.i() < 0.1F * $$1.d()) {
            ((cey.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof cey.b $$7) {
         ij<bmz> $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new bnb($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   public ens k(bno $$0) {
      return $$0.dg() <= this.dg() ? new ens(0.0, 0.3125 * (double)this.ea(), 0.0) : super.k($$0);
   }

   static class a extends bvl {
      public a(cey $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bP();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.bo();
         if ($$0 >= 0.5F && this.a.eh().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements boy {
      @Nullable
      public ij<bmz> a;

      public void a(awo $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bnd.a;
         } else if ($$1 <= 2) {
            this.a = bnd.e;
         } else if ($$1 <= 3) {
            this.a = bnd.j;
         } else if ($$1 <= 4) {
            this.a = bnd.n;
         }
      }
   }

   static class c<T extends bog> extends bwu<T> {
      public c(cey $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bo();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
