import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cwp extends cua {
   protected static final Map<dgv, dua> a = Maps.newHashMap(
      new Builder()
         .put(dgx.i, dgx.kE.o())
         .put(dgx.j, dgx.kE.o())
         .put(dgx.l, dgx.kE.o())
         .put(dgx.k, dgx.kE.o())
         .put(dgx.fl, dgx.kE.o())
         .put(dgx.sH, dgx.kE.o())
         .build()
   );

   public cwp(cxe $$0, float $$1, float $$2, cvg.a $$3) {
      super($$0, aws.bE, $$1, $$2, $$3);
   }

   @Override
   public brk a(cyy $$0) {
      dds $$1 = $$0.q();
      je $$2 = $$0.a();
      dua $$3 = $$1.a_($$2);
      if ($$0.k() == jj.a) {
         return brk.e;
      } else {
         cnp $$4 = $$0.o();
         dua $$5 = a.get($$3.b());
         dua $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, awd.wL, awe.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dhj && $$3.c(dhj.c)) {
            if (!$$1.w_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dhj.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dhj.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dyx.c, $$2, dyx.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, buf.d($$0.p()));
               }
            }

            return brk.a;
         } else {
            return brk.e;
         }
      }
   }
}
