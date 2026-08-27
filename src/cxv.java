import java.util.function.BiFunction;

public class cxv extends css implements csm {
   public static final int a = 1;
   public static final int b = 4;
   public static final dfs c = dfo.R;
   public static final dfy d = dfo.S;
   private static final BiFunction<hb, Integer, ehy> e = ac.a(
      ($$0, $$1) -> {
         ehy[] $$2 = new ehy[]{
            csk.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            csk.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            csk.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            csk.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ehy $$3 = ehv.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ehv.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   protected cxv(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, hb.c).a(d, Integer.valueOf(1)));
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public boolean a(dey $$0, cle $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(d) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return e.apply($$0.c(c), $$0.c(d));
   }

   @Override
   public dey a(cle $$0) {
      dey $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(d, Integer.valueOf(Math.min(4, $$1.c(d) + 1))) : this.n().a(c, $$0.g().g());
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return true;
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      int $$4 = $$3.c(d);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(d, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new ciw(this));
      }
   }
}
