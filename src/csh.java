import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class csh extends ctc {
   protected static final Map<dex, dex> a = new Builder()
      .put(dez.ao, dez.aw)
      .put(dez.U, dez.al)
      .put(dez.au, dez.aC)
      .put(dez.aa, dez.ak)
      .put(dez.as, dez.aA)
      .put(dez.Y, dez.ai)
      .put(dez.at, dez.aB)
      .put(dez.Z, dez.aj)
      .put(dez.aq, dez.ay)
      .put(dez.W, dez.ag)
      .put(dez.ar, dez.az)
      .put(dez.X, dez.ah)
      .put(dez.ap, dez.ax)
      .put(dez.V, dez.af)
      .put(dez.oj, dez.ok)
      .put(dez.ol, dez.om)
      .put(dez.os, dez.ot)
      .put(dez.ou, dez.ov)
      .put(dez.av, dez.aD)
      .put(dez.ab, dez.am)
      .put(dez.ae, dez.an)
      .build();

   public csh(cwc $$0, cui.a $$1) {
      super($$0, awo.bA, $$1);
   }

   @Override
   public bqs a(cya $$0) {
      dbw $$1 = $$0.q();
      iz $$2 = $$0.a();
      cmv $$3 = $$0.o();
      Optional<dsa> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bqs.e;
      } else {
         cun $$5 = $$0.n();
         if ($$3 instanceof arf) {
            am.N.a((arf)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dwt.c, $$2, dwt.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, btn.d($$0.p()));
         }

         return bqs.a($$1.B);
      }
   }

   private Optional<dsa> a(dbw $$0, iz $$1, @Nullable cmv $$2, dsa $$3) {
      Optional<dsa> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, avz.aH, awa.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dsa> $$5 = doc.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, avz.aI, awa.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dsa> $$6 = Optional.ofNullable((dex)cud.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, avz.aJ, awa.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<dsa> a(dsa $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dlj.i, $$0.c(dlj.i)));
   }
}
