import com.google.common.base.Predicates;

public class cvg extends csv {
   public static final dgd a = cwo.aC;
   public static final dga b = dfz.h;
   protected static final eig c = csv.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final eig d = csv.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final eig e = eid.a(c, d);
   private static dfo f;

   public cvg(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfj $$0) {
      return true;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return $$0.c(b) ? e : c;
   }

   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, $$0.g().g()).a(b, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b);
   }

   public static dfo a() {
      if (f == null) {
         f = dfp.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dfn.a(dfs.a))
            .a('^', dfn.a(dfs.a(csw.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hc.d))))
            .a('>', dfn.a(dfs.a(csw.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hc.e))))
            .a('v', dfn.a(dfs.a(csw.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hc.c))))
            .a('<', dfn.a(dfs.a(csw.fy).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(hc.f))))
            .b();
      }

      return f;
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
