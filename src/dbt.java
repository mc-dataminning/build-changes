import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbt extends czv {
   public static final dgd a = cwo.aC;
   protected static final float b = 2.0F;
   protected static final float c = 4.5F;
   protected static final float d = 12.5F;
   private static final Map<hc, eig> h = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csv.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         hc.d,
         csv.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         hc.f,
         csv.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         hc.e,
         csv.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   public dbt(dfi.d $$0, dgw $$1) {
      super($$0.a($$1.d()), $$1);
      this.k(this.C.b().a(a, hc.c).a(e, Boolean.valueOf(false)));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return h.get($$0.c(a));
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return $$1.a_($$2.a($$0.c(a).g())).e();
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      dfj $$1 = this.n();
      eam $$2 = $$0.q().b_($$0.a());
      cpy $$3 = $$0.q();
      gw $$4 = $$0.a();
      hc[] $$5 = $$0.f();

      for (hc $$6 : $$5) {
         if ($$6.o().d()) {
            hc $$7 = $$6.g();
            $$1 = $$1.a(a, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(e, Boolean.valueOf($$2.a() == ean.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfj $$0) {
      return $$0.c(a).p();
   }

   @Override
   public ehn h(dfj $$0) {
      eig $$1 = h.get($$0.c(a));
      return $$1.a().f();
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, e);
   }
}
