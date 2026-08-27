import javax.annotation.Nullable;

public class cwz extends csv implements czw {
   public static final dga a = dfz.j;
   public static final dga b = dfz.C;
   protected static final eig c = eid.a(csv.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), csv.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final eig d = eid.a(csv.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), csv.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   public cwz(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      eam $$1 = $$0.q().b_($$0.a());

      for (hc $$2 : $$0.f()) {
         if ($$2.o() == hc.a.b) {
            dfj $$3 = this.n().a(a, Boolean.valueOf($$2 == hc.b));
            if ($$3.a((cpy)$$0.q(), $$0.a())) {
               return $$3.a(b, Boolean.valueOf($$1.a() == ean.c));
            }
         }
      }

      return null;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return $$0.c(a) ? d : c;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      hc $$3 = h($$0).g();
      return csv.a($$1, $$2.a($$3), $$3.g());
   }

   protected static hc h(dfj $$0) {
      return $$0.c(a) ? hc.a : hc.b;
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(b) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
