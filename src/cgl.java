import javax.annotation.Nullable;

public class cgl extends cga {
   private static final aim<Byte> b = aiq.a(cgl.class, aio.a);
   private static final float c = 0.1F;

   public cgl(bpd<? extends cgl> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bwg(this));
      this.bR.a(2, new bvt<>(this, ccl.class, 6.0F, 1.0, 1.2, $$0 -> !((ccl)$$0).s()));
      this.bR.a(3, new bws(this, 0.4F));
      this.bR.a(4, new cgl.a(this));
      this.bR.a(5, new bxz(this, 0.8));
      this.bR.a(6, new bwu(this, ciu.class, 8.0F));
      this.bR.a(6, new bxh(this));
      this.bS.a(1, new bye(this));
      this.bS.a(2, new cgl.c<>(this, ciu.class));
      this.bS.a(3, new cgl.c<>(this, cbq.class));
   }

   @Override
   protected bza b(cxb $$0) {
      return new bzb(this, $$0);
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

   public static bqv.a s() {
      return cga.gt().a(bqw.q, 16.0).a(bqw.r, 0.3F);
   }

   @Override
   protected atx v() {
      return aty.ym;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.yo;
   }

   @Override
   protected atx n_() {
      return aty.yn;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.yp, 0.15F, 1.0F);
   }

   @Override
   public boolean p_() {
      return this.y();
   }

   @Override
   public void a(dnb $$0, ept $$1) {
      if (!$$0.a(dae.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bok $$0) {
      return $$0.a(bom.s) ? false : super.c($$0);
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
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      axd $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         cgi $$5 = bpd.aN.a(this.dM());
         if ($$5 != null) {
            $$5.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cgl.b();
         if ($$0.aj() == bna.d && $$4.i() < 0.1F * $$1.d()) {
            ((cgl.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cgl.b $$6) {
         il<boi> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bok($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public ept l(box $$0) {
      return $$0.dg() <= this.dg() ? new ept(0.0, 0.3125 * (double)this.eb(), 0.0) : super.l($$0);
   }

   static class a extends bww {
      public a(cgl $$0) {
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

   public static class b implements bqh {
      @Nullable
      public il<boi> a;

      public void a(axd $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bom.a;
         } else if ($$1 <= 2) {
            this.a = bom.e;
         } else if ($$1 <= 3) {
            this.a = bom.j;
         } else if ($$1 <= 4) {
            this.a = bom.n;
         }
      }
   }

   static class c<T extends bpp> extends byf<T> {
      public c(cgl $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.br();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
