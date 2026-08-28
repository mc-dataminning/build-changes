import java.util.Optional;
import javax.annotation.Nullable;

public class csh extends csc {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final bsc u = new bsq(1) {
      @Override
      public boolean b(int $$0, cwp $$1) {
         return $$1.a(awy.ba);
      }

      @Override
      public int an_() {
         return 1;
      }
   };
   private final csh.a v;
   private final csp w;
   private final cso x;

   public csh(int $$0, bsc $$1) {
      this($$0, $$1, new cty(3), csp.a);
   }

   public csh(int $$0, bsc $$1, cso $$2, csp $$3) {
      super(ctl.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new csh.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(cox $$0) {
      super.a($$0);
      if (!$$0.dW().C) {
         cwp $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(cox $$0) {
      return a(this.w, $$0, djo.gj);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public cwp b(cox $$0, int $$1) {
      cwp $$2 = cwp.j;
      ctz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cwp.j;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.M() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cwp.j;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cwp.j;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cwp.j;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cwp.j;
         }

         if ($$4.f()) {
            $$3.e(cwp.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwp.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable jr<btn> $$0) {
      return $$0 == null ? 0 : mb.d.t().a($$0) + 1;
   }

   @Nullable
   public static jr<btn> e(int $$0) {
      return $$0 == 0 ? null : mb.d.t().a($$0 - 1);
   }

   @Nullable
   public jr<btn> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public jr<btn> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<jr<btn>> $$0, Optional<jr<btn>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(dgi::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   static class a extends ctz {
      public a(bsc $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwp $$0) {
         return $$0.a(awy.ba);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
