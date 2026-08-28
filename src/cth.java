import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cth extends cua {
   protected static final Map<dgv, dgv> a = new Builder()
      .put(dgx.ao, dgx.aw)
      .put(dgx.U, dgx.al)
      .put(dgx.au, dgx.aC)
      .put(dgx.aa, dgx.ak)
      .put(dgx.as, dgx.aA)
      .put(dgx.Y, dgx.ai)
      .put(dgx.at, dgx.aB)
      .put(dgx.Z, dgx.aj)
      .put(dgx.aq, dgx.ay)
      .put(dgx.W, dgx.ag)
      .put(dgx.ar, dgx.az)
      .put(dgx.X, dgx.ah)
      .put(dgx.ap, dgx.ax)
      .put(dgx.V, dgx.af)
      .put(dgx.oj, dgx.ok)
      .put(dgx.ol, dgx.om)
      .put(dgx.os, dgx.ot)
      .put(dgx.ou, dgx.ov)
      .put(dgx.av, dgx.aD)
      .put(dgx.ab, dgx.am)
      .put(dgx.ae, dgx.an)
      .build();

   public cth(cxe $$0, float $$1, float $$2, cvg.a $$3) {
      super($$0, aws.bB, $$1, $$2, $$3);
   }

   @Override
   public brk a(cyy $$0) {
      dds $$1 = $$0.q();
      je $$2 = $$0.a();
      cnp $$3 = $$0.o();
      if (b($$0)) {
         return brk.e;
      } else {
         Optional<dua> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return brk.e;
         } else {
            cvl $$5 = $$0.n();
            if ($$3 instanceof arh) {
               an.N.a((arh)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(dyx.c, $$2, dyx.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, buf.d($$0.p()));
            }

            return brk.a;
         }
      }
   }

   private static boolean b(cyy $$0) {
      cnp $$1 = $$0.o();
      return $$0.p().equals(brj.a) && $$1.eX().a(cvo.vu) && !$$1.fR();
   }

   private Optional<dua> a(dds $$0, je $$1, @Nullable cnp $$2, dua $$3) {
      Optional<dua> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, awd.aH, awe.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dua> $$5 = dqb.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, awd.aI, awe.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dua> $$6 = Optional.ofNullable((dgv)cvb.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, awd.aJ, awe.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dua> a(dua $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().b(dni.i, $$0.c(dni.i)));
   }
}
