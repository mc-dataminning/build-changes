import javax.annotation.Nullable;

public abstract class cug extends ctc {
   private static final int m = 9;
   private static final int n = 3;
   private static final int o = 0;
   protected final ctp q;
   protected final cpx r;
   protected final btc s;
   protected final cuu t = new cuu() {
      @Override
      public void e() {
         cug.this.a(this);
      }
   };
   private final int p;

   protected boolean a(cpx $$0, boolean $$1) {
      return true;
   }

   protected abstract void a(cpx var1, cxp var2);

   protected abstract boolean a(dxv var1);

   public cug(@Nullable cul<?> $$0, int $$1, cpw $$2, ctp $$3, cuh $$4) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.k;
      this.s = this.e($$4.d());
      this.p = $$4.e();
      this.a($$4);
      this.b($$4);
      this.c($$2, 8, 84);
   }

   private void a(cuh $$0) {
      for (final cuh.b $$1 : $$0.c()) {
         this.a(new cuz(this.s, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(cxp $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cuh $$0) {
      this.a(new cuz(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(cxp $$0) {
            return false;
         }

         @Override
         public boolean a(cpx $$0) {
            return cug.this.a($$0, this.h());
         }

         @Override
         public void a(cpx $$0, cxp $$1) {
            cug.this.a($$0, $$1);
         }
      });
   }

   @Override
   public abstract void l();

   private btq e(int $$0) {
      return new btq($$0) {
         @Override
         public void e() {
            super.e();
            cug.this.a(this);
         }
      };
   }

   @Override
   public void a(btc $$0) {
      super.a($$0);
      if ($$0 == this.s) {
         this.l();
      }
   }

   @Override
   public void a(cpx $$0) {
      super.a($$0);
      this.q.a(($$1, $$2) -> this.a($$0, this.s));
   }

   @Override
   public boolean b(cpx $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public cxp b(cpx $$0, int $$1) {
      cxp $$2 = cxp.j;
      cuz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxp $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.m();
         int $$6 = this.q();
         if ($$1 == this.n()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return cxp.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 0 && $$1 < this.n()) {
            if (!this.a($$4, $$5, $$6, false)) {
               return cxp.j;
            }
         } else if (this.c($$4) && $$1 >= this.m() && $$1 < this.q()) {
            if (!this.a($$4, 0, this.n(), false)) {
               return cxp.j;
            }
         } else if ($$1 >= this.m() && $$1 < this.o()) {
            if (!this.a($$4, this.p(), this.q(), false)) {
               return cxp.j;
            }
         } else if ($$1 >= this.p() && $$1 < this.q() && !this.a($$4, this.m(), this.o(), false)) {
            return cxp.j;
         }

         if ($$4.f()) {
            $$3.e(cxp.j);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxp.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cxp $$0) {
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
