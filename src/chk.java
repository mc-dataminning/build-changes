import javax.annotation.Nullable;

public class chk extends cgz {
   private static final aiy<Byte> b = ajc.a(chk.class, aja.a);
   private static final float c = 0.1F;

   public chk(bqb<? extends chk> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxf(this));
      this.bR.a(2, new bws<>(this, cdk.class, 6.0F, 1.0, 1.2, $$0 -> !((cdk)$$0).u()));
      this.bR.a(3, new bxr(this, 0.4F));
      this.bR.a(4, new chk.a(this));
      this.bR.a(5, new byy(this, 0.8));
      this.bR.a(6, new bxt(this, cjt.class, 8.0F));
      this.bR.a(6, new byg(this));
      this.bS.a(1, new bzd(this));
      this.bS.a(2, new chk.c<>(this, cjt.class));
      this.bS.a(3, new chk.c<>(this, ccp.class));
   }

   @Override
   protected bzz b(cyx $$0) {
      return new caa(this, $$0);
   }

   @Override
   protected void a(ajc.a $$0) {
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

   public static bru.a u() {
      return cgz.gt().a(brv.q, 16.0).a(brv.r, 0.3F);
   }

   @Override
   protected aul v() {
      return aum.yp;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.yr;
   }

   @Override
   protected aul o_() {
      return aum.yq;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.ys, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(doz $$0, esa $$1) {
      if (!$$0.a(dca.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bph $$0) {
      return $$0.a(bpj.s) ? false : super.c($$0);
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
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      axr $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         chh $$5 = bqb.aM.a(this.dM());
         if ($$5 != null) {
            $$5.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new chk.b();
         if ($$0.ak() == bnx.d && $$4.i() < 0.1F * $$1.d()) {
            ((chk.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof chk.b $$6) {
         il<bpf> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bph($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public esa l(bpv $$0) {
      return $$0.dg() <= this.dg() ? new esa(0.0, 0.3125 * (double)this.eb(), 0.0) : super.l($$0);
   }

   static class a extends bxv {
      public a(chk $$0) {
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

   public static class b implements brg {
      @Nullable
      public il<bpf> a;

      public void a(axr $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bpj.a;
         } else if ($$1 <= 2) {
            this.a = bpj.e;
         } else if ($$1 <= 3) {
            this.a = bpj.j;
         } else if ($$1 <= 4) {
            this.a = bpj.n;
         }
      }
   }

   static class c<T extends bqo> extends bze<T> {
      public c(chk $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.br();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
