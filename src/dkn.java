public class dkn extends dlk implements dlj {
   private static final int e = 1;
   private iu<cqk> f = iu.a(27, cqk.h);
   private final dkt g = new dkt() {
      @Override
      protected void a(cwz $$0, ib $$1, dmz $$2) {
         dkn.a($$0, $$1, $$2, aty.eL);
      }

      @Override
      protected void b(cwz $$0, ib $$1, dmz $$2) {
         dkn.a($$0, $$1, $$2, aty.eJ);
      }

      @Override
      protected void a(cwz $$0, ib $$1, dmz $$2, int $$3, int $$4) {
         dkn.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cis $$0) {
         if (!($$0.bZ instanceof clv)) {
            return false;
         } else {
            bmv $$1 = ((clv)$$0.bZ).l();
            return $$1 == dkn.this || $$1 instanceof bmu && ((bmu)$$1).a(dkn.this);
         }
      }
   };
   private final dko h = new dko();

   protected dkn(dki<?> $$0, ib $$1, dmz $$2) {
      super($$0, $$1, $$2);
   }

   public dkn(ib $$0, dmz $$1) {
      this(dki.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected vu k() {
      return vu.c("container.chest");
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.f = iu.a(this.b(), cqk.h);
      if (!this.c_($$0)) {
         bmw.b($$0, this.f);
      }
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         bmw.a($$0, this.f);
      }
   }

   public static void a(cwz $$0, ib $$1, dmz $$2, dkn $$3) {
      $$3.h.a();
   }

   static void a(cwz $$0, ib $$1, dmz $$2, atx $$3) {
      dnr $$4 = $$2.c(dbd.d);
      if ($$4 != dnr.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dnr.c) {
            ih $$8 = dbd.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, atz.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.h.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void d_(cis $$0) {
      if (!this.q && !$$0.N_()) {
         this.g.a($$0, this.i(), this.aC_(), this.n());
      }
   }

   @Override
   public void c(cis $$0) {
      if (!this.q && !$$0.N_()) {
         this.g.b($$0, this.i(), this.aC_(), this.n());
      }
   }

   @Override
   protected iu<cqk> j() {
      return this.f;
   }

   @Override
   protected void a(iu<cqk> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.h.a($$0);
   }

   public static int a(cwf $$0, ib $$1) {
      dmz $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dkg $$3 = $$0.c_($$1);
         if ($$3 instanceof dkn) {
            return ((dkn)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dkn $$0, dkn $$1) {
      iu<cqk> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected clo a(int $$0, cir $$1) {
      return clv.a($$0, $$1, this);
   }

   public void l() {
      if (!this.q) {
         this.g.c(this.i(), this.aC_(), this.n());
      }
   }

   protected void a(cwz $$0, ib $$1, dmz $$2, int $$3, int $$4) {
      daa $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
