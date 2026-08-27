import com.google.common.base.Predicates;

public class cry extends cpn {
   public static final dcv a = ctg.aC;
   public static final dcs b = dcr.h;
   protected static final efb c = cpn.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final efb d = cpn.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final efb e = eey.a(c, d);
   private static dcg f;

   public cry(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dcb $$0) {
      return true;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return $$0.c(b) ? e : c;
   }

   @Override
   public dcb a(cih $$0) {
      return this.n().a(a, $$0.g().g()).a(b, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b);
   }

   public static dcg a() {
      if (f == null) {
         f = dch.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dcf.a(dck.a))
            .a('^', dcf.a(dck.a(cpo.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(ha.d))))
            .a('>', dcf.a(dck.a(cpo.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(ha.e))))
            .a('v', dcf.a(dck.a(cpo.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(ha.c))))
            .a('<', dcf.a(dck.a(cpo.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(ha.f))))
            .b();
      }

      return f;
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}
