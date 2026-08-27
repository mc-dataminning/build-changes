public class dja extends djx implements djw {
   private static final int e = 1;
   private is<coz> f = is.a(27, coz.h);
   private final djg g = new djg() {
      @Override
      protected void a(cvn $$0, hz $$1, dlf $$2) {
         dja.a($$0, $$1, $$2, atk.eH);
      }

      @Override
      protected void b(cvn $$0, hz $$1, dlf $$2) {
         dja.a($$0, $$1, $$2, atk.eF);
      }

      @Override
      protected void a(cvn $$0, hz $$1, dlf $$2, int $$3, int $$4) {
         dja.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(chh $$0) {
         if (!($$0.bW instanceof cki)) {
            return false;
         } else {
            bln $$1 = ((cki)$$0.bW).l();
            return $$1 == dja.this || $$1 instanceof blm && ((blm)$$1).a(dja.this);
         }
      }
   };
   private final djb h = new djb();

   protected dja(div<?> $$0, hz $$1, dlf $$2) {
      super($$0, $$1, $$2);
   }

   public dja(hz $$0, dlf $$1) {
      this(div.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected vq l() {
      return vq.c("container.chest");
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.f = is.a(this.b(), coz.h);
      if (!this.c_($$0)) {
         blo.b($$0, this.f);
      }
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         blo.a($$0, this.f);
      }
   }

   public static void a(cvn $$0, hz $$1, dlf $$2, dja $$3) {
      $$3.h.a();
   }

   static void a(cvn $$0, hz $$1, dlf $$2, atj $$3) {
      dlx $$4 = $$2.c(czr.d);
      if ($$4 != dlx.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dlx.c) {
            ie $$8 = czr.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, atl.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(chh $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.a($$0, this.i(), this.aE_(), this.r());
      }
   }

   @Override
   public void c(chh $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.b($$0, this.i(), this.aE_(), this.r());
      }
   }

   @Override
   protected is<coz> k() {
      return this.f;
   }

   @Override
   protected void a(is<coz> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.h.a($$0);
   }

   public static int a(cut $$0, hz $$1) {
      dlf $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dit $$3 = $$0.c_($$1);
         if ($$3 instanceof dja) {
            return ((dja)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dja $$0, dja $$1) {
      is<coz> $$2 = $$0.k();
      $$0.a($$1.k());
      $$1.a($$2);
   }

   @Override
   protected ckb a(int $$0, chg $$1) {
      return cki.a($$0, $$1, this);
   }

   public void m() {
      if (!this.q) {
         this.g.c(this.i(), this.aE_(), this.r());
      }
   }

   protected void a(cvn $$0, hz $$1, dlf $$2, int $$3, int $$4) {
      cyo $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
