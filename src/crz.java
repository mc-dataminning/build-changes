import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class crz extends ctf {
   public static final dgf a = cwq.aC;
   protected static final float b = 2.0F;
   private static final Map<hc, eii> c = Maps.newEnumMap(
      ImmutableMap.of(
         hc.d,
         csx.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         hc.e,
         csx.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         hc.c,
         csx.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         hc.f,
         csx.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final dau d;
   private final Supplier<cjc> e;

   protected crz(dau $$0, Supplier<cjc> $$1, dfk.d $$2) {
      super($$2);
      this.k(this.C.b().a(a, hc.c));
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return c.get($$0.c(a));
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return !$$2.a(this.d) && $$1 == $$0.c(a) ? this.d.a().n().a(dat.b, Integer.valueOf(7)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean d(dfl $$0, cpd $$1, gw $$2) {
      return $$0.a(csy.cC);
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return new cjh(this.e.get());
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }
}
