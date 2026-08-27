import java.util.function.ToIntFunction;

public class cwv extends csk implements czl {
   public static final int a = 15;
   public static final dfy b = dfo.aP;
   public static final dfp c = dfo.C;
   public static final ToIntFunction<dey> d = $$0 -> $$0.c(b);

   public cwv(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(15)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b, c);
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if (!$$1.B && $$3.gn()) {
         $$1.a($$2, $$0.a(b), 2);
         return bgo.a;
      } else {
         return bgo.b;
      }
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return $$3.a(ciz.hg) ? ehv.b() : ehv.a();
   }

   @Override
   public boolean c(dey $$0, coq $$1, gv $$2) {
      return true;
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.a;
   }

   @Override
   public float b(dey $$0, coq $$1, gv $$2) {
      return 1.0F;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(c) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(b));
   }

   public static ciw a(ciw $$0, int $$1) {
      if ($$1 != 15) {
         qs $$2 = new qs();
         $$2.a(b.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
