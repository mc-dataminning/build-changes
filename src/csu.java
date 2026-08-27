import javax.annotation.Nullable;

public class csu extends cvb {
   public static final dfq a = dfp.w;
   private static final int J = 1;
   private static final int K = 2;
   protected static final int b = 2;
   protected static final int c = 3;
   protected static final ehw d = csl.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ehw e = csl.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ehw f = csl.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ehw g = csl.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ehw h = csl.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ehw i = csl.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ehw j = csl.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ehw k = csl.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ehw l = csl.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ehw m = csl.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ehw n = csl.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ehw D = csl.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ehw E = csl.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ehw F = csl.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ehw G = csl.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ehw H = csl.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dfo L;
   private final int M;
   private final boolean N;

   protected csu(dey.d $$0, dfo $$1, int $$2, boolean $$3) {
      super($$0.a($$1.d()));
      this.L = $$1;
      this.k(this.C.b().a(aC, ha.c).a(a, Boolean.valueOf(false)).a(I, dfk.b));
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      ha $$4 = $$0.c(aC);
      boolean $$5 = $$0.c(a);
      switch ((dfk)$$0.c(I)) {
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
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$0.c(a)) {
         return bgq.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, djj.a, $$2);
         return bgq.a($$1.B);
      }
   }

   public void d(dez $$0, cpl $$1, gu $$2) {
      $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.M);
   }

   protected void a(@Nullable cbm $$0, cpm $$1, gu $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), aox.e);
   }

   protected aov a(boolean $$0) {
      return $$0 ? this.L.l() : this.L.k();
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(a)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.c(a) ? 15 : 0;
   }

   @Override
   public int b(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.c(a) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dez $$0) {
      return true;
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      if (!$$1.B && this.N && !$$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dez $$0, cpl $$1, gu $$2) {
      cbs $$3 = this.N ? $$1.a(cbs.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(a);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? djj.a : djj.e, $$2);
      }

      if ($$4) {
         $$1.a(new gu($$2), this, this.M);
      }
   }

   private void f(dez $$0, cpl $$1, gu $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(aC, a, I);
   }
}
