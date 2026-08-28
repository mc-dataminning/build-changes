public class dyk extends dzl implements dzj {
   private static final int d = 1;
   private jo<czy> e = jo.a(27, czy.k);
   private final dyq f = new dyq() {
      @Override
      protected void a(djx $$0, iv $$1, ebe $$2) {
         dyk.a($$0, $$1, $$2, awp.eU);
      }

      @Override
      protected void b(djx $$0, iv $$1, ebe $$2) {
         dyk.a($$0, $$1, $$2, awp.eS);
      }

      @Override
      protected void a(djx $$0, iv $$1, ebe $$2, int $$3, int $$4) {
         dyk.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(crx $$0) {
         if (!($$0.bR instanceof cvz)) {
            return false;
         } else {
            buk $$1 = ((cvz)$$0.bR).l();
            return $$1 == dyk.this || $$1 instanceof buj && ((buj)$$1).a(dyk.this);
         }
      }
   };
   private final dyl g = new dyl();

   protected dyk(dye<?> $$0, iv $$1, ebe $$2) {
      super($$0, $$1, $$2);
   }

   public dyk(iv $$0, ebe $$1) {
      this(dye.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xa j() {
      return xa.c("container.chest");
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.e = jo.a(this.b(), czy.k);
      if (!this.b_($$0)) {
         bul.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bul.a($$0, this.e, $$1);
      }
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dyk $$3) {
      $$3.g.a();
   }

   static void a(djx $$0, iv $$1, ebe $$2, awo $$3) {
      ebw $$4 = $$2.c(dog.d);
      if ($$4 != ebw.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == ebw.c) {
            jb $$8 = dog.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awq.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
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
   public void c_(crx $$0) {
      if (!this.p && !$$0.Z_()) {
         this.f.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(crx $$0) {
      if (!this.p && !$$0.Z_()) {
         this.f.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   protected jo<czy> f() {
      return this.e;
   }

   @Override
   protected void a(jo<czy> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(djb $$0, iv $$1) {
      ebe $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dyc $$3 = $$0.c_($$1);
         if ($$3 instanceof dyk) {
            return ((dyk)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dyk $$0, dyk $$1) {
      jo<czy> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cvq a(int $$0, crw $$1) {
      return cvz.a($$0, $$1, this);
   }

   public void k() {
      if (!this.p) {
         this.f.c(this.i(), this.aB_(), this.m());
      }
   }

   protected void a(djx $$0, iv $$1, ebe $$2, int $$3, int $$4) {
      dnc $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
