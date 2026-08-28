import java.util.Optional;
import javax.annotation.Nullable;

public class csf extends csa {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final bsb u = new bsp(1) {
      @Override
      public boolean b(int $$0, cwn $$1) {
         return $$1.a(awx.ba);
      }

      @Override
      public int an_() {
         return 1;
      }
   };
   private final csf.a v;
   private final csn w;
   private final csm x;

   public csf(int $$0, bsb $$1) {
      this($$0, $$1, new ctw(3), csn.a);
   }

   public csf(int $$0, bsb $$1, csm $$2, csn $$3) {
      super(ctj.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new csf.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(cov $$0) {
      super.a($$0);
      if (!$$0.dW().C) {
         cwn $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(cov $$0) {
      return a(this.w, $$0, djm.gj);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public cwn b(cov $$0, int $$1) {
      cwn $$2 = cwn.j;
      ctx $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwn $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cwn.j;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.M() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cwn.j;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cwn.j;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cwn.j;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cwn.j;
         }

         if ($$4.f()) {
            $$3.e(cwn.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwn.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable jr<btm> $$0) {
      return $$0 == null ? 0 : mb.d.t().a($$0) + 1;
   }

   @Nullable
   public static jr<btm> e(int $$0) {
      return $$0 == 0 ? null : mb.d.t().a($$0 - 1);
   }

   @Nullable
   public jr<btm> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public jr<btm> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<jr<btm>> $$0, Optional<jr<btm>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(dgg::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   static class a extends ctx {
      public a(bsb $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwn $$0) {
         return $$0.a(awx.ba);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
