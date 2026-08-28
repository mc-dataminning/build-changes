import java.util.Optional;
import javax.annotation.Nullable;

public class cse extends crz {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final bsd u = new bsr(1) {
      @Override
      public boolean b(int $$0, cwm $$1) {
         return $$1.a(axl.bb);
      }

      @Override
      public int an_() {
         return 1;
      }
   };
   private final cse.a v;
   private final csm w;
   private final csl x;

   public cse(int $$0, bsd $$1) {
      this($$0, $$1, new ctv(3), csm.a);
   }

   public cse(int $$0, bsd $$1, csl $$2, csm $$3) {
      super(cti.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new cse.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(cou $$0) {
      super.a($$0);
      if (!$$0.dV().C) {
         cwm $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(cou $$0) {
      return a(this.w, $$0, dis.fO);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cwm.k;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.L() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cwm.k;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cwm.k;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cwm.k;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cwm.k;
         }

         if ($$4.f()) {
            $$3.e(cwm.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwm.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable jq<bto> $$0) {
      return $$0 == null ? 0 : lz.d.t().a($$0) + 1;
   }

   @Nullable
   public static jq<bto> e(int $$0) {
      return $$0 == 0 ? null : lz.d.t().a($$0 - 1);
   }

   @Nullable
   public jq<bto> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public jq<bto> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<jq<bto>> $$0, Optional<jq<bto>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(dfm::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   class a extends ctw {
      public a(final bsd $$0, final int $$1, final int $$2, final int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwm $$0) {
         return $$0.a(axl.bb);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
