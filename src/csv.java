import javax.annotation.Nullable;

public class csv extends cvc {
   public static final dfr a = dfq.w;
   private static final int J = 1;
   private static final int K = 2;
   protected static final int b = 2;
   protected static final int c = 3;
   protected static final ehx d = csm.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ehx e = csm.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ehx f = csm.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ehx g = csm.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ehx h = csm.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ehx i = csm.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ehx j = csm.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ehx k = csm.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ehx l = csm.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ehx m = csm.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ehx n = csm.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ehx D = csm.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ehx E = csm.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ehx F = csm.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ehx G = csm.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ehx H = csm.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dfp L;
   private final int M;
   private final boolean N;

   protected csv(dez.d $$0, dfp $$1, int $$2, boolean $$3) {
      super($$0.a($$1.d()));
      this.L = $$1;
      this.k(this.C.b().a(aC, ha.c).a(a, Boolean.valueOf(false)).a(I, dfl.b));
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      ha $$4 = $$0.c(aC);
      boolean $$5 = $$0.c(a);
      switch ((dfl)$$0.c(I)) {
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
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$0.c(a)) {
         return bgq.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, djk.a, $$2);
         return bgq.a($$1.B);
      }
   }

   public void d(dfa $$0, cpm $$1, gu $$2) {
      $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.M);
   }

   protected void a(@Nullable cbn $$0, cpn $$1, gu $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), aox.e);
   }

   protected aov a(boolean $$0) {
      return $$0 ? this.L.l() : this.L.k();
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(a)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$0.c(a) ? 15 : 0;
   }

   @Override
   public int b(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$0.c(a) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dfa $$0) {
      return true;
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      if (!$$1.B && this.N && !$$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dfa $$0, cpm $$1, gu $$2) {
      cbt $$3 = this.N ? $$1.a(cbt.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(a);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? djk.a : djk.e, $$2);
      }

      if ($$4) {
         $$1.a(new gu($$2), this, this.M);
      }
   }

   private void f(dfa $$0, cpm $$1, gu $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(aC, a, I);
   }
}
