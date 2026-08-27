import java.util.Optional;
import javax.annotation.Nullable;

public class cms extends cmp {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private static final int r = 0;
   private final bnt s = new boj(1) {
      @Override
      public boolean b(int $$0, crj $$1) {
         return $$1.a(avk.aw);
      }

      @Override
      public int aj_() {
         return 1;
      }
   };
   private final cms.a t;
   private final cna u;
   private final cmz v;

   public cms(int $$0, bnt $$1) {
      this($$0, $$1, new coj(3), cna.a);
   }

   public cms(int $$0, bnt $$1, cmz $$2, cna $$3) {
      super(cnw.j, $$0);
      a($$2, 3);
      this.v = $$2;
      this.u = $$3;
      this.t = new cms.a(this.s, 0, 136, 110);
      this.a(this.t);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cok($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new cok($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(cjt $$0) {
      super.b($$0);
      if (!$$0.dM().B) {
         crj $$1 = this.t.a(this.t.a());
         if (!$$1.d()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return a(this.u, $$0, dca.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public crj a(cjt $$0, int $$1) {
      crj $$2 = crj.i;
      cok $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crj $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return crj.i;
            }

            $$3.b($$4, $$2);
         } else if (!this.t.h() && this.t.a($$4) && $$4.G() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return crj.i;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return crj.i;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return crj.i;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return crj.i;
         }

         if ($$4.d()) {
            $$3.e(crj.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crj.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(0);
   }

   public static int a(@Nullable il<bpf> $$0) {
      return $$0 == null ? 0 : kr.d.t().a($$0) + 1;
   }

   @Nullable
   public static il<bpf> e(int $$0) {
      return $$0 == 0 ? null : kr.d.t().a($$0 - 1);
   }

   @Nullable
   public il<bpf> m() {
      return e(this.v.a(1));
   }

   @Nullable
   public il<bpf> n() {
      return e(this.v.a(2));
   }

   public void a(Optional<il<bpf>> $$0, Optional<il<bpf>> $$1) {
      if (this.t.h()) {
         this.v.a(1, a($$0.orElse(null)));
         this.v.a(2, a($$1.orElse(null)));
         this.t.a(1);
         this.u.a(cyx::q);
      }
   }

   public boolean o() {
      return !this.s.a(0).d();
   }

   class a extends cok {
      public a(bnt $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(crj $$0) {
         return $$0.a(avk.aw);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
