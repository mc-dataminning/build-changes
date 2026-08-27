import javax.annotation.Nullable;

public class chr extends chg {
   private static final aja<Byte> b = aje.a(chr.class, ajc.a);
   private static final float c = 0.1F;

   public chr(bqg<? extends chr> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxk(this));
      this.bR.a(2, new bwx<>(this, cdr.class, 6.0F, 1.0, 1.2, $$0 -> !((cdr)$$0).u()));
      this.bR.a(3, new bxw(this, 0.4F));
      this.bR.a(4, new chr.a(this));
      this.bR.a(5, new bzd(this, 0.8));
      this.bR.a(6, new bxy(this, cka.class, 8.0F));
      this.bR.a(6, new byl(this));
      this.bS.a(1, new bzi(this));
      this.bS.a(2, new chr.c<>(this, cka.class));
      this.bS.a(3, new chr.c<>(this, ccu.class));
   }

   @Override
   protected cae b(czg $$0) {
      return new caf(this, $$0);
   }

   @Override
   protected void a(aje.a $$0) {
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

   public static brz.a u() {
      return chg.gt().a(bsa.q, 16.0).a(bsa.r, 0.3F);
   }

   @Override
   protected aun v() {
      return auo.yp;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.yr;
   }

   @Override
   protected aun o_() {
      return auo.yq;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.ys, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(dpi $$0, esj $$1) {
      if (!$$0.a(dcj.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bpm $$0) {
      return $$0.a(bpo.s) ? false : super.c($$0);
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
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      axt $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         cho $$5 = bqg.aM.a(this.dM());
         if ($$5 != null) {
            $$5.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new chr.b();
         if ($$0.ak() == boc.d && $$4.i() < 0.1F * $$1.d()) {
            ((chr.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof chr.b $$6) {
         in<bpk> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bpm($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public esj l(bqa $$0) {
      return $$0.dg() <= this.dg() ? new esj(0.0, 0.3125 * (double)this.eb(), 0.0) : super.l($$0);
   }

   static class a extends bya {
      public a(chr $$0) {
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

   public static class b implements brl {
      @Nullable
      public in<bpk> a;

      public void a(axt $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bpo.a;
         } else if ($$1 <= 2) {
            this.a = bpo.e;
         } else if ($$1 <= 3) {
            this.a = bpo.j;
         } else if ($$1 <= 4) {
            this.a = bpo.n;
         }
      }
   }

   static class c<T extends bqt> extends bzj<T> {
      public c(chr $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.br();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
