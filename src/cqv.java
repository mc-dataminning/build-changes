import java.util.Optional;
import javax.annotation.Nullable;

public class cqv extends cqq {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final brd u = new brr(1) {
      @Override
      public boolean b(int $$0, cvl $$1) {
         return $$1.a(axb.aW);
      }

      @Override
      public int ak_() {
         return 1;
      }
   };
   private final cqv.a v;
   private final crd w;
   private final crc x;

   public cqv(int $$0, brd $$1) {
      this($$0, $$1, new csm(3), crd.a);
   }

   public cqv(int $$0, brd $$1, crc $$2, crd $$3) {
      super(crz.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new cqv.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(cnp $$0) {
      super.a($$0);
      if (!$$0.dS().B) {
         cvl $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(cnp $$0) {
      return a(this.w, $$0, dgx.fO);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public cvl b(cnp $$0, int $$1) {
      cvl $$2 = cvl.k;
      csn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvl $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cvl.k;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.J() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cvl.k;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cvl.k;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cvl.k;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cvl.k;
         }

         if ($$4.f()) {
            $$3.e(cvl.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvl.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable jn<bso> $$0) {
      return $$0 == null ? 0 : lu.d.t().a($$0) + 1;
   }

   @Nullable
   public static jn<bso> e(int $$0) {
      return $$0 == 0 ? null : lu.d.t().a($$0 - 1);
   }

   @Nullable
   public jn<bso> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public jn<bso> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<jn<bso>> $$0, Optional<jn<bso>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(dds::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   class a extends csn {
      public a(final brd $$0, final int $$1, final int $$2, final int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cvl $$0) {
         return $$0.a(axb.aW);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
