import javax.annotation.Nullable;

public class cmz extends cmo {
   private static final aks<Byte> a = akw.a(cmz.class, aku.a);
   private static final float b = 0.1F;

   public cmz(bvi<? extends cmz> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(1, new ccp(this));
      this.bT.a(2, new ccc<>(this, cix.class, 6.0F, 1.0, 1.2, $$0 -> !((cix)$$0).t()));
      this.bT.a(3, new cdb(this, 0.4F));
      this.bT.a(4, new cmz.a(this));
      this.bT.a(5, new cei(this, 0.8));
      this.bT.a(6, new cdd(this, cpo.class, 8.0F));
      this.bT.a(6, new cdq(this));
      this.bU.a(1, new cen(this));
      this.bU.a(2, new cmz.c<>(this, cpo.class));
      this.bU.a(3, new cmz.c<>(this, cia.class));
   }

   @Override
   protected cfj b(dgz $$0) {
      return new cfk(this, $$0);
   }

   @Override
   protected void a(akw.a $$0) {
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

   public static bxe.a p() {
      return cmo.gt().a(bxf.s, 16.0).a(bxf.v, 0.3F);
   }

   @Override
   protected awu u() {
      return awv.zA;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.zC;
   }

   @Override
   protected awu o_() {
      return awv.zB;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.zD, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.t();
   }

   @Override
   public void a(dxo $$0, fbr $$1) {
      if (!$$0.a(dkf.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(bug $$0) {
      return $$0.a(bui.s) ? false : super.b($$0);
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
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bac $$4 = $$0.H_();
      if ($$4.a(100) == 0) {
         cmw $$5 = bvi.bf.a(this.dW(), bvh.g);
         if ($$5 != null) {
            $$5.b(this.dB(), this.dD(), this.dH(), this.dM(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cmz.b();
         if ($$0.am() == bsx.d && $$4.i() < 0.1F * $$1.d()) {
            ((cmz.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cmz.b $$6) {
         jq<bue> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new bug($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fbr l(bvb $$0) {
      return $$0.dr() <= this.dr() ? new fbr(0.0, 0.3125 * (double)this.ek(), 0.0) : super.l($$0);
   }

   static class a extends cdf {
      public a(cmz $$0) {
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

   public static class b implements bwq {
      @Nullable
      public jq<bue> a;

      public void a(bac $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bui.a;
         } else if ($$1 <= 2) {
            this.a = bui.e;
         } else if ($$1 <= 3) {
            this.a = bui.j;
         } else if ($$1 <= 4) {
            this.a = bui.n;
         }
      }
   }

   static class c<T extends bvx> extends ceo<T> {
      public c(cmz $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.by();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
