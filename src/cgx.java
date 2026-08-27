import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cgx extends cej {
   protected static final Map<cpn, dcb> a = Maps.newHashMap(
      new Builder()
         .put(cpo.i, cpo.kE.n())
         .put(cpo.j, cpo.kE.n())
         .put(cpo.l, cpo.kE.n())
         .put(cpo.k, cpo.kE.n())
         .put(cpo.fl, cpo.kE.n())
         .put(cpo.rG, cpo.kE.n())
         .build()
   );

   public cgx(chm $$0, float $$1, float $$2, cfu.a $$3) {
      super($$1, $$2, $$0, amw.bA, $$3);
   }

   @Override
   public bdx a(cij $$0) {
      cmm $$1 = $$0.q();
      gu $$2 = $$0.a();
      dcb $$3 = $$1.a_($$2);
      if ($$0.k() == ha.a) {
         return bdx.d;
      } else {
         byo $$4 = $$0.o();
         dcb $$5 = a.get($$3.b());
         dcb $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, amh.uX, ami.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof cqa && $$3.c(cqa.b)) {
            if (!$$1.r_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            cqa.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(cqa.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dgl.c, $$2, dgl.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bdx.a($$1.B);
         } else {
            return bdx.d;
         }
      }
   }
}
