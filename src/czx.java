public class czx extends crs {
   public static final int b = dgp.a();
   private static final int f = b + 1;
   public static final dgj c = dfz.ba;
   protected static final eig d = csv.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final eig e = csv.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   protected czx(czx.a $$0, dfi.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(c, Integer.valueOf(0)));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return this.a() == czx.b.f ? e : d;
   }

   @Override
   public eig f(dfj $$0, cpb $$1, gw $$2) {
      return eid.a();
   }

   @Override
   public dfj a(cln $$0) {
      return super.a($$0).a(c, Integer.valueOf(dgp.a($$0.i())));
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(c, Integer.valueOf($$1.a($$0.c(c), f)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a(c, Integer.valueOf($$1.a($$0.c(c), f)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   public interface a {
   }

   public static enum b implements czx.a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
