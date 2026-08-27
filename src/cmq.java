import java.util.List;
import javax.annotation.Nullable;

public abstract class cmq extends clo {
   private static final int k = 9;
   private static final int l = 3;
   protected final clz o;
   protected final cis p;
   protected final bmv q;
   private final List<Integer> m;
   protected final cne r = new cne();
   private final int n;

   protected abstract boolean a(cis var1, boolean var2);

   protected abstract void a(cis var1, cqk var2);

   protected abstract boolean a(dmz var1);

   public cmq(@Nullable cmv<?> $$0, int $$1, cir $$2, clz $$3) {
      super($$0, $$1);
      this.o = $$3;
      this.p = $$2.m;
      cmr $$4 = this.l();
      this.q = this.e($$4.d());
      this.m = $$4.f();
      this.n = $$4.e();
      this.a($$4);
      this.b($$4);
      this.a($$2);
   }

   private void a(cmr $$0) {
      for (final cmr.b $$1 : $$0.c()) {
         this.a(new cnj(this.q, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(cqk $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cmr $$0) {
      this.a(new cnj(this.r, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(cqk $$0) {
            return false;
         }

         @Override
         public boolean a(cis $$0) {
            return cmq.this.a($$0, this.h());
         }

         @Override
         public void a(cis $$0, cqk $$1) {
            cmq.this.a($$0, $$1);
         }
      });
   }

   private void a(cir $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.a(new cnj($$0, $$2 + $$1 * 9 + 9, 8 + $$2 * 18, 84 + $$1 * 18));
         }
      }

      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.a(new cnj($$0, $$3, 8 + $$3 * 18, 142));
      }
   }

   public abstract void m();

   protected abstract cmr l();

   private bnl e(int $$0) {
      return new bnl($$0) {
         @Override
         public void e() {
            super.e();
            cmq.this.a(this);
         }
      };
   }

   @Override
   public void a(bmv $$0) {
      super.a($$0);
      if ($$0 == this.q) {
         this.m();
      }
   }

   @Override
   public void b(cis $$0) {
      super.b($$0);
      this.o.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean a(cis $$0) {
      return this.o.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.i((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5) <= 64.0, true);
   }

   @Override
   public cqk a(cis $$0, int $$1) {
      cqk $$2 = cqk.h;
      cnj $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqk $$4 = $$3.g();
         $$2 = $$4.q();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return cqk.h;
            }

            $$3.b($$4, $$2);
         } else if (this.m.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return cqk.h;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return cqk.h;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return cqk.h;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return cqk.h;
         }

         if ($$4.b()) {
            $$3.e(cqk.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cqk.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cqk $$0) {
      return true;
   }

   public int d(cqk $$0) {
      return this.q.ai_() ? 0 : this.m.get(0);
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
