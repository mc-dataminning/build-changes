import javax.annotation.Nullable;

public abstract class ctg extends csc {
   private static final int m = 9;
   private static final int n = 3;
   private static final int o = 0;
   protected final csp q;
   protected final cox r;
   protected final bsd s;
   protected final ctu t = new ctu() {
      @Override
      public void e() {
         ctg.this.a(this);
      }
   };
   private final int p;

   protected boolean a(cox $$0, boolean $$1) {
      return true;
   }

   protected abstract void a(cox var1, cwp var2);

   protected abstract boolean a(dwx var1);

   public ctg(@Nullable ctl<?> $$0, int $$1, cow $$2, csp $$3, cth $$4) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.k;
      this.s = this.e($$4.d());
      this.p = $$4.e();
      this.a($$4);
      this.b($$4);
      this.c($$2, 8, 84);
   }

   private void a(cth $$0) {
      for (final cth.b $$1 : $$0.c()) {
         this.a(new ctz(this.s, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(cwp $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cth $$0) {
      this.a(new ctz(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(cwp $$0) {
            return false;
         }

         @Override
         public boolean a(cox $$0) {
            return ctg.this.a($$0, this.h());
         }

         @Override
         public void a(cox $$0, cwp $$1) {
            ctg.this.a($$0, $$1);
         }
      });
   }

   @Override
   public abstract void l();

   private bsr e(int $$0) {
      return new bsr($$0) {
         @Override
         public void e() {
            super.e();
            ctg.this.a(this);
         }
      };
   }

   @Override
   public void a(bsd $$0) {
      super.a($$0);
      if ($$0 == this.s) {
         this.l();
      }
   }

   @Override
   public void a(cox $$0) {
      super.a($$0);
      this.q.a(($$1, $$2) -> this.a($$0, this.s));
   }

   @Override
   public boolean b(cox $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public cwp b(cox $$0, int $$1) {
      cwp $$2 = cwp.j;
      ctz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwp $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.m();
         int $$6 = this.q();
         if ($$1 == this.n()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return cwp.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 0 && $$1 < this.n()) {
            if (!this.a($$4, $$5, $$6, false)) {
               return cwp.j;
            }
         } else if (this.c($$4) && $$1 >= this.m() && $$1 < this.q()) {
            if (!this.a($$4, 0, this.n(), false)) {
               return cwp.j;
            }
         } else if ($$1 >= this.m() && $$1 < this.o()) {
            if (!this.a($$4, this.p(), this.q(), false)) {
               return cwp.j;
            }
         } else if ($$1 >= this.p() && $$1 < this.q() && !this.a($$4, this.m(), this.o(), false)) {
            return cwp.j;
         }

         if ($$4.f()) {
            $$3.e(cwp.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwp.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cwp $$0) {
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
