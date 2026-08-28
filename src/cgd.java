import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgd extends cgi<bvy> {
   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.of(cfc.h, cfc.M, cfc.an);
   }

   @Override
   protected void a(ard $$0, bvy $$1) {
      bxa<?> $$2 = $$1.ea();
      List<coe> $$3 = Lists.newArrayList();
      cfe $$4 = $$2.c(cfc.h).orElse(cfe.a());
      Optional<bwa> $$5 = $$4.a($$0x -> $$0x instanceof cnj || $$0x instanceof clj).map(bwa.class::cast);

      for (bvy $$7 : $$2.c(cfc.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof coe && ((coe)$$7).t()) {
            $$3.add((coe)$$7);
         }
      }

      $$2.a(cfc.M, $$5);
      $$2.a(cfc.an, $$3);
   }
}
