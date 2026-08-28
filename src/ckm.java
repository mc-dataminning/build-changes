import javax.annotation.Nullable;

public class ckm extends ckb {
   private static final ajv<Byte> b = ajz.a(ckm.class, ajx.a);
   private static final float c = 0.1F;

   public ckm(bsw<? extends ckm> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cae(this));
      this.bU.a(2, new bzr<>(this, cgl.class, 6.0F, 1.0, 1.2, $$0 -> !((cgl)$$0).t()));
      this.bU.a(3, new caq(this, 0.4F));
      this.bU.a(4, new ckm.a(this));
      this.bU.a(5, new cbx(this, 0.8));
      this.bU.a(6, new cas(this, cmv.class, 8.0F));
      this.bU.a(6, new cbf(this));
      this.bV.a(1, new ccc(this));
      this.bV.a(2, new ckm.c<>(this, cmv.class));
      this.bV.a(3, new ckm.c<>(this, cfo.class));
   }

   @Override
   protected ccy b(dcu $$0) {
      return new ccz(this, $$0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dQ().B) {
         this.w(this.Q);
      }
   }

   public static but.a t() {
      return ckb.gs().a(buu.s, 16.0).a(buu.v, 0.3F);
   }

   @Override
   protected avn v() {
      return avo.yL;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.yN;
   }

   @Override
   protected avn n_() {
      return avo.yM;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.yO, 0.15F, 1.0F);
   }

   @Override
   public boolean p_() {
      return this.x();
   }

   @Override
   public void a(dta $$0, eww $$1) {
      if (!$$0.a(dfy.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bry $$0) {
      return $$0.a(bsa.s) ? false : super.c($$0);
   }

   public boolean x() {
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
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayv $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         ckj $$5 = bsw.aN.a(this.dQ());
         if ($$5 != null) {
            $$5.b(this.dv(), this.dx(), this.dB(), this.dG(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new ckm.b();
         if ($$0.al() == bqn.d && $$4.i() < 0.1F * $$1.d()) {
            ((ckm.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof ckm.b $$6) {
         jm<brw> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bry($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public eww l(bsq $$0) {
      return $$0.dk() <= this.dk() ? new eww(0.0, 0.3125 * (double)this.ec(), 0.0) : super.l($$0);
   }

   static class a extends cau {
      public a(ckm $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.bT();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.bu();
         if ($$0 >= 0.5F && this.a.dT().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements buf {
      @Nullable
      public jm<brw> a;

      public void a(ayv $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bsa.a;
         } else if ($$1 <= 2) {
            this.a = bsa.e;
         } else if ($$1 <= 3) {
            this.a = bsa.j;
         } else if ($$1 <= 4) {
            this.a = bsa.n;
         }
      }
   }

   static class c<T extends btl> extends ccd<T> {
      public c(ckm $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bu();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
