import java.util.function.BiFunction;

public class cxx extends csu implements cso {
   public static final int a = 1;
   public static final int b = 4;
   public static final dfu c = dfq.R;
   public static final dga d = dfq.S;
   private static final BiFunction<ha, Integer, ehx> e = ac.a(
      ($$0, $$1) -> {
         ehx[] $$2 = new ehx[]{
            csm.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            csm.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            csm.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            csm.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ehx $$3 = ehu.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ehu.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   protected cxx(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, ha.c).a(d, Integer.valueOf(1)));
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public boolean a(dfa $$0, clg $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(d) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return e.apply($$0.c(c), $$0.c(d));
   }

   @Override
   public dfa a(clg $$0) {
      dfa $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(d, Integer.valueOf(Math.min(4, $$1.c(d) + 1))) : this.n().a(c, $$0.g().g());
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return true;
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      int $$4 = $$3.c(d);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(d, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new ciy(this));
      }
   }
}
