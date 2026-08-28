import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cgr extends cgp<bwn> {
   private static final cgw a = cgw.b().d();
   private final Predicate<cxo> b;

   public cgr(Predicate<cxo> $$0) {
      this.b = $$0;
   }

   protected void a(ash $$0, bwn $$1) {
      bxh<?> $$2 = $$1.eb();
      cgw $$3 = a.c().a((double)((float)$$1.h(bxn.E)));
      List<cpw> $$4 = $$0.y()
         .stream()
         .filter(bvo.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.y($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cpw $$5 = $$4.get(0);
         $$2.a(cfj.O, $$5);
      } else {
         $$2.b(cfj.O);
      }
   }

   private boolean a(cpw $$0) {
      return this.a($$0.eX()) || this.a($$0.eY());
   }

   private boolean a(cxo $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.of(cfj.O);
   }
}
