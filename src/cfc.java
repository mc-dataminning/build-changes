import javax.annotation.Nullable;

public class cfc extends cer {
   private static final aie<Byte> b = aih.a(cfc.class, aig.a);
   private static final float c = 0.1F;

   public cfc(bnw<? extends cfc> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new buz(this));
      this.bO.a(2, new bum<>(this, cbe.class, 6.0F, 1.0, 1.2, $$0 -> !((cbe)$$0).w()));
      this.bO.a(3, new bvl(this, 0.4F));
      this.bO.a(4, new cfc.a(this));
      this.bO.a(5, new bws(this, 0.8));
      this.bO.a(6, new bvn(this, chl.class, 8.0F));
      this.bO.a(6, new bwa(this));
      this.bP.a(1, new bwx(this));
      this.bP.a(2, new cfc.c<>(this, chl.class));
      this.bP.a(3, new cfc.c<>(this, caj.class));
   }

   @Override
   protected bxt b(cvr $$0) {
      return new bxu(this, $$0);
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

   public static bpo.a w() {
      return cer.gm().a(bpp.n, 16.0).a(bpp.o, 0.3F);
   }

   @Override
   protected atk y() {
      return atl.ye;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.yg;
   }

   @Override
   protected atk n_() {
      return atl.yf;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.yh, 0.15F, 1.0F);
   }

   @Override
   public boolean e_() {
      return this.A();
   }

   @Override
   public void a(dlj $$0, enz $$1) {
      if (!$$0.a(cyu.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bnd $$0) {
      return $$0.a(bnf.s) ? false : super.c($$0);
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
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      awp $$5 = $$0.F_();
      if ($$5.a(100) == 0) {
         cez $$6 = bnw.aL.a(this.dM());
         if ($$6 != null) {
            $$6.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.m(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cfc.b();
         if ($$0.aj() == blt.d && $$5.i() < 0.1F * $$1.d()) {
            ((cfc.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof cfc.b $$7) {
         ij<bnb> $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new bnd($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   public enz k(bnq $$0) {
      return $$0.dg() <= this.dg() ? new enz(0.0, 0.3125 * (double)this.ea(), 0.0) : super.k($$0);
   }

   static class a extends bvp {
      public a(cfc $$0) {
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

   public static class b implements bpa {
      @Nullable
      public ij<bnb> a;

      public void a(awp $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bnf.a;
         } else if ($$1 <= 2) {
            this.a = bnf.e;
         } else if ($$1 <= 3) {
            this.a = bnf.j;
         } else if ($$1 <= 4) {
            this.a = bnf.n;
         }
      }
   }

   static class c<T extends boi> extends bwy<T> {
      public c(cfc $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bo();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
