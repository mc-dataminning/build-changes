import javax.annotation.Nullable;

public class cvz extends csk implements czl {
   private static final dfp b = dfo.C;
   protected static final ehy a = csk.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   protected cvz(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(b) ? eac.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      dey $$1 = super.a($$0);
      if ($$1 != null) {
         eab $$2 = $$0.q().b_($$0.a());
         return $$1.a(b, Boolean.valueOf($$2.a() == eac.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      gv $$3 = $$2.c();
      dey $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, hb.a);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return a;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$1 == hb.b && !this.a($$0, $$3, $$4)) {
         return csl.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eac.c, eac.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
