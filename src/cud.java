import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cud extends cuu {
   protected static final Map<die, die> a = new Builder()
      .put(dig.ao, dig.aw)
      .put(dig.U, dig.al)
      .put(dig.au, dig.aC)
      .put(dig.aa, dig.ak)
      .put(dig.as, dig.aA)
      .put(dig.Y, dig.ai)
      .put(dig.at, dig.aB)
      .put(dig.Z, dig.aj)
      .put(dig.aq, dig.ay)
      .put(dig.W, dig.ag)
      .put(dig.ar, dig.az)
      .put(dig.X, dig.ah)
      .put(dig.ap, dig.ax)
      .put(dig.V, dig.af)
      .put(dig.oj, dig.ok)
      .put(dig.ol, dig.om)
      .put(dig.os, dig.ot)
      .put(dig.ou, dig.ov)
      .put(dig.av, dig.aD)
      .put(dig.ab, dig.am)
      .put(dig.ae, dig.an)
      .build();

   public cud(cxs $$0, float $$1, float $$2, cvx.a $$3) {
      super($$0, axa.bB, $$1, $$2, $$3);
   }

   @Override
   public bsd a(czu $$0) {
      dfb $$1 = $$0.q();
      jh $$2 = $$0.a();
      com $$3 = $$0.o();
      if (b($$0)) {
         return bsd.e;
      } else {
         Optional<dvj> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bsd.e;
         } else {
            cwb $$5 = $$0.n();
            if ($$3 instanceof aro) {
               ao.N.a((aro)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(eag.c, $$2, eag.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bva.d($$0.p()));
            }

            return bsd.a;
         }
      }
   }

   private static boolean b(czu $$0) {
      com $$1 = $$0.o();
      return $$0.p().equals(bsc.a) && $$1.fc().a(cwf.vu) && !$$1.ga();
   }

   private Optional<dvj> a(dfb $$0, jh $$1, @Nullable com $$2, dvj $$3) {
      Optional<dvj> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awl.aH, awm.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dvj> $$5 = drj.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awl.aI, awm.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dvj> $$6 = Optional.ofNullable((die)cvs.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awl.aJ, awm.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dvj> a(dvj $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(doq.i, $$0.c(doq.i)));
   }
}
