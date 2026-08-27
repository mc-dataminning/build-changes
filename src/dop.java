public class dop extends dpn implements dpl {
   private static final int d = 1;
   private jg<ctq> e = jg.a(27, ctq.i);
   private final dov f = new dov() {
      @Override
      protected void a(daz $$0, io $$1, drd $$2) {
         dop.a($$0, $$1, $$2, avi.eQ);
      }

      @Override
      protected void b(daz $$0, io $$1, drd $$2) {
         dop.a($$0, $$1, $$2, avi.eO);
      }

      @Override
      protected void a(daz $$0, io $$1, drd $$2, int $$3, int $$4) {
         dop.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cly $$0) {
         if (!($$0.cb instanceof cpc)) {
            return false;
         } else {
            bpp $$1 = ((cpc)$$0.cb).l();
            return $$1 == dop.this || $$1 instanceof bpo && ((bpo)$$1).a(dop.this);
         }
      }
   };
   private final doq g = new doq();

   protected dop(dok<?> $$0, io $$1, drd $$2) {
      super($$0, $$1, $$2);
   }

   public dop(io $$0, drd $$1) {
      this(dok.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wx k() {
      return wx.c("container.chest");
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.e = jg.a(this.b(), ctq.i);
      if (!this.a_($$0)) {
         bpq.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpq.a($$0, this.e, $$1);
      }
   }

   public static void a(daz $$0, io $$1, drd $$2, dop $$3) {
      $$3.g.a();
   }

   static void a(daz $$0, io $$1, drd $$2, avh $$3) {
      drv $$4 = $$2.c(dfd.d);
      if ($$4 != drv.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == drv.c) {
            it $$8 = dfd.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, avj.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cly $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.a($$0, this.i(), this.aA_(), this.n());
      }
   }

   @Override
   public void c(cly $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.b($$0, this.i(), this.aA_(), this.n());
      }
   }

   @Override
   protected jg<ctq> j() {
      return this.e;
   }

   @Override
   protected void a(jg<ctq> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(daf $$0, io $$1) {
      drd $$2 = $$0.a_($$1);
      if ($$2.t()) {
         doi $$3 = $$0.c_($$1);
         if ($$3 instanceof dop) {
            return ((dop)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dop $$0, dop $$1) {
      jg<ctq> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cov a(int $$0, clx $$1) {
      return cpc.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.aA_(), this.n());
      }
   }

   protected void a(daz $$0, io $$1, drd $$2, int $$3, int $$4) {
      dea $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
