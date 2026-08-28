import javax.annotation.Nullable;

public class cmi extends clx {
   private static final ajx<Byte> a = akb.a(cmi.class, ajz.a);
   private static final float b = 0.1F;

   public cmi(bur<? extends cmi> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(1, new cby(this));
      this.bS.a(2, new cbl<>(this, cig.class, 6.0F, 1.0, 1.2, $$0 -> !((cig)$$0).t()));
      this.bS.a(3, new cck(this, 0.4F));
      this.bS.a(4, new cmi.a(this));
      this.bS.a(5, new cdr(this, 0.8));
      this.bS.a(6, new ccm(this, cox.class, 8.0F));
      this.bS.a(6, new ccz(this));
      this.bT.a(1, new cdw(this));
      this.bT.a(2, new cmi.c<>(this, cox.class));
      this.bT.a(3, new cmi.c<>(this, chj.class));
   }

   @Override
   protected ces b(dgi $$0) {
      return new cet(this, $$0);
   }

   @Override
   protected void a(akb.a $$0) {
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

   public static bwn.a p() {
      return clx.gu().a(bwo.s, 16.0).a(bwo.v, 0.3F);
   }

   @Override
   protected avz u() {
      return awa.zA;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.zC;
   }

   @Override
   protected avz o_() {
      return awa.zB;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.zD, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.t();
   }

   @Override
   public void a(dwx $$0, fba $$1) {
      if (!$$0.a(djo.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(btp $$0) {
      return $$0.a(btr.s) ? false : super.b($$0);
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
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.H_();
      if ($$4.a(100) == 0) {
         cmf $$5 = bur.bf.a(this.dW(), buq.g);
         if ($$5 != null) {
            $$5.b(this.dB(), this.dD(), this.dH(), this.dM(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cmi.b();
         if ($$0.am() == bsg.d && $$4.i() < 0.1F * $$1.d()) {
            ((cmi.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cmi.b $$6) {
         jr<btn> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new btp($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fba l(buk $$0) {
      return $$0.dr() <= this.dr() ? new fba(0.0, 0.3125 * (double)this.ek(), 0.0) : super.l($$0);
   }

   static class a extends cco {
      public a(cmi $$0) {
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

   public static class b implements bvz {
      @Nullable
      public jr<btn> a;

      public void a(azh $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = btr.a;
         } else if ($$1 <= 2) {
            this.a = btr.e;
         } else if ($$1 <= 3) {
            this.a = btr.j;
         } else if ($$1 <= 4) {
            this.a = btr.n;
         }
      }
   }

   static class c<T extends bvg> extends cdx<T> {
      public c(cmi $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.by();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
