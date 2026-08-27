import java.util.Optional;
import javax.annotation.Nullable;

public class cgu extends cgr {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private static final int r = 0;
   private final biu s = new bjj(1) {
      @Override
      public boolean b(int $$0, clo $$1) {
         return $$1.a(ars.aw);
      }

      @Override
      public int al_() {
         return 1;
      }
   };
   private final cgu.a t;
   private final chc u;
   private final chb v;

   public cgu(int $$0, biu $$1) {
      this($$0, $$1, new cil(3), chc.a);
   }

   public cgu(int $$0, biu $$1, chb $$2, chc $$3) {
      super(chy.j, $$0);
      a($$2, 3);
      this.v = $$2;
      this.u = $$3;
      this.t = new cgu.a(this.s, 0, 136, 110);
      this.a(this.t);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cim($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new cim($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(cdz $$0) {
      super.b($$0);
      if (!$$0.dN().B) {
         clo $$1 = this.t.a(this.t.a());
         if (!$$1.b()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(cdz $$0) {
      return a(this.u, $$0, cvh.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public clo a(cdz $$0, int $$1) {
      clo $$2 = clo.b;
      cim $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clo $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return clo.b;
            }

            $$3.b($$4, $$2);
         } else if (!this.t.g() && this.t.a($$4) && $$4.L() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return clo.b;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return clo.b;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return clo.b;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return clo.b;
         }

         if ($$4.b()) {
            $$3.e(clo.b);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return clo.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(0);
   }

   public static int a(@Nullable bkg $$0) {
      return $$0 == null ? 0 : kc.e.a($$0) + 1;
   }

   @Nullable
   public static bkg e(int $$0) {
      return $$0 == 0 ? null : kc.e.a($$0 - 1);
   }

   @Nullable
   public bkg m() {
      return e(this.v.a(1));
   }

   @Nullable
   public bkg n() {
      return e(this.v.a(2));
   }

   public void a(Optional<bkg> $$0, Optional<bkg> $$1) {
      if (this.t.g()) {
         this.v.a(1, a($$0.orElse(null)));
         this.v.a(2, a($$1.orElse(null)));
         this.t.a(1);
         this.u.a(csf::p);
      }
   }

   public boolean o() {
      return !this.s.a(0).b();
   }

   class a extends cim {
      public a(biu $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(clo $$0) {
         return $$0.a(ars.aw);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
