import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface auv extends auz {
   Set<String> a();

   List<aut> a(ale var1);

   Map<ale, aut> b(String var1, Predicate<ale> var2);

   Map<ale, List<aut>> c(String var1, Predicate<ale> var2);

   Stream<ath> b();

   public static enum a implements auv {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<aut> getResource(ale $$0) {
         return Optional.empty();
      }

      @Override
      public List<aut> a(ale $$0) {
         return List.of();
      }

      @Override
      public Map<ale, aut> b(String $$0, Predicate<ale> $$1) {
         return Map.of();
      }

      @Override
      public Map<ale, List<aut>> c(String $$0, Predicate<ale> $$1) {
         return Map.of();
      }

      @Override
      public Stream<ath> b() {
         return Stream.of();
      }
   }
}
