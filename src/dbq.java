import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dbq extends crm {
   public static final dgd a = cwo.aC;
   private static final Map<hc, eig> b = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csv.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         hc.d,
         csv.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         hc.e,
         csv.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         hc.f,
         csv.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   public dbq(cht $$0, dfi.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, hc.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return $$1.a_($$2.a($$0.c(a).g())).e();
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1 == $$0.c(a).g() && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return b.get($$0.c(a));
   }

   @Override
   public dfj a(cln $$0) {
      dfj $$1 = this.n();
      cpy $$2 = $$0.q();
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
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }
}
