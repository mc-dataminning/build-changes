public class dje extends dkb implements dka {
   private static final int e = 1;
   private is<cpd> f = is.a(27, cpd.h);
   private final djk g = new djk() {
      @Override
      protected void a(cvr $$0, hz $$1, dlj $$2) {
         dje.a($$0, $$1, $$2, atl.eI);
      }

      @Override
      protected void b(cvr $$0, hz $$1, dlj $$2) {
         dje.a($$0, $$1, $$2, atl.eG);
      }

      @Override
      protected void a(cvr $$0, hz $$1, dlj $$2, int $$3, int $$4) {
         dje.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(chl $$0) {
         if (!($$0.bW instanceof ckm)) {
            return false;
         } else {
            blp $$1 = ((ckm)$$0.bW).l();
            return $$1 == dje.this || $$1 instanceof blo && ((blo)$$1).a(dje.this);
         }
      }
   };
   private final djf h = new djf();

   protected dje(diz<?> $$0, hz $$1, dlj $$2) {
      super($$0, $$1, $$2);
   }

   public dje(hz $$0, dlj $$1) {
      this(diz.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected vq l() {
      return vq.c("container.chest");
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.f = is.a(this.b(), cpd.h);
      if (!this.c_($$0)) {
         blq.b($$0, this.f);
      }
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         blq.a($$0, this.f);
      }
   }

   public static void a(cvr $$0, hz $$1, dlj $$2, dje $$3) {
      $$3.h.a();
   }

   static void a(cvr $$0, hz $$1, dlj $$2, atk $$3) {
      dmb $$4 = $$2.c(czv.d);
      if ($$4 != dmb.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dmb.c) {
            ie $$8 = czv.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, atm.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(chl $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.a($$0, this.i(), this.aE_(), this.r());
      }
   }

   @Override
   public void c(chl $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.b($$0, this.i(), this.aE_(), this.r());
      }
   }

   @Override
   protected is<cpd> k() {
      return this.f;
   }

   @Override
   protected void a(is<cpd> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.h.a($$0);
   }

   public static int a(cux $$0, hz $$1) {
      dlj $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dix $$3 = $$0.c_($$1);
         if ($$3 instanceof dje) {
            return ((dje)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dje $$0, dje $$1) {
      is<cpd> $$2 = $$0.k();
      $$0.a($$1.k());
      $$1.a($$2);
   }

   @Override
   protected ckf a(int $$0, chk $$1) {
      return ckm.a($$0, $$1, this);
   }

   public void m() {
      if (!this.q) {
         this.g.c(this.i(), this.aE_(), this.r());
      }
   }

   protected void a(cvr $$0, hz $$1, dlj $$2, int $$3, int $$4) {
      cys $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
