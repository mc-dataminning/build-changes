import javax.annotation.Nullable;

public class crk extends crj implements czl {
   public static final dfp a = dfo.C;
   public static final dfs b = dfo.P;
   protected final ehy c;
   protected final ehy d;
   protected final ehy e;
   protected final ehy f;
   protected final ehy g;
   protected final ehy h;

   public crk(int $$0, int $$1, dex.d $$2) {
      super($$2);
      this.k(this.n().a(a, Boolean.valueOf(false)).a(b, hb.b));
      this.g = csk.a((double)$$1, 0.0, (double)$$1, (double)(16 - $$1), (double)$$0, (double)(16 - $$1));
      this.h = csk.a((double)$$1, (double)(16 - $$0), (double)$$1, (double)(16 - $$1), 16.0, (double)(16 - $$1));
      this.c = csk.a((double)$$1, (double)$$1, (double)(16 - $$0), (double)(16 - $$1), (double)(16 - $$1), 16.0);
      this.d = csk.a((double)$$1, (double)$$1, 0.0, (double)(16 - $$1), (double)(16 - $$1), (double)$$0);
      this.e = csk.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16 - $$1), (double)(16 - $$1));
      this.f = csk.a((double)(16 - $$0), (double)$$1, (double)$$1, 16.0, (double)(16 - $$1), (double)(16 - $$1));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      hb $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return this.c;
         case d:
            return this.d;
         case f:
            return this.e;
         case e:
            return this.f;
         case a:
            return this.h;
         case b:
         default:
            return this.g;
      }
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      hb $$3 = $$0.c(b);
      gv $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      cpl $$1 = $$0.q();
      gv $$2 = $$0.a();
      return this.n().a(a, Boolean.valueOf($$1.b_($$2).a() == eac.c)).a(b, $$0.k());
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(a) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b);
   }
}
