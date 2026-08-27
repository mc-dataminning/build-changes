import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class cym extends coj {
   public static final dcv a = ctg.aC;
   private static final Map<ha, efb> b = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         cpn.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ha.d,
         cpn.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ha.f,
         cpn.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ha.e,
         cpn.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   protected cym(cwp.a $$0, dca.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return b.get($$0.c(a));
   }

   @Override
   public dcb a(cih $$0) {
      dcb $$1 = this.n();
      cls $$2 = $$0.q();
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
