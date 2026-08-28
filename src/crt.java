import java.util.Optional;
import javax.annotation.Nullable;

public class crt extends cro {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final brw u = new bsk(1) {
      @Override
      public boolean b(int $$0, cwb $$1) {
         return $$1.a(axj.ba);
      }

      @Override
      public int am_() {
         return 1;
      }
   };
   private final crt.a v;
   private final csb w;
   private final csa x;

   public crt(int $$0, brw $$1) {
      this($$0, $$1, new ctk(3), csb.a);
   }

   public crt(int $$0, brw $$1, csa $$2, csb $$3) {
      super(csx.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new crt.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(com $$0) {
      super.a($$0);
      if (!$$0.dX().C) {
         cwb $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(com $$0) {
      return a(this.w, $$0, dig.fO);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public cwb b(com $$0, int $$1) {
      cwb $$2 = cwb.k;
      ctl $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwb $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cwb.k;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.L() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cwb.k;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cwb.k;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cwb.k;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cwb.k;
         }

         if ($$4.f()) {
            $$3.e(cwb.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwb.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable jq<bth> $$0) {
      return $$0 == null ? 0 : ly.d.t().a($$0) + 1;
   }

   @Nullable
   public static jq<bth> e(int $$0) {
      return $$0 == 0 ? null : ly.d.t().a($$0 - 1);
   }

   @Nullable
   public jq<bth> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public jq<bth> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<jq<bth>> $$0, Optional<jq<bth>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(dfb::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   class a extends ctl {
      public a(final brw $$0, final int $$1, final int $$2, final int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwb $$0) {
         return $$0.a(axj.ba);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
