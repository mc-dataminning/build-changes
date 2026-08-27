import javax.annotation.Nullable;

public class cpw extends csd {
   public static final dcs a = dcr.w;
   private static final int J = 1;
   private static final int K = 2;
   protected static final int b = 2;
   protected static final int c = 3;
   protected static final efb d = cpn.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final efb e = cpn.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final efb f = cpn.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final efb g = cpn.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final efb h = cpn.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final efb i = cpn.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final efb j = cpn.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final efb k = cpn.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final efb l = cpn.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final efb m = cpn.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final efb n = cpn.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final efb D = cpn.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final efb E = cpn.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final efb F = cpn.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final efb G = cpn.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final efb H = cpn.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dcq L;
   private final int M;
   private final boolean N;

   protected cpw(dca.d $$0, dcq $$1, int $$2, boolean $$3) {
      super($$0.a($$1.d()));
      this.L = $$1;
      this.k(this.C.b().a(aC, ha.c).a(a, Boolean.valueOf(false)).a(I, dcm.b));
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      ha $$4 = $$0.c(aC);
      boolean $$5 = $$0.c(a);
      switch ((dcm)$$0.c(I)) {
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
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$0.c(a)) {
         return bdx.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dgl.a, $$2);
         return bdx.a($$1.B);
      }
   }

   public void d(dcb $$0, cmm $$1, gu $$2) {
      $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.M);
   }

   protected void a(@Nullable byo $$0, cmn $$1, gu $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), ami.e);
   }

   protected amg a(boolean $$0) {
      return $$0 ? this.L.l() : this.L.k();
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(a)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return $$0.c(a) ? 15 : 0;
   }

   @Override
   public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return $$0.c(a) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dcb $$0) {
      return true;
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      if (!$$1.B && this.N && !$$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dcb $$0, cmm $$1, gu $$2) {
      byu $$3 = this.N ? $$1.a(byu.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(a);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dgl.a : dgl.e, $$2);
      }

      if ($$4) {
         $$1.a(new gu($$2), this, this.M);
      }
   }

   private void f(dcb $$0, cmm $$1, gu $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(aC, a, I);
   }
}
