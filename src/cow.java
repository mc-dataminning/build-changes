import java.util.Optional;
import javax.annotation.Nullable;

public class cow extends cot {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private static final int r = 0;
   private final bpn s = new bqd(1) {
      @Override
      public boolean b(int $$0, cto $$1) {
         return $$1.a(awe.aX);
      }

      @Override
      public int ah_() {
         return 1;
      }
   };
   private final cow.a t;
   private final cpe u;
   private final cpd v;

   public cow(int $$0, bpn $$1) {
      this($$0, $$1, new cqn(3), cpe.a);
   }

   public cow(int $$0, bpn $$1, cpd $$2, cpe $$3) {
      super(cqa.j, $$0);
      a($$2, 3);
      this.v = $$2;
      this.u = $$3;
      this.t = new cow.a(this.s, 0, 136, 110);
      this.a(this.t);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cqo($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new cqo($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(clw $$0) {
      super.b($$0);
      if (!$$0.dP().B) {
         cto $$1 = this.t.a(this.t.a());
         if (!$$1.e()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(clw $$0) {
      return a(this.u, $$0, dea.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public cto a(clw $$0, int $$1) {
      cto $$2 = cto.i;
      cqo $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cto $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cto.i;
            }

            $$3.b($$4, $$2);
         } else if (!this.t.h() && this.t.a($$4) && $$4.I() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cto.i;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cto.i;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cto.i;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cto.i;
         }

         if ($$4.e()) {
            $$3.e(cto.i);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cto.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(0);
   }

   public static int a(@Nullable ix<bra> $$0) {
      return $$0 == null ? 0 : le.d.t().a($$0) + 1;
   }

   @Nullable
   public static ix<bra> e(int $$0) {
      return $$0 == 0 ? null : le.d.t().a($$0 - 1);
   }

   @Nullable
   public ix<bra> m() {
      return e(this.v.a(1));
   }

   @Nullable
   public ix<bra> n() {
      return e(this.v.a(2));
   }

   public void a(Optional<ix<bra>> $$0, Optional<ix<bra>> $$1) {
      if (this.t.h()) {
         this.v.a(1, a($$0.orElse(null)));
         this.v.a(2, a($$1.orElse(null)));
         this.t.a(1);
         this.u.a(dax::q);
      }
   }

   public boolean o() {
      return !this.s.a(0).e();
   }

   class a extends cqo {
      public a(bpn $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cto $$0) {
         return $$0.a(awe.aX);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
