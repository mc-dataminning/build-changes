import java.util.Optional;
import javax.annotation.Nullable;

public class csy extends cst {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final bst u = new bth(1) {
      @Override
      public boolean b(int $$0, cxg $$1) {
         return $$1.a(axt.bc);
      }

      @Override
      public int ao_() {
         return 1;
      }
   };
   private final csy.a v;
   private final ctg w;
   private final ctf x;

   public csy(int $$0, bst $$1) {
      this($$0, $$1, new cup(3), ctg.a);
   }

   public csy(int $$0, bst $$1, ctf $$2, ctg $$3) {
      super(cuc.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new csy.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(cpo $$0) {
      super.a($$0);
      if (!$$0.dW().C) {
         cxg $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(cpo $$0) {
      return a(this.w, $$0, dkf.gj);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      cxg $$2 = cxg.j;
      cuq $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxg $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cxg.j;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.M() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cxg.j;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cxg.j;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cxg.j;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cxg.j;
         }

         if ($$4.f()) {
            $$3.e(cxg.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxg.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable jq<bue> $$0) {
      return $$0 == null ? 0 : ma.d.t().a($$0) + 1;
   }

   @Nullable
   public static jq<bue> e(int $$0) {
      return $$0 == 0 ? null : ma.d.t().a($$0 - 1);
   }

   @Nullable
   public jq<bue> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public jq<bue> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<jq<bue>> $$0, Optional<jq<bue>> $$1) {
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

   class a extends cuq {
      public a(final bst $$0, final int $$1, final int $$2, final int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cxg $$0) {
         return $$0.a(axt.bc);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
