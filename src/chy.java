import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;

public class chy extends cit {
   protected static final Map<cua, cua> a = new Builder()
      .put(cuc.ao, cuc.aw)
      .put(cuc.U, cuc.al)
      .put(cuc.au, cuc.aC)
      .put(cuc.aa, cuc.ak)
      .put(cuc.as, cuc.aA)
      .put(cuc.Y, cuc.ai)
      .put(cuc.at, cuc.aB)
      .put(cuc.Z, cuc.aj)
      .put(cuc.aq, cuc.ay)
      .put(cuc.W, cuc.ag)
      .put(cuc.ar, cuc.az)
      .put(cuc.X, cuc.ah)
      .put(cuc.ap, cuc.ax)
      .put(cuc.V, cuc.af)
      .put(cuc.oj, cuc.ok)
      .put(cuc.ol, cuc.om)
      .put(cuc.os, cuc.ot)
      .put(cuc.ou, cuc.ov)
      .put(cuc.av, cuc.aD)
      .put(cuc.ab, cuc.am)
      .put(cuc.ae, cuc.an)
      .build();

   protected chy(clw $$0, float $$1, float $$2, cke.a $$3) {
      super($$1, $$2, $$0, aqs.bz, $$3);
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      ccx $$3 = $$0.o();
      dgb $$4 = $$1.a_($$2);
      Optional<dgb> $$5 = this.b($$4);
      Optional<dgb> $$6 = dcz.b($$4);
      Optional<dgb> $$7 = Optional.ofNullable((cua)cjy.b.get().get($$4.b())).map($$1x -> $$1x.l($$4));
      ckj $$8 = $$0.n();
      Optional<dgb> $$9 = Optional.empty();
      if ($$5.isPresent()) {
         $$1.a($$3, $$2, aqd.as, aqe.e, 1.0F, 1.0F);
         $$9 = $$5;
      } else if ($$6.isPresent()) {
         $$1.a($$3, $$2, aqd.at, aqe.e, 1.0F, 1.0F);
         $$1.a($$3, 3005, $$2, 0);
         $$9 = $$6;
      } else if ($$7.isPresent()) {
         $$1.a($$3, $$2, aqd.au, aqe.e, 1.0F, 1.0F);
         $$1.a($$3, 3004, $$2, 0);
         $$9 = $$7;
      }

      if ($$9.isPresent()) {
         if ($$3 instanceof alr) {
            al.M.a((alr)$$3, $$2, $$8);
         }

         $$1.a($$2, $$9.get(), 11);
         $$1.a(dkl.c, $$2, dkl.a.a($$3, $$9.get()));
         if ($$3 != null) {
            $$8.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bib.a($$1.B);
      } else {
         return bib.d;
      }
   }

   private Optional<dgb> b(dgb $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dak.i, $$0.c(dak.i)));
   }
}
