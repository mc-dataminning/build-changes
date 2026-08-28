import java.util.Optional;
import javax.annotation.Nullable;

public class csi extends csd {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final bse u = new bss(1) {
      @Override
      public boolean b(int $$0, cwq $$1) {
         return $$1.a(awy.ba);
      }

      @Override
      public int an_() {
         return 1;
      }
   };
   private final csi.a v;
   private final csq w;
   private final csp x;

   public csi(int $$0, bse $$1) {
      this($$0, $$1, new ctz(3), csq.a);
   }

   public csi(int $$0, bse $$1, csp $$2, csq $$3) {
      super(ctm.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new csi.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(coy $$0) {
      super.a($$0);
      if (!$$0.dV().C) {
         cwq $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(coy $$0) {
      return a(this.w, $$0, djp.gj);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwq $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cwq.j;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.M() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cwq.j;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cwq.j;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cwq.j;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cwq.j;
         }

         if ($$4.f()) {
            $$3.e(cwq.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwq.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable jr<btp> $$0) {
      return $$0 == null ? 0 : mb.d.t().a($$0) + 1;
   }

   @Nullable
   public static jr<btp> e(int $$0) {
      return $$0 == 0 ? null : mb.d.t().a($$0 - 1);
   }

   @Nullable
   public jr<btp> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public jr<btp> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<jr<btp>> $$0, Optional<jr<btp>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(dgj::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   static class a extends cua {
      public a(bse $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwq $$0) {
         return $$0.a(awy.ba);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
