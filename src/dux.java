public class dux extends dvy implements dvw {
   private static final int d = 1;
   private jz<cxg> e = jz.a(27, cxg.j);
   private final dvd f = new dvd() {
      @Override
      protected void a(dgz $$0, jh $$1, dxo $$2) {
         dux.a($$0, $$1, $$2, awv.eS);
      }

      @Override
      protected void b(dgz $$0, jh $$1, dxo $$2) {
         dux.a($$0, $$1, $$2, awv.eQ);
      }

      @Override
      protected void a(dgz $$0, jh $$1, dxo $$2, int $$3, int $$4) {
         dux.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cpo $$0) {
         if (!($$0.cd instanceof ctc)) {
            return false;
         } else {
            bst $$1 = ((ctc)$$0.cd).l();
            return $$1 == dux.this || $$1 instanceof bss && ((bss)$$1).a(dux.this);
         }
      }
   };
   private final duy g = new duy();

   protected dux(dus<?> $$0, jh $$1, dxo $$2) {
      super($$0, $$1, $$2);
   }

   public dux(jh $$0, dxo $$1) {
      this(dus.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xk j() {
      return xk.c("container.chest");
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e = jz.a(this.b(), cxg.j);
      if (!this.b_($$0)) {
         bsu.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsu.a($$0, this.e, $$1);
      }
   }

   public static void a(dgz $$0, jh $$1, dxo $$2, dux $$3) {
      $$3.g.a();
   }

   static void a(dgz $$0, jh $$1, dxo $$2, awu $$3) {
      dyg $$4 = $$2.c(dlg.d);
      if ($$4 != dyg.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dyg.c) {
            jm $$8 = dlg.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, aww.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
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
   public void c_(cpo $$0) {
      if (!this.q && !$$0.aa_()) {
         this.f.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(cpo $$0) {
      if (!this.q && !$$0.aa_()) {
         this.f.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   protected jz<cxg> f() {
      return this.e;
   }

   @Override
   protected void a(jz<cxg> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dge $$0, jh $$1) {
      dxo $$2 = $$0.a_($$1);
      if ($$2.x()) {
         duq $$3 = $$0.c_($$1);
         if ($$3 instanceof dux) {
            return ((dux)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dux $$0, dux $$1) {
      jz<cxg> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cst a(int $$0, cpn $$1) {
      return ctc.a($$0, $$1, this);
   }

   public void k() {
      if (!this.q) {
         this.f.c(this.i(), this.aB_(), this.m());
      }
   }

   protected void a(dgz $$0, jh $$1, dxo $$2, int $$3, int $$4) {
      dkd $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
