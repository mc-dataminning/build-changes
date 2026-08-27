import java.util.List;
import javax.annotation.Nullable;

public abstract class cht extends cgr {
   private static final int k = 9;
   private static final int l = 3;
   protected final chc o;
   protected final cdz p;
   protected final biu q;
   private final List<Integer> m;
   protected final cih r = new cih();
   private final int n;

   protected abstract boolean a(cdz var1, boolean var2);

   protected abstract void a(cdz var1, clo var2);

   protected abstract boolean a(dhn var1);

   public cht(@Nullable chy<?> $$0, int $$1, cdy $$2, chc $$3) {
      super($$0, $$1);
      this.o = $$3;
      this.p = $$2.m;
      chu $$4 = this.l();
      this.q = this.e($$4.d());
      this.m = $$4.f();
      this.n = $$4.e();
      this.a($$4);
      this.b($$4);
      this.a($$2);
   }

   private void a(chu $$0) {
      for (final chu.b $$1 : $$0.c()) {
         this.a(new cim(this.q, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(clo $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(chu $$0) {
      this.a(new cim(this.r, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(clo $$0) {
            return false;
         }

         @Override
         public boolean a(cdz $$0) {
            return cht.this.a($$0, this.g());
         }

         @Override
         public void a(cdz $$0, clo $$1) {
            cht.this.a($$0, $$1);
         }
      });
   }

   private void a(cdy $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.a(new cim($$0, $$2 + $$1 * 9 + 9, 8 + $$2 * 18, 84 + $$1 * 18));
         }
      }

      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.a(new cim($$0, $$3, 8 + $$3 * 18, 142));
      }
   }

   public abstract void m();

   protected abstract chu l();

   private bjj e(int $$0) {
      return new bjj($$0) {
         @Override
         public void e() {
            super.e();
            cht.this.a(this);
         }
      };
   }

   @Override
   public void a(biu $$0) {
      super.a($$0);
      if ($$0 == this.q) {
         this.m();
      }
   }

   @Override
   public void b(cdz $$0) {
      super.b($$0);
      this.o.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean a(cdz $$0) {
      return this.o.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.i((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5) <= 64.0, true);
   }

   @Override
   public clo a(cdz $$0, int $$1) {
      clo $$2 = clo.b;
      cim $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clo $$4 = $$3.f();
         $$2 = $$4.p();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return clo.b;
            }

            $$3.b($$4, $$2);
         } else if (this.m.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return clo.b;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return clo.b;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return clo.b;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return clo.b;
         }

         if ($$4.b()) {
            $$3.e(clo.b);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return clo.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(clo $$0) {
      return true;
   }

   public int d(clo $$0) {
      return this.q.aj_() ? 0 : this.m.get(0);
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
