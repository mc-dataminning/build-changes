import com.google.common.base.Predicates;

public class cuv extends csk {
   public static final dfs a = cwd.aC;
   public static final dfp b = dfo.h;
   protected static final ehy c = csk.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ehy d = csk.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ehy e = ehv.a(c, d);
   private static dfd f;

   public cuv(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dey $$0) {
      return true;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return $$0.c(b) ? e : c;
   }

   @Override
   public dey a(cle $$0) {
      return this.n().a(a, $$0.g().g()).a(b, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      return $$0.c(b) ? 15 : 0;
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

   public static dfd a() {
      if (f == null) {
         f = dfe.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dfc.a(dfh.a))
            .a('^', dfc.a(dfh.a(csl.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hb.d))))
            .a('>', dfc.a(dfh.a(csl.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hb.e))))
            .a('v', dfc.a(dfh.a(csl.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hb.c))))
            .a('<', dfc.a(dfh.a(csl.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hb.f))))
            .b();
      }

      return f;
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
