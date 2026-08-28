import java.util.Optional;
import javax.annotation.Nullable;

public class cup extends cuk {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final btr u = new buf(1) {
      @Override
      public boolean b(int $$0, cys $$1) {
         return $$1.a(axi.ba);
      }

      @Override
      public int aj_() {
         return 1;
      }
   };
   private final cup.a v;
   private final cux w;
   private final cuw x;

   public cup(int $$0, btr $$1) {
      this($$0, $$1, new cwg(3), cux.a);
   }

   public cup(int $$0, btr $$1, cuw $$2, cux $$3) {
      super(cvt.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new cup.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(cqs $$0) {
      super.a($$0);
      if (!$$0.dV().C) {
         cys $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(cqs $$0) {
      return a(this.w, $$0, dlw.gj);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cys $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cys.k;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.M() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cys.k;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cys.k;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cys.k;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cys.k;
         }

         if ($$4.f()) {
            $$3.e(cys.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cys.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable je<bvc> $$0) {
      return $$0 == null ? 0 : mf.d.t().a($$0) + 1;
   }

   @Nullable
   public static je<bvc> e(int $$0) {
      return $$0 == 0 ? null : mf.d.t().a($$0 - 1);
   }

   @Nullable
   public je<bvc> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public je<bvc> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<je<bvc>> $$0, Optional<je<bvc>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(dip::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   static class a extends cwh {
      public a(btr $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cys $$0) {
         return $$0.a(axi.ba);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
