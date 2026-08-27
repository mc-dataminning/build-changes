import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class csq extends cqh {
   protected static final Map<dch, dpi> a = Maps.newHashMap(
      new Builder()
         .put(dcj.i, dcj.kE.n())
         .put(dcj.j, dcj.kE.n())
         .put(dcj.l, dcj.kE.n())
         .put(dcj.k, dcj.kE.n())
         .put(dcj.fl, dcj.kE.n())
         .put(dcj.sH, dcj.kE.n())
         .build()
   );

   public csq(cte $$0, crn.a $$1) {
      super($$0, ave.bD, $$1);
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      dpi $$3 = $$1.a_($$2);
      if ($$0.k() == ij.a) {
         return bof.d;
      } else {
         cka $$4 = $$0.o();
         dpi $$5 = a.get($$3.b());
         dpi $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, auo.wo, aup.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dcv && $$3.c(dcv.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dcv.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(dcv.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dub.c, $$2, dub.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bqt.d($$0.p()));
               }
            }

            return bof.a($$1.B);
         } else {
            return bof.d;
         }
      }
   }
}
