import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class crn extends cst {
   public static final dft a = cwe.aC;
   protected static final float b = 2.0F;
   private static final Map<ha, ehw> c = Maps.newEnumMap(
      ImmutableMap.of(
         ha.d,
         csl.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ha.e,
         csl.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ha.c,
         csl.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ha.f,
         csl.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final dai d;
   private final Supplier<cis> e;

   protected crn(dai $$0, Supplier<cis> $$1, dey.d $$2) {
      super($$2);
      this.k(this.C.b().a(a, ha.c));
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return c.get($$0.c(a));
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return !$$2.a(this.d) && $$1 == $$0.c(a) ? this.d.a().n().a(dah.b, Integer.valueOf(7)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean d(dez $$0, cor $$1, gu $$2) {
      return $$0.a(csm.cC);
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      return new cix(this.e.get());
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }
}
