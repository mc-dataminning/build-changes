import java.util.List;
import javax.annotation.Nullable;

public abstract class csd extends cqz {
   private static final int m = 9;
   private static final int n = 3;
   protected final crm q;
   protected final cnx r;
   protected final brl s;
   private final List<Integer> o;
   protected final csr t = new csr();
   private final int p;

   protected abstract boolean a(cnx var1, boolean var2);

   protected abstract void a(cnx var1, cvs var2);

   protected abstract boolean a(dus var1);

   public csd(@Nullable csi<?> $$0, int $$1, cnw $$2, crm $$3) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.k;
      cse $$4 = this.l();
      this.s = this.e($$4.d());
      this.o = $$4.f();
      this.p = $$4.e();
      this.a($$4);
      this.b($$4);
      this.c($$2, 8, 84);
   }

   private void a(cse $$0) {
      for (final cse.b $$1 : $$0.c()) {
         this.a(new csw(this.s, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(cvs $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cse $$0) {
      this.a(new csw(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(cvs $$0) {
            return false;
         }

         @Override
         public boolean a(cnx $$0) {
            return csd.this.a($$0, this.h());
         }

         @Override
         public void a(cnx $$0, cvs $$1) {
            csd.this.a($$0, $$1);
         }
      });
   }

   public abstract void m();

   protected abstract cse l();

   private brz e(int $$0) {
      return new brz($$0) {
         @Override
         public void e() {
            super.e();
            csd.this.a(this);
         }
      };
   }

   @Override
   public void a(brl $$0) {
      super.a($$0);
      if ($$0 == this.s) {
         this.m();
      }
   }

   @Override
   public void a(cnx $$0) {
      super.a($$0);
      this.q.a(($$1, $$2) -> this.a($$0, this.s));
   }

   @Override
   public boolean b(cnx $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public cvs b(cnx $$0, int $$1) {
      cvs $$2 = cvs.k;
      csw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvs $$4 = $$3.g();
         $$2 = $$4.u();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return cvs.k;
            }

            $$3.b($$4, $$2);
         } else if (this.o.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return cvs.k;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return cvs.k;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return cvs.k;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return cvs.k;
         }

         if ($$4.f()) {
            $$3.e(cvs.k);
         } else {
            $$3.c();
         }

         if ($$4.K() == $$2.K()) {
            return cvs.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cvs $$0) {
      return true;
   }

   public int d(cvs $$0) {
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
