import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpm extends cqh {
   protected static final Map<dch, dch> a = new Builder()
      .put(dcj.ao, dcj.aw)
      .put(dcj.U, dcj.al)
      .put(dcj.au, dcj.aC)
      .put(dcj.aa, dcj.ak)
      .put(dcj.as, dcj.aA)
      .put(dcj.Y, dcj.ai)
      .put(dcj.at, dcj.aB)
      .put(dcj.Z, dcj.aj)
      .put(dcj.aq, dcj.ay)
      .put(dcj.W, dcj.ag)
      .put(dcj.ar, dcj.az)
      .put(dcj.X, dcj.ah)
      .put(dcj.ap, dcj.ax)
      .put(dcj.V, dcj.af)
      .put(dcj.oj, dcj.ok)
      .put(dcj.ol, dcj.om)
      .put(dcj.os, dcj.ot)
      .put(dcj.ou, dcj.ov)
      .put(dcj.av, dcj.aD)
      .put(dcj.ab, dcj.am)
      .put(dcj.ae, dcj.an)
      .build();

   public cpm(cte $$0, crn.a $$1) {
      super($$0, ave.bA, $$1);
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      cka $$3 = $$0.o();
      Optional<dpi> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bof.d;
      } else {
         crs $$5 = $$0.n();
         if ($$3 instanceof apv) {
            am.N.a((apv)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dub.c, $$2, dub.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, bqt.d($$0.p()));
         }

         return bof.a($$1.B);
      }
   }

   private Optional<dpi> a(czg $$0, id $$1, @Nullable cka $$2, dpi $$3) {
      Optional<dpi> $$4 = this.b($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, auo.aH, aup.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dpi> $$5 = dll.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, auo.aI, aup.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dpi> $$6 = Optional.ofNullable((dch)cri.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, auo.aJ, aup.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dpi> b(dpi $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().a(dis.i, $$0.c(dis.i)));
   }
}
