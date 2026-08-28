import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class csi extends ctd {
   protected static final Map<dey, dey> a = new Builder()
      .put(dfa.ao, dfa.aw)
      .put(dfa.U, dfa.al)
      .put(dfa.au, dfa.aC)
      .put(dfa.aa, dfa.ak)
      .put(dfa.as, dfa.aA)
      .put(dfa.Y, dfa.ai)
      .put(dfa.at, dfa.aB)
      .put(dfa.Z, dfa.aj)
      .put(dfa.aq, dfa.ay)
      .put(dfa.W, dfa.ag)
      .put(dfa.ar, dfa.az)
      .put(dfa.X, dfa.ah)
      .put(dfa.ap, dfa.ax)
      .put(dfa.V, dfa.af)
      .put(dfa.oj, dfa.ok)
      .put(dfa.ol, dfa.om)
      .put(dfa.os, dfa.ot)
      .put(dfa.ou, dfa.ov)
      .put(dfa.av, dfa.aD)
      .put(dfa.ab, dfa.am)
      .put(dfa.ae, dfa.an)
      .build();

   public csi(cwd $$0, cuj.a $$1) {
      super($$0, awo.bA, $$1);
   }

   @Override
   public bqt a(cyb $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      cmw $$3 = $$0.o();
      Optional<dsb> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
      if ($$4.isEmpty()) {
         return bqt.e;
      } else {
         cuo $$5 = $$0.n();
         if ($$3 instanceof arf) {
            am.N.a((arf)$$3, $$2, $$5);
         }

         $$1.a($$2, $$4.get(), 11);
         $$1.a(dwu.c, $$2, dwu.a.a($$3, $$4.get()));
         if ($$3 != null) {
            $$5.a(1, $$3, bto.d($$0.p()));
         }

         return bqt.a($$1.B);
      }
   }

   private Optional<dsb> a(dbx $$0, iz $$1, @Nullable cmw $$2, dsb $$3) {
      Optional<dsb> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, avz.aH, awa.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<dsb> $$5 = dod.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, avz.aI, awa.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<dsb> $$6 = Optional.ofNullable((dey)cue.b.get().get($$3.b())).map($$1x -> $$1x.l($$3));
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

   private Optional<dsb> a(dsb $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.o().a(dlk.i, $$0.c(dlk.i)));
   }
}
