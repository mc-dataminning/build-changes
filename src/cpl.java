import java.util.Optional;
import javax.annotation.Nullable;

public class cpl extends cph {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private static final int r = 0;
   private final bpz s = new bqp(1) {
      @Override
      public boolean b(int $$0, cuc $$1) {
         return $$1.a(awf.aX);
      }

      @Override
      public int ah_() {
         return 1;
      }
   };
   private final cpl.a t;
   private final cpt u;
   private final cps v;

   public cpl(int $$0, bpz $$1) {
      this($$0, $$1, new crc(3), cpt.a);
   }

   public cpl(int $$0, bpz $$1, cps $$2, cpt $$3) {
      super(cqp.j, $$0);
      a($$2, 3);
      this.v = $$2;
      this.u = $$3;
      this.t = new cpl.a(this.s, 0, 136, 110);
      this.a(this.t);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new crd($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new crd($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void a(cmk $$0) {
      super.a($$0);
      if (!$$0.dQ().B) {
         cuc $$1 = this.t.a(this.t.a());
         if (!$$1.e()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(cmk $$0) {
      return a(this.u, $$0, dfj.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public cuc b(cmk $$0, int $$1) {
      cuc $$2 = cuc.l;
      crd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuc $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cuc.l;
            }

            $$3.b($$4, $$2);
         } else if (!this.t.h() && this.t.a($$4) && $$4.H() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cuc.l;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cuc.l;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cuc.l;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cuc.l;
         }

         if ($$4.e()) {
            $$3.e(cuc.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuc.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(0);
   }

   public static int a(@Nullable jj<brm> $$0) {
      return $$0 == null ? 0 : lq.d.u().a($$0) + 1;
   }

   @Nullable
   public static jj<brm> e(int $$0) {
      return $$0 == 0 ? null : lq.d.u().a($$0 - 1);
   }

   @Nullable
   public jj<brm> m() {
      return e(this.v.a(1));
   }

   @Nullable
   public jj<brm> n() {
      return e(this.v.a(2));
   }

   public void a(Optional<jj<brm>> $$0, Optional<jj<brm>> $$1) {
      if (this.t.h()) {
         this.v.a(1, a($$0.orElse(null)));
         this.v.a(2, a($$1.orElse(null)));
         this.t.a(1);
         this.u.a(dcf::q);
      }
   }

   public boolean o() {
      return !this.s.a(0).e();
   }

   class a extends crd {
      public a(final bpz $$0, final int $$1, final int $$2, final int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cuc $$0) {
         return $$0.a(awf.aX);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
