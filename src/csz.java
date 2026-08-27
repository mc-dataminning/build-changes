import javax.annotation.Nullable;

public class csz extends cvg {
   public static final dfv a = dfu.w;
   private static final int J = 1;
   private static final int K = 2;
   protected static final int b = 2;
   protected static final int c = 3;
   protected static final eib d = csq.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eib e = csq.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eib f = csq.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final eib g = csq.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final eib h = csq.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final eib i = csq.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final eib j = csq.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eib k = csq.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final eib l = csq.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eib m = csq.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eib n = csq.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final eib D = csq.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final eib E = csq.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final eib F = csq.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final eib G = csq.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eib H = csq.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dft L;
   private final int M;
   private final boolean N;

   protected csz(dfd.d $$0, dft $$1, int $$2, boolean $$3) {
      super($$0.a($$1.d()));
      this.L = $$1;
      this.k(this.C.b().a(aC, hc.c).a(a, Boolean.valueOf(false)).a(I, dfp.b));
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      hc $$4 = $$0.c(aC);
      boolean $$5 = $$0.c(a);
      switch ((dfp)$$0.c(I)) {
         case a:
            if ($$4.o() == hc.a.a) {
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
            if ($$4.o() == hc.a.a) {
               return $$5 ? l : d;
            } else {
               return $$5 ? m : e;
            }
      }
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$0.c(a)) {
         return bgt.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, djo.a, $$2);
         return bgt.a($$1.B);
      }
   }

   public void d(dfe $$0, cpq $$1, gw $$2) {
      $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.M);
   }

   protected void a(@Nullable cbp $$0, cpr $$1, gw $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), apa.e);
   }

   protected aoy a(boolean $$0) {
      return $$0 ? this.L.l() : this.L.k();
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(a)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$0.c(a) ? 15 : 0;
   }

   @Override
   public int b(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$0.c(a) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dfe $$0) {
      return true;
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if (!$$1.B && this.N && !$$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dfe $$0, cpq $$1, gw $$2) {
      cbv $$3 = this.N ? $$1.a(cbv.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(a);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? djo.a : djo.e, $$2);
      }

      if ($$4) {
         $$1.a(new gw($$2), this, this.M);
      }
   }

   private void f(dfe $$0, cpq $$1, gw $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(aC, a, I);
   }
}
