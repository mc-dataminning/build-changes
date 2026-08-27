public class dnk extends doi implements dog {
   private static final int e = 1;
   private je<csd> f = je.a(27, csd.i);
   private final dnq g = new dnq() {
      @Override
      protected void a(czu $$0, im $$1, dpy $$2) {
         dnk.a($$0, $$1, $$2, auz.eQ);
      }

      @Override
      protected void b(czu $$0, im $$1, dpy $$2) {
         dnk.a($$0, $$1, $$2, auz.eO);
      }

      @Override
      protected void a(czu $$0, im $$1, dpy $$2, int $$3, int $$4) {
         dnk.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(ckl $$0) {
         if (!($$0.cc instanceof cno)) {
            return false;
         } else {
            boj $$1 = ((cno)$$0.cc).l();
            return $$1 == dnk.this || $$1 instanceof boi && ((boi)$$1).a(dnk.this);
         }
      }
   };
   private final dnl h = new dnl();

   protected dnk(dnf<?> $$0, im $$1, dpy $$2) {
      super($$0, $$1, $$2);
   }

   public dnk(im $$0, dpy $$1) {
      this(dnf.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected ws k() {
      return ws.c("container.chest");
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.f = je.a(this.b(), csd.i);
      if (!this.a_($$0)) {
         bok.b($$0, this.f, $$1);
      }
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bok.a($$0, this.f, $$1);
      }
   }

   public static void a(czu $$0, im $$1, dpy $$2, dnk $$3) {
      $$3.h.a();
   }

   static void a(czu $$0, im $$1, dpy $$2, auy $$3) {
      dqq $$4 = $$2.c(ddy.d);
      if ($$4 != dqq.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dqq.c) {
            ir $$8 = ddy.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, ava.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(ckl $$0) {
      if (!this.q && !$$0.N_()) {
         this.g.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(ckl $$0) {
      if (!this.q && !$$0.N_()) {
         this.g.b($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   protected je<csd> j() {
      return this.f;
   }

   @Override
   protected void a(je<csd> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.h.a($$0);
   }

   public static int a(cza $$0, im $$1) {
      dpy $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dnd $$3 = $$0.c_($$1);
         if ($$3 instanceof dnk) {
            return ((dnk)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dnk $$0, dnk $$1) {
      je<csd> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cnh a(int $$0, ckk $$1) {
      return cno.a($$0, $$1, this);
   }

   public void l() {
      if (!this.q) {
         this.g.c(this.i(), this.az_(), this.n());
      }
   }

   protected void a(czu $$0, im $$1, dpy $$2, int $$3, int $$4) {
      dcv $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
