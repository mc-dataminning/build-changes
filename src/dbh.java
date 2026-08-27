import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dbh extends crd {
   public static final dfu a = cwf.aC;
   private static final Map<ha, ehx> b = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         csm.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ha.d,
         csm.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ha.e,
         csm.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ha.f,
         csm.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   public dbh(chm $$0, dez.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return $$1.a_($$2.a($$0.c(a).g())).e();
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$1 == $$0.c(a).g() && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return b.get($$0.c(a));
   }

   @Override
   public dfa a(clg $$0) {
      dfa $$1 = this.n();
      cpp $$2 = $$0.q();
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
