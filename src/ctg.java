import javax.annotation.Nullable;

public class ctg extends cvn {
   public static final dgc a = dgb.w;
   private static final int J = 1;
   private static final int K = 2;
   protected static final int b = 2;
   protected static final int c = 3;
   protected static final eii d = csx.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eii e = csx.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eii f = csx.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final eii g = csx.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final eii h = csx.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final eii i = csx.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final eii j = csx.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eii k = csx.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final eii l = csx.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eii m = csx.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eii n = csx.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final eii D = csx.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final eii E = csx.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final eii F = csx.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final eii G = csx.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eii H = csx.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dga L;
   private final int M;
   private final boolean N;

   protected ctg(dfk.d $$0, dga $$1, int $$2, boolean $$3) {
      super($$0.a($$1.d()));
      this.L = $$1;
      this.k(this.C.b().a(aC, hc.c).a(a, Boolean.valueOf(false)).a(I, dfw.b));
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      hc $$4 = $$0.c(aC);
      boolean $$5 = $$0.c(a);
      switch ((dfw)$$0.c(I)) {
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
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$0.c(a)) {
         return bha.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, djv.a, $$2);
         return bha.a($$1.B);
      }
   }

   public void d(dfl $$0, cpx $$1, gw $$2) {
      $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.M);
   }

   protected void a(@Nullable cbw $$0, cpy $$1, gw $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), apg.e);
   }

   protected ape a(boolean $$0) {
      return $$0 ? this.L.l() : this.L.k();
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(a)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(a) ? 15 : 0;
   }

   @Override
   public int b(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(a) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dfl $$0) {
      return true;
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if (!$$1.B && this.N && !$$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dfl $$0, cpx $$1, gw $$2) {
      ccc $$3 = this.N ? $$1.a(ccc.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(a);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? djv.a : djv.e, $$2);
      }

      if ($$4) {
         $$1.a(new gw($$2), this, this.M);
      }
   }

   private void f(dfl $$0, cpx $$1, gw $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(aC, a, I);
   }
}
