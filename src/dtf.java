public class dtf extends duf implements dud {
   private static final int d = 1;
   private jz<cwm> e = jz.a(27, cwm.k);
   private final dtl f = new dtl() {
      @Override
      protected void a(dfm $$0, jh $$1, dvv $$2) {
         dtf.a($$0, $$1, $$2, awn.eR);
      }

      @Override
      protected void b(dfm $$0, jh $$1, dvv $$2) {
         dtf.a($$0, $$1, $$2, awn.eP);
      }

      @Override
      protected void a(dfm $$0, jh $$1, dvv $$2, int $$3, int $$4) {
         dtf.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cou $$0) {
         if (!($$0.cc instanceof csi)) {
            return false;
         } else {
            bsd $$1 = ((csi)$$0.cc).l();
            return $$1 == dtf.this || $$1 instanceof bsc && ((bsc)$$1).a(dtf.this);
         }
      }
   };
   private final dtg g = new dtg();

   protected dtf(dta<?> $$0, jh $$1, dvv $$2) {
      super($$0, $$1, $$2);
   }

   public dtf(jh $$0, dvv $$1) {
      this(dta.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xj j() {
      return xj.c("container.chest");
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e = jz.a(this.b(), cwm.k);
      if (!this.b_($$0)) {
         bse.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bse.a($$0, this.e, $$1);
      }
   }

   public static void a(dfm $$0, jh $$1, dvv $$2, dtf $$3) {
      $$3.g.a();
   }

   static void a(dfm $$0, jh $$1, dvv $$2, awm $$3) {
      dwn $$4 = $$2.c(djt.d);
      if ($$4 != dwn.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dwn.c) {
            jm $$8 = djt.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awo.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
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
   public void c_(cou $$0) {
      if (!this.q && !$$0.Y_()) {
         this.f.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public void c(cou $$0) {
      if (!this.q && !$$0.Y_()) {
         this.f.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   protected jz<cwm> f() {
      return this.e;
   }

   @Override
   protected void a(jz<cwm> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(der $$0, jh $$1) {
      dvv $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dsy $$3 = $$0.c_($$1);
         if ($$3 instanceof dtf) {
            return ((dtf)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dtf $$0, dtf $$1) {
      jz<cwm> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected crz a(int $$0, cot $$1) {
      return csi.a($$0, $$1, this);
   }

   public void k() {
      if (!this.q) {
         this.f.c(this.i(), this.aA_(), this.m());
      }
   }

   protected void a(dfm $$0, jh $$1, dvv $$2, int $$3, int $$4) {
      diq $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
