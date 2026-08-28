import javax.annotation.Nullable;

public abstract class cvo extends cuk {
   private static final int m = 9;
   private static final int n = 3;
   private static final int o = 0;
   protected final cux q;
   protected final cqs r;
   protected final btr s;
   protected final cwc t = new cwc() {
      @Override
      public void e() {
         cvo.this.a(this);
      }
   };
   private final int p;

   protected boolean a(cqs $$0, boolean $$1) {
      return true;
   }

   protected abstract void a(cqs var1, cys var2);

   protected abstract boolean a(dzo var1);

   public cvo(@Nullable cvt<?> $$0, int $$1, cqr $$2, cux $$3, cvp $$4) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.k;
      this.s = this.e($$4.d());
      this.p = $$4.e();
      this.a($$4);
      this.b($$4);
      this.c($$2, 8, 84);
   }

   private void a(cvp $$0) {
      for (final cvp.b $$1 : $$0.c()) {
         this.a(new cwh(this.s, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(cys $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cvp $$0) {
      this.a(new cwh(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(cys $$0) {
            return false;
         }

         @Override
         public boolean a(cqs $$0) {
            return cvo.this.a($$0, this.h());
         }

         @Override
         public void a(cqs $$0, cys $$1) {
            cvo.this.a($$0, $$1);
         }
      });
   }

   @Override
   public abstract void l();

   private buf e(int $$0) {
      return new buf($$0) {
         @Override
         public void e() {
            super.e();
            cvo.this.a(this);
         }
      };
   }

   @Override
   public void a(btr $$0) {
      super.a($$0);
      if ($$0 == this.s) {
         this.l();
      }
   }

   @Override
   public void a(cqs $$0) {
      super.a($$0);
      this.q.a(($$1, $$2) -> this.a($$0, this.s));
   }

   @Override
   public boolean b(cqs $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cys $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.m();
         int $$6 = this.q();
         if ($$1 == this.n()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return cys.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 0 && $$1 < this.n()) {
            if (!this.a($$4, $$5, $$6, false)) {
               return cys.k;
            }
         } else if (this.c($$4) && $$1 >= this.m() && $$1 < this.q()) {
            if (!this.a($$4, 0, this.n(), false)) {
               return cys.k;
            }
         } else if ($$1 >= this.m() && $$1 < this.o()) {
            if (!this.a($$4, this.p(), this.q(), false)) {
               return cys.k;
            }
         } else if ($$1 >= this.p() && $$1 < this.q() && !this.a($$4, this.m(), this.o(), false)) {
            return cys.k;
         }

         if ($$4.f()) {
            $$3.e(cys.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cys.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cys $$0) {
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
