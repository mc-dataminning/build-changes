import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dbl extends crj {
   public static final dfu a = cwf.aC;
   private static final Map<ha, ehx> b = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         csm.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ha.d,
         csm.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ha.f,
         csm.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ha.e,
         csm.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   protected dbl(czo.a $$0, dez.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return b.get($$0.c(a));
   }

   @Override
   public dfa a(clg $$0) {
      dfa $$1 = this.n();
      cos $$2 = $$0.q();
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
