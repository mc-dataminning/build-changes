import javax.annotation.Nullable;

public class cmh extends clw {
   private static final ajx<Byte> a = akb.a(cmh.class, ajz.a);
   private static final float b = 0.1F;

   public cmh(buq<? extends cmh> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(1, new cbx(this));
      this.bS.a(2, new cbk<>(this, cif.class, 6.0F, 1.0, 1.2, $$0 -> !((cif)$$0).t()));
      this.bS.a(3, new ccj(this, 0.4F));
      this.bS.a(4, new cmh.a(this));
      this.bS.a(5, new cdq(this, 0.8));
      this.bS.a(6, new ccl(this, cov.class, 8.0F));
      this.bS.a(6, new ccy(this));
      this.bT.a(1, new cdv(this));
      this.bT.a(2, new cmh.c<>(this, cov.class));
      this.bT.a(3, new cmh.c<>(this, chi.class));
   }

   @Override
   protected cer b(dgg $$0) {
      return new ces(this, $$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dW().C) {
         this.x(this.P);
      }
   }

   public static bwm.a p() {
      return clw.gu().a(bwn.s, 16.0).a(bwn.v, 0.3F);
   }

   @Override
   protected avy u() {
      return avz.zz;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.zB;
   }

   @Override
   protected avy o_() {
      return avz.zA;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.zC, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.t();
   }

   @Override
   public void a(dwv $$0, fay $$1) {
      if (!$$0.a(djm.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(bto $$0) {
      return $$0.a(btq.s) ? false : super.b($$0);
   }

   public boolean t() {
      return (this.al.a(a) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(a);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.al.a(a, $$1);
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azg $$4 = $$0.H_();
      if ($$4.a(100) == 0) {
         cme $$5 = buq.be.a(this.dW(), bup.g);
         if ($$5 != null) {
            $$5.b(this.dB(), this.dD(), this.dH(), this.dM(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cmh.b();
         if ($$0.am() == bsf.d && $$4.i() < 0.1F * $$1.d()) {
            ((cmh.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cmh.b $$6) {
         jr<btm> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new bto($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fay l(buj $$0) {
      return $$0.dr() <= this.dr() ? new fay(0.0, 0.3125 * (double)this.ek(), 0.0) : super.l($$0);
   }

   static class a extends ccn {
      public a(cmh $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.ca();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.by();
         if ($$0 >= 0.5F && this.a.dZ().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements bvy {
      @Nullable
      public jr<btm> a;

      public void a(azg $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = btq.a;
         } else if ($$1 <= 2) {
            this.a = btq.e;
         } else if ($$1 <= 3) {
            this.a = btq.j;
         } else if ($$1 <= 4) {
            this.a = btq.n;
         }
      }
   }

   static class c<T extends bvf> extends cdw<T> {
      public c(cmh $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.by();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
