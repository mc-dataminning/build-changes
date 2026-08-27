import java.util.Optional;
import javax.annotation.Nullable;

public class cmz extends cmw {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private static final int r = 0;
   private final bny s = new boo(1) {
      @Override
      public boolean b(int $$0, crs $$1) {
         return $$1.a(avm.aw);
      }

      @Override
      public int ah_() {
         return 1;
      }
   };
   private final cmz.a t;
   private final cnh u;
   private final cng v;

   public cmz(int $$0, bny $$1) {
      this($$0, $$1, new cor(3), cnh.a);
   }

   public cmz(int $$0, bny $$1, cng $$2, cnh $$3) {
      super(cod.j, $$0);
      a($$2, 3);
      this.v = $$2;
      this.u = $$3;
      this.t = new cmz.a(this.s, 0, 136, 110);
      this.a(this.t);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cos($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new cos($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(cka $$0) {
      super.b($$0);
      if (!$$0.dM().B) {
         crs $$1 = this.t.a(this.t.a());
         if (!$$1.d()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(cka $$0) {
      return a(this.u, $$0, dcj.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public crs a(cka $$0, int $$1) {
      crs $$2 = crs.i;
      cos $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crs $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return crs.i;
            }

            $$3.b($$4, $$2);
         } else if (!this.t.h() && this.t.a($$4) && $$4.G() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return crs.i;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return crs.i;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return crs.i;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return crs.i;
         }

         if ($$4.d()) {
            $$3.e(crs.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crs.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(0);
   }

   public static int a(@Nullable in<bpk> $$0) {
      return $$0 == null ? 0 : kt.d.t().a($$0) + 1;
   }

   @Nullable
   public static in<bpk> e(int $$0) {
      return $$0 == 0 ? null : kt.d.t().a($$0 - 1);
   }

   @Nullable
   public in<bpk> m() {
      return e(this.v.a(1));
   }

   @Nullable
   public in<bpk> n() {
      return e(this.v.a(2));
   }

   public void a(Optional<in<bpk>> $$0, Optional<in<bpk>> $$1) {
      if (this.t.h()) {
         this.v.a(1, a($$0.orElse(null)));
         this.v.a(2, a($$1.orElse(null)));
         this.t.a(1);
         this.u.a(czg::q);
      }
   }

   public boolean o() {
      return !this.s.a(0).d();
   }

   class a extends cos {
      public a(bny $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(crs $$0) {
         return $$0.a(avm.aw);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
