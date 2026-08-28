import java.util.List;
import javax.annotation.Nullable;

public abstract class cqx extends cpv {
   private static final int k = 9;
   private static final int l = 3;
   protected final cqg o;
   protected final cmy p;
   protected final bqo q;
   private final List<Integer> m;
   protected final crl r = new crl();
   private final int n;

   protected abstract boolean a(cmy var1, boolean var2);

   protected abstract void a(cmy var1, cuq var2);

   protected abstract boolean a(dsd var1);

   public cqx(@Nullable crc<?> $$0, int $$1, cmx $$2, cqg $$3) {
      super($$0, $$1);
      this.o = $$3;
      this.p = $$2.l;
      cqy $$4 = this.l();
      this.q = this.e($$4.d());
      this.m = $$4.f();
      this.n = $$4.e();
      this.a($$4);
      this.b($$4);
      this.a($$2);
   }

   private void a(cqy $$0) {
      for (final cqy.b $$1 : $$0.c()) {
         this.a(new crq(this.q, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(cuq $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cqy $$0) {
      this.a(new crq(this.r, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(cuq $$0) {
            return false;
         }

         @Override
         public boolean a(cmy $$0) {
            return cqx.this.a($$0, this.h());
         }

         @Override
         public void a(cmy $$0, cuq $$1) {
            cqx.this.a($$0, $$1);
         }
      });
   }

   private void a(cmx $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.a(new crq($$0, $$2 + $$1 * 9 + 9, 8 + $$2 * 18, 84 + $$1 * 18));
         }
      }

      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.a(new crq($$0, $$3, 8 + $$3 * 18, 142));
      }
   }

   public abstract void m();

   protected abstract cqy l();

   private bre e(int $$0) {
      return new bre($$0) {
         @Override
         public void e() {
            super.e();
            cqx.this.a(this);
         }
      };
   }

   @Override
   public void a(bqo $$0) {
      super.a($$0);
      if ($$0 == this.q) {
         this.m();
      }
   }

   @Override
   public void b(cmy $$0) {
      super.b($$0);
      this.o.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean a(cmy $$0) {
      return this.o.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public cuq a(cmy $$0, int $$1) {
      cuq $$2 = cuq.l;
      crq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuq $$4 = $$3.g();
         $$2 = $$4.s();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return cuq.l;
            }

            $$3.b($$4, $$2);
         } else if (this.m.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return cuq.l;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return cuq.l;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return cuq.l;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return cuq.l;
         }

         if ($$4.e()) {
            $$3.e(cuq.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cuq.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cuq $$0) {
      return true;
   }

   public int d(cuq $$0) {
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
