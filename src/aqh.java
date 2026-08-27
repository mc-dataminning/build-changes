import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aqh extends aqk {
   Set<String> a();

   List<aqf> a(ahg var1);

   Map<ahg, aqf> b(String var1, Predicate<ahg> var2);

   Map<ahg, List<aqf>> c(String var1, Predicate<ahg> var2);

   Stream<aov> b();

   public static enum a implements aqh {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<aqf> getResource(ahg $$0) {
         return Optional.empty();
      }

      @Override
      public List<aqf> a(ahg $$0) {
         return List.of();
      }

      @Override
      public Map<ahg, aqf> b(String $$0, Predicate<ahg> $$1) {
         return Map.of();
      }

      @Override
      public Map<ahg, List<aqf>> c(String $$0, Predicate<ahg> $$1) {
         return Map.of();
      }

      @Override
      public Stream<aov> b() {
         return Stream.of();
      }
   }
}
