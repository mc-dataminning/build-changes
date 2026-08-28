import javax.annotation.Nullable;

public abstract class cww extends cvs {
   private static final int m = 9;
   private static final int n = 3;
   private static final int o = 0;
   protected final cwf q;
   protected final crz r;
   protected final bum s;
   protected final cxk t = new cxk() {
      @Override
      public void e() {
         cww.this.a(this);
      }
   };
   private final int p;

   protected boolean a(crz $$0, boolean $$1) {
      return true;
   }

   protected abstract void a(crz var1, daa var2);

   protected abstract boolean a(ebg var1);

   public cww(@Nullable cxb<?> $$0, int $$1, cry $$2, cwf $$3, cwx $$4) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.h;
      this.s = this.e($$4.d());
      this.p = $$4.e();
      this.a($$4);
      this.b($$4);
      this.c($$2, 8, 84);
   }

   private void a(cwx $$0) {
      for (final cwx.b $$1 : $$0.c()) {
         this.a(new cxp(this.s, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(daa $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cwx $$0) {
      this.a(new cxp(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(daa $$0) {
            return false;
         }

         @Override
         public boolean a(crz $$0) {
            return cww.this.a($$0, this.h());
         }

         @Override
         public void a(crz $$0, daa $$1) {
            cww.this.a($$0, $$1);
         }
      });
   }

   @Override
   public abstract void l();

   private bva e(int $$0) {
      return new bva($$0) {
         @Override
         public void e() {
            super.e();
            cww.this.a(this);
         }
      };
   }

   @Override
   public void a(bum $$0) {
      super.a($$0);
      if ($$0 == this.s) {
         this.l();
      }
   }

   @Override
   public void a(crz $$0) {
      super.a($$0);
      this.q.a(($$1, $$2) -> this.a($$0, this.s));
   }

   @Override
   public boolean b(crz $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public daa b(crz $$0, int $$1) {
      daa $$2 = daa.k;
      cxp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         daa $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.m();
         int $$6 = this.q();
         if ($$1 == this.n()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return daa.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 0 && $$1 < this.n()) {
            if (!this.a($$4, $$5, $$6, false)) {
               return daa.k;
            }
         } else if (this.c($$4) && $$1 >= this.m() && $$1 < this.q()) {
            if (!this.a($$4, 0, this.n(), false)) {
               return daa.k;
            }
         } else if ($$1 >= this.m() && $$1 < this.o()) {
            if (!this.a($$4, this.p(), this.q(), false)) {
               return daa.k;
            }
         } else if ($$1 >= this.p() && $$1 < this.q() && !this.a($$4, this.m(), this.o(), false)) {
            return daa.k;
         }

         if ($$4.f()) {
            $$3.e(daa.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return daa.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(daa $$0) {
      return true;
   }

   public int n() {
      return this.p;
   }

   private int m() {
      return this.n() + 1;
   }

   private int o() {
      return this.m() + 27;
   }

   private int p() {
      return this.o();
   }

   private int q() {
      return this.p() + 9;
   }
}
