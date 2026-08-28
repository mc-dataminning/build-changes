import javax.annotation.Nullable;

public class cmk extends clz {
   private static final ajy<Byte> a = akc.a(cmk.class, aka.a);
   private static final float b = 0.1F;

   public cmk(but<? extends cmk> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.bS.a(1, new cca(this));
      this.bS.a(2, new cbn<>(this, cii.class, 6.0F, 1.0, 1.2, $$0 -> !((cii)$$0).t()));
      this.bS.a(3, new ccm(this, 0.4F));
      this.bS.a(4, new cmk.a(this));
      this.bS.a(5, new cdt(this, 0.8));
      this.bS.a(6, new cco(this, coy.class, 8.0F));
      this.bS.a(6, new cdb(this));
      this.bT.a(1, new cdy(this));
      this.bT.a(2, new cmk.c<>(this, coy.class));
      this.bT.a(3, new cmk.c<>(this, chl.class));
   }

   @Override
   protected ceu b(dgj $$0) {
      return new cev(this, $$0);
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

   public static bwp.a p() {
      return clz.gx().a(bwq.s, 16.0).a(bwq.v, 0.3F);
   }

   @Override
   protected avz u() {
      return awa.zz;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.zB;
   }

   @Override
   protected avz o_() {
      return awa.zA;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.zC, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.t();
   }

   @Override
   public void a(dwy $$0, fbb $$1) {
      if (!$$0.a(djp.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(btr $$0) {
      return $$0.a(btt.s) ? false : super.b($$0);
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
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.H_();
      if ($$4.a(100) == 0) {
         cmh $$5 = but.be.a(this.dV(), bus.g);
         if ($$5 != null) {
            $$5.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cmk.b();
         if ($$0.am() == bsi.d && $$4.i() < 0.1F * $$1.d()) {
            ((cmk.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cmk.b $$6) {
         jr<btp> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new btr($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fbb l(bum $$0) {
      return $$0.dq() <= this.dq() ? new fbb(0.0, 0.3125 * (double)this.ej(), 0.0) : super.l($$0);
   }

   static class a extends ccq {
      public a(cmk $$0) {
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

   public static class b implements bwb {
      @Nullable
      public jr<btp> a;

      public void a(azh $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = btt.a;
         } else if ($$1 <= 2) {
            this.a = btt.e;
         } else if ($$1 <= 3) {
            this.a = btt.j;
         } else if ($$1 <= 4) {
            this.a = btt.n;
         }
      }
   }

   static class c<T extends bvi> extends cdz<T> {
      public c(cmk $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.by();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
