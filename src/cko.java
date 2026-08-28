import javax.annotation.Nullable;

public class cko extends ckd {
   private static final ajw<Byte> b = aka.a(cko.class, ajy.a);
   private static final float c = 0.1F;

   public cko(bsx<? extends cko> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bW.a(1, new cag(this));
      this.bW.a(2, new bzt<>(this, cgn.class, 6.0F, 1.0, 1.2, $$0 -> !((cgn)$$0).t()));
      this.bW.a(3, new cas(this, 0.4F));
      this.bW.a(4, new cko.a(this));
      this.bW.a(5, new cbz(this, 0.8));
      this.bW.a(6, new cau(this, cmx.class, 8.0F));
      this.bW.a(6, new cbh(this));
      this.bX.a(1, new cce(this));
      this.bX.a(2, new cko.c<>(this, cmx.class));
      this.bX.a(3, new cko.c<>(this, cfq.class));
   }

   @Override
   protected cda b(dcw $$0) {
      return new cdb(this, $$0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dO().B) {
         this.x(this.Q);
      }
   }

   public static buv.a t() {
      return ckd.gq().a(buw.s, 16.0).a(buw.v, 0.3F);
   }

   @Override
   protected avo v() {
      return avp.yL;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.yN;
   }

   @Override
   protected avo n_() {
      return avp.yM;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.yO, 0.15F, 1.0F);
   }

   @Override
   public boolean p_() {
      return this.x();
   }

   @Override
   public void a(dtc $$0, exc $$1) {
      if (!$$0.a(dga.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(brz $$0) {
      return $$0.a(bsb.s) ? false : super.c($$0);
   }

   public boolean x() {
      return (this.ao.a(b) & 1) != 0;
   }

   public void x(boolean $$0) {
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
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayw $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         ckl $$5 = bsx.aN.a(this.dO());
         if ($$5 != null) {
            $$5.b(this.dt(), this.dv(), this.dz(), this.dE(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cko.b();
         if ($$0.al() == bqo.d && $$4.i() < 0.1F * $$1.d()) {
            ((cko.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cko.b $$6) {
         jm<brx> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new brz($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public exc l(bsr $$0) {
      return $$0.dj() <= this.dj() ? new exc(0.0, 0.3125 * (double)this.eb(), 0.0) : super.l($$0);
   }

   static class a extends caw {
      public a(cko $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.bT();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.bu();
         if ($$0 >= 0.5F && this.a.dR().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements buh {
      @Nullable
      public jm<brx> a;

      public void a(ayw $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bsb.a;
         } else if ($$1 <= 2) {
            this.a = bsb.e;
         } else if ($$1 <= 3) {
            this.a = bsb.j;
         } else if ($$1 <= 4) {
            this.a = bsb.n;
         }
      }
   }

   static class c<T extends btn> extends ccf<T> {
      public c(cko $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bu();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
