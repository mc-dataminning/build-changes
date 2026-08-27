import com.google.common.base.Predicates;

public class cuw extends csl {
   public static final dft a = cwe.aC;
   public static final dfq b = dfp.h;
   protected static final ehw c = csl.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ehw d = csl.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ehw e = eht.a(c, d);
   private static dfe f;

   public cuw(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dez $$0) {
      return true;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return $$0.c(b) ? e : c;
   }

   @Override
   public dez a(clf $$0) {
      return this.n().a(a, $$0.g().g()).a(b, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b);
   }

   public static dfe a() {
      if (f == null) {
         f = dff.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dfd.a(dfi.a))
            .a('^', dfd.a(dfi.a(csm.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(ha.d))))
            .a('>', dfd.a(dfi.a(csm.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(ha.e))))
            .a('v', dfd.a(dfi.a(csm.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(ha.c))))
            .a('<', dfd.a(dfi.a(csm.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(ha.f))))
            .b();
      }

      return f;
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
