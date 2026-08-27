import java.util.Optional;
import javax.annotation.Nullable;

public class ceo extends cel {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private static final int r = 0;
   private final bgr s = new bhf(1) {
      @Override
      public boolean b(int $$0, cjf $$1) {
         return $$1.a(aqa.aw);
      }

      @Override
      public int ag_() {
         return 1;
      }
   };
   private final ceo.a t;
   private final cew u;
   private final cev v;

   public ceo(int $$0, bgr $$1) {
      this($$0, $$1, new cgc(3), cew.a);
   }

   public ceo(int $$0, bgr $$1, cev $$2, cew $$3) {
      super(cfq.i, $$0);
      a($$2, 3);
      this.v = $$2;
      this.u = $$3;
      this.t = new ceo.a(this.s, 0, 136, 110);
      this.a(this.t);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cgd($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new cgd($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(cbu $$0) {
      super.b($$0);
      if (!$$0.dL().B) {
         cjf $$1 = this.t.a(this.t.a());
         if (!$$1.b()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(cbu $$0) {
      return a(this.u, $$0, csw.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public cjf a(cbu $$0, int $$1) {
      cjf $$2 = cjf.b;
      cgd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjf $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cjf.b;
            }

            $$3.b($$4, $$2);
         } else if (!this.t.f() && this.t.a($$4) && $$4.L() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cjf.b;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cjf.b;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cjf.b;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cjf.b;
         }

         if ($$4.b()) {
            $$3.d(cjf.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cjf.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(0);
   }

   public static int a(@Nullable bib $$0) {
      return $$0 == null ? 0 : jb.e.a($$0) + 1;
   }

   @Nullable
   public static bib e(int $$0) {
      return $$0 == 0 ? null : jb.e.a($$0 - 1);
   }

   @Nullable
   public bib m() {
      return e(this.v.a(1));
   }

   @Nullable
   public bib n() {
      return e(this.v.a(2));
   }

   public void a(Optional<bib> $$0, Optional<bib> $$1) {
      if (this.t.f()) {
         this.v.a(1, a($$0.orElse(null)));
         this.v.a(2, a($$1.orElse(null)));
         this.t.a(1);
         this.u.a(cpv::p);
      }
   }

   public boolean o() {
      return !this.s.a(0).b();
   }

   class a extends cgd {
      public a(bgr $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cjf $$0) {
         return $$0.a(aqa.aw);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
