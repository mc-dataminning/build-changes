import java.util.function.BiFunction;

public class cxw extends cst implements csn {
   public static final int a = 1;
   public static final int b = 4;
   public static final dft c = dfp.R;
   public static final dfz d = dfp.S;
   private static final BiFunction<ha, Integer, ehw> e = ac.a(
      ($$0, $$1) -> {
         ehw[] $$2 = new ehw[]{
            csl.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            csl.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            csl.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            csl.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ehw $$3 = eht.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = eht.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   protected cxw(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, ha.c).a(d, Integer.valueOf(1)));
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public boolean a(dez $$0, clf $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(d) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return e.apply($$0.c(c), $$0.c(d));
   }

   @Override
   public dez a(clf $$0) {
      dez $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(d, Integer.valueOf(Math.min(4, $$1.c(d) + 1))) : this.n().a(c, $$0.g().g());
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return true;
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      int $$4 = $$3.c(d);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(d, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cix(this));
      }
   }
}
