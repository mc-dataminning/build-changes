import java.util.Optional;
import javax.annotation.Nullable;

public class chn extends chk {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private static final int r = 0;
   private final bje s = new bjt(1) {
      @Override
      public boolean b(int $$0, cmh $$1) {
         return $$1.a(arz.aw);
      }

      @Override
      public int ak_() {
         return 1;
      }
   };
   private final chn.a t;
   private final chv u;
   private final chu v;

   public chn(int $$0, bje $$1) {
      this($$0, $$1, new cje(3), chv.a);
   }

   public chn(int $$0, bje $$1, chu $$2, chv $$3) {
      super(cir.j, $$0);
      a($$2, 3);
      this.v = $$2;
      this.u = $$3;
      this.t = new chn.a(this.s, 0, 136, 110);
      this.a(this.t);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cjf($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new cjf($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(cer $$0) {
      super.b($$0);
      if (!$$0.dM().B) {
         cmh $$1 = this.t.a(this.t.a());
         if (!$$1.b()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(cer $$0) {
      return a(this.u, $$0, cwb.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public cmh a(cer $$0, int $$1) {
      cmh $$2 = cmh.f;
      cjf $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmh $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cmh.f;
            }

            $$3.b($$4, $$2);
         } else if (!this.t.h() && this.t.a($$4) && $$4.L() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cmh.f;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cmh.f;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cmh.f;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cmh.f;
         }

         if ($$4.b()) {
            $$3.e(cmh.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmh.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(0);
   }

   public static int a(@Nullable bkq $$0) {
      return $$0 == null ? 0 : kb.d.a($$0) + 1;
   }

   @Nullable
   public static bkq e(int $$0) {
      return $$0 == 0 ? null : kb.d.a($$0 - 1);
   }

   @Nullable
   public bkq m() {
      return e(this.v.a(1));
   }

   @Nullable
   public bkq n() {
      return e(this.v.a(2));
   }

   public void a(Optional<bkq> $$0, Optional<bkq> $$1) {
      if (this.t.h()) {
         this.v.a(1, a($$0.orElse(null)));
         this.v.a(2, a($$1.orElse(null)));
         this.t.a(1);
         this.u.a(csy::p);
      }
   }

   public boolean o() {
      return !this.s.a(0).b();
   }

   class a extends cjf {
      public a(bje $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cmh $$0) {
         return $$0.a(arz.aw);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
