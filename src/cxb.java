import java.util.Map;
import java.util.function.Predicate;

public class cxb extends cro {
   public static final int c = 1;
   public static final int d = 3;
   public static final dgj e = dfz.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   public static final Predicate<cqt.c> f = $$0 -> $$0 == cqt.c.b;
   public static final Predicate<cqt.c> g = $$0 -> $$0 == cqt.c.c;
   private final Predicate<cqt.c> j;

   public cxb(dfi.d $$0, Predicate<cqt.c> $$1, Map<cja, id> $$2) {
      super($$0, $$2);
      this.j = $$1;
      this.k(this.C.b().a(e, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dfj $$0) {
      return $$0.c(e) == 3;
   }

   @Override
   protected boolean a(eal $$0) {
      return $$0 == ean.c && this.j == f;
   }

   @Override
   protected double b(dfj $$0) {
      return (6.0 + (double)$$0.c(e).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if (!$$1.B && $$3.bN() && this.a($$0, $$2, $$3)) {
         $$3.az();
         if ($$3.a($$1, $$2)) {
            this.d($$0, $$1, $$2);
         }
      }
   }

   protected void d(dfj $$0, cpv $$1, gw $$2) {
      e($$0, $$1, $$2);
   }

   public static void e(dfj $$0, cpv $$1, gw $$2) {
      int $$3 = $$0.c(e) - 1;
      dfj $$4 = $$3 == 0 ? csw.ft.n() : $$0.a(e, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(djt.c, $$2, djt.a.a($$4));
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, cqt.c $$3) {
      if (ctp.a($$1, $$3) && $$0.c(e) != 3 && this.j.test($$3)) {
         dfj $$4 = $$0.a(e);
         $$1.b($$2, $$4);
         $$1.a(djt.c, $$2, djt.a.a($$4));
      }
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(e);
   }

   @Override
   protected void a(dfj $$0, cpv $$1, gw $$2, eal $$3) {
      if (!this.d($$0)) {
         dfj $$4 = $$0.a(e, Integer.valueOf($$0.c(e) + 1));
         $$1.b($$2, $$4);
         $$1.a(djt.c, $$2, djt.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
