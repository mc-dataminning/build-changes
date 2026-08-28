import javax.annotation.Nullable;

public class ckb extends cjq {
   private static final ajp<Byte> b = ajt.a(ckb.class, ajr.a);
   private static final float c = 0.1F;

   public ckb(bsm<? extends ckb> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzt(this));
      this.bU.a(2, new bzg<>(this, cga.class, 6.0F, 1.0, 1.2, $$0 -> !((cga)$$0).u()));
      this.bU.a(3, new caf(this, 0.4F));
      this.bU.a(4, new ckb.a(this));
      this.bU.a(5, new cbm(this, 0.8));
      this.bU.a(6, new cah(this, cmk.class, 8.0F));
      this.bU.a(6, new cau(this));
      this.bV.a(1, new cbr(this));
      this.bV.a(2, new ckb.c<>(this, cmk.class));
      this.bV.a(3, new ckb.c<>(this, cfd.class));
   }

   @Override
   protected ccn b(dcf $$0) {
      return new cco(this, $$0);
   }

   @Override
   protected void a(ajt.a $$0) {
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

   public static bui.a u() {
      return cjq.gu().a(buj.s, 16.0).a(buj.v, 0.3F);
   }

   @Override
   protected avg v() {
      return avh.yL;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.yN;
   }

   @Override
   protected avg o_() {
      return avh.yM;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.yO, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(dsk $$0, ewf $$1) {
      if (!$$0.a(dfj.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bro $$0) {
      return $$0.a(brq.s) ? false : super.c($$0);
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
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayo $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         cjy $$5 = bsm.aN.a(this.dQ());
         if ($$5 != null) {
            $$5.b(this.dv(), this.dx(), this.dB(), this.dG(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new ckb.b();
         if ($$0.al() == bqd.d && $$4.i() < 0.1F * $$1.d()) {
            ((ckb.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof ckb.b $$6) {
         jj<brm> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bro($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public ewf l(bsg $$0) {
      return $$0.dk() <= this.dk() ? new ewf(0.0, 0.3125 * (double)this.ec(), 0.0) : super.l($$0);
   }

   static class a extends caj {
      public a(ckb $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bT();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.bu();
         if ($$0 >= 0.5F && this.a.dT().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements btu {
      @Nullable
      public jj<brm> a;

      public void a(ayo $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = brq.a;
         } else if ($$1 <= 2) {
            this.a = brq.e;
         } else if ($$1 <= 3) {
            this.a = brq.j;
         } else if ($$1 <= 4) {
            this.a = brq.n;
         }
      }
   }

   static class c<T extends btb> extends cbs<T> {
      public c(ckb $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bu();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
