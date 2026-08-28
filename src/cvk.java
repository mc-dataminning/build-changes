import java.util.Optional;
import javax.annotation.Nullable;

public class cvk extends cvf {
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
      public boolean b(int $$0, czn $$1) {
         return $$1.a(axk.bb);
      }

      @Override
      public int ak_() {
         return 1;
      }
   };
   private final cvk.a v;
   private final cvs w;
   private final cvr x;

   public cvk(int $$0, btz $$1) {
      this($$0, $$1, new cxb(3), cvs.a);
   }

   public cvk(int $$0, btz $$1, cvr $$2, cvs $$3) {
      super(cwo.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new cvk.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(crm $$0) {
      super.a($$0);
      if (!$$0.dU().C) {
         czn $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(crm $$0) {
      return a(this.w, $$0, dmt.gn);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public czn b(crm $$0, int $$1) {
      czn $$2 = czn.k;
      cxc $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czn $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return czn.k;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.M() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return czn.k;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return czn.k;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return czn.k;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return czn.k;
         }

         if ($$4.f()) {
            $$3.e(czn.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czn.k;
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
         this.w.a(djm::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   static class a extends cxc {
      public a(btz $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(czn $$0) {
         return $$0.a(axk.bb);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
