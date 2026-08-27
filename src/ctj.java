import javax.annotation.Nullable;

public class ctj extends cyv implements czl {
   public static final dfp a = dfo.C;
   protected static final float b = 6.5F;
   protected static final float c = 9.5F;
   protected static final ehy d = csk.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ehy e = csk.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ehy f = csk.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   public ctj(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(g, hb.a.b));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      switch ((hb.a)$$0.c(g)) {
         case a:
         default:
            return f;
         case c:
            return e;
         case b:
            return d;
      }
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      eab $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eac.c;
      return super.a($$0).a(a, Boolean.valueOf($$2));
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a).a(g);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(a) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
