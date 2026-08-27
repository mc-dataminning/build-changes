import java.util.Map;
import java.util.function.Predicate;

public class cww extends crj {
   public static final int c = 1;
   public static final int d = 3;
   public static final dge e = dfu.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   public static final Predicate<cqo.c> f = $$0 -> $$0 == cqo.c.b;
   public static final Predicate<cqo.c> g = $$0 -> $$0 == cqo.c.c;
   private final Predicate<cqo.c> j;

   public cww(dfd.d $$0, Predicate<cqo.c> $$1, Map<civ, id> $$2) {
      super($$0, $$2);
      this.j = $$1;
      this.k(this.C.b().a(e, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dfe $$0) {
      return $$0.c(e) == 3;
   }

   @Override
   protected boolean a(eag $$0) {
      return $$0 == eai.c && this.j == f;
   }

   @Override
   protected double b(dfe $$0) {
      return (6.0 + (double)$$0.c(e).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if (!$$1.B && $$3.bM() && this.a($$0, $$2, $$3)) {
         $$3.ay();
         if ($$3.a($$1, $$2)) {
            this.d($$0, $$1, $$2);
         }
      }
   }

   protected void d(dfe $$0, cpq $$1, gw $$2) {
      e($$0, $$1, $$2);
   }

   public static void e(dfe $$0, cpq $$1, gw $$2) {
      int $$3 = $$0.c(e) - 1;
      dfe $$4 = $$3 == 0 ? csr.ft.n() : $$0.a(e, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(djo.c, $$2, djo.a.a($$4));
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, cqo.c $$3) {
      if (ctk.a($$1, $$3) && $$0.c(e) != 3 && this.j.test($$3)) {
         dfe $$4 = $$0.a(e);
         $$1.b($$2, $$4);
         $$1.a(djo.c, $$2, djo.a.a($$4));
      }
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(e);
   }

   @Override
   protected void a(dfe $$0, cpq $$1, gw $$2, eag $$3) {
      if (!this.d($$0)) {
         dfe $$4 = $$0.a(e, Integer.valueOf($$0.c(e) + 1));
         $$1.b($$2, $$4);
         $$1.a(djo.c, $$2, djo.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
