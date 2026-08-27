import java.util.List;
import javax.annotation.Nullable;

public abstract class cfe extends cee {
   private static final int k = 9;
   private static final int l = 3;
   protected final cep o;
   protected final cbn p;
   protected final bgj q;
   private final List<Integer> m;
   protected final cfr r = new cfr();
   private final int n;

   protected abstract boolean a(cbn var1, boolean var2);

   protected abstract void a(cbn var1, ciy var2);

   protected abstract boolean a(dfa var1);

   public cfe(@Nullable cfj<?> $$0, int $$1, cbm $$2, cep $$3) {
      super($$0, $$1);
      this.o = $$3;
      this.p = $$2.m;
      cff $$4 = this.l();
      this.q = this.e($$4.d());
      this.m = $$4.f();
      this.n = $$4.e();
      this.a($$4);
      this.b($$4);
      this.a($$2);
   }

   private void a(cff $$0) {
      for (final cff.b $$1 : $$0.c()) {
         this.a(new cfw(this.q, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(ciy $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cff $$0) {
      this.a(new cfw(this.r, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(ciy $$0) {
            return false;
         }

         @Override
         public boolean a(cbn $$0) {
            return cfe.this.a($$0, this.f());
         }

         @Override
         public void a(cbn $$0, ciy $$1) {
            cfe.this.a($$0, $$1);
         }
      });
   }

   private void a(cbm $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.a(new cfw($$0, $$2 + $$1 * 9 + 9, 8 + $$2 * 18, 84 + $$1 * 18));
         }
      }

      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.a(new cfw($$0, $$3, 8 + $$3 * 18, 142));
      }
   }

   public abstract void m();

   protected abstract cff l();

   private bgx e(int $$0) {
      return new bgx($$0) {
         @Override
         public void e() {
            super.e();
            cfe.this.a(this);
         }
      };
   }

   @Override
   public void a(bgj $$0) {
      super.a($$0);
      if ($$0 == this.q) {
         this.m();
      }
   }

   @Override
   public void b(cbn $$0) {
      super.b($$0);
      this.o.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean a(cbn $$0) {
      return this.o.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.i((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5) <= 64.0, true);
   }

   @Override
   public ciy a(cbn $$0, int $$1) {
      ciy $$2 = ciy.b;
      cfw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciy $$4 = $$3.e();
         $$2 = $$4.p();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return ciy.b;
            }

            $$3.a($$4, $$2);
         } else if (this.m.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return ciy.b;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return ciy.b;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return ciy.b;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return ciy.b;
         }

         if ($$4.b()) {
            $$3.d(ciy.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return ciy.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(ciy $$0) {
      return true;
   }

   public int d(ciy $$0) {
      return this.q.ab_() ? 0 : this.m.get(0);
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
