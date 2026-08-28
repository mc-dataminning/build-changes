import javax.annotation.Nullable;

public class cmi extends clx {
   private static final ajy<Byte> a = akc.a(cmi.class, aka.a);
   private static final float b = 0.1F;

   public cmi(bur<? extends cmi> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.bS.a(1, new cby(this));
      this.bS.a(2, new cbl<>(this, cig.class, 6.0F, 1.0, 1.2, $$0 -> !((cig)$$0).t()));
      this.bS.a(3, new cck(this, 0.4F));
      this.bS.a(4, new cmi.a(this));
      this.bS.a(5, new cdr(this, 0.8));
      this.bS.a(6, new ccm(this, cow.class, 8.0F));
      this.bS.a(6, new ccz(this));
      this.bT.a(1, new cdw(this));
      this.bT.a(2, new cmi.c<>(this, cow.class));
      this.bT.a(3, new cmi.c<>(this, chj.class));
   }

   @Override
   protected ces b(dgh $$0) {
      return new cet(this, $$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().C) {
         this.x(this.P);
      }
   }

   public static bwn.a p() {
      return clx.gx().a(bwo.s, 16.0).a(bwo.v, 0.3F);
   }

   @Override
   protected avz u() {
      return awa.zz;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.zB;
   }

   @Override
   protected avz o_() {
      return awa.zA;
   }

   @Override
   protected void b(ji $$0, dww $$1) {
      this.a(awa.zC, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.t();
   }

   @Override
   public void a(dww $$0, faz $$1) {
      if (!$$0.a(djn.bz)) {
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
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.H_();
      if ($$4.a(100) == 0) {
         cmf $$5 = bur.be.a(this.dV(), buq.g);
         if ($$5 != null) {
            $$5.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
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
   public faz l(buk $$0) {
      return $$0.dq() <= this.dq() ? new faz(0.0, 0.3125 * (double)this.ej(), 0.0) : super.l($$0);
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
         if ($$0 >= 0.5F && this.a.dY().a(100) == 0) {
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
