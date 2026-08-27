import java.util.Map;
import java.util.function.Predicate;

public class cwr extends cre {
   public static final int c = 1;
   public static final int d = 3;
   public static final dfz e = dfp.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   public static final Predicate<cqj.c> f = $$0 -> $$0 == cqj.c.b;
   public static final Predicate<cqj.c> g = $$0 -> $$0 == cqj.c.c;
   private final Predicate<cqj.c> j;

   public cwr(dey.d $$0, Predicate<cqj.c> $$1, Map<cis, ib> $$2) {
      super($$0, $$2);
      this.j = $$1;
      this.k(this.C.b().a(e, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dez $$0) {
      return $$0.c(e) == 3;
   }

   @Override
   protected boolean a(eab $$0) {
      return $$0 == ead.c && this.j == f;
   }

   @Override
   protected double b(dez $$0) {
      return (6.0 + (double)$$0.c(e).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      if (!$$1.B && $$3.bM() && this.a($$0, $$2, $$3)) {
         $$3.ay();
         if ($$3.a($$1, $$2)) {
            this.d($$0, $$1, $$2);
         }
      }
   }

   protected void d(dez $$0, cpl $$1, gu $$2) {
      e($$0, $$1, $$2);
   }

   public static void e(dez $$0, cpl $$1, gu $$2) {
      int $$3 = $$0.c(e) - 1;
      dez $$4 = $$3 == 0 ? csm.ft.n() : $$0.a(e, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(djj.c, $$2, djj.a.a($$4));
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, cqj.c $$3) {
      if (ctf.a($$1, $$3) && $$0.c(e) != 3 && this.j.test($$3)) {
         dez $$4 = $$0.a(e);
         $$1.b($$2, $$4);
         $$1.a(djj.c, $$2, djj.a.a($$4));
      }
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(e);
   }

   @Override
   protected void a(dez $$0, cpl $$1, gu $$2, eab $$3) {
      if (!this.d($$0)) {
         dez $$4 = $$0.a(e, Integer.valueOf($$0.c(e) + 1));
         $$1.b($$2, $$4);
         $$1.a(djj.c, $$2, djj.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
