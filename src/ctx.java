import javax.annotation.Nullable;

public abstract class ctx extends cst {
   private static final int m = 9;
   private static final int n = 3;
   private static final int o = 0;
   protected final ctg q;
   protected final cpo r;
   protected final bst s;
   protected final cul t = new cul() {
      @Override
      public void e() {
         ctx.this.a(this);
      }
   };
   private final int p;

   protected boolean a(cpo $$0, boolean $$1) {
      return true;
   }

   protected abstract void a(cpo var1, cxg var2);

   protected abstract boolean a(dxo var1);

   public ctx(@Nullable cuc<?> $$0, int $$1, cpn $$2, ctg $$3, cty $$4) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.k;
      this.s = this.e($$4.d());
      this.p = $$4.e();
      this.a($$4);
      this.b($$4);
      this.c($$2, 8, 84);
   }

   private void a(cty $$0) {
      for (final cty.b $$1 : $$0.c()) {
         this.a(new cuq(this.s, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(cxg $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cty $$0) {
      this.a(new cuq(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(cxg $$0) {
            return false;
         }

         @Override
         public boolean a(cpo $$0) {
            return ctx.this.a($$0, this.h());
         }

         @Override
         public void a(cpo $$0, cxg $$1) {
            ctx.this.a($$0, $$1);
         }
      });
   }

   @Override
   public abstract void l();

   private bth e(int $$0) {
      return new bth($$0) {
         @Override
         public void e() {
            super.e();
            ctx.this.a(this);
         }
      };
   }

   @Override
   public void a(bst $$0) {
      super.a($$0);
      if ($$0 == this.s) {
         this.l();
      }
   }

   @Override
   public void a(cpo $$0) {
      super.a($$0);
      this.q.a(($$1, $$2) -> this.a($$0, this.s));
   }

   @Override
   public boolean b(cpo $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      cxg $$2 = cxg.j;
      cuq $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxg $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.m();
         int $$6 = this.q();
         if ($$1 == this.n()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return cxg.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 0 && $$1 < this.n()) {
            if (!this.a($$4, $$5, $$6, false)) {
               return cxg.j;
            }
         } else if (this.c($$4) && $$1 >= this.m() && $$1 < this.q()) {
            if (!this.a($$4, 0, this.n(), false)) {
               return cxg.j;
            }
         } else if ($$1 >= this.m() && $$1 < this.o()) {
            if (!this.a($$4, this.p(), this.q(), false)) {
               return cxg.j;
            }
         } else if ($$1 >= this.p() && $$1 < this.q() && !this.a($$4, this.m(), this.o(), false)) {
            return cxg.j;
         }

         if ($$4.f()) {
            $$3.e(cxg.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxg.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cxg $$0) {
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
