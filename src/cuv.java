import java.util.Optional;
import javax.annotation.Nullable;

public class cuv extends cuq {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final btu u = new bui(1) {
      @Override
      public boolean b(int $$0, cyy $$1) {
         return $$1.a(axk.ba);
      }

      @Override
      public int aj_() {
         return 1;
      }
   };
   private final cuv.a v;
   private final cvd w;
   private final cvc x;

   public cuv(int $$0, btu $$1) {
      this($$0, $$1, new cwm(3), cvd.a);
   }

   public cuv(int $$0, btu $$1, cvc $$2, cvd $$3) {
      super(cvz.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new cuv.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(cqy $$0) {
      super.a($$0);
      if (!$$0.dV().C) {
         cyy $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(cqy $$0) {
      return a(this.w, $$0, dmc.gk);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public cyy b(cqy $$0, int $$1) {
      cyy $$2 = cyy.k;
      cwn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cyy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cyy.k;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.M() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cyy.k;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cyy.k;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cyy.k;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cyy.k;
         }

         if ($$4.f()) {
            $$3.e(cyy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cyy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable je<bvf> $$0) {
      return $$0 == null ? 0 : mf.d.t().a($$0) + 1;
   }

   @Nullable
   public static je<bvf> e(int $$0) {
      return $$0 == 0 ? null : mf.d.t().a($$0 - 1);
   }

   @Nullable
   public je<bvf> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public je<bvf> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<je<bvf>> $$0, Optional<je<bvf>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(div::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   static class a extends cwn {
      public a(btu $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cyy $$0) {
         return $$0.a(axk.ba);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
