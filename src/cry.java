import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class cry extends crv {
   public static final dfu a = cwf.aC;
   private static final Map<ha, ehx> b = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         csm.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ha.d,
         csm.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ha.e,
         csm.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ha.f,
         csm.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   protected cry(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(c, Boolean.valueOf(true)));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return b.get($$0.c(a));
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
      $$0.a(a, c);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csn.a.n() : $$0;
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      ha $$3 = $$0.c(a);
      gu $$4 = $$2.a($$3.g());
      dfa $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      dfa $$1 = super.a($$0);
      cpp $$2 = $$0.q();
      gu $$3 = $$0.a();
      ha[] $$4 = $$0.f();

      for (ha $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.a(a, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
