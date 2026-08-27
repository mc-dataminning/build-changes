import javax.annotation.Nullable;

public class cwn extends csk implements czl {
   public static final dfs a = cwd.aC;
   public static final dfp b = dfo.C;
   protected static final float c = 3.0F;
   protected static final ehy d = csk.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ehy e = csk.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehy f = csk.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ehy g = csk.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   protected cwn(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      switch ((hb)$$0.c(a)) {
         case c:
            return g;
         case d:
            return f;
         case e:
            return e;
         case f:
         default:
            return d;
      }
   }

   private boolean a(coq $$0, gv $$1, hb $$2) {
      dey $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      hb $$3 = $$0.c(a);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
         return csl.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eac.c, eac.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      if (!$$0.c()) {
         dey $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(a) == $$0.k()) {
            return null;
         }
      }

      dey $$2 = this.n();
      cpn $$3 = $$0.q();
      gv $$4 = $$0.a();
      eab $$5 = $$0.q().b_($$0.a());

      for (hb $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(a, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(b, Boolean.valueOf($$5.a() == eac.c));
            }
         }
      }

      return null;
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(b) ? eac.c.a(false) : super.c_($$0);
   }
}
