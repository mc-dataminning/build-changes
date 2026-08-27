import java.util.Map;
import java.util.function.Predicate;

public class cxd extends crq {
   public static final int c = 1;
   public static final int d = 3;
   public static final dgl e = dgb.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   public static final Predicate<cqv.c> f = $$0 -> $$0 == cqv.c.b;
   public static final Predicate<cqv.c> g = $$0 -> $$0 == cqv.c.c;
   private final Predicate<cqv.c> j;

   public cxd(dfk.d $$0, Predicate<cqv.c> $$1, Map<cjc, id> $$2) {
      super($$0, $$2);
      this.j = $$1;
      this.k(this.C.b().a(e, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dfl $$0) {
      return $$0.c(e) == 3;
   }

   @Override
   protected boolean a(ean $$0) {
      return $$0 == eap.c && this.j == f;
   }

   @Override
   protected double b(dfl $$0) {
      return (6.0 + (double)$$0.c(e).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if (!$$1.B && $$3.bM() && this.a($$0, $$2, $$3)) {
         $$3.ay();
         if ($$3.a($$1, $$2)) {
            this.d($$0, $$1, $$2);
         }
      }
   }

   protected void d(dfl $$0, cpx $$1, gw $$2) {
      e($$0, $$1, $$2);
   }

   public static void e(dfl $$0, cpx $$1, gw $$2) {
      int $$3 = $$0.c(e) - 1;
      dfl $$4 = $$3 == 0 ? csy.ft.n() : $$0.a(e, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(djv.c, $$2, djv.a.a($$4));
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, cqv.c $$3) {
      if (ctr.a($$1, $$3) && $$0.c(e) != 3 && this.j.test($$3)) {
         dfl $$4 = $$0.a(e);
         $$1.b($$2, $$4);
         $$1.a(djv.c, $$2, djv.a.a($$4));
      }
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(e);
   }

   @Override
   protected void a(dfl $$0, cpx $$1, gw $$2, ean $$3) {
      if (!this.d($$0)) {
         dfl $$4 = $$0.a(e, Integer.valueOf($$0.c(e) + 1));
         $$1.b($$2, $$4);
         $$1.a(djv.c, $$2, djv.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
