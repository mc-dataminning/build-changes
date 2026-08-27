import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dbg extends crc {
   public static final dft a = cwe.aC;
   private static final Map<ha, ehw> b = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         csl.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ha.d,
         csl.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ha.e,
         csl.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ha.f,
         csl.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   public dbg(chl $$0, dey.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return $$1.a_($$2.a($$0.c(a).g())).e();
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$1 == $$0.c(a).g() && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return b.get($$0.c(a));
   }

   @Override
   public dez a(clf $$0) {
      dez $$1 = this.n();
      cpo $$2 = $$0.q();
      gu $$3 = $$0.a();
      ha[] $$4 = $$0.f();

      for (ha $$5 : $$4) {
         if ($$5.o().d()) {
            ha $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
