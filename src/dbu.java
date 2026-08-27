import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dbu extends crs {
   public static final dgd b = cwo.aC;
   private static final Map<hc, eig> c = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csv.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         hc.d,
         csv.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         hc.f,
         csv.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         hc.e,
         csv.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   protected dbu(czx.a $$0, dfi.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(b, hc.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dfj a(cln $$0) {
      dfj $$1 = super.a($$0);
      cpb $$2 = $$0.q();
      gw $$3 = $$0.a();
      hc[] $$4 = $$0.f();

      for (hc $$5 : $$4) {
         if ($$5.o().d()) {
            hc $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      super.a($$0);
      $$0.a(b);
   }
}
