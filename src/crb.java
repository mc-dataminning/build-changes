import java.util.Optional;
import javax.annotation.Nullable;

public class crb extends cqw {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final bri u = new brw(1) {
      @Override
      public boolean b(int $$0, cvp $$1) {
         return $$1.a(axc.aW);
      }

      @Override
      public int ak_() {
         return 1;
      }
   };
   private final crb.a v;
   private final crj w;
   private final cri x;

   public crb(int $$0, bri $$1) {
      this($$0, $$1, new css(3), crj.a);
   }

   public crb(int $$0, bri $$1, cri $$2, crj $$3) {
      super(csf.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new crb.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(cnu $$0) {
      super.a($$0);
      if (!$$0.dS().B) {
         cvp $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(cnu $$0) {
      return a(this.w, $$0, dhl.fO);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public cvp b(cnu $$0, int $$1) {
      cvp $$2 = cvp.k;
      cst $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvp $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cvp.k;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.J() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cvp.k;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cvp.k;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cvp.k;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cvp.k;
         }

         if ($$4.f()) {
            $$3.e(cvp.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvp.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable jn<bst> $$0) {
      return $$0 == null ? 0 : lu.d.t().a($$0) + 1;
   }

   @Nullable
   public static jn<bst> e(int $$0) {
      return $$0 == 0 ? null : lu.d.t().a($$0 - 1);
   }

   @Nullable
   public jn<bst> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public jn<bst> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<jn<bst>> $$0, Optional<jn<bst>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(deg::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   class a extends cst {
      public a(final bri $$0, final int $$1, final int $$2, final int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cvp $$0) {
         return $$0.a(axc.aW);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
