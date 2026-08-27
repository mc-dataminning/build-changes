import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface atw extends atz {
   Set<String> a();

   List<atu> a(akm var1);

   Map<akm, atu> b(String var1, Predicate<akm> var2);

   Map<akm, List<atu>> c(String var1, Predicate<akm> var2);

   Stream<asi> b();

   public static enum a implements atw {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<atu> getResource(akm $$0) {
         return Optional.empty();
      }

      @Override
      public List<atu> a(akm $$0) {
         return List.of();
      }

      @Override
      public Map<akm, atu> b(String $$0, Predicate<akm> $$1) {
         return Map.of();
      }

      @Override
      public Map<akm, List<atu>> c(String $$0, Predicate<akm> $$1) {
         return Map.of();
      }

      @Override
      public Stream<asi> b() {
         return Stream.of();
      }
   }
}
