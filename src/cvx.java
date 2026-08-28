import java.util.Optional;
import javax.annotation.Nullable;

public class cvx extends cvs {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final bum u = new bva(1) {
      @Override
      public boolean b(int $$0, daa $$1) {
         return $$1.a(axo.bc);
      }

      @Override
      public int ao_() {
         return 1;
      }
   };
   private final cvx.a v;
   private final cwf w;
   private final cwe x;

   public cvx(int $$0, bum $$1) {
      this($$0, $$1, new cxo(3), cwf.a);
   }

   public cvx(int $$0, bum $$1, cwe $$2, cwf $$3) {
      super(cxb.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new cvx.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(crz $$0) {
      super.a($$0);
      if (!$$0.dV().C) {
         daa $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(crz $$0) {
      return a(this.w, $$0, dng.gn);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public daa b(crz $$0, int $$1) {
      daa $$2 = daa.k;
      cxp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         daa $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return daa.k;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.M() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return daa.k;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return daa.k;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return daa.k;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return daa.k;
         }

         if ($$4.f()) {
            $$3.e(daa.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return daa.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable jg<bvx> $$0) {
      return $$0 == null ? 0 : mh.d.t().a($$0) + 1;
   }

   @Nullable
   public static jg<bvx> e(int $$0) {
      return $$0 == 0 ? null : mh.d.t().a($$0 - 1);
   }

   @Nullable
   public jg<bvx> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public jg<bvx> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<jg<bvx>> $$0, Optional<jg<bvx>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(djz::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   static class a extends cxp {
      public a(bum $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(daa $$0) {
         return $$0.a(axo.bc);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
