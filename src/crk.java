import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class crk extends csf {
   protected static final Map<dea, dea> a = new Builder()
      .put(dec.ao, dec.aw)
      .put(dec.U, dec.al)
      .put(dec.au, dec.aC)
      .put(dec.aa, dec.ak)
      .put(dec.as, dec.aA)
      .put(dec.Y, dec.ai)
      .put(dec.at, dec.aB)
      .put(dec.Z, dec.aj)
      .put(dec.aq, dec.ay)
      .put(dec.W, dec.ag)
      .put(dec.ar, dec.az)
      .put(dec.X, dec.ah)
      .put(dec.ap, dec.ax)
      .put(dec.V, dec.af)
      .put(dec.oj, dec.ok)
      .put(dec.ol, dec.om)
      .put(dec.os, dec.ot)
      .put(dec.ou, dec.ov)
      .put(dec.av, dec.aD)
      .put(dec.ab, dec.am)
      .put(dec.ae, dec.an)
      .build();

   public crk(cvf $$0, ctl.a $$1) {
      super($$0, avx.bA, $$1);
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      cly $$3 = $$0.o();
      Optional<drd> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bpw.d;
      } else {
         ctq $$5 = $$0.n();
         if ($$3 instanceof aqo) {
            am.N.a((aqo)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dvw.c, $$2, dvw.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, bsq.d($$0.p()));
         }

         return bpw.a($$1.B);
      }
   }

   private Optional<drd> a(daz $$0, io $$1, @Nullable cly $$2, drd $$3) {
      Optional<drd> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, avi.aH, avj.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<drd> $$5 = dnf.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, avi.aI, avj.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<drd> $$6 = Optional.ofNullable((dea)ctg.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, avi.aJ, avj.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<drd> a(drd $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().a(dkm.i, $$0.c(dkm.i)));
   }
}
