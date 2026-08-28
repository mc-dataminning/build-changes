public class dyw extends dzx implements dzv {
   private static final int d = 1;
   private jp<dak> e = jp.a(27, dak.l);
   private final dzc f = new dzc() {
      @Override
      protected void a(dkj $$0, iw $$1, ebq $$2) {
         dyw.a($$0, $$1, $$2, awy.eU);
      }

      @Override
      protected void b(dkj $$0, iw $$1, ebq $$2) {
         dyw.a($$0, $$1, $$2, awy.eS);
      }

      @Override
      protected void a(dkj $$0, iw $$1, ebq $$2, int $$3, int $$4) {
         dyw.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(csi $$0) {
         if (!($$0.bR instanceof cwk)) {
            return false;
         } else {
            buv $$1 = ((cwk)$$0.bR).l();
            return $$1 == dyw.this || $$1 instanceof buu && ((buu)$$1).a(dyw.this);
         }
      }
   };
   private final dyx g = new dyx();

   protected dyw(dyq<?> $$0, iw $$1, ebq $$2) {
      super($$0, $$1, $$2);
   }

   public dyw(iw $$0, ebq $$1) {
      this(dyq.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xg j() {
      return xg.c("container.chest");
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.e = jp.a(this.b(), dak.l);
      if (!this.b_($$0)) {
         buw.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         buw.a($$0, this.e, $$1);
      }
   }

   public static void a(dkj $$0, iw $$1, ebq $$2, dyw $$3) {
      $$3.g.a();
   }

   static void a(dkj $$0, iw $$1, ebq $$2, awx $$3) {
      eci $$4 = $$2.c(dos.d);
      if ($$4 != eci.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == eci.c) {
            jc $$8 = dos.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awz.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
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
   public void c_(csi $$0) {
      if (!this.p && !$$0.ak()) {
         this.f.a($$0, this.i(), this.ax_(), this.m());
      }
   }

   @Override
   public void c(csi $$0) {
      if (!this.p && !$$0.ak()) {
         this.f.b($$0, this.i(), this.ax_(), this.m());
      }
   }

   @Override
   protected jp<dak> f() {
      return this.e;
   }

   @Override
   protected void a(jp<dak> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(djn $$0, iw $$1) {
      ebq $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dyo $$3 = $$0.c_($$1);
         if ($$3 instanceof dyw) {
            return ((dyw)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dyw $$0, dyw $$1) {
      jp<dak> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cwb a(int $$0, csh $$1) {
      return cwk.a($$0, $$1, this);
   }

   public void k() {
      if (!this.p) {
         this.f.c(this.i(), this.ax_(), this.m());
      }
   }

   protected void a(dkj $$0, iw $$1, ebq $$2, int $$3, int $$4) {
      dno $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
