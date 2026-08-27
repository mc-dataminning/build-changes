import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckm extends clh {
   protected static final Map<cwp, cwp> a = new Builder()
      .put(cwr.ao, cwr.aw)
      .put(cwr.U, cwr.al)
      .put(cwr.au, cwr.aC)
      .put(cwr.aa, cwr.ak)
      .put(cwr.as, cwr.aA)
      .put(cwr.Y, cwr.ai)
      .put(cwr.at, cwr.aB)
      .put(cwr.Z, cwr.aj)
      .put(cwr.aq, cwr.ay)
      .put(cwr.W, cwr.ag)
      .put(cwr.ar, cwr.az)
      .put(cwr.X, cwr.ah)
      .put(cwr.ap, cwr.ax)
      .put(cwr.V, cwr.af)
      .put(cwr.oj, cwr.ok)
      .put(cwr.ol, cwr.om)
      .put(cwr.os, cwr.ot)
      .put(cwr.ou, cwr.ov)
      .put(cwr.av, cwr.aD)
      .put(cwr.ab, cwr.am)
      .put(cwr.ae, cwr.an)
      .build();

   protected ckm(cok $$0, float $$1, float $$2, cms.a $$3) {
      super($$1, $$2, $$0, asg.bz, $$3);
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      hx $$2 = $$0.a();
      cfh $$3 = $$0.o();
      Optional<djg> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bka.d;
      } else {
         cmx $$5 = $$0.n();
         if ($$3 instanceof ane) {
            am.N.a((ane)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dnq.c, $$2, dnq.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bka.a($$1.B);
      }
   }

   private Optional<djg> a(cto $$0, hx $$1, @Nullable cfh $$2, djg $$3) {
      Optional<djg> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, arr.as, ars.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<djg> $$5 = dfs.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, arr.at, ars.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<djg> $$6 = Optional.ofNullable((cwp)cmm.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, arr.au, ars.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<djg> b(djg $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dda.i, $$0.c(dda.i)));
   }
}
