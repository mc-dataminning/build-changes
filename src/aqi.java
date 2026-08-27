import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aqi extends aql {
   Set<String> a();

   List<aqg> a(ahg var1);

   Map<ahg, aqg> b(String var1, Predicate<ahg> var2);

   Map<ahg, List<aqg>> c(String var1, Predicate<ahg> var2);

   Stream<aow> b();

   public static enum a implements aqi {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<aqg> getResource(ahg $$0) {
         return Optional.empty();
      }

      @Override
      public List<aqg> a(ahg $$0) {
         return List.of();
      }

      @Override
      public Map<ahg, aqg> b(String $$0, Predicate<ahg> $$1) {
         return Map.of();
      }

      @Override
      public Map<ahg, List<aqg>> c(String $$0, Predicate<ahg> $$1) {
         return Map.of();
      }

      @Override
      public Stream<aow> b() {
         return Stream.of();
      }
   }
}
