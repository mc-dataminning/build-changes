import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bpt extends bqf<bwy> {
   @Override
   public Set<bpb<?>> a() {
      return ImmutableSet.of(bpb.h, bpb.av, bpb.ap, bpb.ao, bpb.ar, bpb.as, new bpb[0]);
   }

   protected void a(aif $$0, bwy $$1) {
      bha<?> $$2 = $$1.dK();
      $$2.a(bpb.av, this.b($$0, $$1));
      Optional<bxe> $$3 = Optional.empty();
      int $$4 = 0;
      List<bwy> $$5 = Lists.newArrayList();
      bpd $$6 = $$2.c(bpb.h).orElse(bpd.a());

      for (bfz $$7 : $$6.b($$0x -> !$$0x.h_() && ($$0x instanceof bxe || $$0x instanceof bwy))) {
         if ($$7 instanceof bxe $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof bwy $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bpb.ap, $$3);
      $$2.a(bpb.ao, $$5);
      $$2.a(bpb.ar, $$4);
      $$2.a(bpb.as, $$5.size());
   }

   private Optional<gu> b(aif $$0, bwy $$1) {
      return gu.a($$1.di(), 8, 4, $$1x -> $$0.a_($$1x).a(amw.aQ));
   }
}
