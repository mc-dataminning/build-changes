public class duf extends dvg implements dve {
   private static final int d = 1;
   private ka<cwo> e = ka.a(27, cwo.j);
   private final dul f = new dul() {
      @Override
      protected void a(dgh $$0, ji $$1, dww $$2) {
         duf.a($$0, $$1, $$2, awa.eS);
      }

      @Override
      protected void b(dgh $$0, ji $$1, dww $$2) {
         duf.a($$0, $$1, $$2, awa.eQ);
      }

      @Override
      protected void a(dgh $$0, ji $$1, dww $$2, int $$3, int $$4) {
         duf.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cow $$0) {
         if (!($$0.cd instanceof csk)) {
            return false;
         } else {
            bsc $$1 = ((csk)$$0.cd).l();
            return $$1 == duf.this || $$1 instanceof bsb && ((bsb)$$1).a(duf.this);
         }
      }
   };
   private final dug g = new dug();

   protected duf(dua<?> $$0, ji $$1, dww $$2) {
      super($$0, $$1, $$2);
   }

   public duf(ji $$0, dww $$1) {
      this(dua.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wp j() {
      return wp.c("container.chest");
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.e = ka.a(this.b(), cwo.j);
      if (!this.b_($$0)) {
         bsd.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsd.a($$0, this.e, $$1);
      }
   }

   public static void a(dgh $$0, ji $$1, dww $$2, duf $$3) {
      $$3.g.a();
   }

   static void a(dgh $$0, ji $$1, dww $$2, avz $$3) {
      dxo $$4 = $$2.c(dko.d);
      if ($$4 != dxo.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dxo.c) {
            jn $$8 = dko.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awb.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.g.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void c_(cow $$0) {
      if (!this.q && !$$0.Z_()) {
         this.f.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public void c(cow $$0) {
      if (!this.q && !$$0.Z_()) {
         this.f.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   protected ka<cwo> f() {
      return this.e;
   }

   @Override
   protected void a(ka<cwo> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dfm $$0, ji $$1) {
      dww $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dty $$3 = $$0.c_($$1);
         if ($$3 instanceof duf) {
            return ((duf)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(duf $$0, duf $$1) {
      ka<cwo> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected csb a(int $$0, cov $$1) {
      return csk.a($$0, $$1, this);
   }

   public void k() {
      if (!this.q) {
         this.f.c(this.i(), this.aA_(), this.m());
      }
   }

   protected void a(dgh $$0, ji $$1, dww $$2, int $$3, int $$4) {
      djl $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
