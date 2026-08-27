import java.util.Map;
import java.util.function.Predicate;

public class cws extends crf {
   public static final int c = 1;
   public static final int d = 3;
   public static final dga e = dfq.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   public static final Predicate<cqk.c> f = $$0 -> $$0 == cqk.c.b;
   public static final Predicate<cqk.c> g = $$0 -> $$0 == cqk.c.c;
   private final Predicate<cqk.c> j;

   public cws(dez.d $$0, Predicate<cqk.c> $$1, Map<cit, ib> $$2) {
      super($$0, $$2);
      this.j = $$1;
      this.k(this.C.b().a(e, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dfa $$0) {
      return $$0.c(e) == 3;
   }

   @Override
   protected boolean a(eac $$0) {
      return $$0 == eae.c && this.j == f;
   }

   @Override
   protected double b(dfa $$0) {
      return (6.0 + (double)$$0.c(e).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      if (!$$1.B && $$3.bM() && this.a($$0, $$2, $$3)) {
         $$3.ay();
         if ($$3.a($$1, $$2)) {
            this.d($$0, $$1, $$2);
         }
      }
   }

   protected void d(dfa $$0, cpm $$1, gu $$2) {
      e($$0, $$1, $$2);
   }

   public static void e(dfa $$0, cpm $$1, gu $$2) {
      int $$3 = $$0.c(e) - 1;
      dfa $$4 = $$3 == 0 ? csn.ft.n() : $$0.a(e, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(djk.c, $$2, djk.a.a($$4));
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, cqk.c $$3) {
      if (ctg.a($$1, $$3) && $$0.c(e) != 3 && this.j.test($$3)) {
         dfa $$4 = $$0.a(e);
         $$1.b($$2, $$4);
         $$1.a(djk.c, $$2, djk.a.a($$4));
      }
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(e);
   }

   @Override
   protected void a(dfa $$0, cpm $$1, gu $$2, eac $$3) {
      if (!this.d($$0)) {
         dfa $$4 = $$0.a(e, Integer.valueOf($$0.c(e) + 1));
         $$1.b($$2, $$4);
         $$1.a(djk.c, $$2, djk.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
