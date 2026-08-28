import javax.annotation.Nullable;

public class cmc extends clr {
   private static final akl<Byte> b = akp.a(cmc.class, akn.a);
   private static final float c = 0.1F;

   public cmc(bul<? extends cmc> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbs(this));
      this.bS.a(2, new cbf<>(this, cia.class, 6.0F, 1.0, 1.2, $$0 -> !((cia)$$0).t()));
      this.bS.a(3, new cce(this, 0.4F));
      this.bS.a(4, new cmc.a(this));
      this.bS.a(5, new cdl(this, 0.8));
      this.bS.a(6, new ccg(this, com.class, 8.0F));
      this.bS.a(6, new cct(this));
      this.bT.a(1, new cdq(this));
      this.bT.a(2, new cmc.c<>(this, com.class));
      this.bT.a(3, new cmc.c<>(this, chd.class));
   }

   @Override
   protected cem b(dfb $$0) {
      return new cen(this, $$0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dX().C) {
         this.x(this.Q);
      }
   }

   public static bwh.a t() {
      return clr.gA().a(bwi.s, 16.0).a(bwi.v, 0.3F);
   }

   @Override
   protected awk w() {
      return awl.yP;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.yR;
   }

   @Override
   protected awk o_() {
      return awl.yQ;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.yS, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(dvj $$0, ezn $$1) {
      if (!$$0.a(dig.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(btj $$0) {
      return $$0.a(btl.s) ? false : super.b($$0);
   }

   public boolean y() {
      return (this.am.a(b) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.a(b);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.am.a(b, $$1);
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azs $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         clz $$5 = bul.aN.a(this.dX(), buk.g);
         if ($$5 != null) {
            $$5.b(this.dC(), this.dE(), this.dI(), this.dN(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cmc.b();
         if ($$0.ak() == bsa.d && $$4.i() < 0.1F * $$1.d()) {
            ((cmc.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cmc.b $$6) {
         jq<bth> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new btj($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public ezn l(bue $$0) {
      return $$0.ds() <= this.ds() ? new ezn(0.0, 0.3125 * (double)this.el(), 0.0) : super.l($$0);
   }

   static class a extends cci {
      public a(cmc $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.cb();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.bz();
         if ($$0 >= 0.5F && this.a.ea().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements bvt {
      @Nullable
      public jq<bth> a;

      public void a(azs $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = btl.a;
         } else if ($$1 <= 2) {
            this.a = btl.e;
         } else if ($$1 <= 3) {
            this.a = btl.j;
         } else if ($$1 <= 4) {
            this.a = btl.n;
         }
      }
   }

   static class c<T extends bva> extends cdr<T> {
      public c(cmc $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bz();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
