import java.util.List;
import javax.annotation.Nullable;

public abstract class cpx extends cov {
   private static final int k = 9;
   private static final int l = 3;
   protected final cpg o;
   protected final cly p;
   protected final bpp q;
   private final List<Integer> m;
   protected final cql r = new cql();
   private final int n;

   protected abstract boolean a(cly var1, boolean var2);

   protected abstract void a(cly var1, ctq var2);

   protected abstract boolean a(drd var1);

   public cpx(@Nullable cqc<?> $$0, int $$1, clx $$2, cpg $$3) {
      super($$0, $$1);
      this.o = $$3;
      this.p = $$2.l;
      cpy $$4 = this.l();
      this.q = this.e($$4.d());
      this.m = $$4.f();
      this.n = $$4.e();
      this.a($$4);
      this.b($$4);
      this.a($$2);
   }

   private void a(cpy $$0) {
      for (final cpy.b $$1 : $$0.c()) {
         this.a(new cqq(this.q, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(ctq $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cpy $$0) {
      this.a(new cqq(this.r, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(ctq $$0) {
            return false;
         }

         @Override
         public boolean a(cly $$0) {
            return cpx.this.a($$0, this.h());
         }

         @Override
         public void a(cly $$0, ctq $$1) {
            cpx.this.a($$0, $$1);
         }
      });
   }

   private void a(clx $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.a(new cqq($$0, $$2 + $$1 * 9 + 9, 8 + $$2 * 18, 84 + $$1 * 18));
         }
      }

      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.a(new cqq($$0, $$3, 8 + $$3 * 18, 142));
      }
   }

   public abstract void m();

   protected abstract cpy l();

   private bqf e(int $$0) {
      return new bqf($$0) {
         @Override
         public void e() {
            super.e();
            cpx.this.a(this);
         }
      };
   }

   @Override
   public void a(bpp $$0) {
      super.a($$0);
      if ($$0 == this.q) {
         this.m();
      }
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.o.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean a(cly $$0) {
      return this.o.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public ctq a(cly $$0, int $$1) {
      ctq $$2 = ctq.i;
      cqq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         ctq $$4 = $$3.g();
         $$2 = $$4.s();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return ctq.i;
            }

            $$3.b($$4, $$2);
         } else if (this.m.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return ctq.i;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return ctq.i;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return ctq.i;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return ctq.i;
         }

         if ($$4.e()) {
            $$3.e(ctq.i);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return ctq.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(ctq $$0) {
      return true;
   }

   public int d(ctq $$0) {
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
