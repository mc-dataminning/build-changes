import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cak extends cax<cid> {
   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.of(bzr.h, bzr.aw, bzr.aq, bzr.ap, bzr.as, bzr.at, new bzr[0]);
   }

   protected void a(aps $$0, cid $$1) {
      brp<?> $$2 = $$1.dP();
      $$2.a(bzr.aw, this.b($$0, $$1));
      Optional<cij> $$3 = Optional.empty();
      int $$4 = 0;
      List<cid> $$5 = Lists.newArrayList();
      bzt $$6 = $$2.c(bzr.h).orElse(bzt.a());

      for (bqo $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof cij || $$0x instanceof cid))) {
         if ($$7 instanceof cij $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cid $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bzr.aq, $$3);
      $$2.a(bzr.ap, $$5);
      $$2.a(bzr.as, $$4);
      $$2.a(bzr.at, $$5.size());
   }

   private Optional<ib> b(aps $$0, cid $$1) {
      return ib.a($$1.dm(), 8, 4, $$1x -> $$0.a_($$1x).a(avc.aS));
   }
}
