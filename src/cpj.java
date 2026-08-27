import java.util.Optional;
import javax.annotation.Nullable;

public class cpj extends cpg {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private static final int r = 0;
   private final bpt s = new bqj(1) {
      @Override
      public boolean b(int $$0, cuh $$1) {
         return $$1.a(awm.aY);
      }

      @Override
      public int ai_() {
         return 1;
      }
   };
   private final cpj.a t;
   private final cpr u;
   private final cpq v;

   public cpj(int $$0, bpt $$1) {
      this($$0, $$1, new crd(3), cpr.a);
   }

   public cpj(int $$0, bpt $$1, cpq $$2, cpr $$3) {
      super(cqo.j, $$0);
      a($$2, 3);
      this.v = $$2;
      this.u = $$3;
      this.t = new cpj.a(this.s, 0, 136, 110);
      this.a(this.t);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cre($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new cre($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      if (!$$0.dU().C) {
         cuh $$1 = this.t.a(this.t.a());
         if (!$$1.d()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(cly $$0) {
      return a(this.u, $$0, dfe.gH);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public cuh a(cly $$0, int $$1) {
      cuh $$2 = cuh.i;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuh $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cuh.i;
            }

            $$3.b($$4, $$2);
         } else if (!this.t.h() && this.t.a($$4) && $$4.G() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cuh.i;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cuh.i;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cuh.i;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cuh.i;
         }

         if ($$4.d()) {
            $$3.e(cuh.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return cuh.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(0);
   }

   public static int a(@Nullable ja<brf> $$0) {
      return $$0 == null ? 0 : lh.d.t().a($$0) + 1;
   }

   @Nullable
   public static ja<brf> e(int $$0) {
      return $$0 == 0 ? null : lh.d.t().a($$0 - 1);
   }

   @Nullable
   public ja<brf> m() {
      return e(this.v.a(1));
   }

   @Nullable
   public ja<brf> n() {
      return e(this.v.a(2));
   }

   public void a(Optional<ja<brf>> $$0, Optional<ja<brf>> $$1) {
      if (this.t.h()) {
         this.v.a(1, a($$0.orElse(null)));
         this.v.a(2, a($$1.orElse(null)));
         this.t.a(1);
         this.u.a(dca::q);
      }
   }

   public boolean o() {
      return !this.s.a(0).d();
   }

   class a extends cre {
      public a(bpt $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cuh $$0) {
         return $$0.a(awm.aY);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
