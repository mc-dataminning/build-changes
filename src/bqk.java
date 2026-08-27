import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bqk extends bpy<bxs> {
   @Override
   public Set<bpb<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bpb.B)));
   }

   protected void a(aif $$0, bxs $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ae() == bfn.bt)
         .or(() -> a($$1, $$0xx -> $$0xx.ae() != bfn.bt))
         .ifPresentOrElse($$1x -> $$1.dK().a(bpb.B, $$1x), () -> $$1.dK().b(bpb.B));
   }

   private static Optional<bfz> a(bxs $$0, Predicate<bfz> $$1) {
      return $$0.dK().c(bpb.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
   }

   @Override
   protected int b() {
      return 24;
   }

   @Override
   protected int c() {
      return 24;
   }
}
