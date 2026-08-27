import java.util.Optional;
import javax.annotation.Nullable;

public class cim extends cij {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private static final int r = 0;
   private final bjv s = new bkl(1) {
      @Override
      public boolean b(int $$0, cng $$1) {
         return $$1.a(asq.aw);
      }

      @Override
      public int al_() {
         return 1;
      }
   };
   private final cim.a t;
   private final ciu u;
   private final cit v;

   public cim(int $$0, bjv $$1) {
      this($$0, $$1, new ckd(3), ciu.a);
   }

   public cim(int $$0, bjv $$1, cit $$2, ciu $$3) {
      super(cjq.j, $$0);
      a($$2, 3);
      this.v = $$2;
      this.u = $$3;
      this.t = new cim.a(this.s, 0, 136, 110);
      this.a(this.t);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cke($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new cke($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(cfq $$0) {
      super.b($$0);
      if (!$$0.dL().B) {
         cng $$1 = this.t.a(this.t.a());
         if (!$$1.b()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(cfq $$0) {
      return a(this.u, $$0, cxa.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public cng a(cfq $$0, int $$1) {
      cng $$2 = cng.f;
      cke $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cng $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cng.f;
            }

            $$3.b($$4, $$2);
         } else if (!this.t.h() && this.t.a($$4) && $$4.L() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cng.f;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cng.f;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cng.f;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cng.f;
         }

         if ($$4.b()) {
            $$3.e(cng.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cng.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(0);
   }

   public static int a(@Nullable ih<blh> $$0) {
      return $$0 == null ? 0 : kd.d.t().a($$0) + 1;
   }

   @Nullable
   public static ih<blh> e(int $$0) {
      return $$0 == 0 ? null : kd.d.t().a($$0 - 1);
   }

   @Nullable
   public ih<blh> m() {
      return e(this.v.a(1));
   }

   @Nullable
   public ih<blh> n() {
      return e(this.v.a(2));
   }

   public void a(Optional<ih<blh>> $$0, Optional<ih<blh>> $$1) {
      if (this.t.h()) {
         this.v.a(1, a($$0.orElse(null)));
         this.v.a(2, a($$1.orElse(null)));
         this.t.a(1);
         this.u.a(ctx::q);
      }
   }

   public boolean o() {
      return !this.s.a(0).b();
   }

   class a extends cke {
      public a(bjv $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cng $$0) {
         return $$0.a(asq.aw);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
