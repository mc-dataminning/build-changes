import java.util.Optional;
import javax.annotation.Nullable;

public class ctb extends csw {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final bsr u = new btf(1) {
      @Override
      public boolean b(int $$0, cxh $$1) {
         return $$1.a(awy.ba);
      }

      @Override
      public int an_() {
         return 1;
      }
   };
   private final ctb.a v;
   private final ctj w;
   private final cti x;

   public ctb(int $$0, bsr $$1) {
      this($$0, $$1, new cus(3), ctj.a);
   }

   public ctb(int $$0, bsr $$1, cti $$2, ctj $$3) {
      super(cuf.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new ctb.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(cpr $$0) {
      super.a($$0);
      if (!$$0.dU().C) {
         cxh $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(cpr $$0) {
      return a(this.w, $$0, dkg.gj);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public cxh b(cpr $$0, int $$1) {
      cxh $$2 = cxh.k;
      cut $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxh $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cxh.k;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.M() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cxh.k;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cxh.k;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cxh.k;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cxh.k;
         }

         if ($$4.f()) {
            $$3.e(cxh.k);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxh.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable jr<buc> $$0) {
      return $$0 == null ? 0 : mb.d.t().a($$0) + 1;
   }

   @Nullable
   public static jr<buc> e(int $$0) {
      return $$0 == 0 ? null : mb.d.t().a($$0 - 1);
   }

   @Nullable
   public jr<buc> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public jr<buc> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<jr<buc>> $$0, Optional<jr<buc>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(dgz::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   static class a extends cut {
      public a(bsr $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cxh $$0) {
         return $$0.a(awy.ba);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
