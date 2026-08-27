import javax.annotation.Nullable;

public class cwo extends csk implements czl {
   public static final dfp a = dfo.j;
   public static final dfp b = dfo.C;
   protected static final ehy c = ehv.a(csk.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), csk.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ehy d = ehv.a(csk.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), csk.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   public cwo(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      eab $$1 = $$0.q().b_($$0.a());

      for (hb $$2 : $$0.f()) {
         if ($$2.o() == hb.a.b) {
            dey $$3 = this.n().a(a, Boolean.valueOf($$2 == hb.b));
            if ($$3.a((cpn)$$0.q(), $$0.a())) {
               return $$3.a(b, Boolean.valueOf($$1.a() == eac.c));
            }
         }
      }

      return null;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return $$0.c(a) ? d : c;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      hb $$3 = h($$0).g();
      return csk.a($$1, $$2.a($$3), $$3.g());
   }

   protected static hb h(dey $$0) {
      return $$0.c(a) ? hb.a : hb.b;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(b) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
