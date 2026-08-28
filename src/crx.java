import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class crx extends csr {
   protected static final Map<dfh, dfh> a = new Builder()
      .put(dfj.ao, dfj.aw)
      .put(dfj.U, dfj.al)
      .put(dfj.au, dfj.aC)
      .put(dfj.aa, dfj.ak)
      .put(dfj.as, dfj.aA)
      .put(dfj.Y, dfj.ai)
      .put(dfj.at, dfj.aB)
      .put(dfj.Z, dfj.aj)
      .put(dfj.aq, dfj.ay)
      .put(dfj.W, dfj.ag)
      .put(dfj.ar, dfj.az)
      .put(dfj.X, dfj.ah)
      .put(dfj.ap, dfj.ax)
      .put(dfj.V, dfj.af)
      .put(dfj.oj, dfj.ok)
      .put(dfj.ol, dfj.om)
      .put(dfj.os, dfj.ot)
      .put(dfj.ou, dfj.ov)
      .put(dfj.av, dfj.aD)
      .put(dfj.ab, dfj.am)
      .put(dfj.ae, dfj.an)
      .build();

   public crx(cvr $$0, ctx.a $$1) {
      super($$0, avw.bA, $$1);
   }

   @Override
   public bqg a(cxo $$0) {
      dcf $$1 = $$0.q();
      ja $$2 = $$0.a();
      cmk $$3 = $$0.o();
      if (b($$0)) {
         return bqg.e;
      } else {
         Optional<dsk> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bqg.e;
         } else {
            cuc $$5 = $$0.n();
            if ($$3 instanceof aqn) {
               am.N.a((aqn)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(dxg.c, $$2, dxg.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, btb.d($$0.p()));
            }

            return bqg.a($$1.B);
         }
      }
   }

   private static boolean b(cxo $$0) {
      cmk $$1 = $$0.o();
      return $$0.p().equals(bqf.a) && $$1.eV().a(cuf.vs) && !$$1.fO();
   }

   private Optional<dsk> a(dcf $$0, ja $$1, @Nullable cmk $$2, dsk $$3) {
      Optional<dsk> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, avh.aH, avi.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dsk> $$5 = dom.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, avh.aI, avi.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dsk> $$6 = Optional.ofNullable((dfh)cts.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, avh.aJ, avi.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dsk> a(dsk $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dlt.i, $$0.c(dlt.i)));
   }
}
