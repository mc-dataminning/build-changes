import java.util.List;
import javax.annotation.Nullable;

public abstract class chg extends cge {
   private static final int k = 9;
   private static final int l = 3;
   protected final cgp o;
   protected final cdm p;
   protected final bij q;
   private final List<Integer> m;
   protected final chu r = new chu();
   private final int n;

   protected abstract boolean a(cdm var1, boolean var2);

   protected abstract void a(cdm var1, clb var2);

   protected abstract boolean a(dgw var1);

   public chg(@Nullable chl<?> $$0, int $$1, cdl $$2, cgp $$3) {
      super($$0, $$1);
      this.o = $$3;
      this.p = $$2.m;
      chh $$4 = this.l();
      this.q = this.e($$4.d());
      this.m = $$4.f();
      this.n = $$4.e();
      this.a($$4);
      this.b($$4);
      this.a($$2);
   }

   private void a(chh $$0) {
      for (final chh.b $$1 : $$0.c()) {
         this.a(new chz(this.q, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(clb $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(chh $$0) {
      this.a(new chz(this.r, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(clb $$0) {
            return false;
         }

         @Override
         public boolean a(cdm $$0) {
            return chg.this.a($$0, this.g());
         }

         @Override
         public void a(cdm $$0, clb $$1) {
            chg.this.a($$0, $$1);
         }
      });
   }

   private void a(cdl $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.a(new chz($$0, $$2 + $$1 * 9 + 9, 8 + $$2 * 18, 84 + $$1 * 18));
         }
      }

      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.a(new chz($$0, $$3, 8 + $$3 * 18, 142));
      }
   }

   public abstract void m();

   protected abstract chh l();

   private bix e(int $$0) {
      return new bix($$0) {
         @Override
         public void e() {
            super.e();
            chg.this.a(this);
         }
      };
   }

   @Override
   public void a(bij $$0) {
      super.a($$0);
      if ($$0 == this.q) {
         this.m();
      }
   }

   @Override
   public void b(cdm $$0) {
      super.b($$0);
      this.o.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean a(cdm $$0) {
      return this.o.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.i((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5) <= 64.0, true);
   }

   @Override
   public clb a(cdm $$0, int $$1) {
      clb $$2 = clb.b;
      chz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clb $$4 = $$3.f();
         $$2 = $$4.p();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return clb.b;
            }

            $$3.b($$4, $$2);
         } else if (this.m.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return clb.b;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return clb.b;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return clb.b;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return clb.b;
         }

         if ($$4.b()) {
            $$3.e(clb.b);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return clb.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(clb $$0) {
      return true;
   }

   public int d(clb $$0) {
      return this.q.ai_() ? 0 : this.m.get(0);
   }

   public int o() {
      return this.n;
   }

   private int n() {
      return this.o() + 1;
   }

   private int p() {
      return this.n() + 27;
   }

   private int q() {
      return this.p();
   }

   private int r() {
      return this.q() + 9;
   }
}
