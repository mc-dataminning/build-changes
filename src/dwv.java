public class dwv extends dxw implements dxu {
   private static final int d = 1;
   private jn<cys> e = jn.a(27, cys.k);
   private final dxb f = new dxb() {
      @Override
      protected void a(dip $$0, iu $$1, dzo $$2) {
         dwv.a($$0, $$1, $$2, awl.eS);
      }

      @Override
      protected void b(dip $$0, iu $$1, dzo $$2) {
         dwv.a($$0, $$1, $$2, awl.eQ);
      }

      @Override
      protected void a(dip $$0, iu $$1, dzo $$2, int $$3, int $$4) {
         dwv.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cqs $$0) {
         if (!($$0.bQ instanceof cut)) {
            return false;
         } else {
            btr $$1 = ((cut)$$0.bQ).l();
            return $$1 == dwv.this || $$1 instanceof btq && ((btq)$$1).a(dwv.this);
         }
      }
   };
   private final dww g = new dww();

   protected dwv(dwp<?> $$0, iu $$1, dzo $$2) {
      super($$0, $$1, $$2);
   }

   public dwv(iu $$0, dzo $$1) {
      this(dwp.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected ww j() {
      return ww.c("container.chest");
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.e = jn.a(this.b(), cys.k);
      if (!this.b_($$0)) {
         bts.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bts.a($$0, this.e, $$1);
      }
   }

   public static void a(dip $$0, iu $$1, dzo $$2, dwv $$3) {
      $$3.g.a();
   }

   static void a(dip $$0, iu $$1, dzo $$2, awk $$3) {
      eag $$4 = $$2.c(dmx.d);
      if ($$4 != eag.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == eag.c) {
            ja $$8 = dmx.i($$2);
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
   public void c_(cqs $$0) {
      if (!this.p && !$$0.U_()) {
         this.f.a($$0, this.i(), this.aw_(), this.m());
      }
   }

   @Override
   public void c(cqs $$0) {
      if (!this.p && !$$0.U_()) {
         this.f.b($$0, this.i(), this.aw_(), this.m());
      }
   }

   @Override
   protected jn<cys> f() {
      return this.e;
   }

   @Override
   protected void a(jn<cys> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dhv $$0, iu $$1) {
      dzo $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dwn $$3 = $$0.c_($$1);
         if ($$3 instanceof dwv) {
            return ((dwv)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dwv $$0, dwv $$1) {
      jn<cys> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cuk a(int $$0, cqr $$1) {
      return cut.a($$0, $$1, this);
   }

   public void k() {
      if (!this.p) {
         this.f.c(this.i(), this.aw_(), this.m());
      }
   }

   protected void a(dip $$0, iu $$1, dzo $$2, int $$3, int $$4) {
      dlu $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
