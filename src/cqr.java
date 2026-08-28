import java.util.List;
import javax.annotation.Nullable;

public abstract class cqr extends cpp {
   private static final int k = 9;
   private static final int l = 3;
   protected final cqa o;
   protected final cms p;
   protected final bqi q;
   private final List<Integer> m;
   protected final crf r = new crf();
   private final int n;

   protected abstract boolean a(cms var1, boolean var2);

   protected abstract void a(cms var1, cuk var2);

   protected abstract boolean a(drx var1);

   public cqr(@Nullable cqw<?> $$0, int $$1, cmr $$2, cqa $$3) {
      super($$0, $$1);
      this.o = $$3;
      this.p = $$2.l;
      cqs $$4 = this.l();
      this.q = this.e($$4.d());
      this.m = $$4.f();
      this.n = $$4.e();
      this.a($$4);
      this.b($$4);
      this.a($$2);
   }

   private void a(cqs $$0) {
      for (final cqs.b $$1 : $$0.c()) {
         this.a(new crk(this.q, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(cuk $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cqs $$0) {
      this.a(new crk(this.r, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(cuk $$0) {
            return false;
         }

         @Override
         public boolean a(cms $$0) {
            return cqr.this.a($$0, this.h());
         }

         @Override
         public void a(cms $$0, cuk $$1) {
            cqr.this.a($$0, $$1);
         }
      });
   }

   private void a(cmr $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.a(new crk($$0, $$2 + $$1 * 9 + 9, 8 + $$2 * 18, 84 + $$1 * 18));
         }
      }

      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.a(new crk($$0, $$3, 8 + $$3 * 18, 142));
      }
   }

   public abstract void m();

   protected abstract cqs l();

   private bqy e(int $$0) {
      return new bqy($$0) {
         @Override
         public void e() {
            super.e();
            cqr.this.a(this);
         }
      };
   }

   @Override
   public void a(bqi $$0) {
      super.a($$0);
      if ($$0 == this.q) {
         this.m();
      }
   }

   @Override
   public void b(cms $$0) {
      super.b($$0);
      this.o.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean a(cms $$0) {
      return this.o.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public cuk a(cms $$0, int $$1) {
      cuk $$2 = cuk.l;
      crk $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuk $$4 = $$3.g();
         $$2 = $$4.s();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return cuk.l;
            }

            $$3.b($$4, $$2);
         } else if (this.m.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return cuk.l;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return cuk.l;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return cuk.l;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return cuk.l;
         }

         if ($$4.e()) {
            $$3.e(cuk.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cuk.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cuk $$0) {
      return true;
   }

   public int d(cuk $$0) {
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
