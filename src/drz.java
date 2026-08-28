public class drz extends dsz implements dsx {
   private static final int d = 1;
   private jw<cvp> e = jw.a(27, cvp.k);
   private final dsf f = new dsf() {
      @Override
      protected void a(deg $$0, je $$1, duo $$2) {
         drz.a($$0, $$1, $$2, awe.eR);
      }

      @Override
      protected void b(deg $$0, je $$1, duo $$2) {
         drz.a($$0, $$1, $$2, awe.eP);
      }

      @Override
      protected void a(deg $$0, je $$1, duo $$2, int $$3, int $$4) {
         drz.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cnu $$0) {
         if (!($$0.bZ instanceof crf)) {
            return false;
         } else {
            bri $$1 = ((crf)$$0.bZ).l();
            return $$1 == drz.this || $$1 instanceof brh && ((brh)$$1).a(drz.this);
         }
      }
   };
   private final dsa g = new dsa();

   protected drz(dru<?> $$0, je $$1, duo $$2) {
      super($$0, $$1, $$2);
   }

   public drz(je $$0, duo $$1) {
      this(dru.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xd j() {
      return xd.c("container.chest");
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.e = jw.a(this.b(), cvp.k);
      if (!this.b_($$0)) {
         brj.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brj.a($$0, this.e, $$1);
      }
   }

   public static void a(deg $$0, je $$1, duo $$2, drz $$3) {
      $$3.g.a();
   }

   static void a(deg $$0, je $$1, duo $$2, awd $$3) {
      dvg $$4 = $$2.c(dim.d);
      if ($$4 != dvg.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dvg.c) {
            jj $$8 = dim.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awf.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cnu $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(cnu $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   protected jw<cvp> f() {
      return this.e;
   }

   @Override
   protected void a(jw<cvp> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(ddl $$0, je $$1) {
      duo $$2 = $$0.a_($$1);
      if ($$2.x()) {
         drs $$3 = $$0.c_($$1);
         if ($$3 instanceof drz) {
            return ((drz)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(drz $$0, drz $$1) {
      jw<cvp> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cqw a(int $$0, cnt $$1) {
      return crf.a($$0, $$1, this);
   }

   public void k() {
      if (!this.q) {
         this.f.c(this.i(), this.aB_(), this.m());
      }
   }

   protected void a(deg $$0, je $$1, duo $$2, int $$3, int $$4) {
      dhj $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
