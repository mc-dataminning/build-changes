import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface anm extends anp {
   Set<String> a();

   List<ank> a(aer var1);

   Map<aer, ank> b(String var1, Predicate<aer> var2);

   Map<aer, List<ank>> c(String var1, Predicate<aer> var2);

   Stream<ama> b();

   public static enum a implements anm {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<ank> getResource(aer $$0) {
         return Optional.empty();
      }

      @Override
      public List<ank> a(aer $$0) {
         return List.of();
      }

      @Override
      public Map<aer, ank> b(String $$0, Predicate<aer> $$1) {
         return Map.of();
      }

      @Override
      public Map<aer, List<ank>> c(String $$0, Predicate<aer> $$1) {
         return Map.of();
      }

      @Override
      public Stream<ama> b() {
         return Stream.of();
      }
   }
}
