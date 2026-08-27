import com.google.common.base.Predicates;

public class cux extends csm {
   public static final dfu a = cwf.aC;
   public static final dfr b = dfq.h;
   protected static final ehx c = csm.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ehx d = csm.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ehx e = ehu.a(c, d);
   private static dff f;

   public cux(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfa $$0) {
      return true;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return $$0.c(b) ? e : c;
   }

   @Override
   public dfa a(clg $$0) {
      return this.n().a(a, $$0.g().g()).a(b, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b);
   }

   public static dff a() {
      if (f == null) {
         f = dfg.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dfe.a(dfj.a))
            .a('^', dfe.a(dfj.a(csn.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(ha.d))))
            .a('>', dfe.a(dfj.a(csn.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(ha.e))))
            .a('v', dfe.a(dfj.a(csn.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(ha.c))))
            .a('<', dfe.a(dfj.a(csn.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(ha.f))))
            .b();
      }

      return f;
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
