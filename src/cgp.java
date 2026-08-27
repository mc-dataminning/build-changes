import java.util.Optional;
import javax.annotation.Nullable;

public class cgp extends cgm {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private static final int r = 0;
   private final biq s = new bje(1) {
      @Override
      public boolean b(int $$0, clj $$1) {
         return $$1.a(aro.aw);
      }

      @Override
      public int aj_() {
         return 1;
      }
   };
   private final cgp.a t;
   private final cgx u;
   private final cgw v;

   public cgp(int $$0, biq $$1) {
      this($$0, $$1, new cig(3), cgx.a);
   }

   public cgp(int $$0, biq $$1, cgw $$2, cgx $$3) {
      super(cht.j, $$0);
      a($$2, 3);
      this.v = $$2;
      this.u = $$3;
      this.t = new cgp.a(this.s, 0, 136, 110);
      this.a(this.t);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cih($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new cih($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(cdu $$0) {
      super.b($$0);
      if (!$$0.dN().B) {
         clj $$1 = this.t.a(this.t.a());
         if (!$$1.b()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(cdu $$0) {
      return a(this.u, $$0, cvc.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public clj a(cdu $$0, int $$1) {
      clj $$2 = clj.b;
      cih $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clj $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return clj.b;
            }

            $$3.b($$4, $$2);
         } else if (!this.t.g() && this.t.a($$4) && $$4.L() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return clj.b;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return clj.b;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return clj.b;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return clj.b;
         }

         if ($$4.b()) {
            $$3.e(clj.b);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return clj.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(0);
   }

   public static int a(@Nullable bkb $$0) {
      return $$0 == null ? 0 : jy.e.a($$0) + 1;
   }

   @Nullable
   public static bkb e(int $$0) {
      return $$0 == 0 ? null : jy.e.a($$0 - 1);
   }

   @Nullable
   public bkb m() {
      return e(this.v.a(1));
   }

   @Nullable
   public bkb n() {
      return e(this.v.a(2));
   }

   public void a(Optional<bkb> $$0, Optional<bkb> $$1) {
      if (this.t.g()) {
         this.v.a(1, a($$0.orElse(null)));
         this.v.a(2, a($$1.orElse(null)));
         this.t.a(1);
         this.u.a(csa::p);
      }
   }

   public boolean o() {
      return !this.s.a(0).b();
   }

   class a extends cih {
      public a(biq $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(clj $$0) {
         return $$0.a(aro.aw);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
