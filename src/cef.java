import java.util.Optional;
import javax.annotation.Nullable;

public class cef extends cec {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private final bgh r = new bgv(1) {
      @Override
      public boolean b(int $$0, ciw $$1) {
         return $$1.a(apr.aw);
      }

      @Override
      public int ac_() {
         return 1;
      }
   };
   private final cef.a s;
   private final cen t;
   private final cem u;

   public cef(int $$0, bgh $$1) {
      this($$0, $$1, new cft(3), cen.a);
   }

   public cef(int $$0, bgh $$1, cem $$2, cen $$3) {
      super(cfh.i, $$0);
      a($$2, 3);
      this.u = $$2;
      this.t = $$3;
      this.s = new cef.a(this.r, 0, 136, 110);
      this.a(this.s);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cfu($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new cfu($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(cbl $$0) {
      super.b($$0);
      if (!$$0.dK().B) {
         ciw $$1 = this.s.a(this.s.a());
         if (!$$1.b()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return a(this.t, $$0, csl.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public ciw a(cbl $$0, int $$1) {
      ciw $$2 = ciw.b;
      cfu $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciw $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return ciw.b;
            }

            $$3.a($$4, $$2);
         } else if (!this.s.f() && this.s.a($$4) && $$4.L() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return ciw.b;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return ciw.b;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return ciw.b;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return ciw.b;
         }

         if ($$4.b()) {
            $$3.d(ciw.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return ciw.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.u.a(0);
   }

   @Nullable
   public bhr m() {
      return bhr.a(this.u.a(1));
   }

   @Nullable
   public bhr n() {
      return bhr.a(this.u.a(2));
   }

   public void a(Optional<bhr> $$0, Optional<bhr> $$1) {
      if (this.s.f()) {
         this.u.a(1, $$0.<Integer>map(bhr::a).orElse(-1));
         this.u.a(2, $$1.<Integer>map(bhr::a).orElse(-1));
         this.s.a(1);
         this.t.a(cpk::p);
      }
   }

   public boolean o() {
      return !this.r.a(0).b();
   }

   class a extends cfu {
      public a(bgh $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(ciw $$0) {
         return $$0.a(apr.aw);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
