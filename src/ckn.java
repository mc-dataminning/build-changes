import javax.annotation.Nullable;

public class ckn extends ckc {
   private static final akj<Byte> b = akn.a(ckn.class, akl.a);
   private static final float c = 0.1F;

   public ckn(bsz<? extends ckn> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cag(this));
      this.bS.a(2, new bzt<>(this, cgn.class, 6.0F, 1.0, 1.2, $$0 -> !((cgn)$$0).u()));
      this.bS.a(3, new cas(this, 0.4F));
      this.bS.a(4, new ckn.a(this));
      this.bS.a(5, new cbz(this, 0.8));
      this.bS.a(6, new cau(this, cmw.class, 8.0F));
      this.bS.a(6, new cbh(this));
      this.bT.a(1, new cce(this));
      this.bT.a(2, new ckn.c<>(this, cmw.class));
      this.bT.a(3, new ckn.c<>(this, cfq.class));
   }

   @Override
   protected cda b(dbx $$0) {
      return new cdb(this, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dP().B) {
         this.w(this.Q);
      }
   }

   public static buv.a u() {
      return ckc.gw().a(buw.q, 16.0).a(buw.r, 0.3F);
   }

   @Override
   protected avy v() {
      return avz.yI;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.yK;
   }

   @Override
   protected avy o_() {
      return avz.yJ;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.yL, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(dsb $$0, evq $$1) {
      if (!$$0.a(dfa.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bsb $$0) {
      return $$0.a(bsd.s) ? false : super.c($$0);
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
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azg $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         ckk $$5 = bsz.aN.a(this.dP());
         if ($$5 != null) {
            $$5.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new ckn.b();
         if ($$0.al() == bqq.d && $$4.i() < 0.1F * $$1.d()) {
            ((ckn.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof ckn.b $$6) {
         ji<brz> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bsb($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public evq l(bst $$0) {
      return $$0.dj() <= this.dj() ? new evq(0.0, 0.3125 * (double)this.ee(), 0.0) : super.l($$0);
   }

   static class a extends caw {
      public a(ckn $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bS();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.bt();
         if ($$0 >= 0.5F && this.a.el().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements buh {
      @Nullable
      public ji<brz> a;

      public void a(azg $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bsd.a;
         } else if ($$1 <= 2) {
            this.a = bsd.e;
         } else if ($$1 <= 3) {
            this.a = bsd.j;
         } else if ($$1 <= 4) {
            this.a = bsd.n;
         }
      }
   }

   static class c<T extends bto> extends ccf<T> {
      public c(ckn $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bt();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
