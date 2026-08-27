import java.util.function.BiFunction;

public class cyg extends ctd implements csx {
   public static final int a = 1;
   public static final int b = 4;
   public static final dgd c = dfz.R;
   public static final dgj d = dfz.S;
   private static final BiFunction<hc, Integer, eig> e = ac.a(
      ($$0, $$1) -> {
         eig[] $$2 = new eig[]{
            csv.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            csv.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            csv.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            csv.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         eig $$3 = eid.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = eid.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   protected cyg(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, hc.c).a(d, Integer.valueOf(1)));
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public boolean a(dfj $$0, cln $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(d) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return e.apply($$0.c(c), $$0.c(d));
   }

   @Override
   public dfj a(cln $$0) {
      dfj $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(d, Integer.valueOf(Math.min(4, $$1.c(d) + 1))) : this.n().a(c, $$0.g().g());
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      return true;
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akr $$0, asc $$1, gw $$2, dfj $$3) {
      int $$4 = $$3.c(d);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(d, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cjf(this));
      }
   }
}
