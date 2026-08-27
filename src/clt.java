import java.util.Optional;
import javax.annotation.Nullable;

public class clt extends clq {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private static final int r = 0;
   private final bmw s = new bnm(1) {
      @Override
      public boolean b(int $$0, cqm $$1) {
         return $$1.a(auv.aw);
      }

      @Override
      public int ak_() {
         return 1;
      }
   };
   private final clt.a t;
   private final cmb u;
   private final cma v;

   public clt(int $$0, bmw $$1) {
      this($$0, $$1, new cnk(3), cmb.a);
   }

   public clt(int $$0, bmw $$1, cma $$2, cmb $$3) {
      super(cmx.j, $$0);
      a($$2, 3);
      this.v = $$2;
      this.u = $$3;
      this.t = new clt.a(this.s, 0, 136, 110);
      this.a(this.t);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cnl($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new cnl($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(ciu $$0) {
      super.b($$0);
      if (!$$0.dM().B) {
         cqm $$1 = this.t.a(this.t.a());
         if (!$$1.b()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(ciu $$0) {
      return a(this.u, $$0, dae.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public cqm a(ciu $$0, int $$1) {
      cqm $$2 = cqm.h;
      cnl $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqm $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cqm.h;
            }

            $$3.b($$4, $$2);
         } else if (!this.t.h() && this.t.a($$4) && $$4.M() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cqm.h;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cqm.h;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cqm.h;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cqm.h;
         }

         if ($$4.b()) {
            $$3.e(cqm.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cqm.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(0);
   }

   public static int a(@Nullable il<boi> $$0) {
      return $$0 == null ? 0 : ki.d.t().a($$0) + 1;
   }

   @Nullable
   public static il<boi> e(int $$0) {
      return $$0 == 0 ? null : ki.d.t().a($$0 - 1);
   }

   @Nullable
   public il<boi> m() {
      return e(this.v.a(1));
   }

   @Nullable
   public il<boi> n() {
      return e(this.v.a(2));
   }

   public void a(Optional<il<boi>> $$0, Optional<il<boi>> $$1) {
      if (this.t.h()) {
         this.v.a(1, a($$0.orElse(null)));
         this.v.a(2, a($$1.orElse(null)));
         this.t.a(1);
         this.u.a(cxb::q);
      }
   }

   public boolean o() {
      return !this.s.a(0).b();
   }

   class a extends cnl {
      public a(bmw $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cqm $$0) {
         return $$0.a(auv.aw);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
