import javax.annotation.Nullable;

public class crv extends csk implements czl {
   public static final dfp c = dfo.C;
   private static final ehy a = csk.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected crv(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, Boolean.valueOf(true)));
   }

   protected void a(dey $$0, cpl $$1, gv $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.y_().a(40));
      }
   }

   protected static boolean e(dey $$0, coq $$1, gv $$2) {
      if ($$0.c(c)) {
         return true;
      } else {
         for (hb $$3 : hb.values()) {
            if ($$1.b_($$2.a($$3)).a(apo.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      eab $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, Boolean.valueOf($$1.a(apo.a) && $$1.e() == 8));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return a;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return $$1 == hb.a && !this.a($$0, (cpn)$$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      gv $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, hb.b);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(c);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(c) ? eac.c.a(false) : super.c_($$0);
   }
}
