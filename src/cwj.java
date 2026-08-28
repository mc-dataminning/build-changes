import javax.annotation.Nullable;

public abstract class cwj extends cvf {
   private static final int m = 9;
   private static final int n = 3;
   private static final int o = 0;
   protected final cvs q;
   protected final crm r;
   protected final btz s;
   protected final cwx t = new cwx() {
      @Override
      public void e() {
         cwj.this.a(this);
      }
   };
   private final int p;

   protected boolean a(crm $$0, boolean $$1) {
      return true;
   }

   protected abstract void a(crm var1, czn var2);

   protected abstract boolean a(eat var1);

   public cwj(@Nullable cwo<?> $$0, int $$1, crl $$2, cvs $$3, cwk $$4) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.h;
      this.s = this.e($$4.d());
      this.p = $$4.e();
      this.a($$4);
      this.b($$4);
      this.c($$2, 8, 84);
   }

   private void a(cwk $$0) {
      for (final cwk.b $$1 : $$0.c()) {
         this.a(new cxc(this.s, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(czn $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cwk $$0) {
      this.a(new cxc(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(czn $$0) {
            return false;
         }

         @Override
         public boolean a(crm $$0) {
            return cwj.this.a($$0, this.h());
         }

         @Override
         public void a(crm $$0, czn $$1) {
            cwj.this.a($$0, $$1);
         }
      });
   }

   @Override
   public abstract void l();

   private bun e(int $$0) {
      return new bun($$0) {
         @Override
         public void e() {
            super.e();
            cwj.this.a(this);
         }
      };
   }

   @Override
   public void a(btz $$0) {
      super.a($$0);
      if ($$0 == this.s) {
         this.l();
      }
   }

   @Override
   public void a(crm $$0) {
      super.a($$0);
      this.q.a(($$1, $$2) -> this.a($$0, this.s));
   }

   @Override
   public boolean b(crm $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public czn b(crm $$0, int $$1) {
      czn $$2 = czn.k;
      cxc $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czn $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.m();
         int $$6 = this.q();
         if ($$1 == this.n()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return czn.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 0 && $$1 < this.n()) {
            if (!this.a($$4, $$5, $$6, false)) {
               return czn.k;
            }
         } else if (this.c($$4) && $$1 >= this.m() && $$1 < this.q()) {
            if (!this.a($$4, 0, this.n(), false)) {
               return czn.k;
            }
         } else if ($$1 >= this.m() && $$1 < this.o()) {
            if (!this.a($$4, this.p(), this.q(), false)) {
               return czn.k;
            }
         } else if ($$1 >= this.p() && $$1 < this.q() && !this.a($$4, this.m(), this.o(), false)) {
            return czn.k;
         }

         if ($$4.f()) {
            $$3.e(czn.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czn.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(czn $$0) {
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
