import javax.annotation.Nullable;

public class clo extends cld {
   private static final akh<Byte> b = akl.a(clo.class, akj.a);
   private static final float c = 0.1F;

   public clo(bty<? extends clo> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbe(this));
      this.bS.a(2, new car<>(this, chm.class, 6.0F, 1.0, 1.2, $$0 -> !((chm)$$0).t()));
      this.bS.a(3, new cbq(this, 0.4F));
      this.bS.a(4, new clo.a(this));
      this.bS.a(5, new ccx(this, 0.8));
      this.bS.a(6, new cbs(this, cnx.class, 8.0F));
      this.bS.a(6, new ccf(this));
      this.bT.a(1, new cdc(this));
      this.bT.a(2, new clo.c<>(this, cnx.class));
      this.bT.a(3, new clo.c<>(this, cgp.class));
   }

   @Override
   protected cdy b(dej $$0) {
      return new cdz(this, $$0);
   }

   @Override
   protected void a(akl.a $$0) {
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

   public static bvt.a t() {
      return cld.gu().a(bvu.s, 16.0).a(bvu.v, 0.3F);
   }

   @Override
   protected awf w() {
      return awg.yR;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.yT;
   }

   @Override
   protected awf o_() {
      return awg.yS;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.yU, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(dus $$0, eyw $$1) {
      if (!$$0.a(dho.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(bsy $$0) {
      return $$0.a(bta.s) ? false : super.b($$0);
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
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azn $$4 = $$0.D_();
      if ($$4.a(100) == 0) {
         cll $$5 = bty.aN.a(this.dS(), btx.g);
         if ($$5 != null) {
            $$5.b(this.dx(), this.dz(), this.dD(), this.dI(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new clo.b();
         if ($$0.am() == brp.d && $$4.i() < 0.1F * $$1.d()) {
            ((clo.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof clo.b $$6) {
         jo<bsw> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new bsy($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public eyw l(btr $$0) {
      return $$0.dn() <= this.dn() ? new eyw(0.0, 0.3125 * (double)this.eg(), 0.0) : super.l($$0);
   }

   static class a extends cbu {
      public a(clo $$0) {
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

   public static class b implements bvf {
      @Nullable
      public jo<bsw> a;

      public void a(azn $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bta.a;
         } else if ($$1 <= 2) {
            this.a = bta.e;
         } else if ($$1 <= 3) {
            this.a = bta.j;
         } else if ($$1 <= 4) {
            this.a = bta.n;
         }
      }
   }

   static class c<T extends bun> extends cdd<T> {
      public c(clo $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bx();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
