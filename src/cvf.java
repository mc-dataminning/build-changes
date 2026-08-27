import javax.annotation.Nullable;

public class cvf extends csm {
   public static final dga a = dfq.aQ;
   protected static final ehx b = csm.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int c = 7;

   protected cvf(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$1 == ha.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      dfa $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cvh || $$3.b() instanceof des;
   }

   @Override
   public dfa a(clg $$0) {
      return !this.n().a((cpp)$$0.q(), $$0.a()) ? csn.j.n() : super.a($$0);
   }

   @Override
   public boolean g_(dfa $$0) {
      return true;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return b;
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      int $$4 = $$0.c(a);
      if (!a((cpp)$$1, $$2) && !$$1.q($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(a, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cos)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cpm $$0, dfa $$1, gu $$2, bii $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof biy && ($$3 instanceof cbn || $$0.X().b(cpi.c)) && $$3.df() * $$3.df() * $$3.dg() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bii $$0, dfa $$1, cpm $$2, gu $$3) {
      dfa $$4 = a($$1, csn.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(djk.c, $$3, djk.a.a($$0, $$4));
   }

   private static boolean a(cos $$0, gu $$1) {
      return $$0.a_($$1.c()).a(apl.cp);
   }

   private static boolean a(cpp $$0, gu $$1) {
      for (gu $$2 : gu.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(apq.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
