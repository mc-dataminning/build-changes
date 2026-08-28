import java.util.List;
import javax.annotation.Nullable;

public abstract class csw extends crs {
   private static final int m = 9;
   private static final int n = 3;
   protected final csf q;
   protected final cor r;
   protected final bsa s;
   private final List<Integer> o;
   protected final ctk t = new ctk();
   private final int p;

   protected abstract boolean a(cor var1, boolean var2);

   protected abstract void a(cor var1, cwf var2);

   protected abstract boolean a(dvo var1);

   public csw(@Nullable ctb<?> $$0, int $$1, coq $$2, csf $$3) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.k;
      csx $$4 = this.l();
      this.s = this.e($$4.d());
      this.o = $$4.f();
      this.p = $$4.e();
      this.a($$4);
      this.b($$4);
      this.c($$2, 8, 84);
   }

   private void a(csx $$0) {
      for (final csx.b $$1 : $$0.c()) {
         this.a(new ctp(this.s, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(cwf $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(csx $$0) {
      this.a(new ctp(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(cwf $$0) {
            return false;
         }

         @Override
         public boolean a(cor $$0) {
            return csw.this.a($$0, this.h());
         }

         @Override
         public void a(cor $$0, cwf $$1) {
            csw.this.a($$0, $$1);
         }
      });
   }

   public abstract void m();

   protected abstract csx l();

   private bso e(int $$0) {
      return new bso($$0) {
         @Override
         public void e() {
            super.e();
            csw.this.a(this);
         }
      };
   }

   @Override
   public void a(bsa $$0) {
      super.a($$0);
      if ($$0 == this.s) {
         this.m();
      }
   }

   @Override
   public void a(cor $$0) {
      super.a($$0);
      this.q.a(($$1, $$2) -> this.a($$0, this.s));
   }

   @Override
   public boolean b(cor $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public cwf b(cor $$0, int $$1) {
      cwf $$2 = cwf.k;
      ctp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwf $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return cwf.k;
            }

            $$3.b($$4, $$2);
         } else if (this.o.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return cwf.k;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return cwf.k;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return cwf.k;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return cwf.k;
         }

         if ($$4.f()) {
            $$3.e(cwf.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwf.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cwf $$0) {
      return true;
   }

   public int d(cwf $$0) {
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
