import java.util.Optional;
import javax.annotation.Nullable;

public class cnk extends cnh {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private static final int r = 0;
   private final boj s = new boz(1) {
      @Override
      public boolean b(int $$0, csd $$1) {
         return $$1.a(avw.aw);
      }

      @Override
      public int ah_() {
         return 1;
      }
   };
   private final cnk.a t;
   private final cns u;
   private final cnr v;

   public cnk(int $$0, boj $$1) {
      this($$0, $$1, new cpc(3), cns.a);
   }

   public cnk(int $$0, boj $$1, cnr $$2, cns $$3) {
      super(cop.j, $$0);
      a($$2, 3);
      this.v = $$2;
      this.u = $$3;
      this.t = new cnk.a(this.s, 0, 136, 110);
      this.a(this.t);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cpd($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new cpd($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(ckl $$0) {
      super.b($$0);
      if (!$$0.dN().B) {
         csd $$1 = this.t.a(this.t.a());
         if (!$$1.d()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(ckl $$0) {
      return a(this.u, $$0, dcx.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public csd a(ckl $$0, int $$1) {
      csd $$2 = csd.i;
      cpd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csd $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return csd.i;
            }

            $$3.b($$4, $$2);
         } else if (!this.t.h() && this.t.a($$4) && $$4.G() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return csd.i;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return csd.i;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return csd.i;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return csd.i;
         }

         if ($$4.d()) {
            $$3.e(csd.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return csd.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(0);
   }

   public static int a(@Nullable iv<bpv> $$0) {
      return $$0 == null ? 0 : lc.d.t().a($$0) + 1;
   }

   @Nullable
   public static iv<bpv> e(int $$0) {
      return $$0 == 0 ? null : lc.d.t().a($$0 - 1);
   }

   @Nullable
   public iv<bpv> m() {
      return e(this.v.a(1));
   }

   @Nullable
   public iv<bpv> n() {
      return e(this.v.a(2));
   }

   public void a(Optional<iv<bpv>> $$0, Optional<iv<bpv>> $$1) {
      if (this.t.h()) {
         this.v.a(1, a($$0.orElse(null)));
         this.v.a(2, a($$1.orElse(null)));
         this.t.a(1);
         this.u.a(czu::q);
      }
   }

   public boolean o() {
      return !this.s.a(0).d();
   }

   class a extends cpd {
      public a(boj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(csd $$0) {
         return $$0.a(avw.aw);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
