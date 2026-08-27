import java.util.OptionalInt;

public class cxc extends csv implements czw {
   public static final int a = 7;
   public static final dgj b = dfz.aC;
   public static final dga c = dfz.v;
   public static final dga d = dfz.C;
   private static final int e = 1;

   public cxc(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(7)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public eig b_(dfj $$0, cpb $$1, gw $$2) {
      return eid.a();
   }

   @Override
   public boolean e_(dfj $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   public void b(dfj $$0, akr $$1, gw $$2, asc $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(dfj $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(dfj $$0, cpb $$1, gw $$2) {
      return 1;
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(b) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dfj a(dfj $$0, cpw $$1, gw $$2) {
      int $$3 = 7;
      gw.a $$4 = new gw.a();

      for (hc $$5 : hc.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(b, Integer.valueOf($$3));
   }

   private static int o(dfj $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dfj $$0) {
      if ($$0.a(apt.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(d) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      if ($$1.q($$2.c())) {
         if ($$3.a(15) == 1) {
            gw $$4 = $$2.d();
            dfj $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, hc.b)) {
               asa.a($$1, $$2, $$3, ix.m);
            }
         }
      }
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dfj a(cln $$0) {
      eam $$1 = $$0.q().b_($$0.a());
      dfj $$2 = this.n().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf($$1.a() == ean.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
