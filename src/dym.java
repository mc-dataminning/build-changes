public class dym extends dzn implements dzl {
   private static final int d = 1;
   private jp<daa> e = jp.a(27, daa.k);
   private final dys f = new dys() {
      @Override
      protected void a(djz $$0, iw $$1, ebg $$2) {
         dym.a($$0, $$1, $$2, awr.eU);
      }

      @Override
      protected void b(djz $$0, iw $$1, ebg $$2) {
         dym.a($$0, $$1, $$2, awr.eS);
      }

      @Override
      protected void a(djz $$0, iw $$1, ebg $$2, int $$3, int $$4) {
         dym.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(crz $$0) {
         if (!($$0.bR instanceof cwb)) {
            return false;
         } else {
            bum $$1 = ((cwb)$$0.bR).l();
            return $$1 == dym.this || $$1 instanceof bul && ((bul)$$1).a(dym.this);
         }
      }
   };
   private final dyn g = new dyn();

   protected dym(dyg<?> $$0, iw $$1, ebg $$2) {
      super($$0, $$1, $$2);
   }

   public dym(iw $$0, ebg $$1) {
      this(dyg.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xc j() {
      return xc.c("container.chest");
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.e = jp.a(this.b(), daa.k);
      if (!this.b_($$0)) {
         bun.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bun.a($$0, this.e, $$1);
      }
   }

   public static void a(djz $$0, iw $$1, ebg $$2, dym $$3) {
      $$3.g.a();
   }

   static void a(djz $$0, iw $$1, ebg $$2, awq $$3) {
      eby $$4 = $$2.c(doi.d);
      if ($$4 != eby.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == eby.c) {
            jc $$8 = doi.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, aws.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
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
   public void c_(crz $$0) {
      if (!this.p && !$$0.Z_()) {
         this.f.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(crz $$0) {
      if (!this.p && !$$0.Z_()) {
         this.f.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   protected jp<daa> f() {
      return this.e;
   }

   @Override
   protected void a(jp<daa> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(djd $$0, iw $$1) {
      ebg $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dye $$3 = $$0.c_($$1);
         if ($$3 instanceof dym) {
            return ((dym)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dym $$0, dym $$1) {
      jp<daa> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cvs a(int $$0, cry $$1) {
      return cwb.a($$0, $$1, this);
   }

   public void k() {
      if (!this.p) {
         this.f.c(this.i(), this.aB_(), this.m());
      }
   }

   protected void a(djz $$0, iw $$1, ebg $$2, int $$3, int $$4) {
      dne $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
