import javax.annotation.Nullable;

public class cte extends cvl {
   public static final dga a = dfz.w;
   private static final int J = 1;
   private static final int K = 2;
   protected static final int b = 2;
   protected static final int c = 3;
   protected static final eig d = csv.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eig e = csv.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eig f = csv.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final eig g = csv.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final eig h = csv.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final eig i = csv.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final eig j = csv.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eig k = csv.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final eig l = csv.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eig m = csv.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eig n = csv.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final eig D = csv.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final eig E = csv.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final eig F = csv.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final eig G = csv.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eig H = csv.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dfy L;
   private final int M;
   private final boolean N;

   protected cte(dfi.d $$0, dfy $$1, int $$2, boolean $$3) {
      super($$0.a($$1.d()));
      this.L = $$1;
      this.k(this.C.b().a(aC, ha.c).a(a, Boolean.valueOf(false)).a(I, dfu.b));
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      ha $$4 = $$0.c(aC);
      boolean $$5 = $$0.c(a);
      switch ((dfu)$$0.c(I)) {
         case a:
            if ($$4.o() == ha.a.a) {
               return $$5 ? n : f;
            }

            return $$5 ? D : g;
         case b:
            return switch ($$4) {
               case f -> $$5 ? H : k;
               case e -> $$5 ? G : j;
               case d -> $$5 ? F : i;
               case c, b, a -> $$5 ? E : h;
            };
         case c:
         default:
            if ($$4.o() == ha.a.a) {
               return $$5 ? l : d;
            } else {
               return $$5 ? m : e;
            }
      }
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$0.c(a)) {
         return bgy.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, djt.a, $$2);
         return bgy.a($$1.B);
      }
   }

   public void d(dfj $$0, cpv $$1, gw $$2) {
      $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.M);
   }

   protected void a(@Nullable cbu $$0, cpw $$1, gw $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), ape.e);
   }

   protected apc a(boolean $$0) {
      return $$0 ? this.L.l() : this.L.k();
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(a)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dfj $$0, cpb $$1, gw $$2, ha $$3) {
      return $$0.c(a) ? 15 : 0;
   }

   @Override
   public int b(dfj $$0, cpb $$1, gw $$2, ha $$3) {
      return $$0.c(a) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dfj $$0) {
      return true;
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if ($$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if (!$$1.B && this.N && !$$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dfj $$0, cpv $$1, gw $$2) {
      cca $$3 = this.N ? $$1.a(cca.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(a);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? djt.a : djt.e, $$2);
      }

      if ($$4) {
         $$1.a(new gw($$2), this, this.M);
      }
   }

   private void f(dfj $$0, cpv $$1, gw $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(aC, a, I);
   }
}
