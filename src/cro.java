import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class cro extends csu {
   public static final dfu a = cwf.aC;
   protected static final float b = 2.0F;
   private static final Map<ha, ehx> c = Maps.newEnumMap(
      ImmutableMap.of(
         ha.d,
         csm.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ha.e,
         csm.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ha.c,
         csm.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ha.f,
         csm.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final daj d;
   private final Supplier<cit> e;

   protected cro(daj $$0, Supplier<cit> $$1, dez.d $$2) {
      super($$2);
      this.k(this.C.b().a(a, ha.c));
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return c.get($$0.c(a));
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return !$$2.a(this.d) && $$1 == $$0.c(a) ? this.d.a().n().a(dai.b, Integer.valueOf(7)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean d(dfa $$0, cos $$1, gu $$2) {
      return $$0.a(csn.cC);
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return new ciy(this.e.get());
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }
}
