import java.util.Map;
import java.util.function.Predicate;

public class cwq extends crd {
   public static final int c = 1;
   public static final int d = 3;
   public static final dfy e = dfo.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   public static final Predicate<cqi.c> f = $$0 -> $$0 == cqi.c.b;
   public static final Predicate<cqi.c> g = $$0 -> $$0 == cqi.c.c;
   private final Predicate<cqi.c> j;

   public cwq(dex.d $$0, Predicate<cqi.c> $$1, Map<cir, ic> $$2) {
      super($$0, $$2);
      this.j = $$1;
      this.k(this.C.b().a(e, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dey $$0) {
      return $$0.c(e) == 3;
   }

   @Override
   protected boolean a(eaa $$0) {
      return $$0 == eac.c && this.j == f;
   }

   @Override
   protected double b(dey $$0) {
      return (6.0 + (double)$$0.c(e).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if (!$$1.B && $$3.bM() && this.a($$0, $$2, $$3)) {
         $$3.ay();
         if ($$3.a($$1, $$2)) {
            this.d($$0, $$1, $$2);
         }
      }
   }

   protected void d(dey $$0, cpk $$1, gv $$2) {
      e($$0, $$1, $$2);
   }

   public static void e(dey $$0, cpk $$1, gv $$2) {
      int $$3 = $$0.c(e) - 1;
      dey $$4 = $$3 == 0 ? csl.ft.n() : $$0.a(e, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dji.c, $$2, dji.a.a($$4));
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, cqi.c $$3) {
      if (cte.a($$1, $$3) && $$0.c(e) != 3 && this.j.test($$3)) {
         dey $$4 = $$0.a(e);
         $$1.b($$2, $$4);
         $$1.a(dji.c, $$2, dji.a.a($$4));
      }
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(e);
   }

   @Override
   protected void a(dey $$0, cpk $$1, gv $$2, eaa $$3) {
      if (!this.d($$0)) {
         dey $$4 = $$0.a(e, Integer.valueOf($$0.c(e) + 1));
         $$1.b($$2, $$4);
         $$1.a(dji.c, $$2, dji.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
