import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface ank extends ann {
   Set<String> a();

   List<ani> a(aep var1);

   Map<aep, ani> b(String var1, Predicate<aep> var2);

   Map<aep, List<ani>> c(String var1, Predicate<aep> var2);

   Stream<aly> b();

   public static enum a implements ank {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<ani> getResource(aep $$0) {
         return Optional.empty();
      }

      @Override
      public List<ani> a(aep $$0) {
         return List.of();
      }

      @Override
      public Map<aep, ani> b(String $$0, Predicate<aep> $$1) {
         return Map.of();
      }

      @Override
      public Map<aep, List<ani>> c(String $$0, Predicate<aep> $$1) {
         return Map.of();
      }

      @Override
      public Stream<aly> b() {
         return Stream.of();
      }
   }
}
