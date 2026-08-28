import java.util.List;
import javax.annotation.Nullable;

public abstract class cqu extends cps {
   private static final int k = 9;
   private static final int l = 3;
   protected final cqd o;
   protected final cmv p;
   protected final bql q;
   private final List<Integer> m;
   protected final cri r = new cri();
   private final int n;

   protected abstract boolean a(cmv var1, boolean var2);

   protected abstract void a(cmv var1, cun var2);

   protected abstract boolean a(dsa var1);

   public cqu(@Nullable cqz<?> $$0, int $$1, cmu $$2, cqd $$3) {
      super($$0, $$1);
      this.o = $$3;
      this.p = $$2.l;
      cqv $$4 = this.l();
      this.q = this.e($$4.d());
      this.m = $$4.f();
      this.n = $$4.e();
      this.a($$4);
      this.b($$4);
      this.a($$2);
   }

   private void a(cqv $$0) {
      for (final cqv.b $$1 : $$0.c()) {
         this.a(new crn(this.q, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(cun $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cqv $$0) {
      this.a(new crn(this.r, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(cun $$0) {
            return false;
         }

         @Override
         public boolean a(cmv $$0) {
            return cqu.this.a($$0, this.h());
         }

         @Override
         public void a(cmv $$0, cun $$1) {
            cqu.this.a($$0, $$1);
         }
      });
   }

   private void a(cmu $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.a(new crn($$0, $$2 + $$1 * 9 + 9, 8 + $$2 * 18, 84 + $$1 * 18));
         }
      }

      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.a(new crn($$0, $$3, 8 + $$3 * 18, 142));
      }
   }

   public abstract void m();

   protected abstract cqv l();

   private brb e(int $$0) {
      return new brb($$0) {
         @Override
         public void e() {
            super.e();
            cqu.this.a(this);
         }
      };
   }

   @Override
   public void a(bql $$0) {
      super.a($$0);
      if ($$0 == this.q) {
         this.m();
      }
   }

   @Override
   public void b(cmv $$0) {
      super.b($$0);
      this.o.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean a(cmv $$0) {
      return this.o.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public cun a(cmv $$0, int $$1) {
      cun $$2 = cun.l;
      crn $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cun $$4 = $$3.g();
         $$2 = $$4.s();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return cun.l;
            }

            $$3.b($$4, $$2);
         } else if (this.m.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return cun.l;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return cun.l;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return cun.l;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return cun.l;
         }

         if ($$4.e()) {
            $$3.e(cun.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cun.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cun $$0) {
      return true;
   }

   public int d(cun $$0) {
      return this.q.c() ? 0 : this.m.get(0);
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
