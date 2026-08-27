import javax.annotation.Nullable;

public class cst extends cva {
   public static final dfp a = dfo.w;
   private static final int J = 1;
   private static final int K = 2;
   protected static final int b = 2;
   protected static final int c = 3;
   protected static final ehy d = csk.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ehy e = csk.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ehy f = csk.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ehy g = csk.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ehy h = csk.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ehy i = csk.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ehy j = csk.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ehy k = csk.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ehy l = csk.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ehy m = csk.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ehy n = csk.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ehy D = csk.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ehy E = csk.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ehy F = csk.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ehy G = csk.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ehy H = csk.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dfn L;
   private final int M;
   private final boolean N;

   protected cst(dex.d $$0, dfn $$1, int $$2, boolean $$3) {
      super($$0.a($$1.d()));
      this.L = $$1;
      this.k(this.C.b().a(aC, hb.c).a(a, Boolean.valueOf(false)).a(I, dfj.b));
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      hb $$4 = $$0.c(aC);
      boolean $$5 = $$0.c(a);
      switch ((dfj)$$0.c(I)) {
         case a:
            if ($$4.o() == hb.a.a) {
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
            if ($$4.o() == hb.a.a) {
               return $$5 ? l : d;
            } else {
               return $$5 ? m : e;
            }
      }
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$0.c(a)) {
         return bgo.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dji.a, $$2);
         return bgo.a($$1.B);
      }
   }

   public void d(dey $$0, cpk $$1, gv $$2) {
      $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.M);
   }

   protected void a(@Nullable cbl $$0, cpl $$1, gv $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), aov.e);
   }

   protected aot a(boolean $$0) {
      return $$0 ? this.L.l() : this.L.k();
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(a)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.c(a) ? 15 : 0;
   }

   @Override
   public int b(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.c(a) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dey $$0) {
      return true;
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if (!$$1.B && this.N && !$$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dey $$0, cpk $$1, gv $$2) {
      cbr $$3 = this.N ? $$1.a(cbr.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(a);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dji.a : dji.e, $$2);
      }

      if ($$4) {
         $$1.a(new gv($$2), this, this.M);
      }
   }

   private void f(dey $$0, cpk $$1, gv $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(aC, a, I);
   }
}
