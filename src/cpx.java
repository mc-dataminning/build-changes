import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpx extends cqs {
   protected static final Map<dcv, dcv> a = new Builder()
      .put(dcx.ao, dcx.aw)
      .put(dcx.U, dcx.al)
      .put(dcx.au, dcx.aC)
      .put(dcx.aa, dcx.ak)
      .put(dcx.as, dcx.aA)
      .put(dcx.Y, dcx.ai)
      .put(dcx.at, dcx.aB)
      .put(dcx.Z, dcx.aj)
      .put(dcx.aq, dcx.ay)
      .put(dcx.W, dcx.ag)
      .put(dcx.ar, dcx.az)
      .put(dcx.X, dcx.ah)
      .put(dcx.ap, dcx.ax)
      .put(dcx.V, dcx.af)
      .put(dcx.oj, dcx.ok)
      .put(dcx.ol, dcx.om)
      .put(dcx.os, dcx.ot)
      .put(dcx.ou, dcx.ov)
      .put(dcx.av, dcx.aD)
      .put(dcx.ab, dcx.am)
      .put(dcx.ae, dcx.an)
      .build();

   public cpx(ctq $$0, cry.a $$1) {
      super($$0, avo.bA, $$1);
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      ckl $$3 = $$0.o();
      Optional<dpy> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return boq.d;
      } else {
         csd $$5 = $$0.n();
         if ($$3 instanceof aqf) {
            am.N.a((aqf)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dur.c, $$2, dur.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, bre.d($$0.p()));
         }

         return boq.a($$1.B);
      }
   }

   private Optional<dpy> a(czu $$0, im $$1, @Nullable ckl $$2, dpy $$3) {
      Optional<dpy> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, auz.aH, ava.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dpy> $$5 = dma.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, auz.aI, ava.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dpy> $$6 = Optional.ofNullable((dcv)crt.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, auz.aJ, ava.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dpy> b(dpy $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().a(djh.i, $$0.c(djh.i)));
   }
}
