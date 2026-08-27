import javax.annotation.Nullable;

public class cfr extends cfg {
   private static final aii<Byte> b = ail.a(cfr.class, aik.a);
   private static final float c = 0.1F;

   public cfr(bol<? extends cfr> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bP.a(1, new bvo(this));
      this.bP.a(2, new bvb<>(this, cbt.class, 6.0F, 1.0, 1.2, $$0 -> !((cbt)$$0).w()));
      this.bP.a(3, new bwa(this, 0.4F));
      this.bP.a(4, new cfr.a(this));
      this.bP.a(5, new bxh(this, 0.8));
      this.bP.a(6, new bwc(this, cia.class, 8.0F));
      this.bP.a(6, new bwp(this));
      this.bQ.a(1, new bxm(this));
      this.bQ.a(2, new cfr.c<>(this, cia.class));
      this.bQ.a(3, new cfr.c<>(this, cay.class));
   }

   @Override
   protected byi b(cwe $$0) {
      return new byj(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dJ().B) {
         this.w(this.O);
      }
   }

   public static bqd.a w() {
      return cfg.gr().a(bqe.n, 16.0).a(bqe.o, 0.3F);
   }

   @Override
   protected ato y() {
      return atp.ye;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.yg;
   }

   @Override
   protected ato n_() {
      return atp.yf;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.yh, 0.15F, 1.0F);
   }

   @Override
   public boolean e_() {
      return this.A();
   }

   @Override
   public void a(dme $$0, eov $$1) {
      if (!$$0.a(czh.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bns $$0) {
      return $$0.a(bnu.s) ? false : super.c($$0);
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
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      awt $$4 = $$0.F_();
      if ($$4.a(100) == 0) {
         cfo $$5 = bol.aL.a(this.dJ());
         if ($$5 != null) {
            $$5.b(this.do(), this.dq(), this.du(), this.dz(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.m(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cfr.b();
         if ($$0.aj() == bmi.d && $$4.i() < 0.1F * $$1.d()) {
            ((cfr.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cfr.b $$6) {
         il<bnq> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bns($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public eov k(bof $$0) {
      return $$0.dd() <= this.dd() ? new eov(0.0, 0.3125 * (double)this.dY(), 0.0) : super.k($$0);
   }

   static class a extends bwe {
      public a(cfr $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bM();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.bo();
         if ($$0 >= 0.5F && this.a.ef().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements bpp {
      @Nullable
      public il<bnq> a;

      public void a(awt $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bnu.a;
         } else if ($$1 <= 2) {
            this.a = bnu.e;
         } else if ($$1 <= 3) {
            this.a = bnu.j;
         } else if ($$1 <= 4) {
            this.a = bnu.n;
         }
      }
   }

   static class c<T extends box> extends bxn<T> {
      public c(cfr $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bo();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
