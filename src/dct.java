public class dct extends ddp implements ddo {
   private static final int c = 1;
   private hn<ciy> f = hn.a(27, ciy.b);
   private final dcz g = new dcz() {
      @Override
      protected void a(cpm $$0, gu $$1, dfa $$2) {
         dct.a($$0, $$1, $$2, aow.ej);
      }

      @Override
      protected void b(cpm $$0, gu $$1, dfa $$2) {
         dct.a($$0, $$1, $$2, aow.eh);
      }

      @Override
      protected void a(cpm $$0, gu $$1, dfa $$2, int $$3, int $$4) {
         dct.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cbn $$0) {
         if (!($$0.bQ instanceof cel)) {
            return false;
         } else {
            bgj $$1 = ((cel)$$0.bQ).l();
            return $$1 == dct.this || $$1 instanceof bgi && ((bgi)$$1).a(dct.this);
         }
      }
   };
   private final dcu j = new dcu();

   protected dct(dco<?> $$0, gu $$1, dfa $$2) {
      super($$0, $$1, $$2);
   }

   public dct(gu $$0, dfa $$1) {
      this(dco.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected tf g() {
      return tf.c("container.chest");
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.f = hn.a(this.b(), ciy.b);
      if (!this.d($$0)) {
         bgk.b($$0, this.f);
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgk.a($$0, this.f);
      }
   }

   public static void a(cpm $$0, gu $$1, dfa $$2, dct $$3) {
      $$3.j.a();
   }

   static void a(cpm $$0, gu $$1, dfa $$2, aov $$3) {
      dfs $$4 = $$2.c(cto.c);
      if ($$4 != dfs.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dfs.c) {
            ha $$8 = cto.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, aox.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cbn $$0) {
      if (!this.q && !$$0.G_()) {
         this.g.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cbn $$0) {
      if (!this.q && !$$0.G_()) {
         this.g.b($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   protected hn<ciy> f() {
      return this.f;
   }

   @Override
   protected void a(hn<ciy> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.j.a($$0);
   }

   public static int a(cos $$0, gu $$1) {
      dfa $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dcm $$3 = $$0.c_($$1);
         if ($$3 instanceof dct) {
            return ((dct)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dct $$0, dct $$1) {
      hn<ciy> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cee a(int $$0, cbm $$1) {
      return cel.a($$0, $$1, this);
   }

   public void i() {
      if (!this.q) {
         this.g.c(this.k(), this.p(), this.q());
      }
   }

   protected void a(cpm $$0, gu $$1, dfa $$2, int $$3, int $$4) {
      csm $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
