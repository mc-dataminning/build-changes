import javax.annotation.Nullable;

public class ciy extends cin {
   private static final ajm<Byte> b = ajq.a(ciy.class, ajo.a);
   private static final float c = 0.1F;

   public ciy(brn<? extends ciy> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new byr(this));
      this.bS.a(2, new bye<>(this, cey.class, 6.0F, 1.0, 1.2, $$0 -> !((cey)$$0).u()));
      this.bS.a(3, new bzd(this, 0.4F));
      this.bS.a(4, new ciy.a(this));
      this.bS.a(5, new cak(this, 0.8));
      this.bS.a(6, new bzf(this, clh.class, 8.0F));
      this.bS.a(6, new bzs(this));
      this.bT.a(1, new cap(this));
      this.bT.a(2, new ciy.c<>(this, clh.class));
      this.bT.a(3, new ciy.c<>(this, ceb.class));
   }

   @Override
   protected cbl b(dad $$0) {
      return new cbm(this, $$0);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dN().B) {
         this.w(this.Q);
      }
   }

   public static btg.a u() {
      return cin.gv().a(bth.q, 16.0).a(bth.r, 0.3F);
   }

   @Override
   protected avb v() {
      return avc.yx;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.yz;
   }

   @Override
   protected avb o_() {
      return avc.yy;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.yA, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(dqh $$0, etp $$1) {
      if (!$$0.a(ddg.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(bqt $$0) {
      return $$0.a(bqv.s) ? false : super.c($$0);
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
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayg $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         civ $$5 = brn.aM.a(this.dN());
         if ($$5 != null) {
            $$5.b(this.ds(), this.du(), this.dy(), this.dD(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new ciy.b();
         if ($$0.ak() == bpj.d && $$4.i() < 0.1F * $$1.d()) {
            ((ciy.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof ciy.b $$6) {
         iw<bqr> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new bqt($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public etp l(brh $$0) {
      return $$0.dh() <= this.dh() ? new etp(0.0, 0.3125 * (double)this.ec(), 0.0) : super.l($$0);
   }

   static class a extends bzh {
      public a(ciy $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bQ();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.br();
         if ($$0 >= 0.5F && this.a.ej().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements bss {
      @Nullable
      public iw<bqr> a;

      public void a(ayg $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bqv.a;
         } else if ($$1 <= 2) {
            this.a = bqv.e;
         } else if ($$1 <= 3) {
            this.a = bqv.j;
         } else if ($$1 <= 4) {
            this.a = bqv.n;
         }
      }
   }

   static class c<T extends bsa> extends caq<T> {
      public c(ciy $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.br();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
