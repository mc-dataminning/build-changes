import javax.annotation.Nullable;

public abstract class cvz extends cuv {
   private static final int m = 9;
   private static final int n = 3;
   private static final int o = 0;
   protected final cvi q;
   protected final crc r;
   protected final btw s;
   protected final cwn t = new cwn() {
      @Override
      public void e() {
         cvz.this.a(this);
      }
   };
   private final int p;

   protected boolean a(crc $$0, boolean $$1) {
      return true;
   }

   protected abstract void a(crc var1, czd var2);

   protected abstract boolean a(eah var1);

   public cvz(@Nullable cwe<?> $$0, int $$1, crb $$2, cvi $$3, cwa $$4) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.h;
      this.s = this.e($$4.d());
      this.p = $$4.e();
      this.a($$4);
      this.b($$4);
      this.c($$2, 8, 84);
   }

   private void a(cwa $$0) {
      for (final cwa.b $$1 : $$0.c()) {
         this.a(new cws(this.s, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(czd $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cwa $$0) {
      this.a(new cws(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(czd $$0) {
            return false;
         }

         @Override
         public boolean a(crc $$0) {
            return cvz.this.a($$0, this.h());
         }

         @Override
         public void a(crc $$0, czd $$1) {
            cvz.this.a($$0, $$1);
         }
      });
   }

   @Override
   public abstract void l();

   private buk e(int $$0) {
      return new buk($$0) {
         @Override
         public void e() {
            super.e();
            cvz.this.a(this);
         }
      };
   }

   @Override
   public void a(btw $$0) {
      super.a($$0);
      if ($$0 == this.s) {
         this.l();
      }
   }

   @Override
   public void a(crc $$0) {
      super.a($$0);
      this.q.a(($$1, $$2) -> this.a($$0, this.s));
   }

   @Override
   public boolean b(crc $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public czd b(crc $$0, int $$1) {
      czd $$2 = czd.k;
      cws $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czd $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.m();
         int $$6 = this.q();
         if ($$1 == this.n()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return czd.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 0 && $$1 < this.n()) {
            if (!this.a($$4, $$5, $$6, false)) {
               return czd.k;
            }
         } else if (this.c($$4) && $$1 >= this.m() && $$1 < this.q()) {
            if (!this.a($$4, 0, this.n(), false)) {
               return czd.k;
            }
         } else if ($$1 >= this.m() && $$1 < this.o()) {
            if (!this.a($$4, this.p(), this.q(), false)) {
               return czd.k;
            }
         } else if ($$1 >= this.p() && $$1 < this.q() && !this.a($$4, this.m(), this.o(), false)) {
            return czd.k;
         }

         if ($$4.f()) {
            $$3.e(czd.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czd.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(czd $$0) {
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
