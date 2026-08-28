import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class dbb extends czw {
   protected static final Map<dne, ebg> a = Maps.newHashMap(
      new Builder()
         .put(dng.i, dng.lk.m())
         .put(dng.j, dng.lk.m())
         .put(dng.l, dng.lk.m())
         .put(dng.k, dng.lk.m())
         .put(dng.fE, dng.lk.m())
         .put(dng.tr, dng.lk.m())
         .build()
   );

   public dbb(dbo $$0, float $$1, float $$2, czw.a $$3) {
      super($$3.d($$0, $$1, $$2));
   }

   @Override
   public but a(ddv $$0) {
      djz $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebg $$3 = $$1.a_($$2);
      if ($$0.k() == jc.a) {
         return but.e;
      } else {
         crz $$4 = $$0.o();
         ebg $$5 = a.get($$3.b());
         ebg $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awr.xA, aws.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dnu && $$3.c(dnu.b)) {
            if (!$$1.A_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dnu.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dnu.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(egg.c, $$2, egg.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bxw.d($$0.p()));
               }
            }

            return but.a;
         } else {
            return but.e;
         }
      }
   }
}
