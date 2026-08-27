import com.google.common.base.Predicates;

public class cvi extends csx {
   public static final dgf a = cwq.aC;
   public static final dgc b = dgb.h;
   protected static final eii c = csx.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final eii d = csx.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final eii e = eif.a(c, d);
   private static dfq f;

   public cvi(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfl $$0) {
      return true;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return $$0.c(b) ? e : c;
   }

   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, $$0.g().g()).a(b, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b);
   }

   public static dfq a() {
      if (f == null) {
         f = dfr.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dfp.a(dfu.a))
            .a('^', dfp.a(dfu.a(csy.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hc.d))))
            .a('>', dfp.a(dfu.a(csy.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hc.e))))
            .a('v', dfp.a(dfu.a(csy.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hc.c))))
            .a('<', dfp.a(dfu.a(csy.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hc.f))))
            .b();
      }

      return f;
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
