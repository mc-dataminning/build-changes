import javax.annotation.Nullable;

public class cmg extends clv {
   private static final ako<Byte> b = aks.a(cmg.class, akq.a);
   private static final float c = 0.1F;

   public cmg(bup<? extends cmg> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbw(this));
      this.bS.a(2, new cbj<>(this, cie.class, 6.0F, 1.0, 1.2, $$0 -> !((cie)$$0).t()));
      this.bS.a(3, new cci(this, 0.4F));
      this.bS.a(4, new cmg.a(this));
      this.bS.a(5, new cdp(this, 0.8));
      this.bS.a(6, new cck(this, cor.class, 8.0F));
      this.bS.a(6, new ccx(this));
      this.bT.a(1, new cdu(this));
      this.bT.a(2, new cmg.c<>(this, cor.class));
      this.bT.a(3, new cmg.c<>(this, chh.class));
   }

   @Override
   protected ceq b(dff $$0) {
      return new cer(this, $$0);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dY().C) {
         this.x(this.Q);
      }
   }

   public static bwl.a t() {
      return clv.gB().a(bwm.s, 16.0).a(bwm.v, 0.3F);
   }

   @Override
   protected awn w() {
      return awo.yP;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.yR;
   }

   @Override
   protected awn o_() {
      return awo.yQ;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.yS, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(dvo $$0, ezr $$1) {
      if (!$$0.a(dil.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(btn $$0) {
      return $$0.a(btp.s) ? false : super.b($$0);
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
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azv $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         cmd $$5 = bup.aN.a(this.dY(), buo.g);
         if ($$5 != null) {
            $$5.b(this.dD(), this.dF(), this.dJ(), this.dO(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cmg.b();
         if ($$0.ak() == bse.d && $$4.i() < 0.1F * $$1.d()) {
            ((cmg.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cmg.b $$6) {
         jq<btl> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new btn($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public ezr l(bui $$0) {
      return $$0.dt() <= this.dt() ? new ezr(0.0, 0.3125 * (double)this.em(), 0.0) : super.l($$0);
   }

   static class a extends ccm {
      public a(cmg $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.cc();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.bA();
         if ($$0 >= 0.5F && this.a.eb().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements bvx {
      @Nullable
      public jq<btl> a;

      public void a(azv $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = btp.a;
         } else if ($$1 <= 2) {
            this.a = btp.e;
         } else if ($$1 <= 3) {
            this.a = btp.j;
         } else if ($$1 <= 4) {
            this.a = btp.n;
         }
      }
   }

   static class c<T extends bve> extends cdv<T> {
      public c(cmg $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bA();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
