import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class csc extends crz {
   public static final dfy a = cwj.aC;
   private static final Map<hc, eib> b = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csq.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         hc.d,
         csq.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         hc.e,
         csq.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         hc.f,
         csq.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   protected csc(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(c, Boolean.valueOf(true)));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return b.get($$0.c(a));
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
      $$0.a(a, c);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csr.a.n() : $$0;
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      hc $$3 = $$0.c(a);
      gw $$4 = $$2.a($$3.g());
      dfe $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      dfe $$1 = super.a($$0);
      cpt $$2 = $$0.q();
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
