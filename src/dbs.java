import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dbs extends cro {
   public static final dgf a = cwq.aC;
   private static final Map<hc, eii> b = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csx.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         hc.d,
         csx.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         hc.e,
         csx.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         hc.f,
         csx.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   public dbs(chv $$0, dfk.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, hc.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return $$1.a_($$2.a($$0.c(a).g())).e();
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1 == $$0.c(a).g() && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return b.get($$0.c(a));
   }

   @Override
   public dfl a(clp $$0) {
      dfl $$1 = this.n();
      cqa $$2 = $$0.q();
      gw $$3 = $$0.a();
      hc[] $$4 = $$0.f();

      for (hc $$5 : $$4) {
         if ($$5.o().d()) {
            hc $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
