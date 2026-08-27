import javax.annotation.Nullable;

public class cgj extends cfy {
   private static final aim<Byte> b = aiq.a(cgj.class, aio.a);
   private static final float c = 0.1F;

   public cgj(bpc<? extends cgj> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bwf(this));
      this.bR.a(2, new bvs<>(this, cck.class, 6.0F, 1.0, 1.2, $$0 -> !((cck)$$0).s()));
      this.bR.a(3, new bwr(this, 0.4F));
      this.bR.a(4, new cgj.a(this));
      this.bR.a(5, new bxy(this, 0.8));
      this.bR.a(6, new bwt(this, cis.class, 8.0F));
      this.bR.a(6, new bxg(this));
      this.bS.a(1, new byd(this));
      this.bS.a(2, new cgj.c<>(this, cis.class));
      this.bS.a(3, new cgj.c<>(this, cbp.class));
   }

   @Override
   protected byz b(cwz $$0) {
      return new bza(this, $$0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B) {
         this.w(this.P);
      }
   }

   public static bqu.a s() {
      return cfy.gt().a(bqv.q, 16.0).a(bqv.r, 0.3F);
   }

   @Override
   protected atx v() {
      return aty.yh;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.yj;
   }

   @Override
   protected atx n_() {
      return aty.yi;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.yk, 0.15F, 1.0F);
   }

   @Override
   public boolean p_() {
      return this.y();
   }

   @Override
   public void a(dmz $$0, epr $$1) {
      if (!$$0.a(dac.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(boj $$0) {
      return $$0.a(bol.s) ? false : super.c($$0);
   }

   public boolean y() {
      return (this.an.a(b) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.a(b);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.an.a(b, $$1);
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      axd $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         cgg $$5 = bpc.aM.a(this.dM());
         if ($$5 != null) {
            $$5.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cgj.b();
         if ($$0.aj() == bmz.d && $$4.i() < 0.1F * $$1.d()) {
            ((cgj.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cgj.b $$6) {
         il<boh> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new boj($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public epr l(bow $$0) {
      return $$0.dg() <= this.dg() ? new epr(0.0, 0.3125 * (double)this.eb(), 0.0) : super.l($$0);
   }

   static class a extends bwv {
      public a(cgj $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bP();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.br();
         if ($$0 >= 0.5F && this.a.ei().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements bqg {
      @Nullable
      public il<boh> a;

      public void a(axd $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bol.a;
         } else if ($$1 <= 2) {
            this.a = bol.e;
         } else if ($$1 <= 3) {
            this.a = bol.j;
         } else if ($$1 <= 4) {
            this.a = bol.n;
         }
      }
   }

   static class c<T extends bpo> extends bye<T> {
      public c(cgj $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.br();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
