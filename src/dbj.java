import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbj extends czl {
   public static final dft a = cwe.aC;
   protected static final float b = 2.0F;
   protected static final float c = 4.5F;
   protected static final float d = 12.5F;
   private static final Map<ha, ehw> h = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         csl.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ha.d,
         csl.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ha.f,
         csl.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ha.e,
         csl.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   public dbj(dey.d $$0, dgm $$1) {
      super($$0.a($$1.d()), $$1);
      this.k(this.C.b().a(a, ha.c).a(e, Boolean.valueOf(false)));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return h.get($$0.c(a));
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return $$1.a_($$2.a($$0.c(a).g())).e();
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      dez $$1 = this.n();
      eac $$2 = $$0.q().b_($$0.a());
      cpo $$3 = $$0.q();
      gu $$4 = $$0.a();
      ha[] $$5 = $$0.f();

      for (ha $$6 : $$5) {
         if ($$6.o().d()) {
            ha $$7 = $$6.g();
            $$1 = $$1.a(a, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(e, Boolean.valueOf($$2.a() == ead.c));
            }
         }
      }

      return null;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dez $$0) {
      return $$0.c(a).p();
   }

   @Override
   public ehd h(dez $$0) {
      ehw $$1 = h.get($$0.c(a));
      return $$1.a().f();
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
      $$0.a(a, e);
   }
}
