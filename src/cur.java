import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cur extends csf {
   protected static final Map<dea, drd> a = Maps.newHashMap(
      new Builder()
         .put(dec.i, dec.kE.n())
         .put(dec.j, dec.kE.n())
         .put(dec.l, dec.kE.n())
         .put(dec.k, dec.kE.n())
         .put(dec.fl, dec.kE.n())
         .put(dec.sH, dec.kE.n())
         .build()
   );

   public cur(cvf $$0, ctl.a $$1) {
      super($$0, avx.bD, $$1);
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      drd $$3 = $$1.a_($$2);
      if ($$0.k() == it.a) {
         return bpw.d;
      } else {
         cly $$4 = $$0.o();
         drd $$5 = a.get($$3.b());
         drd $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, avi.wH, avj.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof deo && $$3.c(deo.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            deo.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(deo.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dvw.c, $$2, dvw.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bsq.d($$0.p()));
               }
            }

            return bpw.a($$1.B);
         } else {
            return bpw.d;
         }
      }
   }
}
