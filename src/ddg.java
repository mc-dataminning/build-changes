public class ddg extends dec implements deb {
   private static final int c = 1;
   private hn<cjl> f = hn.a(27, cjl.b);
   private final ddm g = new ddm() {
      @Override
      protected void a(cqb $$0, gw $$1, dfd $$2) {
         ddg.a($$0, $$1, $$2, apg.ej);
      }

      @Override
      protected void b(cqb $$0, gw $$1, dfd $$2) {
         ddg.a($$0, $$1, $$2, apg.eh);
      }

      @Override
      protected void a(cqb $$0, gw $$1, dfd $$2, int $$3, int $$4) {
         ddg.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cca $$0) {
         if (!($$0.bS instanceof cey)) {
            return false;
         } else {
            bgx $$1 = ((cey)$$0.bS).l();
            return $$1 == ddg.this || $$1 instanceof bgw && ((bgw)$$1).a(ddg.this);
         }
      }
   };
   private final ddh j = new ddh();

   protected ddg(ddb<?> $$0, gw $$1, dfd $$2) {
      super($$0, $$1, $$2);
   }

   public ddg(gw $$0, dfd $$1) {
      this(ddb.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected tl g() {
      return tl.c("container.chest");
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.f = hn.a(this.b(), cjl.b);
      if (!this.d($$0)) {
         bgy.b($$0, this.f);
      }
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgy.a($$0, this.f);
      }
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, ddg $$3) {
      $$3.j.a();
   }

   static void a(cqb $$0, gw $$1, dfd $$2, apf $$3) {
      dfv $$4 = $$2.c(cuf.d);
      if ($$4 != dfv.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dfv.c) {
            ha $$8 = cuf.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, aph.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.j.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void d_(cca $$0) {
      if (!this.q && !$$0.M_()) {
         this.g.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cca $$0) {
      if (!this.q && !$$0.M_()) {
         this.g.b($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   protected hn<cjl> f() {
      return this.f;
   }

   @Override
   protected void a(hn<cjl> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.j.a($$0);
   }

   public static int a(cph $$0, gw $$1) {
      dfd $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dcz $$3 = $$0.c_($$1);
         if ($$3 instanceof ddg) {
            return ((ddg)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(ddg $$0, ddg $$1) {
      hn<cjl> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cer a(int $$0, cbz $$1) {
      return cey.a($$0, $$1, this);
   }

   public void i() {
      if (!this.q) {
         this.g.c(this.k(), this.p(), this.q());
      }
   }

   protected void a(cqb $$0, gw $$1, dfd $$2, int $$3, int $$4) {
      ctc $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
