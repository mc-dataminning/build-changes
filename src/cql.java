import java.util.List;
import javax.annotation.Nullable;

public abstract class cql extends cpi {
   private static final int k = 9;
   private static final int l = 3;
   protected final cpu o;
   protected final cml p;
   protected final bqa q;
   private final List<Integer> m;
   protected final cqz r = new cqz();
   private final int n;

   protected abstract boolean a(cml var1, boolean var2);

   protected abstract void a(cml var1, cud var2);

   protected abstract boolean a(dsl var1);

   public cql(@Nullable cqq<?> $$0, int $$1, cmk $$2, cpu $$3) {
      super($$0, $$1);
      this.o = $$3;
      this.p = $$2.l;
      cqm $$4 = this.l();
      this.q = this.e($$4.d());
      this.m = $$4.f();
      this.n = $$4.e();
      this.a($$4);
      this.b($$4);
      this.a($$2);
   }

   private void a(cqm $$0) {
      for (final cqm.b $$1 : $$0.c()) {
         this.a(new cre(this.q, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(cud $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cqm $$0) {
      this.a(new cre(this.r, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(cud $$0) {
            return false;
         }

         @Override
         public boolean a(cml $$0) {
            return cql.this.a($$0, this.h());
         }

         @Override
         public void a(cml $$0, cud $$1) {
            cql.this.a($$0, $$1);
         }
      });
   }

   private void a(cmk $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.a(new cre($$0, $$2 + $$1 * 9 + 9, 8 + $$2 * 18, 84 + $$1 * 18));
         }
      }

      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.a(new cre($$0, $$3, 8 + $$3 * 18, 142));
      }
   }

   public abstract void m();

   protected abstract cqm l();

   private bqq e(int $$0) {
      return new bqq($$0) {
         @Override
         public void e() {
            super.e();
            cql.this.a(this);
         }
      };
   }

   @Override
   public void a(bqa $$0) {
      super.a($$0);
      if ($$0 == this.q) {
         this.m();
      }
   }

   @Override
   public void a(cml $$0) {
      super.a($$0);
      this.o.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(cml $$0) {
      return this.o.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public cud b(cml $$0, int $$1) {
      cud $$2 = cud.l;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cud $$4 = $$3.g();
         $$2 = $$4.s();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return cud.l;
            }

            $$3.b($$4, $$2);
         } else if (this.m.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return cud.l;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return cud.l;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return cud.l;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return cud.l;
         }

         if ($$4.e()) {
            $$3.e(cud.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cud.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cud $$0) {
      return true;
   }

   public int d(cud $$0) {
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
