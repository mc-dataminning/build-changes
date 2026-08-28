import javax.annotation.Nullable;

public abstract class cub extends csx {
   private static final int m = 9;
   private static final int n = 3;
   private static final int o = 0;
   protected final ctk q;
   protected final cps r;
   protected final bsx s;
   protected final cup t = new cup();
   private final int p;

   protected boolean a(cps $$0, boolean $$1) {
      return true;
   }

   protected abstract void a(cps var1, cxk var2);

   protected abstract boolean a(dxn var1);

   public cub(@Nullable cug<?> $$0, int $$1, cpr $$2, ctk $$3, cuc $$4) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.k;
      this.s = this.e($$4.d());
      this.p = $$4.e();
      this.a($$4);
      this.b($$4);
      this.c($$2, 8, 84);
   }

   private void a(cuc $$0) {
      for (final cuc.b $$1 : $$0.c()) {
         this.a(new cuu(this.s, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(cxk $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cuc $$0) {
      this.a(new cuu(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(cxk $$0) {
            return false;
         }

         @Override
         public boolean a(cps $$0) {
            return cub.this.a($$0, this.h());
         }

         @Override
         public void a(cps $$0, cxk $$1) {
            cub.this.a($$0, $$1);
         }
      });
   }

   @Override
   public abstract void l();

   private btl e(int $$0) {
      return new btl($$0) {
         @Override
         public void e() {
            super.e();
            cub.this.a(this);
         }
      };
   }

   @Override
   public void a(bsx $$0) {
      super.a($$0);
      if ($$0 == this.s) {
         this.l();
      }
   }

   @Override
   public void a(cps $$0) {
      super.a($$0);
      this.q.a(($$1, $$2) -> this.a($$0, this.s));
   }

   @Override
   public boolean b(cps $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public cxk b(cps $$0, int $$1) {
      cxk $$2 = cxk.k;
      cuu $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxk $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.m();
         int $$6 = this.q();
         if ($$1 == this.n()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return cxk.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 0 && $$1 < this.n()) {
            if (!this.a($$4, $$5, $$6, false)) {
               return cxk.k;
            }
         } else if (this.c($$4) && $$1 >= this.m() && $$1 < this.q()) {
            if (!this.a($$4, 0, this.n(), false)) {
               return cxk.k;
            }
         } else if ($$1 >= this.m() && $$1 < this.o()) {
            if (!this.a($$4, this.p(), this.q(), false)) {
               return cxk.k;
            }
         } else if ($$1 >= this.p() && $$1 < this.q() && !this.a($$4, this.m(), this.o(), false)) {
            return cxk.k;
         }

         if ($$4.f()) {
            $$3.e(cxk.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxk.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cxk $$0) {
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
