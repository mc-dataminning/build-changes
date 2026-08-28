public class dug extends dvh implements dvf {
   private static final int d = 1;
   private ka<cwp> e = ka.a(27, cwp.j);
   private final dum f = new dum() {
      @Override
      protected void a(dgi $$0, ji $$1, dwx $$2) {
         dug.a($$0, $$1, $$2, awa.eS);
      }

      @Override
      protected void b(dgi $$0, ji $$1, dwx $$2) {
         dug.a($$0, $$1, $$2, awa.eQ);
      }

      @Override
      protected void a(dgi $$0, ji $$1, dwx $$2, int $$3, int $$4) {
         dug.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cox $$0) {
         if (!($$0.cd instanceof csl)) {
            return false;
         } else {
            bsc $$1 = ((csl)$$0.cd).l();
            return $$1 == dug.this || $$1 instanceof bsb && ((bsb)$$1).a(dug.this);
         }
      }
   };
   private final duh g = new duh();

   protected dug(dub<?> $$0, ji $$1, dwx $$2) {
      super($$0, $$1, $$2);
   }

   public dug(ji $$0, dwx $$1) {
      this(dub.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wo j() {
      return wo.c("container.chest");
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.e = ka.a(this.b(), cwp.j);
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

   public static void a(dgi $$0, ji $$1, dwx $$2, dug $$3) {
      $$3.g.a();
   }

   static void a(dgi $$0, ji $$1, dwx $$2, avz $$3) {
      dxp $$4 = $$2.c(dkp.d);
      if ($$4 != dxp.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dxp.c) {
            jn $$8 = dkp.i($$2);
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
   public void c_(cox $$0) {
      if (!this.q && !$$0.Z_()) {
         this.f.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public void c(cox $$0) {
      if (!this.q && !$$0.Z_()) {
         this.f.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   protected ka<cwp> f() {
      return this.e;
   }

   @Override
   protected void a(ka<cwp> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dfn $$0, ji $$1) {
      dwx $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dtz $$3 = $$0.c_($$1);
         if ($$3 instanceof dug) {
            return ((dug)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dug $$0, dug $$1) {
      ka<cwp> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected csc a(int $$0, cow $$1) {
      return csl.a($$0, $$1, this);
   }

   public void k() {
      if (!this.q) {
         this.f.c(this.i(), this.aA_(), this.m());
      }
   }

   protected void a(dgi $$0, ji $$1, dwx $$2, int $$3, int $$4) {
      djm $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
