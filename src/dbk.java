import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbk extends czm {
   public static final dfu a = cwf.aC;
   protected static final float b = 2.0F;
   protected static final float c = 4.5F;
   protected static final float d = 12.5F;
   private static final Map<ha, ehx> h = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         csm.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ha.d,
         csm.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ha.f,
         csm.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ha.e,
         csm.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   public dbk(dez.d $$0, dgn $$1) {
      super($$0.a($$1.d()), $$1);
      this.k(this.C.b().a(a, ha.c).a(e, Boolean.valueOf(false)));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return h.get($$0.c(a));
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return $$1.a_($$2.a($$0.c(a).g())).e();
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      dfa $$1 = this.n();
      ead $$2 = $$0.q().b_($$0.a());
      cpp $$3 = $$0.q();
      gu $$4 = $$0.a();
      ha[] $$5 = $$0.f();

      for (ha $$6 : $$5) {
         if ($$6.o().d()) {
            ha $$7 = $$6.g();
            $$1 = $$1.a(a, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(e, Boolean.valueOf($$2.a() == eae.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfa $$0) {
      return $$0.c(a).p();
   }

   @Override
   public ehe h(dfa $$0) {
      ehx $$1 = h.get($$0.c(a));
      return $$1.a().f();
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
      $$0.a(a, e);
   }
}
