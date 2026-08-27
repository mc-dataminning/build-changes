import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aqj extends aqm {
   Set<String> a();

   List<aqh> a(ahh var1);

   Map<ahh, aqh> b(String var1, Predicate<ahh> var2);

   Map<ahh, List<aqh>> c(String var1, Predicate<ahh> var2);

   Stream<aox> b();

   public static enum a implements aqj {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<aqh> getResource(ahh $$0) {
         return Optional.empty();
      }

      @Override
      public List<aqh> a(ahh $$0) {
         return List.of();
      }

      @Override
      public Map<ahh, aqh> b(String $$0, Predicate<ahh> $$1) {
         return Map.of();
      }

      @Override
      public Map<ahh, List<aqh>> c(String $$0, Predicate<ahh> $$1) {
         return Map.of();
      }

      @Override
      public Stream<aox> b() {
         return Stream.of();
      }
   }
}
