import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class czt extends cyo {
   protected static final Map<dlu, dzo> a = Maps.newHashMap(
      new Builder()
         .put(dlw.i, dlw.lg.m())
         .put(dlw.j, dlw.lg.m())
         .put(dlw.l, dlw.lg.m())
         .put(dlw.k, dlw.lg.m())
         .put(dlw.fA, dlw.lg.m())
         .put(dlw.tn, dlw.lg.m())
         .build()
   );

   public czt(dag $$0, float $$1, float $$2, cyo.a $$3) {
      super($$3.d($$0, $$1, $$2));
   }

   @Override
   public bty a(dcn $$0) {
      dip $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzo $$3 = $$1.a_($$2);
      if ($$0.k() == ja.a) {
         return bty.e;
      } else {
         cqs $$4 = $$0.o();
         dzo $$5 = a.get($$3.b());
         dzo $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awl.xu, awm.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dmj && $$3.c(dmj.b)) {
            if (!$$1.w_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dmj.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dmj.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(eeo.c, $$2, eeo.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bwz.d($$0.p()));
               }
            }

            return bty.a;
         } else {
            return bty.e;
         }
      }
   }
}
