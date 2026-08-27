import java.util.Optional;
import javax.annotation.Nullable;

public class chx extends chu {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private static final int r = 0;
   private final bjo s = new bkd(1) {
      @Override
      public boolean b(int $$0, cmr $$1) {
         return $$1.a(asj.aw);
      }

      @Override
      public int ak_() {
         return 1;
      }
   };
   private final chx.a t;
   private final cif u;
   private final cie v;

   public chx(int $$0, bjo $$1) {
      this($$0, $$1, new cjo(3), cif.a);
   }

   public chx(int $$0, bjo $$1, cie $$2, cif $$3) {
      super(cjb.j, $$0);
      a($$2, 3);
      this.v = $$2;
      this.u = $$3;
      this.t = new chx.a(this.s, 0, 136, 110);
      this.a(this.t);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cjp($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new cjp($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(cfb $$0) {
      super.b($$0);
      if (!$$0.dM().B) {
         cmr $$1 = this.t.a(this.t.a());
         if (!$$1.b()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(cfb $$0) {
      return a(this.u, $$0, cwl.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public cmr a(cfb $$0, int $$1) {
      cmr $$2 = cmr.f;
      cjp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmr $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cmr.f;
            }

            $$3.b($$4, $$2);
         } else if (!this.t.h() && this.t.a($$4) && $$4.L() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cmr.f;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cmr.f;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cmr.f;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cmr.f;
         }

         if ($$4.b()) {
            $$3.e(cmr.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmr.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(0);
   }

   public static int a(@Nullable bla $$0) {
      return $$0 == null ? 0 : kd.d.a($$0) + 1;
   }

   @Nullable
   public static bla e(int $$0) {
      return $$0 == 0 ? null : kd.d.a($$0 - 1);
   }

   @Nullable
   public bla m() {
      return e(this.v.a(1));
   }

   @Nullable
   public bla n() {
      return e(this.v.a(2));
   }

   public void a(Optional<bla> $$0, Optional<bla> $$1) {
      if (this.t.h()) {
         this.v.a(1, a($$0.orElse(null)));
         this.v.a(2, a($$1.orElse(null)));
         this.t.a(1);
         this.u.a(cti::q);
      }
   }

   public boolean o() {
      return !this.s.a(0).b();
   }

   class a extends cjp {
      public a(bjo $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cmr $$0) {
         return $$0.a(asj.aw);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
