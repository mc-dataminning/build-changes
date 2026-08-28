import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfb extends cfo<cmz> {
   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.of(cei.h, cei.aw, cei.aq, cei.ap, cei.as, cei.at, new cei[0]);
   }

   protected void a(arq $$0, cmz $$1) {
      bwg<?> $$2 = $$1.ee();
      $$2.a(cei.aw, this.b($$0, $$1));
      Optional<cnf> $$3 = Optional.empty();
      int $$4 = 0;
      List<cmz> $$5 = Lists.newArrayList();
      cek $$6 = $$2.c(cei.h).orElse(cek.a());

      for (bve $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof cnf || $$0x instanceof cmz))) {
         if ($$7 instanceof cnf $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cmz $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cei.aq, $$3);
      $$2.a(cei.ap, $$5);
      $$2.a(cei.as, $$4);
      $$2.a(cei.at, $$5.size());
   }

   private Optional<jh> b(arq $$0, cmz $$1) {
      return jh.a($$1.dy(), 8, 4, $$1x -> $$0.a_($$1x).a(axd.aT));
   }
}
