import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dbk extends cri {
   public static final dft a = cwe.aC;
   private static final Map<ha, ehw> b = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         csl.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ha.d,
         csl.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ha.f,
         csl.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ha.e,
         csl.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   protected dbk(czn.a $$0, dey.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return b.get($$0.c(a));
   }

   @Override
   public dez a(clf $$0) {
      dez $$1 = this.n();
      cor $$2 = $$0.q();
      gu $$3 = $$0.a();
      ha[] $$4 = $$0.f();

      for (ha $$5 : $$4) {
         if ($$5.o().d()) {
            ha $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
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
