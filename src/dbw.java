import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dbw extends cru {
   public static final dgf b = cwq.aC;
   private static final Map<hc, eii> c = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csx.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         hc.d,
         csx.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         hc.f,
         csx.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         hc.e,
         csx.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   protected dbw(czz.a $$0, dfk.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(b, hc.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dfl a(clp $$0) {
      dfl $$1 = super.a($$0);
      cpd $$2 = $$0.q();
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
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      super.a($$0);
      $$0.a(b);
   }
}
