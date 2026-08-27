import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aph extends apk {
   Set<String> a();

   List<apf> a(agi var1);

   Map<agi, apf> b(String var1, Predicate<agi> var2);

   Map<agi, List<apf>> c(String var1, Predicate<agi> var2);

   Stream<anv> b();

   public static enum a implements aph {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<apf> getResource(agi $$0) {
         return Optional.empty();
      }

      @Override
      public List<apf> a(agi $$0) {
         return List.of();
      }

      @Override
      public Map<agi, apf> b(String $$0, Predicate<agi> $$1) {
         return Map.of();
      }

      @Override
      public Map<agi, List<apf>> c(String $$0, Predicate<agi> $$1) {
         return Map.of();
      }

      @Override
      public Stream<anv> b() {
         return Stream.of();
      }
   }
}
