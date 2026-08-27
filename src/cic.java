import javax.annotation.Nullable;

public class cic extends chr {
   private static final ajk<Byte> b = ajo.a(cic.class, ajm.a);
   private static final float c = 0.1F;

   public cic(bqr<? extends cic> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bxv(this));
      this.bS.a(2, new bxi<>(this, cec.class, 6.0F, 1.0, 1.2, $$0 -> !((cec)$$0).u()));
      this.bS.a(3, new byh(this, 0.4F));
      this.bS.a(4, new cic.a(this));
      this.bS.a(5, new bzo(this, 0.8));
      this.bS.a(6, new byj(this, ckl.class, 8.0F));
      this.bS.a(6, new byw(this));
      this.bT.a(1, new bzt(this));
      this.bT.a(2, new cic.c<>(this, ckl.class));
      this.bT.a(3, new cic.c<>(this, cdf.class));
   }

   @Override
   protected cap b(czu $$0) {
      return new caq(this, $$0);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dN().B) {
         this.w(this.Q);
      }
   }

   public static bsk.a u() {
      return chr.gv().a(bsl.q, 16.0).a(bsl.r, 0.3F);
   }

   @Override
   protected auy v() {
      return auz.yw;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.yy;
   }

   @Override
   protected auy o_() {
      return auz.yx;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.yz, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(dpy $$0, etf $$1) {
      if (!$$0.a(dcx.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bpx $$0) {
      return $$0.a(bpz.s) ? false : super.c($$0);
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
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayd $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         chz $$5 = bqr.aM.a(this.dN());
         if ($$5 != null) {
            $$5.b(this.ds(), this.du(), this.dy(), this.dD(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cic.b();
         if ($$0.ak() == bon.d && $$4.i() < 0.1F * $$1.d()) {
            ((cic.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cic.b $$6) {
         iv<bpv> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bpx($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public etf l(bql $$0) {
      return $$0.dh() <= this.dh() ? new etf(0.0, 0.3125 * (double)this.ec(), 0.0) : super.l($$0);
   }

   static class a extends byl {
      public a(cic $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bQ();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.br();
         if ($$0 >= 0.5F && this.a.ej().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements brw {
      @Nullable
      public iv<bpv> a;

      public void a(ayd $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bpz.a;
         } else if ($$1 <= 2) {
            this.a = bpz.e;
         } else if ($$1 <= 3) {
            this.a = bpz.j;
         } else if ($$1 <= 4) {
            this.a = bpz.n;
         }
      }
   }

   static class c<T extends bre> extends bzu<T> {
      public c(cic $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.br();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
