import java.util.Map;

public record dio(int a, Map<diq, Integer> b, int c, jg<awx> d, float e, float f, ayc<dag> g, alq<dir> h) {
   public ddb a(diq $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      ddb.a $$2 = ddb.a();
      bxp $$3 = bxp.a($$0.a());
      alr $$4 = alr.b("armor." + $$0.b());
      $$2.a(bzl.a, new bzj($$4, (double)$$1, bzj.a.a), $$3);
      $$2.a(bzl.b, new bzj($$4, (double)this.e, bzj.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bzl.p, new bzj($$4, (double)this.f, bzj.a.a), $$3);
      }

      return $$2.a();
   }
}
