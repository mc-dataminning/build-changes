import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dbl extends crh {
   public static final dfy a = cwj.aC;
   private static final Map<hc, eib> b = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csq.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         hc.d,
         csq.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         hc.e,
         csq.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         hc.f,
         csq.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   public dbl(cho $$0, dfd.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, hc.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return $$1.a_($$2.a($$0.c(a).g())).e();
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1 == $$0.c(a).g() && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return b.get($$0.c(a));
   }

   @Override
   public dfe a(cli $$0) {
      dfe $$1 = this.n();
      cpt $$2 = $$0.q();
      gw $$3 = $$0.a();
      hc[] $$4 = $$0.f();

      for (hc $$5 : $$4) {
         if ($$5.o().d()) {
            hc $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
      $$0.a(a);
   }
}
