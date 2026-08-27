import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bps extends bqf<bfz> {
   private static final int a = 200;
   private static final int c = 600;

   public bps() {
      this(200);
   }

   public bps(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aif $$0, bfz $$1) {
      a($$1);
   }

   @Override
   public Set<bpb<?>> a() {
      return ImmutableSet.of(bpb.g);
   }

   public static void a(bfz $$0) {
      Optional<List<bfz>> $$1 = $$0.dK().c(bpb.g);
      if ($$1.isPresent()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ae().equals(bfn.ac));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bfz $$0) {
      $$0.dK().a(bpb.F, true, 600L);
   }
}
