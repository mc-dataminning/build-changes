import com.google.common.base.Predicates;

public class cvb extends csq {
   public static final dfy a = cwj.aC;
   public static final dfv b = dfu.h;
   protected static final eib c = csq.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final eib d = csq.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final eib e = ehy.a(c, d);
   private static dfj f;

   public cvb(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfe $$0) {
      return true;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return $$0.c(b) ? e : c;
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, $$0.g().g()).a(b, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b);
   }

   public static dfj a() {
      if (f == null) {
         f = dfk.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dfi.a(dfn.a))
            .a('^', dfi.a(dfn.a(csr.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hc.d))))
            .a('>', dfi.a(dfn.a(csr.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hc.e))))
            .a('v', dfi.a(dfn.a(csr.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hc.c))))
            .a('<', dfi.a(dfn.a(csr.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hc.f))))
            .b();
      }

      return f;
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
