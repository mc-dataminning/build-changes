import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cxe extends cuu {
   protected static final Map<die, dvj> a = Maps.newHashMap(
      new Builder()
         .put(dig.i, dig.kE.m())
         .put(dig.j, dig.kE.m())
         .put(dig.l, dig.kE.m())
         .put(dig.k, dig.kE.m())
         .put(dig.fl, dig.kE.m())
         .put(dig.sH, dig.kE.m())
         .build()
   );

   public cxe(cxs $$0, float $$1, float $$2, cvx.a $$3) {
      super($$0, axa.bE, $$1, $$2, $$3);
   }

   @Override
   public bsd a(czu $$0) {
      dfb $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvj $$3 = $$1.a_($$2);
      if ($$0.k() == jm.a) {
         return bsd.e;
      } else {
         com $$4 = $$0.o();
         dvj $$5 = a.get($$3.b());
         dvj $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awl.wJ, awm.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dis && $$3.c(dis.c)) {
            if (!$$1.y_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dis.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dis.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(eag.c, $$2, eag.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bva.d($$0.p()));
               }
            }

            return bsd.a;
         } else {
            return bsd.e;
         }
      }
   }
}
