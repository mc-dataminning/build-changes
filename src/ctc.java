import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class ctc extends cqs {
   protected static final Map<dcv, dpy> a = Maps.newHashMap(
      new Builder()
         .put(dcx.i, dcx.kE.n())
         .put(dcx.j, dcx.kE.n())
         .put(dcx.l, dcx.kE.n())
         .put(dcx.k, dcx.kE.n())
         .put(dcx.fl, dcx.kE.n())
         .put(dcx.sH, dcx.kE.n())
         .build()
   );

   public ctc(ctq $$0, cry.a $$1) {
      super($$0, avo.bD, $$1);
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      dpy $$3 = $$1.a_($$2);
      if ($$0.k() == ir.a) {
         return boq.d;
      } else {
         ckl $$4 = $$0.o();
         dpy $$5 = a.get($$3.b());
         dpy $$6 = null;
         if ($$5 != null && $$1.a_($$2.c()).i()) {
            $$1.a($$4, $$2, auz.wv, ava.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof ddj && $$3.c(ddj.c)) {
            if (!$$1.x_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            ddj.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(ddj.c, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.B) {
               $$1.a($$2, $$6, 11);
               $$1.a(dur.c, $$2, dur.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, bre.d($$0.p()));
               }
            }

            return boq.a($$1.B);
         } else {
            return boq.d;
         }
      }
   }
}
