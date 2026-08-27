public class dmv extends dnt implements dnr {
   private static final int e = 1;
   private iw<crs> f = iw.a(27, crs.i);
   private final dnb g = new dnb() {
      @Override
      protected void a(czg $$0, id $$1, dpi $$2) {
         dmv.a($$0, $$1, $$2, auo.eQ);
      }

      @Override
      protected void b(czg $$0, id $$1, dpi $$2) {
         dmv.a($$0, $$1, $$2, auo.eO);
      }

      @Override
      protected void a(czg $$0, id $$1, dpi $$2, int $$3, int $$4) {
         dmv.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cka $$0) {
         if (!($$0.ca instanceof cnd)) {
            return false;
         } else {
            bny $$1 = ((cnd)$$0.ca).l();
            return $$1 == dmv.this || $$1 instanceof bnx && ((bnx)$$1).a(dmv.this);
         }
      }
   };
   private final dmw h = new dmw();

   protected dmv(dmq<?> $$0, id $$1, dpi $$2) {
      super($$0, $$1, $$2);
   }

   public dmv(id $$0, dpi $$1) {
      this(dmq.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wi k() {
      return wi.c("container.chest");
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.f = iw.a(this.b(), crs.i);
      if (!this.a_($$0)) {
         bnz.b($$0, this.f, $$1);
      }
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bnz.a($$0, this.f, $$1);
      }
   }

   public static void a(czg $$0, id $$1, dpi $$2, dmv $$3) {
      $$3.h.a();
   }

   static void a(czg $$0, id $$1, dpi $$2, aun $$3) {
      dqa $$4 = $$2.c(ddk.d);
      if ($$4 != dqa.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dqa.c) {
            ij $$8 = ddk.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, aup.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cka $$0) {
      if (!this.q && !$$0.N_()) {
         this.g.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(cka $$0) {
      if (!this.q && !$$0.N_()) {
         this.g.b($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   protected iw<crs> j() {
      return this.f;
   }

   @Override
   protected void a(iw<crs> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.h.a($$0);
   }

   public static int a(cym $$0, id $$1) {
      dpi $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dmo $$3 = $$0.c_($$1);
         if ($$3 instanceof dmv) {
            return ((dmv)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dmv $$0, dmv $$1) {
      iw<crs> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cmw a(int $$0, cjz $$1) {
      return cnd.a($$0, $$1, this);
   }

   public void l() {
      if (!this.q) {
         this.g.c(this.i(), this.az_(), this.n());
      }
   }

   protected void a(czg $$0, id $$1, dpi $$2, int $$3, int $$4) {
      dch $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
