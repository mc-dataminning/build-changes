public class cbk extends cbl {
   private boolean p;

   public cbk(bsc $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected emq a(int $$0) {
      this.o = new emw();
      this.o.a(true);
      return new emq(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aC() || this.a.bg() || this.a.bP();
   }

   @Override
   protected etp b() {
      return new etp(this.a.ds(), (double)this.s(), this.a.dy());
   }

   @Override
   public emo a(in $$0, int $$1) {
      dsn $$2 = this.b.M().a(jp.a($$0.u()), jp.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).i()) {
            in $$3 = $$0.d();

            while ($$3.v() > this.b.I_() && $$2.a_($$3).i()) {
               $$3 = $$3.d();
            }

            if ($$3.v() > this.b.I_()) {
               return super.a($$3.c(), $$1);
            }

            while ($$3.v() < this.b.al() && $$2.a_($$3).i()) {
               $$3 = $$3.c();
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            in $$4 = $$0.c();

            while ($$4.v() < this.b.al() && $$2.a_($$4).e()) {
               $$4 = $$4.c();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public emo a(brh $$0, int $$1) {
      return this.a($$0.dn(), $$1);
   }

   private int s() {
      if (this.a.bc() && this.p()) {
         int $$0 = this.a.dt();
         dqh $$1 = this.b.a_(in.a(this.a.ds(), (double)$$0, this.a.dy()));
         int $$2 = 0;

         while ($$1.a(ddg.G)) {
            $$1 = this.b.a_(in.a(this.a.ds(), (double)(++$$0), this.a.dy()));
            if (++$$2 > 16) {
               return this.a.dt();
            }
         }

         return $$0;
      } else {
         return axz.a(this.a.du() + 0.5);
      }
   }

   @Override
   protected void S_() {
      super.S_();
      if (this.p) {
         if (this.b.h(in.a(this.a.ds(), this.a.du() + 0.5, this.a.dy()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            emm $$1 = this.c.a($$0);
            if (this.b.h(new in($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(emr $$0) {
      if ($$0 == emr.j) {
         return false;
      } else {
         return $$0 == emr.i ? false : $$0 != emr.b;
      }
   }

   public void b(boolean $$0) {
      this.o.b($$0);
   }

   public boolean e() {
      return this.o.d();
   }

   public void c(boolean $$0) {
      this.o.a($$0);
   }

   public boolean f() {
      return this.o.d();
   }

   public void d(boolean $$0) {
      this.p = $$0;
   }

   public void e(boolean $$0) {
      this.o.d($$0);
   }
}
