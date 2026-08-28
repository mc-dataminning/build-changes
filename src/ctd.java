import java.util.List;
import javax.annotation.Nullable;

public abstract class ctd extends crz {
   private static final int m = 9;
   private static final int n = 3;
   protected final csm q;
   protected final cou r;
   protected final bsd s;
   private final List<Integer> o;
   protected final ctr t = new ctr();
   private final int p;

   protected abstract boolean a(cou var1, boolean var2);

   protected abstract void a(cou var1, cwm var2);

   protected abstract boolean a(dvv var1);

   public ctd(@Nullable cti<?> $$0, int $$1, cot $$2, csm $$3) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.k;
      cte $$4 = this.l();
      this.s = this.e($$4.d());
      this.o = $$4.f();
      this.p = $$4.e();
      this.a($$4);
      this.b($$4);
      this.c($$2, 8, 84);
   }

   private void a(cte $$0) {
      for (final cte.b $$1 : $$0.c()) {
         this.a(new ctw(this.s, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(cwm $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cte $$0) {
      this.a(new ctw(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(cwm $$0) {
            return false;
         }

         @Override
         public boolean a(cou $$0) {
            return ctd.this.a($$0, this.h());
         }

         @Override
         public void a(cou $$0, cwm $$1) {
            ctd.this.a($$0, $$1);
         }
      });
   }

   public abstract void m();

   protected abstract cte l();

   private bsr e(int $$0) {
      return new bsr($$0) {
         @Override
         public void e() {
            super.e();
            ctd.this.a(this);
         }
      };
   }

   @Override
   public void a(bsd $$0) {
      super.a($$0);
      if ($$0 == this.s) {
         this.m();
      }
   }

   @Override
   public void a(cou $$0) {
      super.a($$0);
      this.q.a(($$1, $$2) -> this.a($$0, this.s));
   }

   @Override
   public boolean b(cou $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return cwm.k;
            }

            $$3.b($$4, $$2);
         } else if (this.o.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return cwm.k;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return cwm.k;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return cwm.k;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return cwm.k;
         }

         if ($$4.f()) {
            $$3.e(cwm.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwm.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cwm $$0) {
      return true;
   }

   public int d(cwm $$0) {
      return this.s.c() ? 0 : this.o.get(0);
   }

   public int o() {
      return this.p;
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
