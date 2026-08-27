import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class crs extends csy {
   public static final dfy a = cwj.aC;
   protected static final float b = 2.0F;
   private static final Map<hc, eib> c = Maps.newEnumMap(
      ImmutableMap.of(
         hc.d,
         csq.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         hc.e,
         csq.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         hc.c,
         csq.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         hc.f,
         csq.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final dan d;
   private final Supplier<civ> e;

   protected crs(dan $$0, Supplier<civ> $$1, dfd.d $$2) {
      super($$2);
      this.k(this.C.b().a(a, hc.c));
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return c.get($$0.c(a));
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return !$$2.a(this.d) && $$1 == $$0.c(a) ? this.d.a().n().a(dam.b, Integer.valueOf(7)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean d(dfe $$0, cow $$1, gw $$2) {
      return $$0.a(csr.cC);
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return new cja(this.e.get());
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
