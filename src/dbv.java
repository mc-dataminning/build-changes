import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbv extends czx {
   public static final dgf a = cwq.aC;
   protected static final float b = 2.0F;
   protected static final float c = 4.5F;
   protected static final float d = 12.5F;
   private static final Map<hc, eii> h = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csx.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         hc.d,
         csx.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         hc.f,
         csx.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         hc.e,
         csx.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   public dbv(dfk.d $$0, dgy $$1) {
      super($$0.a($$1.d()), $$1);
      this.k(this.C.b().a(a, hc.c).a(e, Boolean.valueOf(false)));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return h.get($$0.c(a));
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return $$1.a_($$2.a($$0.c(a).g())).e();
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      dfl $$1 = this.n();
      eao $$2 = $$0.q().b_($$0.a());
      cqa $$3 = $$0.q();
      gw $$4 = $$0.a();
      hc[] $$5 = $$0.f();

      for (hc $$6 : $$5) {
         if ($$6.o().d()) {
            hc $$7 = $$6.g();
            $$1 = $$1.a(a, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(e, Boolean.valueOf($$2.a() == eap.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfl $$0) {
      return $$0.c(a).p();
   }

   @Override
   public ehp h(dfl $$0) {
      eii $$1 = h.get($$0.c(a));
      return $$1.a().f();
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
      $$0.a(a, e);
   }
}
