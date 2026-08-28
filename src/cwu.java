import javax.annotation.Nullable;

public abstract class cwu extends cvq {
   private static final int m = 9;
   private static final int n = 3;
   private static final int o = 0;
   protected final cwd q;
   protected final crx r;
   protected final buk s;
   protected final cxi t = new cxi() {
      @Override
      public void e() {
         cwu.this.a(this);
      }
   };
   private final int p;

   protected boolean a(crx $$0, boolean $$1) {
      return true;
   }

   protected abstract void a(crx var1, czy var2);

   protected abstract boolean a(ebe var1);

   public cwu(@Nullable cwz<?> $$0, int $$1, crw $$2, cwd $$3, cwv $$4) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.h;
      this.s = this.e($$4.d());
      this.p = $$4.e();
      this.a($$4);
      this.b($$4);
      this.c($$2, 8, 84);
   }

   private void a(cwv $$0) {
      for (final cwv.b $$1 : $$0.c()) {
         this.a(new cxn(this.s, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(czy $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cwv $$0) {
      this.a(new cxn(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(czy $$0) {
            return false;
         }

         @Override
         public boolean a(crx $$0) {
            return cwu.this.a($$0, this.h());
         }

         @Override
         public void a(crx $$0, czy $$1) {
            cwu.this.a($$0, $$1);
         }
      });
   }

   @Override
   public abstract void l();

   private buy e(int $$0) {
      return new buy($$0) {
         @Override
         public void e() {
            super.e();
            cwu.this.a(this);
         }
      };
   }

   @Override
   public void a(buk $$0) {
      super.a($$0);
      if ($$0 == this.s) {
         this.l();
      }
   }

   @Override
   public void a(crx $$0) {
      super.a($$0);
      this.q.a(($$1, $$2) -> this.a($$0, this.s));
   }

   @Override
   public boolean b(crx $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public czy b(crx $$0, int $$1) {
      czy $$2 = czy.k;
      cxn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czy $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.m();
         int $$6 = this.q();
         if ($$1 == this.n()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return czy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 0 && $$1 < this.n()) {
            if (!this.a($$4, $$5, $$6, false)) {
               return czy.k;
            }
         } else if (this.c($$4) && $$1 >= this.m() && $$1 < this.q()) {
            if (!this.a($$4, 0, this.n(), false)) {
               return czy.k;
            }
         } else if ($$1 >= this.m() && $$1 < this.o()) {
            if (!this.a($$4, this.p(), this.q(), false)) {
               return czy.k;
            }
         } else if ($$1 >= this.p() && $$1 < this.q() && !this.a($$4, this.m(), this.o(), false)) {
            return czy.k;
         }

         if ($$4.f()) {
            $$3.e(czy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(czy $$0) {
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
