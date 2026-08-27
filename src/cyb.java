import java.util.function.BiFunction;

public class cyb extends csy implements css {
   public static final int a = 1;
   public static final int b = 4;
   public static final dfy c = dfu.R;
   public static final dge d = dfu.S;
   private static final BiFunction<hc, Integer, eib> e = ac.a(
      ($$0, $$1) -> {
         eib[] $$2 = new eib[]{
            csq.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            csq.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            csq.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            csq.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         eib $$3 = ehy.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ehy.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   protected cyb(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, hc.c).a(d, Integer.valueOf(1)));
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public boolean a(dfe $$0, cli $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(d) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return e.apply($$0.c(c), $$0.c(d));
   }

   @Override
   public dfe a(cli $$0) {
      dfe $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(d, Integer.valueOf(Math.min(4, $$1.c(d) + 1))) : this.n().a(c, $$0.g().g());
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return true;
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      int $$4 = $$3.c(d);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(d, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cja(this));
      }
   }
}
