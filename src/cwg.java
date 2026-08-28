import java.util.Optional;
import javax.annotation.Nullable;

public class cwg extends cwb {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final buv u = new bvj(1) {
      @Override
      public boolean b(int $$0, dak $$1) {
         return $$1.a(axv.bc);
      }

      @Override
      public int ap_() {
         return 1;
      }
   };
   private final cwg.a v;
   private final cwo w;
   private final cwn x;

   public cwg(int $$0, buv $$1) {
      this($$0, $$1, new cxy(3), cwo.a);
   }

   public cwg(int $$0, buv $$1, cwn $$2, cwo $$3) {
      super(cxk.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new cwg.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(csi $$0) {
      super.a($$0);
      if (!$$0.dV().C) {
         dak $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(csi $$0) {
      return a(this.w, $$0, dnq.gn);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public dak b(csi $$0, int $$1) {
      dak $$2 = dak.l;
      cxz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dak $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return dak.l;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.M() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return dak.l;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return dak.l;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return dak.l;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return dak.l;
         }

         if ($$4.f()) {
            $$3.e(dak.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dak.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable jg<bwg> $$0) {
      return $$0 == null ? 0 : mh.d.t().a($$0) + 1;
   }

   @Nullable
   public static jg<bwg> e(int $$0) {
      return $$0 == 0 ? null : mh.d.t().a($$0 - 1);
   }

   @Nullable
   public jg<bwg> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public jg<bwg> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<jg<bwg>> $$0, Optional<jg<bwg>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(dkj::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   static class a extends cxz {
      public a(buv $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(dak $$0) {
         return $$0.a(axv.bc);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
