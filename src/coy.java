import java.util.Optional;
import javax.annotation.Nullable;

public class coy extends cov {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private static final int r = 0;
   private final bpp s = new bqf(1) {
      @Override
      public boolean b(int $$0, ctq $$1) {
         return $$1.a(awf.aX);
      }

      @Override
      public int ai_() {
         return 1;
      }
   };
   private final coy.a t;
   private final cpg u;
   private final cpf v;

   public coy(int $$0, bpp $$1) {
      this($$0, $$1, new cqp(3), cpg.a);
   }

   public coy(int $$0, bpp $$1, cpf $$2, cpg $$3) {
      super(cqc.j, $$0);
      a($$2, 3);
      this.v = $$2;
      this.u = $$3;
      this.t = new coy.a(this.s, 0, 136, 110);
      this.a(this.t);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cqq($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new cqq($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      if (!$$0.dP().B) {
         ctq $$1 = this.t.a(this.t.a());
         if (!$$1.e()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(cly $$0) {
      return a(this.u, $$0, dec.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public ctq a(cly $$0, int $$1) {
      ctq $$2 = ctq.i;
      cqq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         ctq $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return ctq.i;
            }

            $$3.b($$4, $$2);
         } else if (!this.t.h() && this.t.a($$4) && $$4.I() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return ctq.i;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return ctq.i;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return ctq.i;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return ctq.i;
         }

         if ($$4.e()) {
            $$3.e(ctq.i);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return ctq.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(0);
   }

   public static int a(@Nullable ix<brc> $$0) {
      return $$0 == null ? 0 : le.d.t().a($$0) + 1;
   }

   @Nullable
   public static ix<brc> e(int $$0) {
      return $$0 == 0 ? null : le.d.t().a($$0 - 1);
   }

   @Nullable
   public ix<brc> m() {
      return e(this.v.a(1));
   }

   @Nullable
   public ix<brc> n() {
      return e(this.v.a(2));
   }

   public void a(Optional<ix<brc>> $$0, Optional<ix<brc>> $$1) {
      if (this.t.h()) {
         this.v.a(1, a($$0.orElse(null)));
         this.v.a(2, a($$1.orElse(null)));
         this.t.a(1);
         this.u.a(daz::q);
      }
   }

   public boolean o() {
      return !this.s.a(0).e();
   }

   class a extends cqq {
      public a(bpp $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(ctq $$0) {
         return $$0.a(awf.aX);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
