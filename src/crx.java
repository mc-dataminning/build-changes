import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class crx extends cru {
   public static final dft a = cwe.aC;
   private static final Map<ha, ehw> b = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         csl.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ha.d,
         csl.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ha.e,
         csl.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ha.f,
         csl.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   protected crx(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(c, Boolean.valueOf(true)));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return b.get($$0.c(a));
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
      $$0.a(a, c);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csm.a.n() : $$0;
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      ha $$3 = $$0.c(a);
      gu $$4 = $$2.a($$3.g());
      dez $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      dez $$1 = super.a($$0);
      cpo $$2 = $$0.q();
      gu $$3 = $$0.a();
      ha[] $$4 = $$0.f();

      for (ha $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.a(a, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
