import java.util.List;
import javax.annotation.Nullable;

public abstract class cgp extends cfp {
   private static final int k = 9;
   private static final int l = 3;
   protected final cga o;
   protected final ccx p;
   protected final bhu q;
   private final List<Integer> m;
   protected final chc r = new chc();
   private final int n;

   protected abstract boolean a(ccx var1, boolean var2);

   protected abstract void a(ccx var1, ckj var2);

   protected abstract boolean a(dgb var1);

   public cgp(@Nullable cgu<?> $$0, int $$1, ccw $$2, cga $$3) {
      super($$0, $$1);
      this.o = $$3;
      this.p = $$2.m;
      cgq $$4 = this.l();
      this.q = this.e($$4.d());
      this.m = $$4.f();
      this.n = $$4.e();
      this.a($$4);
      this.b($$4);
      this.a($$2);
   }

   private void a(cgq $$0) {
      for (final cgq.b $$1 : $$0.c()) {
         this.a(new chh(this.q, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(ckj $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cgq $$0) {
      this.a(new chh(this.r, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(ckj $$0) {
            return false;
         }

         @Override
         public boolean a(ccx $$0) {
            return cgp.this.a($$0, this.f());
         }

         @Override
         public void a(ccx $$0, ckj $$1) {
            cgp.this.a($$0, $$1);
         }
      });
   }

   private void a(ccw $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.a(new chh($$0, $$2 + $$1 * 9 + 9, 8 + $$2 * 18, 84 + $$1 * 18));
         }
      }

      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.a(new chh($$0, $$3, 8 + $$3 * 18, 142));
      }
   }

   public abstract void m();

   protected abstract cgq l();

   private bii e(int $$0) {
      return new bii($$0) {
         @Override
         public void e() {
            super.e();
            cgp.this.a(this);
         }
      };
   }

   @Override
   public void a(bhu $$0) {
      super.a($$0);
      if ($$0 == this.q) {
         this.m();
      }
   }

   @Override
   public void b(ccx $$0) {
      super.b($$0);
      this.o.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean a(ccx $$0) {
      return this.o.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.i((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5) <= 64.0, true);
   }

   @Override
   public ckj a(ccx $$0, int $$1) {
      ckj $$2 = ckj.b;
      chh $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ckj $$4 = $$3.e();
         $$2 = $$4.p();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return ckj.b;
            }

            $$3.b($$4, $$2);
         } else if (this.m.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return ckj.b;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return ckj.b;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return ckj.b;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return ckj.b;
         }

         if ($$4.b()) {
            $$3.d(ckj.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return ckj.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(ckj $$0) {
      return true;
   }

   public int d(ckj $$0) {
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
