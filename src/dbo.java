import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbo extends czq {
   public static final dfy a = cwj.aC;
   protected static final float b = 2.0F;
   protected static final float c = 4.5F;
   protected static final float d = 12.5F;
   private static final Map<hc, eib> h = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csq.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         hc.d,
         csq.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         hc.f,
         csq.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         hc.e,
         csq.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   public dbo(dfd.d $$0, dgr $$1) {
      super($$0.a($$1.d()), $$1);
      this.k(this.C.b().a(a, hc.c).a(e, Boolean.valueOf(false)));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return h.get($$0.c(a));
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return $$1.a_($$2.a($$0.c(a).g())).e();
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      dfe $$1 = this.n();
      eah $$2 = $$0.q().b_($$0.a());
      cpt $$3 = $$0.q();
      gw $$4 = $$0.a();
      hc[] $$5 = $$0.f();

      for (hc $$6 : $$5) {
         if ($$6.o().d()) {
            hc $$7 = $$6.g();
            $$1 = $$1.a(a, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(e, Boolean.valueOf($$2.a() == eai.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfe $$0) {
      return $$0.c(a).p();
   }

   @Override
   public ehi h(dfe $$0) {
      eib $$1 = h.get($$0.c(a));
      return $$1.a().f();
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, e);
   }
}
