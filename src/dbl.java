import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbl extends daw {
   public static final dft a = cwe.aC;
   protected static final float b = 2.5F;
   private static final Map<ha, ehw> c = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         csl.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ha.d,
         csl.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ha.e,
         csl.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ha.f,
         csl.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   protected dbl(dey.d $$0, it $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return h($$0);
   }

   public static ehw h(dez $$0) {
      return c.get($$0.c(a));
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
      dez $$1 = this.n();
      cpo $$2 = $$0.q();
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
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csm.a.n() : $$0;
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      ha $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ha $$10 = $$4.g();
      $$1.a(iv.Z, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.i, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
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
      $$0.a(a);
   }
}
