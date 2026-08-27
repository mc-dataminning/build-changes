import java.util.Map;
import java.util.function.Predicate;

public class ctt extends cof {
   public static final int c = 1;
   public static final int d = 3;
   public static final ddb e = dcr.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   public static final Predicate<cnk.c> f = $$0 -> $$0 == cnk.c.b;
   public static final Predicate<cnk.c> g = $$0 -> $$0 == cnk.c.c;
   private final Predicate<cnk.c> j;

   public ctt(dca.d $$0, Predicate<cnk.c> $$1, Map<cfu, ib> $$2) {
      super($$0, $$2);
      this.j = $$1;
      this.k(this.C.b().a(e, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dcb $$0) {
      return $$0.c(e) == 3;
   }

   @Override
   protected boolean a(dxd $$0) {
      return $$0 == dxf.c && this.j == f;
   }

   @Override
   protected double b(dcb $$0) {
      return (6.0 + (double)$$0.c(e).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      if (!$$1.B && $$3.bL() && this.a($$0, $$2, $$3)) {
         $$3.aw();
         if ($$3.a($$1, $$2)) {
            this.d($$0, $$1, $$2);
         }
      }
   }

   protected void d(dcb $$0, cmm $$1, gu $$2) {
      e($$0, $$1, $$2);
   }

   public static void e(dcb $$0, cmm $$1, gu $$2) {
      int $$3 = $$0.c(e) - 1;
      dcb $$4 = $$3 == 0 ? cpo.ft.n() : $$0.a(e, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dgl.c, $$2, dgl.a.a($$4));
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cnk.c $$3) {
      if (cqh.a($$1, $$3) && $$0.c(e) != 3 && this.j.test($$3)) {
         dcb $$4 = $$0.a(e);
         $$1.b($$2, $$4);
         $$1.a(dgl.c, $$2, dgl.a.a($$4));
      }
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(e);
   }

   @Override
   protected void a(dcb $$0, cmm $$1, gu $$2, dxd $$3) {
      if (!this.d($$0)) {
         dcb $$4 = $$0.a(e, Integer.valueOf($$0.c(e) + 1));
         $$1.b($$2, $$4);
         $$1.a(dgl.c, $$2, dgl.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
