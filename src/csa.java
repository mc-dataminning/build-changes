import java.util.List;
import javax.annotation.Nullable;

public abstract class csa extends cqw {
   private static final int m = 9;
   private static final int n = 3;
   protected final crj q;
   protected final cnu r;
   protected final bri s;
   private final List<Integer> o;
   protected final cso t = new cso();
   private final int p;

   protected abstract boolean a(cnu var1, boolean var2);

   protected abstract void a(cnu var1, cvp var2);

   protected abstract boolean a(duo var1);

   public csa(@Nullable csf<?> $$0, int $$1, cnt $$2, crj $$3) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.k;
      csb $$4 = this.l();
      this.s = this.e($$4.d());
      this.o = $$4.f();
      this.p = $$4.e();
      this.a($$4);
      this.b($$4);
      this.c($$2, 8, 84);
   }

   private void a(csb $$0) {
      for (final csb.b $$1 : $$0.c()) {
         this.a(new cst(this.s, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(cvp $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(csb $$0) {
      this.a(new cst(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(cvp $$0) {
            return false;
         }

         @Override
         public boolean a(cnu $$0) {
            return csa.this.a($$0, this.h());
         }

         @Override
         public void a(cnu $$0, cvp $$1) {
            csa.this.a($$0, $$1);
         }
      });
   }

   public abstract void m();

   protected abstract csb l();

   private brw e(int $$0) {
      return new brw($$0) {
         @Override
         public void e() {
            super.e();
            csa.this.a(this);
         }
      };
   }

   @Override
   public void a(bri $$0) {
      super.a($$0);
      if ($$0 == this.s) {
         this.m();
      }
   }

   @Override
   public void a(cnu $$0) {
      super.a($$0);
      this.q.a(($$1, $$2) -> this.a($$0, this.s));
   }

   @Override
   public boolean b(cnu $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public cvp b(cnu $$0, int $$1) {
      cvp $$2 = cvp.k;
      cst $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvp $$4 = $$3.g();
         $$2 = $$4.u();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return cvp.k;
            }

            $$3.b($$4, $$2);
         } else if (this.o.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return cvp.k;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return cvp.k;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return cvp.k;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return cvp.k;
         }

         if ($$4.f()) {
            $$3.e(cvp.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvp.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cvp $$0) {
      return true;
   }

   public int d(cvp $$0) {
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
