import java.util.Optional;
import javax.annotation.Nullable;

public class cvh extends cvc {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final btz u = new bun(1) {
      @Override
      public boolean b(int $$0, czk $$1) {
         return $$1.a(axk.bb);
      }

      @Override
      public int ak_() {
         return 1;
      }
   };
   private final cvh.a v;
   private final cvp w;
   private final cvo x;

   public cvh(int $$0, btz $$1) {
      this($$0, $$1, new cwy(3), cvp.a);
   }

   public cvh(int $$0, btz $$1, cvo $$2, cvp $$3) {
      super(cwl.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new cvh.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(crj $$0) {
      super.a($$0);
      if (!$$0.dU().C) {
         czk $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(crj $$0) {
      return a(this.w, $$0, dmo.gn);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public czk b(crj $$0, int $$1) {
      czk $$2 = czk.k;
      cwz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return czk.k;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.M() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return czk.k;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return czk.k;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return czk.k;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return czk.k;
         }

         if ($$4.f()) {
            $$3.e(czk.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czk.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable jf<bvk> $$0) {
      return $$0 == null ? 0 : mg.d.t().a($$0) + 1;
   }

   @Nullable
   public static jf<bvk> e(int $$0) {
      return $$0 == 0 ? null : mg.d.t().a($$0 - 1);
   }

   @Nullable
   public jf<bvk> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public jf<bvk> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<jf<bvk>> $$0, Optional<jf<bvk>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(djh::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   static class a extends cwz {
      public a(btz $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(czk $$0) {
         return $$0.a(axk.bb);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
