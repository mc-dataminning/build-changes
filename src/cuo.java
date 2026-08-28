import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cuo extends cvf {
   protected static final Map<diq, diq> a = new Builder()
      .put(dis.ao, dis.aw)
      .put(dis.U, dis.al)
      .put(dis.au, dis.aC)
      .put(dis.aa, dis.ak)
      .put(dis.as, dis.aA)
      .put(dis.Y, dis.ai)
      .put(dis.at, dis.aB)
      .put(dis.Z, dis.aj)
      .put(dis.aq, dis.ay)
      .put(dis.W, dis.ag)
      .put(dis.ar, dis.az)
      .put(dis.X, dis.ah)
      .put(dis.ap, dis.ax)
      .put(dis.V, dis.af)
      .put(dis.oj, dis.ok)
      .put(dis.ol, dis.om)
      .put(dis.os, dis.ot)
      .put(dis.ou, dis.ov)
      .put(dis.av, dis.aD)
      .put(dis.ab, dis.am)
      .put(dis.ae, dis.an)
      .build();

   public cuo(cyd $$0, float $$1, float $$2, cwi.a $$3) {
      super($$0, axc.bB, $$1, $$2, $$3);
   }

   @Override
   public bsk a(daf $$0) {
      dfm $$1 = $$0.q();
      jh $$2 = $$0.a();
      cou $$3 = $$0.o();
      if (b($$0)) {
         return bsk.e;
      } else {
         Optional<dvv> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bsk.e;
         } else {
            cwm $$5 = $$0.n();
            if ($$3 instanceof arq) {
               ao.N.a((arq)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(ear.c, $$2, ear.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, bvh.d($$0.p()));
            }

            return bsk.a;
         }
      }
   }

   private static boolean b(daf $$0) {
      cou $$1 = $$0.o();
      return $$0.p().equals(bsj.a) && $$1.eY().a(cwq.vK) && !$$1.fW();
   }

   private Optional<dvv> a(dfm $$0, jh $$1, @Nullable cou $$2, dvv $$3) {
      Optional<dvv> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awn.aH, awo.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dvv> $$5 = drv.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awn.aI, awo.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dvv> $$6 = Optional.ofNullable((diq)cwd.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awn.aJ, awo.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dvv> a(dvv $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dpc.i, $$0.c(dpc.i)));
   }
}
