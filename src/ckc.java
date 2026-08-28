import javax.annotation.Nullable;

public class ckc extends cjr {
   private static final ajp<Byte> b = ajt.a(ckc.class, ajr.a);
   private static final float c = 0.1F;

   public ckc(bsn<? extends ckc> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzu(this));
      this.bU.a(2, new bzh<>(this, cgb.class, 6.0F, 1.0, 1.2, $$0 -> !((cgb)$$0).t()));
      this.bU.a(3, new cag(this, 0.4F));
      this.bU.a(4, new ckc.a(this));
      this.bU.a(5, new cbn(this, 0.8));
      this.bU.a(6, new cai(this, cml.class, 8.0F));
      this.bU.a(6, new cav(this));
      this.bV.a(1, new cbs(this));
      this.bV.a(2, new ckc.c<>(this, cml.class));
      this.bV.a(3, new ckc.c<>(this, cfe.class));
   }

   @Override
   protected cco b(dcg $$0) {
      return new ccp(this, $$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dR().B) {
         this.w(this.Q);
      }
   }

   public static buj.a t() {
      return cjr.gt().a(buk.s, 16.0).a(buk.v, 0.3F);
   }

   @Override
   protected avg v() {
      return avh.yL;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.yN;
   }

   @Override
   protected avg n_() {
      return avh.yM;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.yO, 0.15F, 1.0F);
   }

   @Override
   public boolean p_() {
      return this.x();
   }

   @Override
   public void a(dsl $$0, ewh $$1) {
      if (!$$0.a(dfk.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(brp $$0) {
      return $$0.a(brr.s) ? false : super.c($$0);
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
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayo $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         cjz $$5 = bsn.aN.a(this.dR());
         if ($$5 != null) {
            $$5.b(this.dw(), this.dy(), this.dC(), this.dH(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new ckc.b();
         if ($$0.al() == bqe.d && $$4.i() < 0.1F * $$1.d()) {
            ((ckc.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof ckc.b $$6) {
         jj<brn> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new brp($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public ewh l(bsh $$0) {
      return $$0.dl() <= this.dl() ? new ewh(0.0, 0.3125 * (double)this.ed(), 0.0) : super.l($$0);
   }

   static class a extends cak {
      public a(ckc $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bU();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.bv();
         if ($$0 >= 0.5F && this.a.dU().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements btv {
      @Nullable
      public jj<brn> a;

      public void a(ayo $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = brr.a;
         } else if ($$1 <= 2) {
            this.a = brr.e;
         } else if ($$1 <= 3) {
            this.a = brr.j;
         } else if ($$1 <= 4) {
            this.a = brr.n;
         }
      }
   }

   static class c<T extends btc> extends cbt<T> {
      public c(ckc $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bv();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
