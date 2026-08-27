import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class cop extends cpv {
   public static final dcv a = ctg.aC;
   protected static final float b = 2.0F;
   private static final Map<ha, efb> c = Maps.newEnumMap(
      ImmutableMap.of(
         ha.d,
         cpn.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ha.e,
         cpn.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ha.c,
         cpn.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ha.f,
         cpn.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final cxk d;
   private final Supplier<cfu> e;

   protected cop(cxk $$0, Supplier<cfu> $$1, dca.d $$2) {
      super($$2);
      this.k(this.C.b().a(a, ha.c));
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return c.get($$0.c(a));
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return !$$2.a(this.d) && $$1 == $$0.c(a) ? this.d.a().n().a(cxj.b, Integer.valueOf(7)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean d(dcb $$0, cls $$1, gu $$2) {
      return $$0.a(cpo.cC);
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return new cfz(this.e.get());
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
   }
}
