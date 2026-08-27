import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dbp extends crn {
   public static final dfy b = cwj.aC;
   private static final Map<hc, eib> c = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csq.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         hc.d,
         csq.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         hc.f,
         csq.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         hc.e,
         csq.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   protected dbp(czs.a $$0, dfd.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(b, hc.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dfe a(cli $$0) {
      dfe $$1 = super.a($$0);
      cow $$2 = $$0.q();
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
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      super.a($$0);
      $$0.a(b);
   }
}
