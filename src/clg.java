import javax.annotation.Nullable;

public class clg extends ckv {
   private static final akg<Byte> b = akk.a(clg.class, aki.a);
   private static final float c = 0.1F;

   public clg(btq<? extends clg> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bT.a(1, new caw(this));
      this.bT.a(2, new caj<>(this, che.class, 6.0F, 1.0, 1.2, $$0 -> !((che)$$0).t()));
      this.bT.a(3, new cbi(this, 0.4F));
      this.bT.a(4, new clg.a(this));
      this.bT.a(5, new ccp(this, 0.8));
      this.bT.a(6, new cbk(this, cnp.class, 8.0F));
      this.bT.a(6, new cbx(this));
      this.bU.a(1, new ccu(this));
      this.bU.a(2, new clg.c<>(this, cnp.class));
      this.bU.a(3, new clg.c<>(this, cgh.class));
   }

   @Override
   protected cdq b(dds $$0) {
      return new cdr(this, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dS().B) {
         this.x(this.Q);
      }
   }

   public static bvl.a t() {
      return ckv.gu().a(bvm.s, 16.0).a(bvm.v, 0.3F);
   }

   @Override
   protected awc w() {
      return awd.yR;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.yT;
   }

   @Override
   protected awc n_() {
      return awd.yS;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.yU, 0.15F, 1.0F);
   }

   @Override
   public boolean p_() {
      return this.y();
   }

   @Override
   public void a(dua $$0, eye $$1) {
      if (!$$0.a(dgx.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bsq $$0) {
      return $$0.a(bss.s) ? false : super.c($$0);
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
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azk $$4 = $$0.C_();
      if ($$4.a(100) == 0) {
         cld $$5 = btq.aN.a(this.dS(), btp.g);
         if ($$5 != null) {
            $$5.b(this.dx(), this.dz(), this.dD(), this.dI(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new clg.b();
         if ($$0.am() == brh.d && $$4.i() < 0.1F * $$1.d()) {
            ((clg.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof clg.b $$6) {
         jn<bso> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bsq($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public eye l(btj $$0) {
      return $$0.dn() <= this.dn() ? new eye(0.0, 0.3125 * (double)this.ef(), 0.0) : super.l($$0);
   }

   static class a extends cbm {
      public a(clg $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.bX();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.bx();
         if ($$0 >= 0.5F && this.a.dV().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements bux {
      @Nullable
      public jn<bso> a;

      public void a(azk $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bss.a;
         } else if ($$1 <= 2) {
            this.a = bss.e;
         } else if ($$1 <= 3) {
            this.a = bss.j;
         } else if ($$1 <= 4) {
            this.a = bss.n;
         }
      }
   }

   static class c<T extends buf> extends ccv<T> {
      public c(clg $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bx();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
