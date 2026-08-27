import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class csj extends csg {
   public static final dgf a = cwq.aC;
   private static final Map<hc, eii> b = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csx.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         hc.d,
         csx.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         hc.e,
         csx.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         hc.f,
         csx.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   protected csj(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(c, Boolean.valueOf(true)));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return b.get($$0.c(a));
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
      $$0.a(a, c);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csy.a.n() : $$0;
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      hc $$3 = $$0.c(a);
      gw $$4 = $$2.a($$3.g());
      dfl $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      dfl $$1 = super.a($$0);
      cqa $$2 = $$0.q();
      gw $$3 = $$0.a();
      hc[] $$4 = $$0.f();

      for (hc $$5 : $$4) {
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
