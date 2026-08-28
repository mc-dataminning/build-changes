public class dst extends dtt implements dtr {
   private static final int d = 1;
   private jz<cwb> e = jz.a(27, cwb.k);
   private final dsz f = new dsz() {
      @Override
      protected void a(dfb $$0, jh $$1, dvj $$2) {
         dst.a($$0, $$1, $$2, awl.eR);
      }

      @Override
      protected void b(dfb $$0, jh $$1, dvj $$2) {
         dst.a($$0, $$1, $$2, awl.eP);
      }

      @Override
      protected void a(dfb $$0, jh $$1, dvj $$2, int $$3, int $$4) {
         dst.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(com $$0) {
         if (!($$0.cd instanceof crx)) {
            return false;
         } else {
            brw $$1 = ((crx)$$0.cd).l();
            return $$1 == dst.this || $$1 instanceof brv && ((brv)$$1).a(dst.this);
         }
      }
   };
   private final dsu g = new dsu();

   protected dst(dso<?> $$0, jh $$1, dvj $$2) {
      super($$0, $$1, $$2);
   }

   public dst(jh $$0, dvj $$1) {
      this(dso.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xi j() {
      return xi.c("container.chest");
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e = jz.a(this.b(), cwb.k);
      if (!this.b_($$0)) {
         brx.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brx.a($$0, this.e, $$1);
      }
   }

   public static void a(dfb $$0, jh $$1, dvj $$2, dst $$3) {
      $$3.g.a();
   }

   static void a(dfb $$0, jh $$1, dvj $$2, awk $$3) {
      dwb $$4 = $$2.c(djh.d);
      if ($$4 != dwb.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dwb.c) {
            jm $$8 = djh.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awm.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
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
   public void d_(com $$0) {
      if (!this.q && !$$0.R_()) {
         this.f.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(com $$0) {
      if (!this.q && !$$0.R_()) {
         this.f.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   protected jz<cwb> f() {
      return this.e;
   }

   @Override
   protected void a(jz<cwb> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(deg $$0, jh $$1) {
      dvj $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dsm $$3 = $$0.c_($$1);
         if ($$3 instanceof dst) {
            return ((dst)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dst $$0, dst $$1) {
      jz<cwb> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cro a(int $$0, col $$1) {
      return crx.a($$0, $$1, this);
   }

   public void k() {
      if (!this.q) {
         this.f.c(this.i(), this.aB_(), this.m());
      }
   }

   protected void a(dfb $$0, jh $$1, dvj $$2, int $$3, int $$4) {
      die $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
