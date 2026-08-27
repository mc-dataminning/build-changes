public class dgk extends dhh implements dhg {
   private static final int e = 1;
   private io<cmh> f = io.a(27, cmh.f);
   private final dgq g = new dgq() {
      @Override
      protected void a(csy $$0, hv $$1, dip $$2) {
         dgk.a($$0, $$1, $$2, arc.es);
      }

      @Override
      protected void b(csy $$0, hv $$1, dip $$2) {
         dgk.a($$0, $$1, $$2, arc.eq);
      }

      @Override
      protected void a(csy $$0, hv $$1, dip $$2, int $$3, int $$4) {
         dgk.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cer $$0) {
         if (!($$0.bS instanceof chr)) {
            return false;
         } else {
            bje $$1 = ((chr)$$0.bS).l();
            return $$1 == dgk.this || $$1 instanceof bjd && ((bjd)$$1).a(dgk.this);
         }
      }
   };
   private final dgl h = new dgl();

   protected dgk(dgf<?> $$0, hv $$1, dip $$2) {
      super($$0, $$1, $$2);
   }

   public dgk(hv $$0, dip $$1) {
      this(dgf.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected vb l() {
      return vb.c("container.chest");
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.f = io.a(this.b(), cmh.f);
      if (!this.c_($$0)) {
         bjf.b($$0, this.f);
      }
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjf.a($$0, this.f);
      }
   }

   public static void a(csy $$0, hv $$1, dip $$2, dgk $$3) {
      $$3.h.a();
   }

   static void a(csy $$0, hv $$1, dip $$2, arb $$3) {
      djh $$4 = $$2.c(cxc.d);
      if ($$4 != djh.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == djh.c) {
            ia $$8 = cxc.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, ard.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cer $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.a($$0, this.i(), this.aB_(), this.r());
      }
   }

   @Override
   public void c(cer $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.b($$0, this.i(), this.aB_(), this.r());
      }
   }

   @Override
   protected io<cmh> k() {
      return this.f;
   }

   @Override
   protected void a(io<cmh> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.h.a($$0);
   }

   public static int a(cse $$0, hv $$1) {
      dip $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dgd $$3 = $$0.c_($$1);
         if ($$3 instanceof dgk) {
            return ((dgk)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dgk $$0, dgk $$1) {
      io<cmh> $$2 = $$0.k();
      $$0.a($$1.k());
      $$1.a($$2);
   }

   @Override
   protected chk a(int $$0, ceq $$1) {
      return chr.a($$0, $$1, this);
   }

   public void m() {
      if (!this.q) {
         this.g.c(this.i(), this.aB_(), this.r());
      }
   }

   protected void a(csy $$0, hv $$1, dip $$2, int $$3, int $$4) {
      cvz $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
