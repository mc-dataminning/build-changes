import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cty extends cuq {
   protected static final Map<dhy, dhy> a = new Builder()
      .put(dia.ao, dia.aw)
      .put(dia.U, dia.al)
      .put(dia.au, dia.aC)
      .put(dia.aa, dia.ak)
      .put(dia.as, dia.aA)
      .put(dia.Y, dia.ai)
      .put(dia.at, dia.aB)
      .put(dia.Z, dia.aj)
      .put(dia.aq, dia.ay)
      .put(dia.W, dia.ag)
      .put(dia.ar, dia.az)
      .put(dia.X, dia.ah)
      .put(dia.ap, dia.ax)
      .put(dia.V, dia.af)
      .put(dia.oj, dia.ok)
      .put(dia.ol, dia.om)
      .put(dia.os, dia.ot)
      .put(dia.ou, dia.ov)
      .put(dia.av, dia.aD)
      .put(dia.ab, dia.am)
      .put(dia.ae, dia.an)
      .build();

   public cty(cxo $$0, float $$1, float $$2, cvt.a $$3) {
      super($$0, awz.bB, $$1, $$2, $$3);
   }

   @Override
   public bry a(czo $$0) {
      dev $$1 = $$0.q();
      jg $$2 = $$0.a();
      coh $$3 = $$0.o();
      if (b($$0)) {
         return bry.e;
      } else {
         Optional<dvd> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bry.e;
         } else {
            cvx $$5 = $$0.n();
            if ($$3 instanceof arn) {
               an.N.a((arn)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(eaa.c, $$2, eaa.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, buv.d($$0.p()));
            }

            return bry.a;
         }
      }
   }

   private static boolean b(czo $$0) {
      coh $$1 = $$0.o();
      return $$0.p().equals(brx.a) && $$1.fc().a(cwb.vu) && !$$1.ga();
   }

   private Optional<dvd> a(dev $$0, jg $$1, @Nullable coh $$2, dvd $$3) {
      Optional<dvd> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awk.aH, awl.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dvd> $$5 = drd.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awk.aI, awl.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dvd> $$6 = Optional.ofNullable((dhy)cvo.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awk.aJ, awl.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dvd> a(dvd $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dok.i, $$0.c(dok.i)));
   }
}
