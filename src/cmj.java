import javax.annotation.Nullable;

public class cmj extends cly {
   private static final ajy<Byte> a = akc.a(cmj.class, aka.a);
   private static final float b = 0.1F;

   public cmj(bus<? extends cmj> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.bS.a(1, new cbz(this));
      this.bS.a(2, new cbm<>(this, cih.class, 6.0F, 1.0, 1.2, $$0 -> !((cih)$$0).t()));
      this.bS.a(3, new ccl(this, 0.4F));
      this.bS.a(4, new cmj.a(this));
      this.bS.a(5, new cds(this, 0.8));
      this.bS.a(6, new ccn(this, cox.class, 8.0F));
      this.bS.a(6, new cda(this));
      this.bT.a(1, new cdx(this));
      this.bT.a(2, new cmj.c<>(this, cox.class));
      this.bT.a(3, new cmj.c<>(this, chk.class));
   }

   @Override
   protected cet b(dgi $$0) {
      return new ceu(this, $$0);
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

   public static bwo.a p() {
      return cly.gx().a(bwp.s, 16.0).a(bwp.v, 0.3F);
   }

   @Override
   protected avz u() {
      return awa.zz;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.zB;
   }

   @Override
   protected avz o_() {
      return awa.zA;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.zC, 0.15F, 1.0F);
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
   public boolean b(btq $$0) {
      return $$0.a(bts.s) ? false : super.b($$0);
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
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.H_();
      if ($$4.a(100) == 0) {
         cmg $$5 = bus.be.a(this.dV(), bur.g);
         if ($$5 != null) {
            $$5.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cmj.b();
         if ($$0.am() == bsh.d && $$4.i() < 0.1F * $$1.d()) {
            ((cmj.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cmj.b $$6) {
         jr<bto> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new btq($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fba l(bul $$0) {
      return $$0.dq() <= this.dq() ? new fba(0.0, 0.3125 * (double)this.ej(), 0.0) : super.l($$0);
   }

   static class a extends ccp {
      public a(cmj $$0) {
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

   public static class b implements bwa {
      @Nullable
      public jr<bto> a;

      public void a(azh $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bts.a;
         } else if ($$1 <= 2) {
            this.a = bts.e;
         } else if ($$1 <= 3) {
            this.a = bts.j;
         } else if ($$1 <= 4) {
            this.a = bts.n;
         }
      }
   }

   static class c<T extends bvh> extends cdy<T> {
      public c(cmj $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.by();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
