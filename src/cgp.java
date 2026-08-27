import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;

public class cgp extends chk {
   protected static final Map<csq, csq> a = new Builder()
      .put(csr.ao, csr.aw)
      .put(csr.U, csr.al)
      .put(csr.au, csr.aC)
      .put(csr.aa, csr.ak)
      .put(csr.as, csr.aA)
      .put(csr.Y, csr.ai)
      .put(csr.at, csr.aB)
      .put(csr.Z, csr.aj)
      .put(csr.aq, csr.ay)
      .put(csr.W, csr.ag)
      .put(csr.ar, csr.az)
      .put(csr.X, csr.ah)
      .put(csr.ap, csr.ax)
      .put(csr.V, csr.af)
      .put(csr.oj, csr.ok)
      .put(csr.ol, csr.om)
      .put(csr.os, csr.ot)
      .put(csr.ou, csr.ov)
      .put(csr.av, csr.aD)
      .put(csr.ab, csr.am)
      .put(csr.ae, csr.an)
      .build();

   protected cgp(ckn $$0, float $$1, float $$2, civ.a $$3) {
      super($$1, $$2, $$0, apo.bz, $$3);
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      cbp $$3 = $$0.o();
      dfe $$4 = $$1.a_($$2);
      Optional<dfe> $$5 = this.b($$4);
      Optional<dfe> $$6 = dbs.b($$4);
      Optional<dfe> $$7 = Optional.ofNullable((csq)cip.b.get().get($$4.b())).map($$1x -> $$1x.l($$4));
      cja $$8 = $$0.n();
      Optional<dfe> $$9 = Optional.empty();
      if ($$5.isPresent()) {
         $$1.a($$3, $$2, aoz.as, apa.e, 1.0F, 1.0F);
         $$9 = $$5;
      } else if ($$6.isPresent()) {
         $$1.a($$3, $$2, aoz.at, apa.e, 1.0F, 1.0F);
         $$1.a($$3, 3005, $$2, 0);
         $$9 = $$6;
      } else if ($$7.isPresent()) {
         $$1.a($$3, $$2, aoz.au, apa.e, 1.0F, 1.0F);
         $$1.a($$3, 3004, $$2, 0);
         $$9 = $$7;
      }

      if ($$9.isPresent()) {
         if ($$3 instanceof ako) {
            al.M.a((ako)$$3, $$2, $$8);
         }

         $$1.a($$2, $$9.get(), 11);
         $$1.a(djo.c, $$2, djo.a.a($$3, $$9.get()));
         if ($$3 != null) {
            $$8.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return bgt.a($$1.B);
      } else {
         return bgt.d;
      }
   }

   private Optional<dfe> b(dfe $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.n().a(czb.g, $$0.c(czb.g)));
   }
}
